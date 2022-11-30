public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.depth() + " cm");
        System.out.println(box.height() + " cm");
        System.out.println(box.width() + " cm");
        System.out.println(box.calculateVolume() + " cm³");
        System.out.println("-------------------------------------------------------");
        Circle circle = new Circle();
        System.out.println(circle.radiusVolume() + "cm³");
        System.out.println(circle.calculateRadius() + "cm³");
        System.out.println("-------------------------------------------------------");
        Triangle triangle = new Triangle();
        System.out.println(triangle.sideA() + "cm");
        System.out.println(triangle.sideB() + "cm");
        System.out.println(triangle.sideC() + "cm");
        System.out.println(triangle.calculateSquare() + "cm³");
        System.out.println("-------------------------------------------------------");
        Employer employer = new Employer();
        System.out.println(employer.getId());
        System.out.println(employer.getFirstName());
        System.out.println(employer.getLastName());
        System.out.println(employer.getSalary() + "$");
        System.out.println(employer.getNewSalary() + "$");
        System.out.println(employer.calculateSalaryYear() + "$");
        System.out.println("-------------------------------------------------------");
        Employer employer1 = new Employer();
        System.out.println(employer1.getId1());
        System.out.println(employer1.getFirstName1());
        System.out.println(employer1.getLastName1());
        System.out.println(employer1.getSalary1() + "$");
        System.out.println(employer1.getNewSalary1() + "$");
        System.out.println(employer1.calculateSalaryYear1() + "$");
    }
    }