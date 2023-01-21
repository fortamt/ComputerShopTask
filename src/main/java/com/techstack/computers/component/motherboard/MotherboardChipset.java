package com.techstack.computers.component.motherboard;

import lombok.Builder;

@Builder
public class MotherboardChipset {

    private String chipset;
    private String bios;

    @Override
    public String toString() {
        return "chipset='" + chipset + '\'' +
                ", bios='" + bios + '\'';
    }
}
