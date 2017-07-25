import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("output.txt"));
        List<String> outputList = new ArrayList<String>();
        for (int x=1; x <= 200; x++) {
            boolean bim = x % 3 == 0;
            boolean bam = x % 5 == 0;
            if (bim && bam) {
                outputList.add("BimBam");
            } else if (bim) {
                outputList.add("Bim");
            } else if (bam) {
                outputList.add("Bam");
            } else {
                outputList.add(String.valueOf(x));
            }
        }
        System.out.println(outputList);
        printWriter.write(String.valueOf(outputList));
        printWriter.close();
    }
}
