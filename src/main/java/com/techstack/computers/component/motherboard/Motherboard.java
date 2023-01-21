package com.techstack.computers.component.motherboard;

import com.techstack.computers.component.Component;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Motherboard extends Component {

    private MotherboardMainInfo motherboardMainInfo;
    private MotherboardChipset motherboardChipset;
    private MotherboardMemory motherboardMemory;
    private VideoOutputs videoOutputs;
    private IntegratedAudio integratedAudio;
    private DriveInterface driveInterface;
    private NetworkInterface networkInterface;
    private ExpansionSlots expansionSlots;
    private ExternalConnections externalConnections;
    private PowerConnectors powerConnectors;

    @Override
    public String toString() {
        return "\n\t\tmotherboardMainInfo=" + motherboardMainInfo +
                ", \n\t\tmotherboardChipset=" + motherboardChipset +
                ", \n\t\tmotherboardMemory=" + motherboardMemory +
                ", \n\t\tvideoOutputs=" + videoOutputs +
                ", \n\t\tintegratedAudio=" + integratedAudio +
                ", \n\t\tdriveInterface=" + driveInterface +
                ", \n\t\tnetworkInterface=" + networkInterface +
                ", \n\t\texpansionSlots=" + expansionSlots +
                ", \n\t\texternalConnections=" + externalConnections +
                ", \n\t\tpowerConnectors=" + powerConnectors +
                ", \n\t\tprice=" + price;
    }
}
