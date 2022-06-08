package com.experience.project.Projectthree.team.service;

import java.io.Serial;

/**
 * @projectName: newJavaProject
 * @className: TeamException
 * <br/>
 * 自定义异常类： 找不到指定员工
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 16:03
 * @version: JDK17
 */
public class TeamException extends Exception {

    @Serial
    private static final long serialVersionUID = 8629777640989500330L;

    public TeamException() {
        super();
    }

    public TeamException(String msg) {
        super(msg);
    }
}
