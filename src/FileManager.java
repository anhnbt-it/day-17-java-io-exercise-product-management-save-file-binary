import java.io.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/27/2020
 * Time: 10:53 AM
 */
public class FileManager {

    private String filePath = "data/products.txt";
    private File file;
    OutputStream outputStream;
    ObjectOutputStream objOutputStream;
    InputStream inputStream;
    ObjectInputStream objInputStream;

    public FileManager() throws IOException {
        file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        this.outputStream = null;
        this.objOutputStream = null;
        this.inputStream = null;
        this.objInputStream = null;
    }

    public void writeToFile(List<Product> list) throws IOException {
        outputStream = new FileOutputStream(file);
        objOutputStream = new ObjectOutputStream(outputStream);
        objOutputStream.writeObject(list); // Ghi ra file
        objOutputStream.close();
        outputStream.close();
        System.out.println("Save file success.");
    }

    public List<Product> readFile() throws IOException, ClassNotFoundException {
        inputStream = new FileInputStream(file);
        objInputStream = new ObjectInputStream(inputStream);
        return (List<Product>) objInputStream.readObject();
    }

    public void closeOutputStream() throws IOException {
        if (objOutputStream != null) {
            objOutputStream.close();
        }

        if (outputStream != null) {
            outputStream.close();
        }
    }

    public void closeInputStream() throws IOException {
        if (objInputStream != null) {
            objInputStream.close();
        }

        if (inputStream != null) {
            inputStream.close();
        }
    }
}
