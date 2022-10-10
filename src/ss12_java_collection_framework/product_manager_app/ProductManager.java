package ss12_java_collection_framework.product_manager_app;
import java.util.*;

public class ProductManager {
    public static void main(String[] args) {

        // create init list
        Product product1 = new Product(1, "PC1", 20000000);
        Product product2 = new Product(2, "PC2", 16000000);
        Product product3 = new Product(3, "PC3", 30000000);
        List<Product> lists = new ArrayList<>();
        lists.add(product1);
        lists.add(product2);
        lists.add(product3);

        //create function
        String choice = "";
        Scanner input = new Scanner(System.in);
        while (choice != "out") {
            System.out.println("- What do you want to đo with list Product? (add, edit, delete, show, sort asc, sort desc)?");
            choice = input.nextLine();
            checkOption(lists, choice);
        }
    }

    private static void checkOption(List<Product> lists, String choice) {
        switch (choice) {
            case "add":
                add(lists);
                break;
            case "edit":
                edit(lists);
                break;
            case "delete":
                delete(lists);
            case "show":
                show(lists);
                break;
            case "search":
                search(lists);
                break;
            case "sort asc":
                sort_asc(lists);
                break;
            case "sort desc":
                sort_desc(lists);
                break;
        }
    }

    private static void add(List<Product> lists) {
        Scanner input = new Scanner(System.in);
        Product lastProduct = (Product) lists.get(lists.size() - 1);
        int newID = lastProduct.getId() + 1;
        System.out.println("+ Please input new product information.");
        System.out.print("Product Name:");
        String productName = input.nextLine();
        System.out.print("Price:");
        int price = input.nextInt();
        Product product = new Product(newID, productName, price);
        lists.add(product);
    }

    private static void edit(List<Product> lists) {
        Scanner input = new Scanner(System.in);
        System.out.println("+ What is ID do you want to edit?");
        int idEdit = input.nextInt();
        System.out.print("New Product Name:");
        String newProductName = input.nextLine();
        System.out.print("New Price:");
        int newPrice = input.nextInt();
        for (int i = 0; i < lists.size(); i++) {
            if (i == idEdit - 1) {
                lists.set(i, new Product(i + 1, newProductName, newPrice));
            }
        }
    }

    private static void delete(List<Product> lists) {
        System.out.println("+ What is ID of product do you want to delete?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("remove " + lists.get(input - 1) + " success!");
        System.out.println("List product after delete");
        lists.remove(input - 1);
    }

    private static void search(List<Product> lists) {
        System.out.println("+ What is ID of product do you want to search?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(lists.get(input - 1));
    }

    private static void show(List<Product> lists) {
        for (Object listProduct : lists) {
            System.out.println(listProduct.toString());
        }
    }

    private static void sort_asc(List<Product> lists) {
        System.out.println("+ Sort asc after:");
        Collections.sort(lists);
        lists.forEach(System.out::println);
    }

    private static void sort_desc(List<Product> lists) {
        System.out.println("+ Sort desc after:");
        Collections.sort(lists, new PriceComparator());
        lists.forEach(System.out::println);
    }
}
