package com.techstack.computers.component;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class PSU extends Component{

    private int powerW;
    private String fanBearing;
    private String cpuPowerConnectors;
    private int sataConnectors;
    private int pciExpressConnectors;
    private int yearsOfWarranty;

    @Override
    public String toString() {
        return "\n\t\tpowerW=" + powerW +
                ", \n\t\tfanBearing='" + fanBearing + '\'' +
                ", \n\t\tCPUPowerConnectors='" + cpuPowerConnectors + '\'' +
                ", \n\t\tsataConnectors=" + sataConnectors +
                ", \n\t\tPCIExpressConnectors=" + pciExpressConnectors +
                ", \n\t\tyearsOfWarranty=" + yearsOfWarranty +
                ", \n\t\tprice=" + price;
    }
}
