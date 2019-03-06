import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class wc {

    public static void main(String[] args) {
        String s = " ";
        ArrayList<String> aldata = new ArrayList<String>();
        TreeSet<String> tsdata = new TreeSet<>();
        String tokens[];

        ArrayList<Integer> wordcounts = new ArrayList<>();

        try {
            FileReader fr = new FileReader("G:\\java projects\\jerry.txt");
            BufferedReader br = new BufferedReader(fr);

            try {
                while ((s = br.readLine()) != null) {
                    tokens = s.split(" ");
                    for (String val : tokens) {
                        aldata.add(val); // all words captured
                        tsdata.add(val); // set of unique words
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        // search for frequency of unique words in the list
        for (String val1 : tsdata) {
            int num = Collections.frequency(aldata, val1);
            wordcounts.add(num);
            //System.out.println(val1 + " " + num);
        }

        int count = 0;
        for (String val1 : tsdata) {
            System.out.println(val1 + ":" + wordcounts.get(count));
            count++;
        }


    }
}





