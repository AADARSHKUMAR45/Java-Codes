import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequensIs {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = new FileInputStream("Source1.txt");
        FileInputStream fis2 = new FileInputStream("Target2.txt");
        FileOutputStream fis3 = new FileOutputStream("Destinatiuon.txt");
        SequenceInputStream sis1=new SequenceInputStream(fis1,fis2);
        int b;
        while((b=sis1.read())!=-1){
            fis3.write(b);
        }
        sis1.close();
        fis1.close();
        fis2.close();
        fis3.close();


    }
}
