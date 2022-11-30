public class Employer {
    int id = 124;
    String firstName = "Vladislav";
    String lastName = "Schevchenko";
    double salary = 1500;
    double percent = 0.20;
    int id1 = 143;
    String firstName1 = "Rich";
    String lastName1 = "Forest";
    double salary1 = 1200;
    double percent1 = 0.10;
String getFirstName1(){
    return "First name is: " + firstName;
}
    String getLastName1(){
        return "Last name is: " + lastName;
    }
    String getId1(){
        return "Id is: " + id;
    }
    String getSalary1(){
        return "Salary is: " + salary;
    }
    String getNewSalary1() {
        return "Salary increase is: " + (salary+(salary*percent));
    }
        String calculateSalaryYear1(){
    return "Year salary is: " + (salary+(salary*percent))*12;
}
    String getFirstName(){
        return "First name is: " + firstName1;
    }
    String getLastName(){
        return "Last name is: " + lastName1;
    }
    String getId(){
        return "Id is: " + id1;
    }
    String getSalary(){
        return "Salary is: " + salary1;
    }
    String getNewSalary() {
        return "Salary increase is: " + (salary1+(salary1*percent1));
    }
    String calculateSalaryYear(){
        return "Year salary is: " + (salary1+(salary1*percent1))*12;
    }

}

