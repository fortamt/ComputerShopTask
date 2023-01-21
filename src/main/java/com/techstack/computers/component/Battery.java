package com.techstack.computers.component;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Battery extends Component{

    private String batteryCapacity;
    private String operatingTime;
    private boolean fastCharge;
    private String chargingTime;

    @Override
    public String toString() {
        return "batteryCapacity='" + batteryCapacity + '\'' +
                ", operatingTime='" + operatingTime + '\'' +
                ", fastCharge=" + fastCharge +
                ", chargingTime='" + chargingTime + '\'' +
                ", price=" + price;
    }
}
