package OA.Hulu;

import java.io.*;
import java.util.*;

public class Org_Chart {
    static Map<String, List<String>> map;
    static Map<String, Integer> count;
    static Map<String, Employee> info;
    static BufferedReader reader;
    static BufferedWriter writer;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new FileReader("src/OA/org_chart.in"));
        writer = new BufferedWriter(new FileWriter("src/OA/org_chart.out"));

        int numCases = Integer.parseInt(reader.readLine());
        String root = "NULL";

        for (int caseNum = 1; caseNum <= numCases; caseNum++) {
            map = new HashMap<String, List<String>>();
            count = new HashMap<String, Integer>();
            info = new HashMap<String, Employee>();
            String[] toks = reader.readLine().split("--");

            for (int i = 0; i < toks.length; i++) {
                String[] data = toks[i].split(",");
                String name = data[0];
                String boss = data[1];
                String title = data[2];
                String year = data[3];

                if (!map.containsKey(boss)) {
                    map.put(boss, new ArrayList<String>());
                }
                map.get(boss).add(name);
                info.put(name, new Employee(name, boss, title, year));
            }

            for (String s:map.keySet()) {
                if (s.equals("NULL")) {
                    depthFirstSearch(s, -1);
                }
            }

            writer.write("Case #" + caseNum + "\n");

            List<String> ll = map.get(root);
            Collections.sort(ll);

            for (String individual:ll) {
                print(individual);
            }
        }

        writer.close();
        reader.close();
    }

    public static void depthFirstSearch(String string, int counts) {
        count.put(string, counts);
        if (map.get(string) == null) {
            return;
        }
        List<String> temp = map.get(string);
        for (String strings:temp) {
            depthFirstSearch(strings, counts + 1);
        }
        return;
    }

    public static void print(String individual) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int a = 0; a < count.get(individual); a++) {
            sb.append("-");
        }

        writer.write(sb.toString() + info.get(individual).getName() + " (" + info.get(individual).getTitle() + ") " + info.get(individual).getYear() + "\n");
        if (!map.containsKey(individual)) {
            return;
        }
        List<String> list = map.get(individual);
        Collections.sort(list);
        for (String strings:list) {
            print(strings);
        }
    }
}

class Employee {
    String name;
    String boss;
    String title;
    String year;

    public Employee (String name, String boss, String title, String year) {
        this.name = name;
        this.boss = boss;
        this.title = title;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public String getBoss() {
        return this.boss;
    }

    public String getTitle() {
        return this.title;
    }

    public String getYear() {
        return this.year;
    }
}