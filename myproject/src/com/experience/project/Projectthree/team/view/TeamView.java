package com.experience.project.Projectthree.team.view;

import com.experience.project.Projectthree.team.domain.Employee;
import com.experience.project.Projectthree.team.domain.Programmer;
import com.experience.project.Projectthree.team.service.NameListService;
import com.experience.project.Projectthree.team.service.TeamException;
import com.experience.project.Projectthree.team.service.TeamService;

/**
 * @projectName: newJavaProject
 * @className: TeamView
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/12 16:14
 * @version: JDK17
 */
public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    /**
     * @param
     * @return:
     * @date: 2022/6/12 16:17
     * @description: 主界面显示及控制z
     */
    public void enterMainMenu() {
        boolean loopFlag = true;
        char menu = 0;
        while (loopFlag) {
            if (menu != '1') {
                listAllEmployees();
            }
            System.out.println("1-团队成员 2-添加团队成员 3-删除团队成员 4-退出 请选择（1-4）：");
            menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("确认是否退出（Y/N）：");
                    char isExit = TSUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        loopFlag = false;
                    }
                    break;
            }
        }
    }

    /**
     * @param
     * @return:
     * @date: 2022/6/12 16:18
     * @description: 以表格形式列出公司所有成员
     */
    private void listAllEmployees() {
        System.out.println("-------------------------------开发团队调度软件----------------------------------\n");
        Employee[] employees = listSvc.getAllEmployees();
        //employees==null，避免出现空指针
        if (employees.length == 0 || employees == null) {
            System.out.println("公司中没有任何员工！");
        } else {
            System.out.println("ID\t姓名\t\t年龄\t  工资\t\t职位\t\t状态\t\t奖金\t\t股票\t\t   领用设备");
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
        }
        System.out.println("-------------------------------------------------------------------------------\n");
    }

    /**
     * @param
     * @return:
     * @date: 2022/6/12 16:19
     * @description: 显示团队成员列表操作
     */
    private void getTeam() {
        System.out.println("---------------------------------团队成员列表------------------------------------\n");
        Programmer[] team = teamSvc.getTeam();
        if (team == null || team.length == 0) {
            System.out.println("开发团队目前没有成员！");
        } else {
            System.out.println("TID/ID\t姓名\t\t年龄\t 工资\t\t 职位\t  奖金\t\t股票");
            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i].getDetailsForTeam());
            }
        }
        System.out.println("------------------------------------------------------------------------------\n");

    }

    /**
     * @param:
     * @return:
     * @date: 2022/6/12 16:19
     * @description: 实现添加成员操作
     */
    private void addMember() {
        System.out.println("-----------------------------------添加成员--------------------------------------\n");
        System.out.print("请输入要添加的员工ID：");
        int id = TSUtility.readInt();
        Employee employee = null;
        try {
            employee = listSvc.getEmployee(id);
            teamSvc.addMember(employee);
            System.out.println("添加成功！");
            //按回车剑继续……
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        TSUtility.readReturn();
    }

    /**
     * @param
     * @return:
     * @date: 2022/6/12 16:22
     * @description: 实现删除成员操作
     */
    private void deleteMember() {
        System.out.println("-----------------------------------删除成员--------------------------------------\n");
        System.out.println("请输入要删除员工的ID：");
        int memberId = TSUtility.readInt();
        System.out.println("确认是否删除（Y/N）：");
        char isDelete=TSUtility.readConfirmSelection();
        if(isDelete=='N'){
            return;
        }
        //确认删除团队信息
        try{
            teamSvc.removeMember(memberId);
            System.out.println("删除成功！");
        } catch (TeamException e) {
            System.out.println("删除失败，原因："+e.getMessage());
        }
        TSUtility.readReturn();
    }

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }
}
