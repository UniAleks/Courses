//написать класс который выводит в консоль сумму всех позитиных значений массива
public class TaskTwo {
    public static void main(String[] args) {
        int mas[] = {1, 7, 3, 2, -4, -3, -9, -21};
        int sum = 0;
        for (int i = 0; i < mas.length;i++){
            if (mas[i]>0) {
                sum += mas[i];
            }
        }
        System.out.println(sum);
    }
}