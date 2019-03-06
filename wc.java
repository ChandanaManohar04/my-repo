import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class wc {

    public static void main(String[] args) {
        String s = " ";
        ArrayList<String> sdata = new ArrayList<String>();
        TreeSet<String> adata = new TreeSet<>();
        try {
            FileReader fr = new FileReader("G:\\java projects\\jerry.txt");
            BufferedReader br = new BufferedReader(fr);
            while (true) {
                try {
                    if (!((s = br.readLine()) != null))
                        break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                for (String val : s.split(" ")) {
                    sdata.add(val);
                    adata.add(val);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (String val1 : adata) {
            int num = Collections.frequency(sdata, val1);
            System.out.println(val1 + " " + num);
        }

    }


}


