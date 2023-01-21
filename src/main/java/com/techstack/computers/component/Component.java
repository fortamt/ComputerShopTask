package com.techstack.computers.component;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class Component {
    protected float price;

    public float getPrice() {
        return price;
    }
}
