package com.techstack.computers.component.cpu;

import lombok.Builder;

@Builder
public class CoresAndThreads {

    private int cores;
    private int threads;
    private boolean multithreading;

    @Override
    public String toString() {
        return "cores=" + cores +
                ", threads=" + threads +
                ", multithreading=" + multithreading;
    }
}
