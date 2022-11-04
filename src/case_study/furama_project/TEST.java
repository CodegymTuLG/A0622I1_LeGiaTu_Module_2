package case_study.furama_project;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        DateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(date);
        System.out.println(date.toString());
        System.out.println(dateFormat.format(date.toString()));
        System.out.println(dateFormat.parse(dateFormat.format(date)));
    }
}
