import java.io.File;
import java.util.Scanner;

public class CountNumsFile {
    public static void main(String[] args) {
        File file = new File("./src/dataset_91022.txt");
        try (Scanner scanner = new Scanner(file)) {
            int total = 0;
            while (scanner.hasNext()) {
                int numAux = scanner.nextInt();
                if (numAux >= 9999) {
                    total++;
                    //System.out.println(numAux);
                }
            }
            System.out.println(total);
        } catch (Exception e) {
            System.out.println("File not found: ");
        }
    }
}
