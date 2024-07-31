import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("-");

        System.out.println(input[0] + "-" + input[2] + "-" + input[1]);
    }
}