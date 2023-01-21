package com.techstack.computers.component.cpu;

import lombok.Builder;

@Builder
public class CPUSpeed {

    private float clockSpeedGHz;
    private float boostClockSpeedGHz;

    @Override
    public String toString() {
        return "clockSpeedGHz=" + clockSpeedGHz +
                ", boostClockSpeedGHz=" + boostClockSpeedGHz;
    }
}
