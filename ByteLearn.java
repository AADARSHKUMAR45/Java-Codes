import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteLearn {
    public static void main(String[] args)throws Exception {
        byte b[]={'a','b','c','d','e','f','g'};
        ByteArrayInputStream bais=new ByteArrayInputStream(b);
        int x;
        while((x=bais.read())!=-1) {
            System.out.print((char)x);
        }
        bais.close();

    }
}
