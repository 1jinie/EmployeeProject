package controller;

import exception.EmployeeException;
import service.EmployeeService;
import vo.EmployeeVO;

import java.util.ArrayList;
import java.util.Scanner;

public class searchForNameController implements Controller {
    @Override
    public void execute(Scanner sc) {
        System.out.println("사원정보를 검색합니다...");
        System.out.println("검색할 사원명 일부: ");
        String name = sc.nextLine();

        try{
            ArrayList<EmployeeVO> list = EmployeeService.getInstance().searchFOrNameEmployee(name);

            list.forEach(item -> System.out.println(item));

        } catch (EmployeeException e){
            System.out.println(e.getMessage());
        }
    }
}
