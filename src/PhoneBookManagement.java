import java.util.ArrayList;

public class PhoneBookManagement {
    ArrayList<PhoneBook> phoneBookList = new ArrayList<>();

    public void createList() {
        PhoneBook phoneBook1 = new PhoneBook("0969356688", "Family", "Thanh Bui", "Male", "123 Me Tri", "28/02/1992", "thanhbui@hotmail.com");
        PhoneBook phoneBook2 = new PhoneBook("0969123456", "Work", "Chau Le", "FeMale", "69 Pham Hung", "08/12/1989", "chauchau@hotmail.com");
        PhoneBook phoneBook3 = new PhoneBook("0913530956", "Friend", "Hong Hoa", "FeMale", "10 Van Cao", "18/10/1990", "Hoahoa@hotmail.com");
        phoneBookList.add(phoneBook1);
        phoneBookList.add(phoneBook2);
        phoneBookList.add(phoneBook3);
    }

    public void displayPhoneBook() {
        System.out.printf("%-17s%-10s%-15s%-10s%-17s%-17s%-17s", "Phone Number", "Group", "FullName", "Gender", "Address", "Date Of Birth", "Email");
        try {
            for (PhoneBook phoneBook : phoneBookList) {
                System.out.printf("\n%-17s%-10s%-15s%-10s%-17s%-17s%-17s", phoneBook.getPhoneNumber(),
                        phoneBook.getGroup(), phoneBook.getName(), phoneBook.getGender(), phoneBook.getAddress(),
                        phoneBook.getDateOfBirth(), phoneBook.getEmail());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void addPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.inputData();
        phoneBookList.add(phoneBook);
    }

    public PhoneBook replaceByPhoneNumber(String phoneNumber, PhoneBook phoneBook) {
        for (PhoneBook value : phoneBookList) {
            if (value.getPhoneNumber().equals(phoneNumber)) {
                value.setPhoneNumber(phoneBook.getPhoneNumber());
                value.setGroup(phoneBook.getGroup());
                value.setName(phoneBook.getName());
                value.setGender(phoneBook.getGender());
                value.setAddress(phoneBook.getAddress());
                value.setDateOfBirth(phoneBook.getDateOfBirth());
                value.setEmail(phoneBook.getEmail());
            }
        }
        return null;
    }

    public void removeByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < phoneBookList.size(); i++) {
            if (phoneBookList.get(i).getPhoneNumber().equals(phoneNumber)) {
                phoneBookList.remove(phoneBookList.get(i));
            }
        }
    }

    public PhoneBook findNumber(String value) {
        for (PhoneBook phoneBook : phoneBookList) {
            if (phoneBook.getPhoneNumber().equals(value)) {
                return phoneBook;
            }
            if (phoneBook.getName().equals(value)) {
                return phoneBook;
            }
        }
        return null;
    }
}
