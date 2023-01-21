package com.techstack.computers.component.motherboard;

import lombok.Builder;

@Builder
public class ExpansionSlots {

    private int pciExpress16Slots;

    @Override
    public String toString() {
        return "PCIExpress16Slots=" + pciExpress16Slots;
    }
}
