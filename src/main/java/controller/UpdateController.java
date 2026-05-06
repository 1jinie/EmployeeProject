package controller;

import exception.EmployeeException;
import service.EmployeeService;
import vo.EmployeeVO;

import java.util.Scanner;

public class UpdateController implements Controller {
    @Override
    public void execute(Scanner sc) {
        System.out.println("사원정보를 수정합니다...");
        System.out.println("수정할 사원번호: ");
        String id = sc.nextLine();

        try {
            EmployeeVO vo = EmployeeService.getInstance().searchEmployee(id);

            System.out.println("수정된 사원명: ");
            vo.setName(sc.nextLine());
            System.out.println("수정된 직급: ");
            vo.setPosition(sc.nextLine());
            System.out.println("수정된 급여: ");
            vo.setSalary(sc.nextInt()); sc.nextLine();
            System.out.println("수정된 입사일: ");
            vo.setHireDate(sc.nextLine());

            System.out.println("사원정보 수정 완료");

        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
            System.out.println("사원정보 수정에 실패했습니다.");
        }
    }
}
