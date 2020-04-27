import java.io.*;
import java.util.ArrayList;

public class PhoneBookFile {
    public static void readPhoneBook(String path) throws Exception {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<PhoneBook> phoneBooks = (ArrayList<PhoneBook>) objectInputStream.readObject();
            System.out.println(phoneBooks);
            System.out.println("Đọc thành công");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            objectInputStream.close();
            fileInputStream.close();
        }
    }

    public static void writeProduct(ArrayList<PhoneBook> arrayList, String path) throws Exception {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayList);
            System.out.println("Ghi thành công!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            objectOutputStream.close();
            fileOutputStream.close();
        }
    }
}
