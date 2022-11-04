package Module2TestPractice;

import Module2TestPractice.service.AccountRenterJob;
import Module2TestPractice.service.AccountLessorJob;
import Module2TestPractice.utils.CheckValidate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Throwable {
        displayMainMenu();
    }

    public static void displayMainMenu() throws Throwable {

            boolean check = true;
            main:
            while (check) {
                AccountRenterJob accountRenterJob = new AccountRenterJob();
                AccountLessorJob accountLessorJob = new AccountLessorJob();
                System.out.println("1. Chuc nang dang ky nguoi the/cho thue nha");
                System.out.println("2. Hien thi thong tin nguoi thue/cho thue");
                System.out.println("3. Tim kiem nguoi cho thue phu hop theo CCCD cua nguoi thue");
                System.out.println("4. Hien thi va xoa nguoi cho thue/cho thue nha thanh cong");
                System.out.println("5. Luu lai du lieu nguoi thue/cho thue vao file");
                System.out.println("6. Import du lieu nguoi thue/cho thue vao chuong trinh");
                System.out.println("7. Thoat");
                System.out.println("Enter your choice: -");
                System.out.println("-----------------------------------");
                Scanner sc = new Scanner(System.in);
                try {
                    int choose = 0;
                    switch (CheckValidate.checkValueInt(choose) ){
                    case 1:
                        accountRenterJob.loadDataFromFile();
                        accountLessorJob.loadDataFromFile();
                        boolean checkAdd = true;
                        while (checkAdd) {
                            System.out.println("1. Dang ky nguoi thue nha");
                            System.out.println("2. Dang ky nguoi cho thue nha");
                            System.out.println("3. Tro lai !");
                            switch (Integer.parseInt(String.valueOf(sc.nextInt()))) {
                                case 1:
                                    System.out.println("-------------------------");
                                    accountRenterJob.add();
                                    break;
                                case 2:
                                    System.out.println("-------------------------");
                                    accountLessorJob.add();
                                    break;
                                case 3:
                                    System.out.println("-------------------------");
                                    checkAdd = false;
                                    break;
                                default:
                                    System.out.println("hay nhap lai so 1 ~ 3");
                            }
                        }
                        break;
                    case 2:
                        accountRenterJob.loadDataFromFile();
                        accountLessorJob.loadDataFromFile();
                        boolean checkDisplay = true;
                        while (checkDisplay) {
                            System.out.println("1. Hien thi thong tin nguoi thue nha");
                            System.out.println("2. Hien thi thong tin nguoi cho thue nha");
                            System.out.println("3. Tro lai !");
                            int chooseDisplay = 0;
                            switch (CheckValidate.checkValueInt(chooseDisplay) ){
                                case 1:
                                    System.out.println("-------------------------");
                                    accountRenterJob.display();
                                    break;
                                case 2:
                                    System.out.println("-------------------------");
                                    accountLessorJob.display();
                                    break;
                                case 3:
                                    System.out.println("-------------------------");
                                    checkDisplay = false;
                                    break;
                                default:
                                    System.out.println("hay nhap lai so 1 ~ 3");
                            }
                        }
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:
                        System.out.println("Tam biet !");
                        check = false;
                        break main;
                    default:
                        System.out.println("hay nhap lua chon bang so tu 1 ~ 7 !");
                }
            }catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Program have an unexpected error occurred !!!");
                    displayMainMenu();
                }
        }
    }
}



