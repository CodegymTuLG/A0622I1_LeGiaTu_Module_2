package ss17_binary_file_and_serialization.product_manage_app;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = -5465465;
    private String id;
    private String name;
    private String maker;
    private String price;
    private String other;

    public Product() {
    }

    public Product(String id, String name, String maker, String price, String other) {
        this.id = id;
        this.name = name;
        this.maker = maker;
        this.price = price;
        this.other = other;
    }

    public Product(String str) {
        String[] data = str.split(",");
        this.id = data[0];
        this.name = data[1];
        this.maker = data[2];
        this.price = data[3];
        this.other = data[4];
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getInfo() {
        return this.id + "," + this.name + "," + this.maker  + "," + this.price  + "," + this.other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", price='" + price + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
