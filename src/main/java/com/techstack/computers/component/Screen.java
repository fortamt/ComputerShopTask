package com.techstack.computers.component;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Screen extends Component{

    private float screenSizeInch;
    private String surfaceTreatment;
    private String screenResolution;
    private int refreshRateInHz;
    private String brightness;

    @Override
    public String toString() {
        return "screenSizeInch=" + screenSizeInch +
                ", surfaceTreatment='" + surfaceTreatment + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", refreshRateInHz=" + refreshRateInHz +
                ", brightness='" + brightness + '\'' +
                ", price=" + price;
    }

    public String getShortInfo() {
        return screenSizeInch + " | " + screenResolution;
    }
}
