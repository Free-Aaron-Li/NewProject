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
    private Status status=Status.FREE;//状态
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

    @Override
    public String toString() {
        return super.toString() + "程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }
    //团队成员基本输出
    public String getTeamBaseDetail() {
        return " "+getMemberId()+" /"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t\t";
    }

    //团队成员输出
    public String getDetailsForTeam() {
        return getTeamBaseDetail()+"程序员";
    }
}
