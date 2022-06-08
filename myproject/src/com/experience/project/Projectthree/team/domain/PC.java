package com.experience.project.Projectthree.team.domain;

/**
 * @projectName: newJavaProject
 * @className: PC
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/7 20:38
 * @version: JDK17
 */
public class PC implements Equipment {
    private String model;//机器型号
    private String display;//显示器名称

    public PC() {
        super();
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "（" + display + "）";
    }
}
