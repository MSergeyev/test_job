import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class InpOutTest {
    public static void main(String[] args) throws IOException {
        File file = new File("Test");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();}
}
