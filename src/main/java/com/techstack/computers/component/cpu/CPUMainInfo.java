package com.techstack.computers.component.cpu;

import lombok.Builder;

@Builder
public class CPUMainInfo {

    private String series;
    private String model;
    private String codeName;
    private String socket;
    private int lithographyNM;

    @Override
    public String toString() {
        return "series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", codeName='" + codeName + '\'' +
                ", socket='" + socket + '\'' +
                ", lithographyNM=" + lithographyNM;
    }

    public String getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }
}
