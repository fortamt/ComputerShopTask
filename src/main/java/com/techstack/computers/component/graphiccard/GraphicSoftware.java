package com.techstack.computers.component.graphiccard;

import lombok.Builder;

@Builder
public class GraphicSoftware {

    private String directX;
    private float openGLVersion;
    private boolean vrSupport;

    @Override
    public String toString() {
        return "directX='" + directX + '\'' +
                ", openGLVersion=" + openGLVersion +
                ", vrSupport=" + vrSupport;
    }
}
