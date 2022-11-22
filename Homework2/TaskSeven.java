//написать класс который выводит в консоль число преобразованное из строки
public class TaskSeven {
    public static void main(String[] args) {
        String Str = "753";
try {
    int i = Integer.parseInt(Str.trim());
    System.out.println("int i = " + i);
}
catch (NumberFormatException nfe)
{
    System.out.println(nfe.getMessage());
}
    }
}
