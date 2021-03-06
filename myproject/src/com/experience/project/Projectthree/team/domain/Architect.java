package com.experience.project.Projectthree.team.domain;

/**
 * @projectName: newJavaProject
 * @className: Architect
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/7 21:30
 * @version: JDK17
 */
public class Architect extends Designer {
    private int stock;//股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        return getDetails() + "架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
    }    //团队成员输出

    public String getDetailsForTeam() {
        return getTeamBaseDetail() + "架构师\t" + getBonus()+"\t\t"+getStock();
    }
}
