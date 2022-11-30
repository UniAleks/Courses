import static java.lang.Math.abs;
//написать класс который выводит в консоль сумму всех целых чисел от 1 до заданного значения, число всегда больше 0
public class TaskThree {
    public static void main(String[] args) {
        double mas[] = {1, 7, 3.43, 2.8, 4.75, 3.33, 9.5, 21};
        int sum = 0;
        for (int i = 0; i < mas.length;i++) {
            if (mas[i]>(int)mas[i]) continue;
            else  {sum = (int) abs(mas[i])+sum;}
            }
        System.out.println(sum);
    }
}
