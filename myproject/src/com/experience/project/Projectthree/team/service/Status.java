package com.experience.project.Projectthree.team.service;

/**
 * @projectName: newJavaProject
 * @className: Status
 * <th>表示员工状态</th>
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/7 21:09
 * @version: JDK17
 */
public class Status { //枚举
    private final String NAME;
    private Status(String name) {
        this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VACATION");

    public String getNAME() {
        return NAME;
    }
}
