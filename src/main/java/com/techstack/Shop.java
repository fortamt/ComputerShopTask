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

    public void sellComputer(String fullNameOfComputer) {
        if (!hasStockSuchComputer(fullNameOfComputer)) {
            System.out.println("We haven`t such computer");
            return;
        }
        for (Computer computer : stock) {
            if (computer.getNameAndModelInfo().equals(fullNameOfComputer)) {
                this.cash += computer.getPrice();
                stock.remove(computer);
            }
        }
    }

    public String showFullProperties(String fullComputerName) {
        if (hasStockSuchComputer(fullComputerName)) {
            for (Computer computer : stock) {
                if (computer.getNameAndModelInfo().equals(fullComputerName)) {
                    return computer.getFullProperties();
                }
            }
        }
        System.out.println("We haven`t such computer");
        return null;
    }

    private boolean hasStockSuchComputer(String fullComputerName) {
        return stock.stream()
                .map(Computer::getNameAndModelInfo)
                .anyMatch(name -> name.equals(fullComputerName));
    }
}
