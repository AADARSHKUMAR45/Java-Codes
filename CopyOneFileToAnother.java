import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyOneFileToAnother {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("Source1.txt");
        FileOutputStream fos=new FileOutputStream("Target2.txt");
        int b;
        while((b=fis.read())!=-1){
            if(b>=65 && b<=90) {
                fos.write(b+32);
            }
            else{
                fos.write(b);
            }

        }
        fis.close();
        fos.close();
    }
}
