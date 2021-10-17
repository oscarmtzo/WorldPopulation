import java.io.File;
import java.util.Scanner;

public class SumWithSpaces {
    public static void main(String[] args) {
        File file = new File("./src/dataset_91007.txt");

        try (Scanner scanner = new Scanner(file);) {
            int longest = 0;
            while (scanner.hasNext()) {
               int compareNum = scanner.nextInt();
                if (compareNum > longest) {
                    longest = compareNum;
                }
            }

            System.out.println(longest);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
