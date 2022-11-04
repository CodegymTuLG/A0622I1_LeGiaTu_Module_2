package case_study.furama_project.utils;

import java.util.Scanner;

public class CheckRequire {
    public static String isNotEmptyString(String errorMesssage) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            if(input.equals("")||input.trim().equals("")){
                System.out.println(errorMesssage);
            }else {
                return input;
            }
        }
    }
    public static int isNotEmptyInt(String errorMesssage) {
        String inputString = "";
        while (true){
            int input = 0;
            inputString = ""+checkValueInt(input);
            if(inputString.equals("")||inputString.trim().equals("")){
                System.out.println(errorMesssage);
            }else {
                return Integer.parseInt(inputString);
            }
        }
    }

    public static int checkValueInt(int input){
        Scanner scanner = new Scanner(System.in);
        boolean resultValueIsTrue = false;
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


}
