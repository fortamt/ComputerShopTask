package com.techstack.computers.component.graphiccard;

import lombok.Builder;

@Builder
public class GPUInfo {

    private String gpuModel;
    private String architecture;
    private int memorySizeInGb;
    private String memoryType;
    private int memoryBusBit;
    private int gpuClockSpeedInMHz;
    private int memoryClockInMHz;
    private int lithographyInNm;
    private String maxResolution;

    @Override
    public String toString() {
        return "GPUModel='" + gpuModel + '\'' +
                ", architecture='" + architecture + '\'' +
                ", memorySizeInGb=" + memorySizeInGb +
                ", memoryType='" + memoryType + '\'' +
                ", memoryBusBit=" + memoryBusBit +
                ", GPUClockSpeedInMHz=" + gpuClockSpeedInMHz +
                ", memoryClockInMHz=" + memoryClockInMHz +
                ", lithographyInNm=" + lithographyInNm +
                ", maxResolution='" + maxResolution + '\'';
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public int getMemorySizeInGb() {
        return memorySizeInGb;
    }
}
