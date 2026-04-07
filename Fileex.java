import java.io.FileReader;

public class Fileex {
    public static void main(String[] args) throws Exception {
        try (FileReader fr = new FileReader("C:\\Users\\kushw\\OneDrive\\Desktop\\Java+Dsa/Test.txt")) {
            int x;
            while ((x = fr.read()) != -1) {
                System.out.print((char) x);
            }

        }
    }
}
