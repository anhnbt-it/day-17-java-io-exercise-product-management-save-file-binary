import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/27/2020
 * Time: 10:15 AM
 */
public class Product implements Serializable {
    private int id;
    private String name;
    private String hangSanXuat;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int id, String name, String hangSanXuat, double price, String description) {
        this.id = id;
        this.name = name;
        this.hangSanXuat = hangSanXuat;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
