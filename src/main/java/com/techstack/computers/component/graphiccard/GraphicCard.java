package com.techstack.computers.component.graphiccard;

import com.techstack.computers.component.Component;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class GraphicCard extends Component {

    private String connectionInterface;
    private GPUInfo gpuInfo;
    private GraphicSoftware graphicSoftware;

    @Override
    public String toString() {
        return "\n\t\tconnectionInterface='" + connectionInterface + '\'' +
                ", \n\t\tgpuInfo=" + gpuInfo +
                ", \n\t\tgraphicSoftware=" + graphicSoftware +
                ", \n\t\tprice=" + price;
    }

    public String getShortInfo() {
        return gpuInfo.getGpuModel() + " | " + gpuInfo.getMemorySizeInGb() + " GB";
    }
}
