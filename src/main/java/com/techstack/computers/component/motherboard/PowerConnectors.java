package com.techstack.computers.component.motherboard;

import lombok.Builder;

@Builder
public class PowerConnectors {

    private int mainPowerSocketPin;
    private String cpuPower;
    private int fanPowerConnectorsCount;

    @Override
    public String toString() {
        return "mainPowerSocketPin=" + mainPowerSocketPin +
                ", cpuPower='" + cpuPower + '\'' +
                ", fanPowerConnectorsCount=" + fanPowerConnectorsCount;
    }
}
