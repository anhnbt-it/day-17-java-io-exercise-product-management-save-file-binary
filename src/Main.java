import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/27/2020
 * Time: 10:18 AM
 */
public class Main {
    public static void main(String[] args) {
        try {
            List<Product> products = new ArrayList<>();
            FileManager fileManager = new FileManager();

            Product product = new Product();
            product.setId(1);
            product.setName("iPhone 11 Pro Max");
            product.setHangSanXuat("Apple");
            product.setPrice(29000000);
            product.setDescription("Content");
            products.add(product);

            fileManager.writeToFile(products);
            fileManager.closeOutputStream();

            List<Product> productList = fileManager.readFile();
            fileManager.closeInputStream();

            System.out.println(productList.get(0).toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
