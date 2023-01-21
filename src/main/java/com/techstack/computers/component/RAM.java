package com.techstack.computers.component;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class RAM extends Component{

    private int sizeInGb;
    private String memoryRank;
    private String memoryTiming;
    private int moduleHeightInMm;

    @Override
    public String toString() {
        return "\n\t\tsizeInGb='" + sizeInGb + '\'' +
                ", \n\t\tmemoryRank='" + memoryRank + '\'' +
                ", \n\t\tmemoryTiming='" + memoryTiming + '\'' +
                ", \n\t\tmoduleHeightInMm=" + moduleHeightInMm +
                ", \n\t\tprice=" + price;
    }

    public String getShortInfo() {
        return String.valueOf(sizeInGb);
    }
}
