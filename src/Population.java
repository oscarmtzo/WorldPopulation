import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        File file = new File("./src/dataset_91069.txt");

        try (Scanner scanner = new Scanner(file)) {
            ArrayList<Integer> years = new ArrayList<>();
            ArrayList<Long> populationNums = new ArrayList<>();
            int start = 1;
            while (scanner.hasNext()) {
                String[] row = new String[2];
                row = scanner.nextLine().split("\t");
                if (!row[0].equals("year") || !row[1].equals("population")) {
                    years.add(Integer.parseInt(row[0]));
                    populationNums.add(Long.parseLong(row[1].replace(",","")));
                }
                //System.out.println(Arrays.toString(scanner.next().split("\t")));
            }
            long popIncrease = 0;
            int index = 0;
            for (int i = 0; i < populationNums.size(); i++) {
                if (i != 0) {
                    long auxIncraese = populationNums.get(i) - populationNums.get(i - 1);
                    if (popIncrease <= auxIncraese) {
                        popIncrease = auxIncraese;
                        index = i;
                    }
                }
            }
            System.out.println(years.get(index));

        } catch (FileNotFoundException e) {
            System.out.println("Not found the file " + file.getName() + " in this path: " + file.getPath());
        }

    }
}
