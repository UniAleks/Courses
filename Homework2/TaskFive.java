//написать класс который выводит в консоль наименьшие елемент массива
public class TaskFive {
    public static void main(String[] args) {
        int mas[] = {1, 3, 6, 9, 4, 5, 9, 11, 43, 76};
        int min = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < mas[1]) {
                min = mas[i];
            }
        }
        System.out.println(min);
    }
}