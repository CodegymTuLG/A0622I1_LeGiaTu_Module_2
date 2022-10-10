package ss12_java_collection_framework.product_manager_app;

import ss12_java_collection_framework.comparable_and_comparator.Student;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p2.getPrice() - p1.getPrice();
    }
}
