package com.techstack.computers;

import com.techstack.computers.component.Battery;
import com.techstack.computers.component.Screen;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Laptop extends Computer {

    private Screen screen;
    private Battery battery;
    private float weightInKg;

    @Override
    public float getPrice() {
        return super.getPrice() +
                screen.getPrice() +
                battery.getPrice();
    }

    @Override
    public String getFullProperties() {
        return "\t" + super.getFullProperties() +
                ", \n\tscreen=" + screen +
                ", \n\tbattery=" + battery +
                ", \n\tweightInKg=" + weightInKg +
                '}';
    }

    @Override
    public String toString() {
        return super.toString() +
                ", \n\tscreen=" + screen.getShortInfo() +
                ", \n\tweightInKg=" + weightInKg;
    }
}
