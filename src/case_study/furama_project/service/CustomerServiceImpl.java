package case_study.furama_project.service;

import case_study.furama_project.models.Customer;
import case_study.furama_project.utils.CheckBirthDay;
import case_study.furama_project.utils.CheckRegex;
import case_study.furama_project.utils.CheckRequire;
import case_study.furama_project.utils.ReadAndWrite;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends Customer implements CustomerService {
    String filepath = "E:\\Study\\CodegymStudyMaterials\\module_02\\src\\case_study\\furama_project\\data\\customer.csv";
    Scanner scanner = new Scanner(System.in);
    CheckRegex checkRegex = new CheckRegex();
    CheckBirthDay checkBirthDay = new CheckBirthDay();
    static final LinkedList<Customer> listCustomer = new LinkedList<Customer>();
    final String YEAR_REGEX = "[0-9]{4}";
    final String MONTH_REGEX = "(0[1-9]|1[0-2])";
    final String DAY_REGEX = "(0[1-9]|1[0-9]|2[0-9]|3[0-1])";
    final String DAYTIME_REGEX = DAY_REGEX + "/" + MONTH_REGEX + "/" + YEAR_REGEX;
    final String PHONENUMBER_REGEX = "[0-9]{10,13}";

    @Override
    public void add() {
        System.out.println("Hãy input thông tin của Customer");
        System.out.println("Name:");
        String name = CheckRequire.isNotEmptyString("Không được bỏ trống");
        System.out.println("BirthDay (dd/MM/yyyy):");
        String birthDay = "";
        birthDay = checkBirthDay.checkValidate(birthDay, DAYTIME_REGEX, "Hãy nhập lại ngày tháng năm sinh theo định đạng dd/MM/yyyy , không bé hơn 18 tuổi hoặc lớn hơn 100 tuổi!");
        System.out.println("Sex:");
        String sex = "";
        boolean sexTrueValue = false;
        while (!sexTrueValue) {
            System.out.println("1.Nam");
            System.out.println("2.Nữ");
            System.out.println("3.Khác");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    sex = "Nam";
                    sexTrueValue = true;
                    break;
                case 2:
                    sex = "Nữ";
                    sexTrueValue = true;
                    break;
                case 3:
                    sex = "khác";
                    sexTrueValue = true;
                    break;
                default:
                    System.out.println("hãy nhập lại đúng các lựa chọn yêu cầu");
            }
        }
        System.out.println("PersonId:");
        String personId = CheckRequire.isNotEmptyString("Không được bỏ trống");
        System.out.println("Phone Number:");
        String phoneNumber = "";
        phoneNumber = checkRegex.checkValidate(phoneNumber, PHONENUMBER_REGEX, "Hãy nhập lại số điện thoại là kiểu số có chiều dài từ 9 đến 13 ký tự số!");
        System.out.println("Email:");
        String email = CheckRequire.isNotEmptyString("Không được bỏ trống");
        System.out.println("Customer Type:");
        String customerType = "";
        boolean customerTypeLevelTrueValue = false;
        while (!customerTypeLevelTrueValue) {
            System.out.println("1.Diamond");
            System.out.println("2.Platinium");
            System.out.println("3.Gold");
            System.out.println("4.Silver");
            System.out.println("5.Member");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    customerType = "Diamond";
                    System.out.println("Customer Type: Diamond");
                    customerTypeLevelTrueValue = true;
                    break;
                case 2:
                    customerType = "Platinium";
                    System.out.println("Customer Type: Platinium");
                    customerTypeLevelTrueValue = true;
                    break;
                case 3:
                    customerType = "Gold";
                    System.out.println("Customer Type: Gold");
                    customerTypeLevelTrueValue = true;
                    break;
                case 4:
                    customerType = "Silver";
                    System.out.println("Customer Type: Silver");
                    customerTypeLevelTrueValue = true;
                    break;
                case 5:
                    customerType = "Member";
                    System.out.println("Customer Type: Member");
                    customerTypeLevelTrueValue = true;
                    break;
                default:
                    System.out.println("hãy nhập lại đúng các lựa chọn yêu cầu");
            }
        }
        System.out.println("Address:");
        String address = CheckRequire.isNotEmptyString("Không được bỏ trống");
        Customer newCustomer = new Customer(listCustomer.size() + 1, name, birthDay, sex, personId, phoneNumber, email, customerType, address);
        listCustomer.add(newCustomer);
        ReadAndWrite.write(newCustomer.getInfo(), filepath);
        System.out.println("Đã thêm thành công!");
    }

    @Override
    public void edit() {
        System.out.println("Enter id do you want to edit");
        int id = CheckRequire.isNotEmptyInt("khong duoc de trong");
        for (int i = 0; i < listCustomer.size(); i++) {
            if (id == listCustomer.get(i).getId()) {
                String name = listCustomer.get(i).getName();
                String birthDay = listCustomer.get(i).getBirthDay();
                String sex = listCustomer.get(i).getSex();
                String personId = listCustomer.get(i).getPersonId();
                String phoneNumber = listCustomer.get(i).getPhoneNumber();
                String email = listCustomer.get(i).getEmail();
                String customerType = listCustomer.get(i).getCustomerType();
                String address = listCustomer.get(i).getAddress();
                System.out.println("Hãy input thông tin của Customer có ID là " + id);
                boolean editDone = false;
                while (!editDone) {
                    System.out.println("bạn muốn sửa giá trị nào");
                    System.out.println("1. Name");
                    System.out.println("2. BirthDay");
                    System.out.println("3. Sex");
                    System.out.println("4. PersonId");
                    System.out.println("5. Phone Number");
                    System.out.println("6. Email");
                    System.out.println("7. Customer Type");
                    System.out.println("8. Address");
                    System.out.println("9. Hoàn thành quá trình chỉnh sửa");
                    switch (Integer.parseInt(scanner.nextLine())) {
                        case 1:
                            System.out.println("Dữ liệu cũ là: " + listCustomer.get(i).getName());
                            System.out.println("Name:");
                            name = CheckRequire.isNotEmptyString("Không được bỏ trống");
                            continue;
                        case 2:
                            System.out.println("Dữ liệu cũ là: " + listCustomer.get(i).getBirthDay());
                            System.out.println("BirthDay (yyyy/MM/dd):");
                            birthDay = checkBirthDay.checkValidate(birthDay, DAYTIME_REGEX, "Hãy nhập lại ngày tháng năm sinh theo định đạng dd/MM/yyyy !");
                            continue;
                        case 3:
                            System.out.println("Dữ liệu cũ là: " + listCustomer.get(i).getSex());
                            System.out.println("Sex:");
                            boolean sexTrueValue = false;
                            while (!sexTrueValue) {
                                System.out.println("1.Nam");
                                System.out.println("2.Nữ");
                                System.out.println("3.Khác");
                                switch (Integer.parseInt(scanner.nextLine())) {
                                    case 1:
                                        sex = "Nam";
                                        sexTrueValue = true;
                                        break;
                                    case 2:
                                        sex = "Nữ";
                                        sexTrueValue = true;
                                        break;
                                    case 3:
                                        sex = "khác";
                                        sexTrueValue = true;
                                        break;
                                    default:
                                        System.out.println("hãy nhập lại đúng các lựa chọn yêu cầu");
                                }
                            }
                            continue;
                        case 4:
                            System.out.println("Dữ liệu cũ là: " + listCustomer.get(i).getPersonId());
                            System.out.println("PersonId:");
                            personId = CheckRequire.isNotEmptyString("Không được bỏ trống");
                            continue;
                        case 5:
                            System.out.println("Dữ liệu cũ là: " + listCustomer.get(i).getPhoneNumber());
                            System.out.println("Phone Number:");
                            phoneNumber = checkRegex.checkValidate(phoneNumber, PHONENUMBER_REGEX, "Hãy nhập lại số điện thoại là kiểu số có chiều dài từ 9 đến 13 ký tự!");
                            continue;
                        case 6:
                            System.out.println("Dữ liệu cũ là: " + listCustomer.get(i).getEmail());
                            System.out.println("Email:");
                            email = CheckRequire.isNotEmptyString("Không được bỏ trống");
                            continue;
                        case 7:
                            System.out.println("Dữ liệu cũ là: " + listCustomer.get(i).getCustomerType());
                            System.out.println("Customer Type:");
                            boolean customerTypeLevelTrueValue = false;
                            while (!customerTypeLevelTrueValue) {
                                System.out.println("1.Diamond");
                                System.out.println("2.Platinium");
                                System.out.println("3.Gold");
                                System.out.println("4.Silver");
                                System.out.println("5.Member");
                                switch (Integer.parseInt(scanner.nextLine())) {
                                    case 1:
                                        customerType = "Diamond";
                                        System.out.println("Customer Type: Diamond");
                                        customerTypeLevelTrueValue = true;
                                        break;
                                    case 2:
                                        customerType = "Platinium";
                                        System.out.println("Customer Type: Platinium");
                                        customerTypeLevelTrueValue = true;
                                        break;
                                    case 3:
                                        customerType = "Gold";
                                        System.out.println("Customer Type: Gold");
                                        customerTypeLevelTrueValue = true;
                                        break;
                                    case 4:
                                        customerType = "Silver";
                                        System.out.println("Customer Type: Silver");
                                        customerTypeLevelTrueValue = true;
                                        break;
                                    case 5:
                                        customerType = "Member";
                                        System.out.println("Customer Type: Member");
                                        customerTypeLevelTrueValue = true;
                                        break;
                                    default:
                                        System.out.println("hãy nhập lại đúng các lựa chọn yêu cầu");
                                }
                            }
                            continue;
                        case 8:
                            System.out.println("Dữ liệu cũ là: " + listCustomer.get(i).getAddress());
                            System.out.println("Address:");
                            address = CheckRequire.isNotEmptyString("Không được bỏ trống");
                            continue;
                        case 9:
                            listCustomer.set(i, new Customer(id, name, birthDay, sex, personId, phoneNumber, email, customerType, address));
                            ReadAndWrite.resetFile(filepath);
                            for (Customer customer : listCustomer) {
                                ReadAndWrite.writeNew(customer.getInfo(), filepath);
                            }
                            editDone = true;
                            break;
                        default:
                            System.out.println("Hãy nhập đúng yêu cầu");
                            break;
                    }
                }
            } else {
                System.out.println("ID đã nhập không tồn tại! Trở lại main menu");
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter id do you want to delete");
        Scanner inputEdit = new Scanner(System.in);
        int id = Integer.parseInt(inputEdit.nextLine());
        int index = 0;
        boolean deleteAble = false;
        for (int i = 0; i < listCustomer.size(); i++) {
            if (id == listCustomer.get(i).getId()) {
                index = i;
                deleteAble = true;
                break;
            }
        }
        if (!deleteAble) {
            System.out.println("Không tim thấy Id cần xóa");
        } else {
            boolean deleteTrue = true;
            while (deleteTrue) {
                System.out.println("Thông tin mà bạn sẽ xóa đối tượng bên dưới");
                System.out.println(listCustomer.get(index).getInfo());
                System.out.println("Bạn có thực sự muốn xóa. Hãy nhập lựa chọn bằng số!");
                System.out.println("1. Có");
                System.out.println("2. Không");
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 1:
                        listCustomer.remove(listCustomer.get(index));
                        ReadAndWrite.resetFile(filepath);
                        for (Customer customer : listCustomer) {
                            ReadAndWrite.writeNew(customer.getInfo(), filepath);
                        }
                        System.out.println("Đã thực hiện xóa thành công");
                        deleteTrue = false;
                        break;
                    case 2:
                        System.out.println("Bạn đã không thực hiện xóa");
                        deleteTrue = false;
                        break;
                    default:
                        System.out.println("hãy nhập lựa chọn bằng số như yêu cầu");
                }
            }
        }
    }

    @Override
    public void show() {
        loadDataFromFile();
        for (Customer customer : listCustomer) {
            System.out.println(customer);
        }
    }

    public void loadDataFromFile() {
        List<String[]> list = ReadAndWrite.read(filepath);
        listCustomer.clear();
        for (String[] item : list) {
            Customer customer = new Customer(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4], item[5], item[6], item[7], item[8]);
            listCustomer.add(customer);
        }
    }
}
