package com.techstack.computers.component.motherboard;

import lombok.Builder;

@Builder
public class NetworkInterface {

    private String wifi;
    private String bluetooth;
    private String lanController;
    private float lanSpeedInGbps;

    @Override
    public String toString() {
        return "wifi='" + wifi + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                ", LANController='" + lanController + '\'' +
                ", LANSpeedInGbps=" + lanSpeedInGbps;
    }
}
