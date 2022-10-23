package case_study.furama_project.controllers;

import case_study.furama_project.service.CustomerServiceImpl;
import case_study.furama_project.service.EmployeeServiceImpl;
import case_study.furama_project.service.FacilityServiceImpl;

import java.util.*;

public class FuramaController<choose> {

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: -");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    break;
            }
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeServiceIplm = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Delete employee");
            System.out.println("5. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
                    employeeServiceIplm.show();
                    break;
                case 2:
                    employeeServiceIplm.add();
                    break;
                case 3:
                    employeeServiceIplm.edit();
                    break;
                case 4:
                    employeeServiceIplm.delete();
                    break;
                case 5:
                    check = false;
                    break;
            }
        }
    }

    public static void displayCustomerMenu() {
        CustomerServiceImpl customerServiceIplm = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. delete customer");
            System.out.println("5. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
                    customerServiceIplm.show();
                    break;
                case 2:
                    customerServiceIplm.add();
                    break;
                case 3:
                    customerServiceIplm.edit();
                    break;
                case 4:
                    customerServiceIplm.delete();
                    break;
                case 5:
                    check = false;
                    break;
            }
        }
    }

    public static void displayFacilityMenu() {
        FacilityServiceImpl facilityServiceImpl = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
                    facilityServiceImpl.show();
                    break;
                case 2:
                    displayAddNewFacility();
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }

    private static void displayAddNewFacility() {
        /*boolean check = true;
        while (check) {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
                    FacilityServiceImpl.addNewVilla();
                    break;
                case 2:
                    FacilityServiceImpl.addNewHouse();
                    break;
                case 3:
                    FacilityServiceImpl.addNewRoom();
                    break;
                case 4:
                    check = false;
                    break;
            }
        }*/
    }

    public static void displayBookingMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
            }
        }
    }

    public static void displayPromotionMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display customer use service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("3. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
            }
        }
    }
}
