package com.techstack.computers.component.motherboard;

import lombok.Builder;

@Builder
public class IntegratedAudio {

    private String audioChip;
    private float soundChannels;

    @Override
    public String toString() {
        return "audioChip='" + audioChip + '\'' +
                ", soundChannels=" + soundChannels;
    }
}
