package com.techstack.computers;

import com.techstack.computers.component.*;
import com.techstack.computers.component.cpu.CPU;
import com.techstack.computers.component.graphiccard.GraphicCard;
import com.techstack.computers.component.motherboard.Motherboard;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.stream.Collectors;

@SuperBuilder
public abstract class Computer {

    private String nameAndModelInfo;
    private CPU cpu;
    private List<RAM> ram;
    private List<HardDrive> hardDrive;
    private GraphicCard graphicCard;
    private Motherboard motherboard;
    private Os os;
    private Type type;

    public String getNameAndModelInfo() {
        return nameAndModelInfo;
    }

    public float getPrice() {
        return cpu.getPrice() +
                getTotalPriceFromList(ram) +
                getTotalPriceFromList(hardDrive) +
                graphicCard.getPrice() +
                motherboard.getPrice() +
                os.getPrice();
    }

    public String getFullProperties() {
        return "-------------------------------------------------\n" +
                nameAndModelInfo + " | " + type.name() + " | " + getPrice() + "$" +
                "\n\tcpu=" + cpu +
                ", \n\tram=" + ram +
                ", \n\thardDrive=" + hardDrive +
                ", \n\tgraphicCard=" + graphicCard +
                ", \n\tmotherboard=" + motherboard +
                ", \n\tos=" + os;
    }

    @Override
    public String toString() {
        return "-------------------------------------------------\n" +
                nameAndModelInfo + " | " + type.name() + " | " + getPrice() + "$" +
                "\n\tcpu=" + cpu.getShortInfo() +
                ", \n\tram=" + ram.stream().map(RAM::getShortInfo).collect(Collectors.joining(" + ")) +
                ", \n\thardDrive=" + hardDrive.stream().map(HardDrive::getShortInfo).collect(Collectors.joining(" + ")) +
                ", \n\tgraphicCard=" + graphicCard.getShortInfo() +
                ", \n\tos=" + os.getShortInfo();
    }

    public enum Type {
        LAPTOP, DESKTOPPC, ALLINONE
    }

    private float getTotalPriceFromList(List<? extends Component> components) {
        int price = 0;
        for (Component component: components) {
            price += component.getPrice();
        }
        return price;
    }
}
