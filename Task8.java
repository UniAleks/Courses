import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год:");
        int Year = in.nextInt();
        int Century = Year / 100 + 1;
        System.out.println(Century + " Век");
    }
}
