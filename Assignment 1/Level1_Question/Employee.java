package Level1_Question;



// Program to Display Employee Details
// Problem Statement:
//  Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.

public class Employee {

    private String name;
    private int id;
    private int salary;

    Employee(int id, String name, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display(){
        System.out.println("Id is " + this.id+ "\nName is "+ this.name + "\nSalary is "+ this.salary);
    }


    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "Deepak", 1000000);
        e1.display();
    }
}
