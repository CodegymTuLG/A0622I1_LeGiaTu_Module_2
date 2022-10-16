package case_study.furama_project.controllers;

import case_study.furama_project.service.EmployeeServiceImpl;

import java.util.*;
public class FuramaController<choose> {

    public static Object displayMainMenu() {
        List<EmployeeServiceImpl> listEmployee = new ArrayList<>();
        int choose = -1;
        Scanner screenInputValue = new Scanner(System.in);
        while (choose != 6) {
            System.out.println(
                    "1.	Employee Management\n" +
                            "2.	Customer Management\n" +
                            "3.	Facility Management\n" +
                            "4.	Booking Management\n" +
                            "5.	Promotion Management\n" +
                            "6.	Exit"
            );
            System.out.println("Enter your choice: ");
            choose = screenInputValue.nextInt();
            switch (choose) {
                case 1:
                    int employees = -1;
                    boolean returnFlag = true;
                    boolean trueOptionFlag = true;
                    while (returnFlag) {
                        System.out.println(
                                "1.	Display list employees\n" +
                                        "2.	Add new employee\n" +
                                        "3.	Edit employee\n" +
                                        "4.	Return main menu"
                        );
                        employees = screenInputValue.nextInt();
                        switch (employees) {
                            case 1:
                                displayListEmployee(listEmployee);
                                break;
                            case 2:
                                System.out.println("Hãy input thông tin của Employee");
                                System.out.println("ID:");
                                Object inputId = -1;
                                while (trueOptionFlag){
                                    inputId = screenInputValue.nextLine();
                                    if(!EmployeeServiceImpl.CheckId(inputId)){
                                        System.out.println("Please try again!");
                                    }else {
                                        trueOptionFlag = false;
                                        return inputId;
                                    }
                                }
                                System.out.println("Name:");
                                String inputName = screenInputValue.nextLine();
                                System.out.println("BirthDay:");
                                String inputBirthDay = screenInputValue.nextLine();
                                System.out.println("Sex:");
                                String inputSex = screenInputValue.nextLine();
                                while (EmployeeServiceImpl.checkSex(inputSex)){
                                    System.out.println("Please try again!");
                                }
                                System.out.println("PersonId:");
                                long inputPersonId = screenInputValue.nextLong();
                                System.out.println("Phone Number:");
                                long inputPhoneNumber = screenInputValue.nextLong();
                                System.out.println("Email:");
                                String inputEmail = screenInputValue.nextLine();
                                System.out.println("Academic Level:");
                                String inputAcademicLevel = screenInputValue.nextLine();
                                while (EmployeeServiceImpl.CheckAcademicLevel(inputAcademicLevel)){
                                    System.out.println("Please try again!");
                                }
                                System.out.println("Position:");
                                String inputPosition = screenInputValue.nextLine();
                                while (EmployeeServiceImpl.CheckPosition(inputPosition)){
                                    System.out.println("Please try again!");
                                }
                                System.out.println("Phone Number:");
                                String inputSalary = screenInputValue.nextLine();
                                EmployeeServiceImpl newEmployee = new EmployeeServiceImpl((Integer) inputId, inputName, inputBirthDay, inputSex, inputPersonId, inputPhoneNumber,inputEmail, inputAcademicLevel, inputPosition, inputSalary);
                                listEmployee.add(newEmployee);
                                break;
                            case 3:
                                break;
                            case 4:
                                returnFlag = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    int customers = -1;
                    System.out.println(
                            "1. Display list customers\n" +
                                    "2. Add new customer\n" +
                                    "3. Edit customer\n" +
                                    "4. Return main menu"
                    );
                    customers = screenInputValue.nextInt();
                    while (customers != 4) {
                        switch (customers) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 3:
                    int facility = -1;
                    System.out.println(
                            "1. Display list facility\n" +
                                    "2. Add new facility\n" +
                                    "3. Display list facility maintenance\n" +
                                    "4. Return main menu"
                    );
                    facility = screenInputValue.nextInt();
                    while (facility != 4) {
                        switch (facility) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 4:
                    int booking = -1;
                    System.out.println(
                            "1. Add new booking\n" +
                                    "2. Display list booking\n" +
                                    "3. Create new constracts\n" +
                                    "4. Display list contracts\n" +
                                    "5. Edit contracts\n" +
                                    "6. Return main menu"
                    );
                    booking = screenInputValue.nextInt();
                    while (booking != 6) {
                        switch (booking) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                    }
                    break;
                case 5:
                    int service = -1;
                    System.out.println(
                            "1. Display list customers use service\n" +
                                    "2. Display list customers get voucher\n" +
                                    "3. Return main menu"
                    );
                    service = screenInputValue.nextInt();
                    while (service != 3) {
                        switch (service) {
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    }
                    break;
            }

        }
        return null;
    }

    private static void displayListEmployee(List<EmployeeServiceImpl> listEmployee) {
        for (EmployeeServiceImpl ls: listEmployee){
            System.out.println(ls.show());
        }
    }
}
