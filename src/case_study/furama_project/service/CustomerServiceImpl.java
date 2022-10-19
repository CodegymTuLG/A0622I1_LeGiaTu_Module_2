package case_study.furama_project.service;

import case_study.furama_project.models.Customer;
import case_study.furama_project.models.Employee;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl extends Customer implements CustomerService {

    final static String[] SEX = {"Nam", "Nữ"};
    final static String[] CUSTOMERTYPE = {"Diamond", "Platinium", "Gold", "Silver", "Member"};
    static final LinkedList<Customer> listCustomer = new LinkedList<Customer>();

    public static boolean checkSex(String input) {
        for (int i = 0; i < SEX.length - 1; i++) {
            if (input.equals(SEX[i])) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkCustomerType(String input) {
        for (int i = 0; i < CUSTOMERTYPE.length - 1; i++) {
            if (input.equals(CUSTOMERTYPE[i])) {
                return true;
            }
        }
        return false;
    }
    @Override
    public void add() {
        Scanner inputNewCustomer = new Scanner(System.in);
        System.out.println("Hãy input thông tin của Employee");
        System.out.println("ID:");
        String inputId = inputNewCustomer.nextLine();
        System.out.println("Name:");
        String inputName = inputNewCustomer.nextLine();
        System.out.println("BirthDay (yyyy/mm/dd):");
        String inputBirthDay = inputNewCustomer.nextLine();
        System.out.println("Sex (Nam/Nữ):");
        String inputSex = inputNewCustomer.nextLine();
        while (!CustomerServiceImpl.checkSex(inputSex)) {
            inputSex = inputNewCustomer.nextLine();
            System.out.println("Please try again!");
        }
        System.out.println("PersonId:");
        long inputPersonId = inputNewCustomer.nextLong();
        System.out.println("Phone Number:");
        long inputPhoneNumber = inputNewCustomer.nextLong();
        System.out.println("Email:");
        String inputEmail = inputNewCustomer.nextLine();
        System.out.println("Customer Type:");
        String inputCustomerType = inputNewCustomer.nextLine();
        while (!CustomerServiceImpl.checkCustomerType(inputCustomerType)) {
            inputCustomerType = inputNewCustomer.nextLine();
            System.out.println("Please try again!");
        }
        System.out.println("Input Address:");
        String inputAddress = inputNewCustomer.nextLine();
        Customer newCustomer = new Customer(inputId, inputName, inputBirthDay, inputSex, inputPersonId, inputPhoneNumber, inputEmail, inputCustomerType, inputAddress);
        listCustomer.add(newCustomer);
    }

    @Override
    public void edit() {
        System.out.println("Enter id do you want to edit");
        Scanner inputEdit = new Scanner(System.in);
        String id = inputEdit.nextLine();
        for (int i = 0; i < listCustomer.size(); i++) {
            if (id == listCustomer.get(i).getId()) {
                System.out.println("Hãy input thông tin của Customer có ID là " + id);
                System.out.println("Name:");
                String inputName = inputEdit.nextLine();
                System.out.println("BirthDay (yyyy/mm/dd):");
                String inputBirthDay = inputEdit.nextLine();
                System.out.println("Sex (Nam/Nữ):");
                String inputSex = inputEdit.nextLine();
                while (!CustomerServiceImpl.checkSex(inputSex)) {
                    inputSex = inputEdit.nextLine();
                    System.out.println("Please try again!");
                }
                System.out.println("PersonId:");
                long inputPersonId = inputEdit.nextLong();
                System.out.println("Phone Number:");
                long inputPhoneNumber = inputEdit.nextLong();
                System.out.println("Email:");
                String inputEmail = inputEdit.nextLine();
                System.out.println("Customer Type:");
                String inputCustomerType = inputEdit.nextLine();
                while (!CustomerServiceImpl.checkCustomerType(inputCustomerType)) {
                    inputCustomerType = inputEdit.nextLine();
                    System.out.println("Please try again!");
                }
                System.out.println("Input Address:");
                String inputAddress = inputEdit.nextLine();
                listCustomer.set(i, new Customer(id, inputName, inputBirthDay, inputSex, inputPersonId, inputPhoneNumber, inputEmail, inputCustomerType, inputAddress));
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter id do you want to delete");
        Scanner inputEdit = new Scanner(System.in);
        String id = inputEdit.nextLine();
        boolean isDelete = false;
        for (Customer ls : listCustomer){
            if(id.equals(ls.getId())){
                listCustomer.remove(ls);
                isDelete = true;
                break;
            }
            isDelete = false;
        }
        if(!isDelete){
            System.out.println("Không tim thấy Id cần xóa");
        }else {
            System.out.println("Đã xóa thành công!");
        }
    }

    @Override
    public void show() {
        for (Customer ls : listCustomer) {
            System.out.println(ls);
        }
    }
}
