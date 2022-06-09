package com.experience.project.Projectthree.team.service;

import com.experience.project.Projectthree.team.domain.Architect;
import com.experience.project.Projectthree.team.domain.Designer;
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
    private final int MAX_MEMBER = 5;//表示团队最大人数
    private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队成员
    private int total = 0;//记录开发团队中实际人数

    public TeamService() {
        super();
    }

    /**
     * @param
     * @return: team[]:大小为total
     * @date: 2022/6/8 17:43
     * @description: 获取开发团队成员
     */
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * @param employee
     * @return:
     * @date: 2022/6/8 17:46
     * @description: &nbsp;将指定员工添加到开发团队中
     * @exception: <ul type="1">
     * <li>成员已满，无法添加</li>
     * <li>该成员不是开发人员，无法添加</li>
     * <li>该员工已经在开发团队</li>
     * <li>该员工已是团队成员</li>
     * <li>该员工正在休假，无法添加</li>
     * <li>团队中至多只能有一名架构师</li>
     * <li>团队中至多只能有两名设计师</li>
     * <li>团队中至多只能有三名程序员</li>
     * </ul>
     */
    public void addMember(Employee employee) throws TeamException {
        //一、成员已满，无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加！！");
        }
        //二、该成员不是开发人员，无法添加
        if (!(employee instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加！！");
        }
        //三、该员工已经在开发团队
        if (isExit(employee)) {
            throw new TeamException("该员工已经在开发团队！！");
        }
        //四、该员工已是团队成员
        //五、该员工正在休假，无法添加
        Programmer programmer = (Programmer) employee;//一定不会出现ClassCastException,因为异常二已经判断
        if ("BUSY".equalsIgnoreCase(programmer.getStatus().getNAME())) {//相较于if(programmer.getStatus().getNAME().equals("BUSY")),这种方式出现空指针异常的概率更小
            throw new TeamException("该员工已是团队成员！！");//通过比较状态
        } else if ("VOCATION".equalsIgnoreCase(programmer.getStatus().getNAME())) {//equalsIgnoreCase:忽略大小写比较
            throw new TeamException("该员工正在休假！！");
        }

        //获取team中已有的架构师、设计师、程序员的人数
        int numOfArch = 0, numOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }

        //六、团队中至多只能有一名架构师        if(programmer instanceof Architect){
        if (numOfArch >= 1) {
            throw new TeamException("团队中至多只能有一名架构师！！");
        }
        //七、团队中至多只能有两名设计师
        else if (numOfDes >= 2) {
            throw new TeamException("团队中至多只能有两名设计师！！");
        }
        //八、团队中至多只能有三名程序员
        else if (numOfPro >= 3) {
            throw new TeamException("团队中至多只能有三名程序员！！");
        }

        //九、将programmer添加到现有的team中
        team[total++] = programmer;
        //十、将programmer的属性赋值

        //TeamID
        programmer.setMemberId(counter++);
        //状态更改
        programmer.setStatus(Status.BUSY);
    }

    /**
     * @param employee
     * @return: boolean
     * @date: 2022/6/8 18:11
     * @description: 判断指定员工是否已经存在于现有的开发团队中
     */
    private boolean isExit(Employee employee) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == employee.getId()) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param memberId
     * @return:
     * @date: 2022/6/9 9:18
     * @description: 移除团队开发者
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                //更改状态
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        //未找到指定memberId的情况
        if(i==total){
            throw new TeamException("找不到指定memberId的员工，删除失败！！");
        }
        //覆盖
        for (int j = i = 1; j < total; j++) {
            team[j - 1] = team[j];
        }
        //最后一个数组设置为null
        team[--total] = null;

    }
}
