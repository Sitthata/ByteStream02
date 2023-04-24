import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB2 {
    public static void main(String[] args) {
        readString();
        writeString();
    }

    public static void writeString() {
        try {
            FileOutputStream output = new FileOutputStream("data.dat");

            String s = "Hello World";
            byte[] b = s.getBytes();
            output.write(b);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readString() {
        try {
            FileInputStream input = new FileInputStream("data.dat");
            int value;
            while ((value = input.read()) != -1) {
                System.out.print((char)value);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
