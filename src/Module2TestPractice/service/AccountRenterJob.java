package Module2TestPractice.service;

import Module2TestPractice.module.AccountRenter;
import Module2TestPractice.utils.CheckValidate;
import Module2TestPractice.utils.ReadAndWrite;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AccountRenterJob extends AccountRenter {
    String filePath = "E:\\Study\\CodegymStudyMaterials\\module_02\\src\\Module2TestPractice\\data\\renter.csv";
    List<AccountRenter> listAccountRenter = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void display() throws ParseException {
        loadDataFromFile();
        for (AccountRenter accountRenter : listAccountRenter) {
            System.out.println(accountRenter.toString());
        }
    }

    public void loadDataFromFile() throws ParseException {
        DateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        List<String[]> list = ReadAndWrite.read(filePath);
        listAccountRenter.clear();
        for (String[] item : list) {
            AccountRenter accountRenter = new AccountRenter(item[0], item[1], dateFormat.parse(item[2]), Integer.parseInt(item[3]), Boolean.parseBoolean(item[4]), Float.parseFloat(item[5]) ,item[6], Integer.parseInt(item[7]), Float.parseFloat(item[8]));
            listAccountRenter.add(accountRenter);
        }
    }

    public void add() throws Throwable {
        System.out.println("Hay nhap thong tin nguoi cho thue");
        System.out.println("Hay nhap cccd (12 chu so)");
        String cccd = CheckValidate.accountDuplicateRenterException(listAccountRenter, CheckValidate.iDInvalidException());
        System.out.println("Hay nhap ho ten");
        String hoTen = CheckValidate.checkEmptyString();
        System.out.println("Hay nhap ngay Sinh");
        Date ngaySinh = CheckValidate.AccountInvalidException();
        System.out.println("Hay nhap gioi Tinh (0: Nu; 1: Nam)");
        int gioiTinh = 0;
        boolean valueGioiTinhTrue = true;
        while (valueGioiTinhTrue){
            switch (gioiTinh = Integer.parseInt(scanner.nextLine())){
                case 0:
                    gioiTinh = 0;
                    valueGioiTinhTrue = false;
                    break;
                case 1:
                    gioiTinh = 1;
                    valueGioiTinhTrue = false;
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
        System.out.println("Hay nhap Dien Tich");
        float dienTich = 0;
        dienTich = CheckValidate.checkValueFloat(dienTich);
        System.out.println("Hay nhap dia Chi");
        String diaChi = CheckValidate.checkEmptyString();
        System.out.println("Hay nhap so Nguoi");
        int soNguoi = 0;
        soNguoi = CheckValidate.checkValueInt(soNguoi);
        System.out.println("Hay nhap gia Tien");
        float giaTien = 0;
        giaTien = CheckValidate.checkValueFloat(giaTien);
        AccountRenter newAccountRenter = new AccountRenter(cccd, hoTen, ngaySinh, gioiTinh, trangThai, dienTich, diaChi, soNguoi, giaTien);
        listAccountRenter.add(newAccountRenter);
        ReadAndWrite.write(newAccountRenter.getInfor(), filePath);
        System.out.println("da them thanh cong");
    }
}
