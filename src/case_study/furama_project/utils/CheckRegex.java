package case_study.furama_project.utils;

import java.util.Scanner;

public class CheckRegex {
    public String checkValidate(String input, String regex, String errorMesssage){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do{
            input = scanner.nextLine();
            if(input.equals("back")|input.equals("cancel")|input.equals("thoát")){
                System.out.println("Bạn đã thoát ra menu!");
                flag = false;
            }else if(input.matches(regex)){
                flag = false;
            }else {
                System.out.println(errorMesssage);
            }
        }
        while (flag);
        return input;
    }
}

