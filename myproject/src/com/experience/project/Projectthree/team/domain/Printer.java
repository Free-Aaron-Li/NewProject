package com.experience.project.Projectthree.team.domain;

/**
 * @projectName: newJavaProject
 * @className: Printer
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/7 20:58
 * @version: JDK17
 */
public class Printer implements Equipment{
    private String name;//机器型号
    private String type;//机器类型

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name+"（"+type+"）";
    }
}
