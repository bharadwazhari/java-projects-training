import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaExceptionsEx {
    public static void main(String args[]) {
        File file = new File("D://file.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally Block");
        }
        Integer obj = null;//new Integer(10);
        if(obj != null)
        System.out.println(obj.byteValue());

    }
}
