import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBookManagement phoneBookManagement = new PhoneBookManagement();
        phoneBookManagement.createList();
        showMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        selectMenu(phoneBookManagement, choice);
        phoneBookManagement.displayPhoneBook();
    }

    private static void selectMenu(PhoneBookManagement phoneBookManagement, int choice) {
        try {
            while (choice >= 0 && choice <= 8) {
                switch (choice) {
                    case 1:
                        phoneBookManagement.displayPhoneBook();
                        break;
                    case 2:
                        phoneBookManagement.addPhoneBook();
                        break;
                    case 3:
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Nhập số điện thoại muốn cập nhật: ");
                        String phoneForReplace = scan.nextLine();
                        PhoneBook phoneBook = new PhoneBook();
                        phoneBook.inputData();
                        phoneBookManagement.replaceByPhoneNumber(phoneForReplace, phoneBook);
                        break;
                    case 4:
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Nhập số điện thoại muốn xóa: ");
                        String phoneForRemove = scanner.nextLine();
                        phoneBookManagement.removeByPhoneNumber(phoneForRemove);
                        break;
                    case 5:
                        System.out.println("Nhập số điện thoại muốn tìm: ");
                        Scanner sc = new Scanner(System.in);
                        String phoneForFind = sc.nextLine();
                        if (phoneBookManagement.findNumber(phoneForFind) != null) {
                            System.out.println(phoneBookManagement.findNumber(phoneForFind));
                        } else {
                            System.out.println("Không hợp lệ!");
                        }
                        break;
                    case 6:
                        PhoneBookFile.readPhoneBook("data/contacts.csv");
                        break;
                    case 7:
                        PhoneBookFile.writeProduct(phoneBookManagement.phoneBookList, "data/contacts.csv");
                        break;
                    default:
                        System.out.println("Lựa chọn không tồn tại!");
                }
                System.out.println();
                System.out.println("Mời chọn tiếp?");
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void showMenu() {
        System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ----");
        System.out.println("Chọn chức năng theo số (để tiếp tục");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa ");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng:");
    }
}
