package com.techstack.computers.component.motherboard;

import lombok.Builder;

@Builder
public class DriveInterface {

    private int countOfSATA3;
    private int countOfM2Connectors;

    @Override
    public String toString() {
        return "countOfSATA3=" + countOfSATA3 +
                ", countOfM2Connectors=" + countOfM2Connectors;
    }
}
