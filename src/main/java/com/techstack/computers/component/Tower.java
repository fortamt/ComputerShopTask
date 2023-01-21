package com.techstack.computers.component;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Tower extends Component{

    private Type towerType;

    public enum Type {
        FULLTOWER, MIDTOWER, MINITOWER, SMALLFORMFACTOR
    }

    @Override
    public String toString() {
        return "\n\t\ttower=" + towerType +
                ", \n\t\tprice=" + price;
    }
}
