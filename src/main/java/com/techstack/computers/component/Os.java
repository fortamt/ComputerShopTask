package com.techstack.computers.component;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Os extends Component{

    private Type operationalSystem;

    public enum Type {
        WINDOWSXP, WINDOWS7, WINDOWS8, WINDOWS10, WINDOWS11, MACOS, LINUX, ABSENT
    }

    @Override
    public String toString() {
        return "\n\t\tos=" + operationalSystem +
                ", \n\t\tprice=" + price;
    }

    public String getShortInfo() {
        return operationalSystem.name();
    }
}
