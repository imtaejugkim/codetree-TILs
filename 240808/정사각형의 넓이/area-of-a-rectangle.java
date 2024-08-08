import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();


        System.out.println(a*a);

        if(a<5){
            System.out.println("tiny");
        }
    }
}