package Module2TestPractice.utils;

import Module2TestPractice.exception.AccountDuplicateException;
import Module2TestPractice.exception.AccountInvalidException;
import Module2TestPractice.exception.IDInvalidException;
import Module2TestPractice.module.Account;
import Module2TestPractice.module.AccountLessor;
import Module2TestPractice.module.AccountRenter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CheckValidate {
    public static String iDInvalidException() throws Throwable {
            final String REGEX_CCCD = "[0-9]{12}$";
            Scanner scanner = new Scanner(System.in);
            boolean flag = true;
        String input;
        do {
                input = scanner.nextLine();
                if (input.matches(REGEX_CCCD)) {
                    flag = false;
                }else {
                    throw new IDInvalidException("Input sai thong tin Can cuoc cong dan!!!");
                }
            }
            while (flag);
            return input;
    }

    public static String accountDuplicateLessorException(List<AccountLessor> list, String input) throws AccountDuplicateException {
        try {
            boolean isDuplicate = true;
            while (isDuplicate) {
                for (Account ac : list) {
                    if (!ac.getCccd().equals(input)) {
                        return input;
                    }
                }
                isDuplicate = false;
            }
            return input;
        } catch (Exception e) {
            throw new AccountDuplicateException("CCCD " + input + " da bi trung lap voi truoc do");
        }

    }

    public static String accountDuplicateRenterException(List<AccountRenter> list, String input) throws AccountDuplicateException {
        try {
            boolean isDuplicate = true;
            while (isDuplicate) {
                for (Account ac : list) {
                    if (ac.getCccd().equals(input)) {
                        return input;
                    }
                }
                isDuplicate = false;
            }
            return input;
        } catch (Exception e) {
            throw new AccountDuplicateException("CCCD " + input + " da bi trung lap voi truoc do");
        }
    }

    public static Date AccountInvalidException() throws AccountInvalidException {
        Scanner scanner = new Scanner(System.in);
        DateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        Date result = null;
        Boolean resultValueIsTrue = false;
        while (!resultValueIsTrue){
            String dateAsString = scanner.nextLine();
            try {
                result = dateFormat.parse(dateAsString);
                resultValueIsTrue = true;
            } catch (ParseException e) {
                System.out.println("Ngay sinh khong hop le. Format chua dung dd/MM/yyyy");
            }
        }
        Date now = new Date();
        if (now.getYear() - result.getYear() < 18) {
            throw new AccountInvalidException("Nguoi dang ky thue/cho thue nha chua du 18 tuoi!!");
        }
        return result;
    }

    public static Float checkValueFloat(Float input){
        Scanner scanner = new Scanner(System.in);
        Boolean resultValueIsTrue = false;
        while (!resultValueIsTrue){
            try {
                input = Float.parseFloat(scanner.nextLine());
                resultValueIsTrue = true;
            } catch (NumberFormatException e) {
                System.out.println("Hay nhap dung kieu so");
            }
        }
        return input;
    }
    public static int checkValueInt(int input){
        Scanner scanner = new Scanner(System.in);
        Boolean resultValueIsTrue = false;
        while (!resultValueIsTrue){
            try {
                input = Integer.parseInt(scanner.nextLine());
                resultValueIsTrue = true;
            } catch (NumberFormatException e) {
                System.out.println("Hay nhap dung kieu so");
            }
        }
        return input;
    }
    public static String checkEmptyString(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            if(input.equals("")||input.trim().equals("")){
                System.out.println("khong duoc bo trong hoac chi co ky tu trang");
            }else {
                return input;
            }
        }
    }
}
