package com.techstack.computers.component.motherboard;

import lombok.Builder;

@Builder
public class MotherboardMainInfo {

    private String socket;
    private String formFactor;

    @Override
    public String toString() {
        return "socket='" + socket + '\'' +
                ", formFactor='" + formFactor + '\'';
    }
}
