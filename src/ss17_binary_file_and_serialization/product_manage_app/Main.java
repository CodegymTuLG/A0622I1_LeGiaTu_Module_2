package ss17_binary_file_and_serialization.product_manage_app;

import case_study.furama_project.models.Employee;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        try {
            Scanner scanner = new Scanner(System.in);
            List<Product> productList = new ArrayList<Product>();
            boolean check = true;
            while (check) {
                System.out.println("1. Show product info");
                System.out.println("2. Add new product");
                System.out.println("3. Edit product");
                System.out.println("4. Delete product");
                System.out.println("5. Exit application");
                System.out.println("Enter your choice: -");
                Scanner sc = new Scanner(System.in);
                switch (Integer.parseInt(String.valueOf(sc.nextInt()))) {
                    case 1:
                        productList = (List<Product>) ReadAndWrite.read("E:\\Study\\CodegymStudyMaterials\\module_02\\src\\Product.csv");
                        for (Product ls : productList) {
                            System.out.println(ls);
                        }
                        break;
                    case 2:
                        System.out.println("Hãy input thông tin của Product");
                        System.out.println("Mã sản phẩm");
                        String id = scanner.nextLine();
                        System.out.println("Tên sản phẩm");
                        String name = scanner.nextLine();
                        System.out.println("Hãng sản xuất");
                        String maker = scanner.nextLine();
                        System.out.println("Giá thành");
                        String price = scanner.nextLine();
                        System.out.println("Các mô tả khác");
                        String other = scanner.nextLine();
                        Product newProduct = new Product(id, name, maker, price, other);
                        productList.add(newProduct);
                        ReadAndWrite.write(productList,"E:\\Study\\CodegymStudyMaterials\\module_02\\src\\Product.csv");
                        break;
                    case 3:
                        System.out.println("Enter id do you want to edit");
                        String idEdit = scanner.nextLine();
                        for (int i = 0; i < productList.size(); i++) {
                            if (idEdit.equals(productList.get(i).getId())) {
                                System.out.println("Hãy input thông tin của Employee có ID là " + idEdit);
                                System.out.println("Tên sản phẩm");
                                String nameEdit = scanner.nextLine();
                                System.out.println("Hãng sản xuất");
                                String makerEdit = scanner.nextLine();
                                System.out.println("Giá thành");
                                String priceEdit = scanner.nextLine();
                                System.out.println("Các mô tả khác");
                                String otherEdit = scanner.nextLine();
                                productList.set(i, new Product(idEdit, nameEdit, makerEdit, priceEdit, otherEdit));
                            }
                        }
                        ReadAndWrite.write(productList,"E:\\Study\\CodegymStudyMaterials\\module_02\\src\\Product.csv");
                        break;
                    case 4:
                        System.out.println("Enter id do you want to delete");
                        String idDelete = scanner.nextLine();
                        for (int i = 0; i < productList.size(); i++) {
                            if (idDelete.equals(productList.get(i).getId())) {
                                productList.remove(productList.get(i));
                            }
                        }
                        ReadAndWrite.write(productList,"E:\\Study\\CodegymStudyMaterials\\module_02\\src\\Product.csv");
                        break;
                    case 5:
                        check = false;
                        break;
                    case 99:
                        System.out.println("Goodbye!!!");
                        check = false;
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Wrong flow!!! Back to Menu");
            displayMainMenu();
        }
    }

}
