import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị tất cả sinh viên");
            System.out.println("3. Sửa thông tin Sinh viên bằng id");
            System.out.println("4. Xóa học sinh bằng id");
            System.out.println("5. Tìm sinh viên qua id");
            System.out.println("6. Tìm sinh viên có điểm trung bình cao nhât");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: ;
                    managerStudent.addStudent();
                    break;
                case 2:
                    managerStudent.displayAllStudent();
                    break;
                case 3:
                    System.out.println("Nhập id sinh viên Muốn sửa: ");
                    int editId = scanner.nextInt();
                    System.out.println(managerStudent.editStudentById(editId));
                    break;
                case 4:
                    System.out.println("Nhập id sinh viên bạn muốn xóa: ");
                    int deleteId = scanner.nextInt();
                    System.out.println(managerStudent.deleteStudentById(deleteId));
                    break;
                case 5:
                    System.out.println("Nhập id sinh viên muốn tìm: ");
                    int findId = scanner.nextInt();
                    managerStudent.findStudentById(findId);
                    break;
                case 6:
                    managerStudent.findMaxAveragePoint();
                    break;
            }
        } while (choice != 0);
    }
}
