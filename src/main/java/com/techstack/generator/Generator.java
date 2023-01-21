package com.techstack.generator;

import com.techstack.computers.Computer;

import java.util.ArrayList;
import java.util.List;

public class Generator {

    private Generator() {}
    public static List<Computer> generateStock() {
        List<Computer> computerList = new ArrayList<>();

        computerList.add(DesktopPCGenerator.generate());
        computerList.add(LaptopGenerator.generate());
        computerList.add(AllInOneGenerator.generate());

        return computerList;
    }
}
