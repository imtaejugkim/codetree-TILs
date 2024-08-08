import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if(a<5){
            System.out.println("tiny");
        }else{
            System.out.println(a*a);
        }
    }
}