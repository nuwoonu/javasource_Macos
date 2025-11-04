package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.dto.ProfessorDTO;
import student2.dto.StudentDTO;
import student2.service.DeptService;
import student2.service.ProfessorService;
import student2.service.StudentService;

public class DeptMain {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        DeptService deptService = new DeptService();
        ProfessorService professorService = new ProfessorService();
        StudentService studentService =new StudentService();
        ConsoleInfo info = new ConsoleInfo();

        while(run)
        {
            System.out.println("======================================================================================");
            System.out.print("1. 학과등록 |");
            System.out.print("2. 학과수정 |");
            System.out.print("3. 학과삭제 |");
            System.out.print("4. 학과조회 |");
            System.out.print("5. 전체학과조회 |");
            System.out.println();
            System.out.println("6. 교수정보 입력");
            System.out.println("7. 교수정보 수정");
            System.out.println("8. 교수정보 삭제");
            System.out.println("9. 교수정보 조회");
            System.out.println();
            System.out.println("10. 학생정보 입력");
            System.out.println("11. 학생정보 수정");
            System.out.println("12. 학생정보 삭제");
            System.out.println("13. 학과별 조회");
            System.out.println("14. 개인별 조회");
            System.out.println("15. 프로그램 종료");
            System.out.println("======================================================================================");
            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    // 추가할 학과번호, 학과명 입력받기.
                    DeptDTO dto = info.setDept(sc);
                    boolean result = deptService.addDept(dto);
                    System.out.println(result ? "학과정보 추가 성공" : "학과정보 추가 실패");
                    break;
            
                case 2:
                    // 수정할 학과정보 입력받기
                    dto = info.setDept(sc);
                    // service 작업
                    result = deptService.updateDept(dto);
                    System.out.println(result ? "학과정보 수정 성공" : "학과정보 수정 실패");
                    break;
            
                case 3:
                    // 삭제할 학과번호 입력받기
                    String deptId = info.getDeptId(sc);
                    // 서비스작업
                    result = deptService.removeDept(deptId);
                    System.out.println(result ? "학과정보 삭제 성공" : "학과정보 삭제 실패");
                    break;
                case 4:

                    String deptName = info.getDeptName(sc);
                    dto = deptService.getDept(deptName);
                    info.print(dto);
                    break;
            
                case 5:
                    List<DeptDTO> list = deptService.getDepts();
                    info.printAll(list);
                    break;
                case 6:
                    // 교수정보 입력받기
                    ProfessorDTO professorDTO = info.insertProfessor(sc);
                    // 입력정보 서비스로 넘겨준 후 결과 받기.
                    result = professorService.insertProfessor(professorDTO);
                    System.out.println(result ? "교수 정보 입력 성공" : "교수 정보 추가 실패");
                    break;                
                case 7:
                    // 수정할 교수정보 입력받기
                    professorDTO =info.updateProfessor(sc);
                    // 수정 정보 서비스로 넘겨준 후 결과 받기
                    result =professorService.updateProfessor(professorDTO);
                    System.out.println(result ? "교수 정보 수정 성공" : "교수 정보 수정 실패");
                    break;                
                case 8:
                    // 삭제할 교수정보 입력받기
                    String profId =info.deleteProfessor(sc);
                    // 삭제정보 서비스 넘겨준 후 결과받기
                    result = professorService.deleteProfessor(profId);
                    System.out.println(result ? "교수 정보 삭제 성공" : "교수 정보 삭제 실패");
                    break;                
                case 9:
                    // 조회할 교수정보 입력받기
                    profId =info.selectProfessor(sc);
                    // 조회정보 서비스 넘겨준 후 결과받기
                    professorDTO = professorService.getProfessor(profId);

                    //받은결과 출력
                    info.printProfessor(professorDTO);

                    break;   
                case 10: //학생입력
                    StudentDTO studentDTO = info.insertStudent(sc);
                    result = studentService.insertStudent(studentDTO);
                    System.out.println(result ? "학생 정보 입력 성공" : "학생 정보 추가 실패");
                    break;             
                case 11: // 수정
                    studentDTO =info.updateStudentDTO(sc);
                    // 수정 정보 서비스로 넘겨준 후 결과 받기
                    result =studentService.updateStudent(studentDTO);
                    System.out.println(result ? "학생 정보 수정 성공" : "학생 정보 수정 실패");
                    break;             
                case 12: // 삭제
                    String Student =info.delteStudent(sc);
                    // 삭제정보 서비스 넘겨준 후 결과받기
                    result = studentService.deleteStudent(Student);
                    System.out.println(result ? "학생 정보 삭제 성공" : "학생 정보 삭제 실패");
                    break;             
                case 13: //학과별 조회
                    deptId = info.getDeptStudent(sc);
                    List<StudentDTO> sList = studentService.getStudents(deptId);
                    info.printAllStudent(sList);

                    break;             
                case 14:
                    String studentId = info.getStudentId(sc);
                    studentDTO = studentService.getStudent(studentId);
                    info.printStudent(studentDTO);
                    break;             
                case 15:
                    run = false;
                    break;

                default:
                    break;
            }
        }

    }
}
