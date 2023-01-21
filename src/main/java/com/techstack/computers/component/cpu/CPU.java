package com.techstack.computers.component.cpu;

import com.techstack.computers.component.Component;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class CPU extends Component {

    private CPUMainInfo cpuMainInfo;
    private CoresAndThreads coresAndThreads;
    private CPUSpeed cpuSpeed;
    private int cacheL3Mb;
    private CPUSpecs cpuSpecs;
    private CPUMemory cpuMemory;

    @Override
    public String toString() {
        return "\n\t\tcpuMainInfo=" + cpuMainInfo +
                ", \n\t\tcoresAndThreads=" + coresAndThreads +
                ", \n\t\tcpuSpeed=" + cpuSpeed +
                ", \n\t\tcacheL3Mb=" + cacheL3Mb +
                ", \n\t\tcpuSpecs=" + cpuSpecs +
                ", \n\t\tcpuMemory=" + cpuMemory +
                ", \n\t\tprice=" + price;
    }

    public String getShortInfo() {
        return cpuMainInfo.getSeries() + " | " + cpuMainInfo.getModel();
    }
}
