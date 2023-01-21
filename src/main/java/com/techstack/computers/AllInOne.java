package com.techstack.computers;

import com.techstack.computers.component.PSU;
import com.techstack.computers.component.Screen;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class AllInOne extends Computer {

    private Screen screen;
    private PSU psu;

    @Override
    public float getPrice() {
        return super.getPrice() +
                screen.getPrice() +
                psu.getPrice();
    }

    @Override
    public String getFullProperties() {
        return "\t" + super.getFullProperties() +
                ", \n\tscreen=" + screen +
                ", \n\tPSU=" + psu +
                '}';
    }

    @Override
    public String toString() {
        return super.toString() +
                ", \n\tscreen=" + screen.getShortInfo();
    }
}
