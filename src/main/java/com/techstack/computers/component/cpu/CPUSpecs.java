package com.techstack.computers.component.cpu;

import lombok.Builder;

@Builder
public class CPUSpecs {

    private String igpModel;
    private String frontSideBus;
    private String tdp;
    private String instructions;
    private boolean freeMultiplier;
    private float pciExpressSupport;
    private int maxOperatingTemperature;

    @Override
    public String toString() {
        return "IGPModel='" + igpModel + '\'' +
                ", frontSideBus='" + frontSideBus + '\'' +
                ", TDP='" + tdp + '\'' +
                ", instructions='" + instructions + '\'' +
                ", freeMultiplier=" + freeMultiplier +
                ", PCIExpressSupport=" + pciExpressSupport +
                ", maxOperatingTemperature=" + maxOperatingTemperature;
    }
}
