package com.experience.project.Projectthree.team.domain;

import com.experience.project.Projectthree.team.service.Status;

/**
 * @projectName: newJavaProject
 * @className: Programmer
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/7 21:05
 * @version: JDK17
 */
public class Programmer extends Employee {
    private int memberId;//团队id
    private Status status;//状态
    private Equipment equipment;//设备

    public Programmer() {
        super();
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
