package com.experience.project.Projectthree.team.domain;

/**
 * @projectName: newJavaProject
 * @className: NoteBook
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/7 20:54
 * @version: JDK17
 */
public class NoteBook implements Equipment {
    private String model;//机器型号
    private double price;//机器价格

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "（" + price + "）";
    }
}
