package OA.Hulu;

import java.io.*;

public class Hulu_Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/OA/sum.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/OA/sum_solution1_java.out"));

        int numCases = Integer.parseInt(reader.readLine());

        System.out.println(numCases);

        for (int caseNum = 1; caseNum <= numCases; caseNum++) {
            String[] toks = reader.readLine().split(" ");
            int x = Integer.parseInt(toks[0]);
            int y = Integer.parseInt(toks[1]);
            int sum = x + y;
            System.out.println(sum);

            writer.write("Case #" + caseNum + "\n");
            writer.write(sum + "\n");
        }

        writer.close();
        reader.close();
    }
}

