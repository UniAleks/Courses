import java.util.Scanner;
//написать класс который выводит в консоль массив чисел в обратном порядке, полученный из числа введенного в консоль
public class TaskSix {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("введите количество элементов");
        int num = Scanner.nextInt();
        int mas[] = new int[num];
        System.out.println("введите элементы");
        int length = 0;
        for (int i = 0; i < num; i++) {
            mas[i] = Scanner.nextInt();
        }
        System.out.println("Элементы в обратном порядке");
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.println(mas[i]);
        }
    }
}
