import java.util.stream.IntStream;
//написать класс который выводит в консоль сумму всех абсолютных значений массива
public class TaskOne {
    public static void main(String[] args) {
        int mas[] = {1, 3, 6, 9, 4, 5, 9, 11, 43, 76};
        int sum = IntStream.of(mas).sum();
        System.out.println(sum);
    }
}