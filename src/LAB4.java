import java.io.*;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB4 {
    public static void main(String[] args) {

        // writeString();
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            BufferedOutputStream output = new BufferedOutputStream(file);

            String s = "Hello World";
            byte[] b = s.getBytes();

            output.write(b);
            output.close();
        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // readString();
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
