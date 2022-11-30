import java.util.stream.IntStream;
//написать класс который выводит в консоль cумму всех eлeментов массива возведенных в квадрат
public class TaskFour {
    public static void main(String[] args) {
        int mas[] = {1, 3, 6, 9, 4, 5, 9, 11, 43, 76};
        int square = 2;
        for (int i = 0;i < mas.length;i++){
            mas[i]= (int) Math.pow(mas[i],square );
        }
        int sum = IntStream.of(mas).sum();
        System.out.println(sum);
    }
}
