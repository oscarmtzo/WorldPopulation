import java.io.File;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        File file = new File("./src/dataset_91033.txt");

        try (Scanner scanner = new Scanner(file)) {
            long sum = 0;
            while (scanner.hasNext()) {
                sum += scanner.nextLong();
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
