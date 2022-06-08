package com.experience.project.Projectthree.team.service;

import com.experience.project.Projectthree.team.domain.*;

import static com.experience.project.Projectthree.team.service.Data.*;

/**
 * @projectName: newJavaProject
 * @className: NameListService
 * <br/>
 * 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/7 21:33
 * @version: JDK17
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
    }

    //给employees及数组元素初始化
    public Employee[] getAllEmployees() {
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            //获取员工的类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);

            //获取Employee的4个基本信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment;
            double bonus;//奖金
            int stock;//股票
            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
        return null;
    }

    //获取指定index上的员工设备
    private Equipment createEquipment(int index) {
        int type = Integer.parseInt(EQUIPMENTS[index][0]);
        switch (type) {
            case Data.PC:
                return new PC(EQUIPMENTS[index][1], EQUIPMENTS[index][2]);//PC(model,display)
            case NOTEBOOK:
                double price = Integer.parseInt(EQUIPMENTS[index][2]);
                return new NoteBook(EQUIPMENTS[index][1], price);//NotBook(model,price)
            case Data.PRINTER:
                return new Printer(EQUIPMENTS[index][1], EQUIPMENTS[index][2]);//Printer(name,type)
        }
        return null;
    }
    
   /**
    * @return: 包含所有员工对象的数组
    * @param null 
    * @date: 2022/6/8 9:59
    * @description: 获取当前所有员工
    */  
    public Employee[] getEmployees(int id) {
        return null;
    }
}
