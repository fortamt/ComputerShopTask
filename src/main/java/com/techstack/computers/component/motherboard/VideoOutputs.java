package com.techstack.computers.component.motherboard;

import lombok.Builder;

@Builder
public class VideoOutputs {

    private boolean outputVGA;
    private boolean outputHDMI;
    private boolean outputDisplayPort;

    @Override
    public String toString() {
        return "outputVGA=" + outputVGA +
                ", outputHDMI=" + outputHDMI +
                ", outputDisplayPort=" + outputDisplayPort;
    }
}
