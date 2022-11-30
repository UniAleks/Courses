//написать класс который выводит в консоль число преобразованное из строки
public class TaskSeven {
    public static void main(String[] args) {
        String str = "753";
try {
    int i = Integer.parseInt(str.trim());
    System.out.println("int i = " + i);
}
catch (NumberFormatException nfe)
{
    System.out.println(nfe.getMessage());
}
    }
}
