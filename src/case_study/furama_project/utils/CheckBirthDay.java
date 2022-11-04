package case_study.furama_project.utils;

import java.util.Calendar;
import java.util.Scanner;

public class CheckBirthDay {
    public String checkValidate(String input, String regex, String errorMesssage){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do{
            input = scanner.nextLine();
            if(input.equals("back")|input.equals("cancel")|input.equals("thoát")){
                System.out.println("Bạn đã thoát ra menu!");
                flag = false;
            }else if(input.matches(regex)&&checkBirthDay(input)){
                flag = false;
            }else {
                System.out.println(errorMesssage);
            }
        }
        while (flag);
        return input;
    }

    public static boolean checkBirthDay(String input) {
        int year = (Integer.parseInt(String.valueOf(input.charAt(6)))*1000 + Integer.parseInt(String.valueOf(input.charAt(7)))*100 + Integer.parseInt(String.valueOf(input.charAt(8)))*10 + Integer.parseInt(String.valueOf(input.charAt(9))))*10000;
        int month = (Integer.parseInt(String.valueOf(input.charAt(3)))*10 + Integer.parseInt(String.valueOf(input.charAt(4))))*100;
        int day = Integer.parseInt(String.valueOf(input.charAt(0)))*10 + Integer.parseInt(String.valueOf(input.charAt(1)));
        int timeTotal = year+month+day;
        int yearReal = Calendar.getInstance().get(Calendar.YEAR)*10000;
        int monthReal = Calendar.getInstance().get(Calendar.MONTH)*100;
        int dayReal = Calendar.getInstance().get(Calendar.DATE);
        int realTimeTotal = yearReal+monthReal+dayReal;
        int age = realTimeTotal-timeTotal;
        return age > 180000 && age < 1000000;
    }
}
