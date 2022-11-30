public class Triangle {
    double a = 6;

    double b = 6;

    double c = 6;

    double p = ((a+b+c)/2);

    String sideA(){
        return "a side is: " + a;
    }
    String sideB(){
        return "b side is: " + b;
    }
    String sideC(){
        return "c side is: " + c;
    }
    String calculateSquare(){
        return "Square volume is: " + Math.sqrt(p*(p-a)*(p-b)*(p-c)) ;
    }
}
