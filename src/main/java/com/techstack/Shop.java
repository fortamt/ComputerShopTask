package com.techstack;

import com.techstack.computers.AllInOne;
import com.techstack.computers.Computer;
import com.techstack.computers.DesktopPC;
import com.techstack.computers.Laptop;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Shop {

    private static Shop instance;
    private final Map<String, Computer> stock;
    private float cash;

    private Shop(Map<String, Computer> stock, float cash) {
        this.stock = stock;
        this.cash = cash;
    }

    public static Shop getInstance(Map<String, Computer> stock, float cash) {
        if (instance == null) {
            if (stock == null) {
                throw new RuntimeException("Stock cannot by empty");
            }
            instance = new Shop(stock, cash);
        }
        return instance;
    }

    public Collection<Computer> getStock(){
        return stock.values();
    }

    public Collection<Computer> getDesktopPCs(){
        return stock.values().stream()
                .filter(DesktopPC.class::isInstance)
                .collect(Collectors.toList());
    }

    public Collection<Computer> getLaptops(){
        return stock.values().stream()
                .filter(Laptop.class::isInstance)
                .collect(Collectors.toList());
    }

    public Collection<Computer> getAllInOne(){
        return stock.values().stream()
                .filter(AllInOne.class::isInstance)
                .collect(Collectors.toList());
    }

    public void sellComputer(String computerID) {
        if (!hasStockSuchComputer(computerID)) {
            System.out.println("We haven`t such computer");
            return;
        }
        Computer computerForSell = stock.get(computerID);
        assert computerForSell != null;
        this.cash += computerForSell.getPrice();
        stock.remove(computerID);
        System.out.println("Success");
    }

    public String showFullProperties(String computerId) {
        if (hasStockSuchComputer(computerId)) {
            return stock.get(computerId).getFullProperties();
        }
        System.out.println("We haven`t such computer");
        return null;
    }

    private boolean hasStockSuchComputer(String computerId) {
        return stock.containsKey(computerId);
    }
}
