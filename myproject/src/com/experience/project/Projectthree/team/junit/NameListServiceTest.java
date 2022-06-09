package com.experience.project.Projectthree.team.junit;

import com.experience.project.Projectthree.team.domain.Employee;
import com.experience.project.Projectthree.team.service.NameListService;
import com.experience.project.Projectthree.team.service.TeamException;
import org.junit.jupiter.api.Test;

/**
 * @projectName: newJavaProject
 * @className: NameListServiceTest
 * <br/>
 * 对NameListService的测试
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 16:09
 * @version: JDK17
 */
public class NameListServiceTest {
    @Test
    public void testGetNameListService() {
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    @Test
    public void testGetEmploy(){
        NameListService service = new NameListService();
        int id=12;
        try {
            System.out.println(service.getEmployee(id));
        } catch (TeamException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
