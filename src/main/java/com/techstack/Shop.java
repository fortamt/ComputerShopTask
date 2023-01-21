package com.techstack;

import com.techstack.computers.AllInOne;
import com.techstack.computers.Computer;
import com.techstack.computers.DesktopPC;
import com.techstack.computers.Laptop;

import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private static Shop instance;
    private final List<Computer> stock;
    private float cash;

    private Shop(List<Computer> stock, float cash) {
        this.stock = stock;
        this.cash = cash;
    }

    public static Shop getInstance(List<Computer> stock, float cash) {
        if (instance == null) {
            if (stock == null) {
                throw new RuntimeException("Stock cannot by empty");
            }
            instance = new Shop(stock, cash);
        }
        return instance;
    }

    public List<Computer> getStock(){
        return stock;
    }

    public List<Computer> getDesktopPCs(){
        return stock.stream()
                .filter(DesktopPC.class::isInstance)
                .collect(Collectors.toList());
    }

    public List<Computer> getLaptops(){
        return stock.stream()
                .filter(Laptop.class::isInstance)
                .collect(Collectors.toList());
    }

    public List<Computer> getAllInOne(){
        return stock.stream()
                .filter(AllInOne.class::isInstance)
                .collect(Collectors.toList());
    }

    public void sellComputer(String computerID) {
        if (!hasStockSuchComputer(computerID)) {
            System.out.println("We haven`t such computer");
            return;
        }
        Computer computerForSell = null;
        for (Computer computer : stock) {
            if (computer.getUuid().equals(computerID)) {
                computerForSell = computer;
            }
        }
        assert computerForSell != null;
        this.cash += computerForSell.getPrice();
        stock.remove(computerForSell);
        System.out.println("Success");
    }

    public String showFullProperties(String computerId) {
        if (hasStockSuchComputer(computerId)) {
            for (Computer computer : stock) {
                if (computer.getUuid().equals(computerId)) {
                    return computer.getFullProperties();
                }
            }
        }
        System.out.println("We haven`t such computer");
        return null;
    }

    private boolean hasStockSuchComputer(String computerId) {
        return stock.stream()
                .map(Computer::getUuid)
                .anyMatch(name -> name.equals(computerId));
    }
}
