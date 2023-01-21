package com.techstack.generator;

import com.techstack.computers.Computer;

import java.util.*;

public class Generator {

    private Generator() {}
    public static Map<String, Computer> generateStock() {
        Map<String, Computer> computers = new HashMap<>();

        Computer desktop = DesktopPCGenerator.generate();
        Computer laptop = LaptopGenerator.generate();
        Computer allInOne = AllInOneGenerator.generate();

        computers.put(desktop.getUuid(), desktop);
        computers.put(laptop.getUuid(), laptop);
        computers.put(allInOne.getUuid(), allInOne);

        return computers;
    }
}
