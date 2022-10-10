package case_study.furama_project.controllers;

import case_study.furama_project.models.Employee;
import case_study.furama_project.service.EmployeeServiceImpl;

import java.util.*;
public class FuramaController<choose> {

    public static void displayMainMenu() {
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
                    System.out.println(
                            "1.	Display list employees\n" +
                                    "2.	Add new employee\n" +
                                    "3.	Edit employee\n" +
                                    "4.	Return main menu"
                    );
                    employees = screenInputValue.nextInt();
                    while (employees != 4) {
                        switch (employees) {
                            case 1:
                                /*EmployeeServiceImpl.add();*/
                                Employee employee1 = new Employee(1,"Lê Văn A", "10-10-1999", "Nam", 0123456755 , 123123123, "levana@gmail.com", "Đại Học", "Lễ Tân", "15tr" );
                                Employee employee2 = new Employee(2,"Lê Văn B", "10-10-1999", "Nam", 0123456755 , 123123123, "levana@gmail.com", "Đại Học", "Lễ Tân", "15tr" );
                                Employee employee3 = new Employee(3,"Lê Văn C", "10-10-1999", "Nam", 0123456755 , 123123123, "levana@gmail.com", "Đại Học", "Lễ Tân", "15tr" );
                                Employee employee4 = new Employee(4,"Lê Văn D", "10-10-1999", "Nam", 0123456755 , 123123123, "levana@gmail.com", "Đại Học", "Lễ Tân", "15tr" );
                                List<Employee> listEmployee = new ArrayList<>();
                                listEmployee.add(employee1);
                                listEmployee.add(employee2);
                                listEmployee.add(employee3);
                                listEmployee.add(employee4);
                                System.out.println(listEmployee);
                                break;
                            case 2:
                                break;
                            case 3:
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
    }
}
