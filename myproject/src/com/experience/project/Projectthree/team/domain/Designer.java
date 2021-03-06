package com.experience.project.Projectthree.team.domain;

/**
 * @projectName: newJavaProject
 * @className: Designer
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/7 21:27
 * @version: JDK17
 */
public class Designer extends Programmer {
    private double bonus;//奖金

    byte b=127;
    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return getDetails() + "设计师\t" + getStatus() + "\t" + bonus + "\t\t\t" + getEquipment().getDescription();
    }

    //团队成员输出
    public String getDetailsForTeam() {
        return getTeamBaseDetail() + "设计师\t" + getBonus();
    }
}
