package Module2TestPractice.service;

import Module2TestPractice.module.AccountLessor;
import Module2TestPractice.utils.CheckValidate;
import Module2TestPractice.utils.ReadAndWrite;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountLessorJob extends AccountLessor {
    String filePath = "E:\\Study\\CodegymStudyMaterials\\module_02\\src\\Module2TestPractice\\data\\lessor.csv";
    List<AccountLessor> listAccountLessor = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void display() throws ParseException {
        loadDataFromFile();
        for (AccountLessor accountLessor : listAccountLessor) {
            System.out.println(accountLessor.toString());
        }
    }

    public void loadDataFromFile() throws ParseException {
        DateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        List<String[]> list = ReadAndWrite.read(filePath);
        listAccountLessor.clear();
        for (String[] item : list) {
            AccountLessor accountLessor = new AccountLessor(item[0], item[1], dateFormat.parse(item[2]), Integer.parseInt(item[3]), Boolean.parseBoolean(item[4]), Float.parseFloat(item[5]), Float.parseFloat(item[6]), Integer.parseInt(item[7]), Float.parseFloat(item[8]));
            listAccountLessor.add(accountLessor);
        }
    }

    public void add() throws Throwable {
        System.out.println("Hay nhap thong tin nguoi cho thue");
        System.out.println("Hay nhap cccd (12 chu so)");
        String cccd = CheckValidate.accountDuplicateLessorException(listAccountLessor, CheckValidate.iDInvalidException());
        System.out.println("Hay nhap ho ten");
        String hoTen = CheckValidate.checkEmptyString();
        System.out.println("Hay nhap ngay Sinh");
        Date ngaySinh = (Date) CheckValidate.AccountInvalidException();
        System.out.println("Hay nhap gioi Tinh (1: Nam ; 0: Nu)");
        int gioiTinh = 0;
        boolean valueGioiTinhTrue = false;
        while (!valueGioiTinhTrue) {
            switch (gioiTinh = Integer.parseInt(scanner.nextLine())) {
                case 0:
                    gioiTinh = 0;
                    valueGioiTinhTrue = true;
                    break;
                case 1:
                    gioiTinh = 1;
                    valueGioiTinhTrue = true;
                    break;
                default:
                    System.out.println("hay nhap 1 hoac 2");
            }
        }
        System.out.println("Hay nhap trang Thai (0: chua su dung dich vu; 1: da su dung dich vu)");
        boolean trangThai = false;
        boolean valueTrangThaiTrue = false;
        while (!valueTrangThaiTrue) {
            try {
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 0:
                        trangThai = false;
                        valueTrangThaiTrue = true;
                        break;
                    case 1:
                        trangThai = true;
                        valueTrangThaiTrue = true;
                        break;
                    default:
                        System.out.println("hay nhap 0 hoac 1");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Hay nhap dung dinh dang so!");
            }
        }
        System.out.println("Hay nhap min Dien Tich");
        float minDienTich = 0;
        minDienTich = CheckValidate.checkValueFloat(minDienTich);
        System.out.println("Hay nhap max Dien Tich");
        float maxDienTich = 0;
        maxDienTich = CheckValidate.checkValueFloat(maxDienTich);
        System.out.println("Hay nhap min Gia Tien");
        float minGiaTien = 0;
        minGiaTien = CheckValidate.checkValueFloat(minGiaTien);
        System.out.println("Hay nhap max Gia Tien");
        float maxGiaTien = 0;
        maxGiaTien = CheckValidate.checkValueFloat(maxGiaTien);
        AccountLessor newAccountLessor = new AccountLessor(cccd, hoTen, ngaySinh, gioiTinh, trangThai, minDienTich, maxDienTich, minGiaTien, maxGiaTien);
        listAccountLessor.add(newAccountLessor);
        ReadAndWrite.write(newAccountLessor.getInfor(), filePath);
        System.out.println("da them thanh cong");
    }
}
