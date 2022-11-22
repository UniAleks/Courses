import java.util.Scanner;
//написать класс который выводит в консоль массив состоящий из двух елементов.
//1й - кол-во  всех позитивных значений массива, 2й - сумма всех отрицательных. Массив вводится с консоли
public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print array length");
        int value = scanner.nextInt();
        int[] mas = new int[value];
        System.out.println(mas);
        for (int i = 0; i < value; i++) {
            mas[i]= scanner.nextInt();
        }
        System.out.println(mas);
        int[] resultMas = new int[2];
        int posValuesAmount = 0;
        int sumOfNegatives=0;
        for (int i = 0; i <value;i++){
            if (mas[i] > 0){
                posValuesAmount++;

            }
            else if (mas[i] < 0){
                sumOfNegatives += mas[i];
            }
        }
        resultMas[0]=posValuesAmount;
        resultMas[1]=sumOfNegatives;
        System.out.println(resultMas[0]);
        System.out.println(resultMas[1]);
    }

}
