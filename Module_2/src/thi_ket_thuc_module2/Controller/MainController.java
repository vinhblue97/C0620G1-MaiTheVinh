package thi_ket_thuc_module2.Controller;

import thi_ket_thuc_module2.Common.FileUtil;
import thi_ket_thuc_module2.models.Telephone;
import thi_ket_thuc_module2.task.Delete;
import thi_ket_thuc_module2.task.DisplayNumberList;
import thi_ket_thuc_module2.task.NewNumberPhone;
import thi_ket_thuc_module2.task.UpdateInfor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {

    List<Telephone> telephoneNumberLists = new ArrayList<>();

    public MainController() {

    }

    public void displayMenu() {
        for (Telephone phone : telephoneNumberLists) {
            System.out.println(phone.toString());
        }
        Scanner scanner = new Scanner(System.in);
        loop:
        do {
            System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----\n" +
                    "Chọn chức năng theo số (để tiếp tục) :\n" +
                    "1. Xem danh sách\n" +
                    "2. Thêm mới\n" +
                    "3. Cập nhật\n" +
                    "4. Xóa\n" +
                    "5. Tìm kiếm\n" +
                    "6. Đọc từ file\n" +
                    "7. Ghi từ file\n" +
                    "8. Thoát\n");
            System.out.print("Chọn chức năng: ");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    DisplayNumberList displayNumberList = new DisplayNumberList(telephoneNumberLists);
                    displayNumberList.displayList();
                    break;
                case "2":
                    NewNumberPhone addNewNumberPhone = new NewNumberPhone(telephoneNumberLists);
                    telephoneNumberLists = addNewNumberPhone.addNewPhone();
                    break;
                case "3":
                    UpdateInfor updateInfor = new UpdateInfor(telephoneNumberLists);
                    updateInfor.updateInfor();
                    break;
                case "4":
                    Delete delete = new Delete(telephoneNumberLists);
                    telephoneNumberLists = delete.delete();
                    break;
                case "5":

                    break;
                case "6":
                    FileUtil read = new FileUtil();
                    telephoneNumberLists = read.readFileCSV();
                    break;
                case "7":
                    FileUtil write = new FileUtil();
                    write.writeCSV(telephoneNumberLists);
                    break;
                case "8":
                    break loop;
                default:
                    System.out.println("Hãy nhập lại đúng số trên menu: ");
            }
        } while (true);
    }
}
