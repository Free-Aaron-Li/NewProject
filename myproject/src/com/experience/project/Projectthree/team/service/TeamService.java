package com.experience.project.Projectthree.team.service;

import com.experience.project.Projectthree.team.domain.Employee;
import com.experience.project.Projectthree.team.domain.Programmer;

/**
 * @projectName: newJavaProject
 * @className: TeamService
 * <br/>
 * 关于开发团队人员的添加、删除等
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 17:35
 * @version: JDK17
 */
public class TeamService {
    private static int counter = 1;//用来为开发团队新增成员自动生成团队中的唯一ID，即memberID
    private final int MAX_MEMBER=5;//表示团队最大人数
    private Programmer[] team=new Programmer[MAX_MEMBER];//保存开发团队成员
    private int total=0;//记录开发团队中实际人数
    public TeamService(){
        super();
    }
    /**
    * @param
    * @return: team[]:大小为total
    * @date: 2022/6/8 17:43
    * @description: 获取开发团队成员
    */
    public Programmer[] getTeam(){
        Programmer[] team=new Programmer[total];
        for (int i = 0; i < team.length; i++) {
           team[i]=this.team[i];
        }
        return team;
    }
/**
* @param employee
* @return:
* @date: 2022/6/8 17:46
* @description: &nbsp;将指定员工添加到开发团队中
* @exception:
*<ul type="1">
 *     <li>成员已满，无法添加</li>
 *     <li>该成员不是开发人员，无法添加</li>
 *     <li>该员工已经在开发团队</li>
 *     <li>该员工已是团队成员</li>
 *     <li>该员工正在休假，无法添加</li>
 *     <li>团队中至多只能有一名架构师</li>
 *     <li>团队中至多只能有两名设计师</li>
 *     <li>团队中至多只能有三名程序员</li>
*</ul>
*/
    public void addMember(Employee employee) throws TeamException {
        //成员已满，无法添加
        if(total>=MAX_MEMBER){
            throw new TeamException("成员已满，无法添加!!");
        }
        //该成员不是开发人员，无法添加
        if(!(employee instanceof Programmer)){
           throw new TeamException("该成员不是开发人员，无法添加!!");
        }
        //该员工已经在开发团队
        if(isExit(employee)){
            throw new TeamException("该员工已经在开发团队!!");
        }
    }
    /**
    * @param employee
    * @return: boolean
    * @date: 2022/6/8 18:11
    * @description: 判断指定员工是否已经存在于现有的开发团队中
    */
    private boolean isExit(Employee employee){
        for (int i = 0; i < total; i++) {
           if(team[i].getId()==employee.getId()){
               return true;
           }
        }
        return false;
    }
    public void removeMember(int memberId   ){}
}
