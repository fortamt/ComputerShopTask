package com.techstack.computers.component;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class HardDrive extends Component{

    private int sizeGb;
    private int yearsOfWarranty;
    private String connectionInterface;
    private int cacheMemoryMb;
    private String dataTransferRate;
    private int shockproofInG;
    private int readingNoiseLevelInDb;
    private int standByNoiseLevelInDb;

    @Override
    public String toString() {
        return "\n\t\tsizeGb=" + sizeGb +
                ", \n\t\tyearsOfWarranty=" + yearsOfWarranty +
                ", \n\t\tconnectionInterface='" + connectionInterface + '\'' +
                ", \n\t\tcacheMemoryMb=" + cacheMemoryMb +
                ", \n\t\tdataTransferRate='" + dataTransferRate + '\'' +
                ", \n\t\tshockproofInG=" + shockproofInG +
                ", \n\t\treadingNoiseLevelInDb=" + readingNoiseLevelInDb +
                ", \n\t\tstandByNoiseLevelInDb=" + standByNoiseLevelInDb +
                ", \n\t\tprice=" + price;
    }

    public String getShortInfo() {
        return String.valueOf(sizeGb);
    }
}
