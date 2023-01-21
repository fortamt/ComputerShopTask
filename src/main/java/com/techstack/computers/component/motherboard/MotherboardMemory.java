package com.techstack.computers.component.motherboard;

import lombok.Builder;

@Builder
public class MotherboardMemory {

    private int ramSlots;
    private String operationMode;
    private int maxClockFrequencyInMHz;
    private int maxMemoryInGb;

    @Override
    public String toString() {
        return "RAMSlots=" + ramSlots +
                ", operationMode='" + operationMode + '\'' +
                ", maxClockFrequencyInMHz=" + maxClockFrequencyInMHz +
                ", maxMemoryInGb=" + maxMemoryInGb;
    }
}
