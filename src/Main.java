import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("------- Manu Bar ------");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị tất cả sinh viên");
            System.out.println("3. Sửa thông tin Sinh viên bằng id");
            System.out.println("4. Xóa học sinh bằng id");
            System.out.println("5. Tìm sinh viên qua id");
            System.out.println("6. Range student by average point");
            System.out.println("7. Tìm sinh viên có điểm trung bình cao nhât");
            System.out.println("0. Exit");
            System.out.print("Enter you choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    managerStudent.addStudent();
                case 2:
                    managerStudent.displayAllStudent();
                    break;
                case 3:
                    managerStudent.editStudentById();
                    break;
                case 4:
                    managerStudent.deleteStudentById();
                    break;
                case 5:
                    managerStudent.findStudentById();
                    break;
                case 6:
                    managerStudent.
                    break;
                case 7:
                    managerStudent.findMaxAveragePoint();
                    break;
            }
        } while (choice != 0);
    }
}
