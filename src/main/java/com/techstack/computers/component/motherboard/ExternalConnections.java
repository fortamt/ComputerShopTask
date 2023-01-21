package com.techstack.computers.component.motherboard;

import lombok.Builder;

@Builder
public class ExternalConnections {

    private int usb2Slots;
    private int usb3Slots;

    @Override
    public String toString() {
        return "USB2Slots=" + usb2Slots +
                ", USB3Slots=" + usb3Slots;
    }
}
