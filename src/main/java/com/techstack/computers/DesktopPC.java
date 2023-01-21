package com.techstack.computers;

import com.techstack.computers.component.PSU;
import com.techstack.computers.component.Tower;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class DesktopPC extends Computer {

    private Tower tower;
    private PSU psu;

    @Override
    public float getPrice() {
        return super.getPrice() +
                tower.getPrice() +
                psu.getPrice();
    }

    @Override
    public String getFullProperties() {
        return super.getFullProperties() +
                ", \n\ttower=" + tower +
                ", \n\tPSU=" + psu +
                '}';
    }
}
