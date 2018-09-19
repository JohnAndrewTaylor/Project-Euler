// Author: John Taylor

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PE42 {
    public static void main(String[] args) {
        try {
            File file = new File("p042_words.txt");
            Scanner scanner = new Scanner(file).useDelimiter("\\p{Punct}");
            int triangleWords=0;
            while (scanner.hasNext()) {
                char[] word = scanner.next().toCharArray();
                int sum=0;
                for (int i=0; i<word.length;i++) {
                    sum += word[i]-64;
                }
                int n = (int)(Math.sqrt(2*sum));
                double tn = 0.5*n*(n+1);
                if (tn==sum&&sum>0){
                    triangleWords++;
                }
            }
            System.out.println(triangleWords);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}