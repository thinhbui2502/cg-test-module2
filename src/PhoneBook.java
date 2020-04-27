import java.sql.SQLOutput;
import java.util.Scanner;

public class PhoneBook {
    private String phoneNumber;
    private String group;
    private String name;
    private String gender;
    private String address;
    private String dateOfBirth;
    private String email;

    public PhoneBook() {
    }

    public PhoneBook(String phoneNumber, String group, String name, String gender, String address, String dateOfBirth, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại:");
        this.phoneNumber = scanner.nextLine();
        System.out.println("Nhập nhóm: ");
        this.group = scanner.nextLine();
        System.out.println("Nhập tên đầy đủ ");
        this.name = scanner.nextLine();
        System.out.println("Nhập giới tính ");
        this.gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ ");
        this.address = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        this.dateOfBirth = scanner.nextLine();
        System.out.println("Nhập email: ");
        this.email = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "PhoneBook["
                + "phoneNumber: "
                + phoneNumber
                + ", group: "
                + group
                + ", name: "
                + name
                + ", gender: "
                + gender
                + ", address: "
                + address
                + ", dateOfBirth: "
                + dateOfBirth
                + ", email: "
                + email
                + ']';
    }
}
