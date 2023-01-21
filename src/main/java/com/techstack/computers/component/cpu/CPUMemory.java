package com.techstack.computers.component.cpu;

import lombok.Builder;

@Builder
public class CPUMemory {

    private int maxRAMSizeGB;
    private int maxRAMSpeedMHz;
    private int countRAMChannels;

    @Override
    public String toString() {
        return "maxRAMSizeGB=" + maxRAMSizeGB +
                ", maxRAMSpeedMHz=" + maxRAMSpeedMHz +
                ", countRAMChannels=" + countRAMChannels;
    }
}
