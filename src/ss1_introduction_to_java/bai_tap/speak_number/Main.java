package ss1_introduction_to_java.bai_tap.speak_number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number ");
        int number = scanner.nextInt();
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        } else if (number < 20 && number >= 10) {
            char ones = String.valueOf(number).charAt(1);
            switch (Integer.parseInt(String.valueOf(ones))) {
                case 0:
                    System.out.print("ten");
                    break;
                case 1:
                    System.out.print("eleven");
                    break;
                case 2:
                    System.out.print("twelve");
                    break;
                case 3:
                    System.out.print("thirteen ");
                    break;
                case 4:
                    System.out.print("fourteen ");
                    break;
                case 5:
                    System.out.print("fifteen");
                    break;
                case 6:
                    System.out.print("sixteen");
                    break;
                case 7:
                    System.out.print("seventeen");
                    break;
                case 8:
                    System.out.print("eighteen");
                    break;
                case 9:
                    System.out.print("nineteen");
                    break;
            }
        } else if (number < 100 && number >= 20) {
            int tens = Integer.parseInt(String.valueOf(String.valueOf(number).charAt(0)));
            int ones = Integer.parseInt(String.valueOf(String.valueOf(number).charAt(1)));
            String tensChar = "";
            String onesChar = "";
            switch (tens) {
                case 1:
                    tensChar = "one";
                    break;
                case 2:
                    tensChar = "two";
                    break;
                case 3:
                    tensChar = "three";
                    break;
                case 4:
                    tensChar = "four";
                    break;
                case 5:
                    tensChar = "five";
                    break;
                case 6:
                    tensChar = "six";
                    break;
                case 7:
                    tensChar = "seven";
                    break;
                case 8:
                    tensChar = "eight";
                    break;
                case 9:
                    tensChar = "nine";
                    break;
            }
            switch (ones) {
                case 1:
                    onesChar = "one";
                    break;
                case 2:
                    onesChar = "two";
                    break;
                case 3:
                    onesChar = "three";
                    break;
                case 4:
                    onesChar = "four";
                    break;
                case 5:
                    onesChar = "five";
                    break;
                case 6:
                    onesChar = "six";
                    break;
                case 7:
                    onesChar = "seven";
                    break;
                case 8:
                    onesChar = "eight";
                    break;
                case 9:
                    onesChar = "nine";
                    break;
            }
            System.out.println(tensChar + "ty " + onesChar);
        } else if (number < 1000 && number >= 100) {
            int hundred = Integer.parseInt(String.valueOf(String.valueOf(number).charAt(0)));
            int tens = Integer.parseInt(String.valueOf(String.valueOf(number).charAt(1)));
            int ones = Integer.parseInt(String.valueOf(String.valueOf(number).charAt(2)));
            String hundredChar = "";
            String tensChar = "";
            String onesChar = "";
            if (tens == 0 && ones == 0) {
                switch (hundred) {
                    case 1:
                        hundredChar = "one";
                        break;
                    case 2:
                        hundredChar = "two";
                        break;
                    case 3:
                        hundredChar = "three";
                        break;
                    case 4:
                        hundredChar = "four";
                        break;
                    case 5:
                        hundredChar = "five";
                        break;
                    case 6:
                        hundredChar = "six";
                        break;
                    case 7:
                        hundredChar = "seven";
                        break;
                    case 8:
                        hundredChar = "eight";
                        break;
                    case 9:
                        hundredChar = "nine";
                        break;
                }
                System.out.println(hundredChar + " hundred ");
            } else {
                switch (hundred) {
                    case 1:
                        hundredChar = "one";
                        break;
                    case 2:
                        hundredChar = "two";
                        break;
                    case 3:
                        hundredChar = "three";
                        break;
                    case 4:
                        hundredChar = "four";
                        break;
                    case 5:
                        hundredChar = "five";
                        break;
                    case 6:
                        hundredChar = "six";
                        break;
                    case 7:
                        hundredChar = "seven";
                        break;
                    case 8:
                        hundredChar = "eight";
                        break;
                    case 9:
                        hundredChar = "nine";
                        break;
                }
                switch (tens) {
                    case 1:
                        tensChar = "one";
                        break;
                    case 2:
                        tensChar = "two";
                        break;
                    case 3:
                        tensChar = "three";
                        break;
                    case 4:
                        tensChar = "four";
                        break;
                    case 5:
                        tensChar = "five";
                        break;
                    case 6:
                        tensChar = "six";
                        break;
                    case 7:
                        tensChar = "seven";
                        break;
                    case 8:
                        tensChar = "eight";
                        break;
                    case 9:
                        tensChar = "nine";
                        break;
                }
                switch (ones) {
                    case 1:
                        onesChar = "one";
                        break;
                    case 2:
                        onesChar = "two";
                        break;
                    case 3:
                        onesChar = "three";
                        break;
                    case 4:
                        onesChar = "four";
                        break;
                    case 5:
                        onesChar = "five";
                        break;
                    case 6:
                        onesChar = "six";
                        break;
                    case 7:
                        onesChar = "seven";
                        break;
                    case 8:
                        onesChar = "eight";
                        break;
                    case 9:
                        onesChar = "nine";
                        break;
                }
                System.out.println(hundredChar + " hundred and " + tensChar + "ty " + onesChar);
            }

        }
    }
}


