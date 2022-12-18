package file;

// Import package cần thiết
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class docfile {
    public static void main(String args[]) throws FileNotFoundException {
        String htt="2851";
        String url="P:\\Code_QuanTrong\\Code_Khoa_Hoc\\backend\\TP_Store\\src\\main\\resources\\static\\noidung\\"+htt +".txt";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);

        try {
            while (scanner.hasNextLine()) {

//                System.out.println(scanner.nextLine());
                String id =scanner.nextLine();
                System.out.println(id);
            }
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException ex) {

            }
        }
    }
}