package Test;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);


        List<Information> list = new ArrayList();
        do {
            System.out.println("Chọn một chức năng: ");
            System.out.println("1. Hiện thị danh sách");
            System.out.println("2. Thêm vào danh sách");
            System.out.println("3. Xóa chỉnh sửa");
            System.out.println("4. Chỉnh sửa");
            System.out.println("5. Kết thúc chương trình");
            choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Danh sách sinh viên là:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("ID: " + i + ", Name");
                }
                break;
                case 2:
                    String inputName;
                    int inputAge;
                    System.out.print("Nhập tên: ");
                    inputName = scanner.next();
                    System.out.print("Nhập tuổi: ");
                    inputAge = scanner.nextInt();
                    Information information = new Information(inputName, inputAge);
                    list.add(information);
                    System.out.println("Add thành công");
                    break;
                case 3:
                    list.clear();
                    break;
            case 4:
        }
        } while (choice != 5);
    }

}
