/*
Name : 
Sid# : 
Course: CSC508
Group#: 
Assign#: LAB 1
Due Date: 29 April 2022
Program Description: Employee
*/

import java.util.Scanner;

public class ArrayListUserDefined {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Number of employee:");
        int n = in.nextInt();

        //declare MyArrayList  object named empList
        MyArrayList empList = new MyArrayList();

        String aName;
        long anId;
        double aSalary, max, min, total = 0;
        int count = 0;
        int index;

        //exercise 6
        System.out.println(" ");
        System.out.println("INSERT AT FRONT");
        for (int i = 0; i < 3; i++) {
            // input data for the employees here
            System.out.print("------------------\nEmployee name : ");
            aName = (in.next());

            System.out.print("Employee id : ");
            anId = in.nextLong();

            System.out.print("Employee base salary : ");
            aSalary = in.nextDouble();

            Employee emp = new Employee(aName, anId, aSalary); // normal constructor

            empList.insertAtFront(emp);
        }
        empList.display();

        //EXERCISE 8
        System.out.println(" ");
        System.out.println("INSERT AT BACK");
        for (int i = 0; i < 2; i++) {

            System.out.print("------------------\nEmployee name : ");
            aName = (in.next());

            System.out.print("Employee id : ");
            anId = in.nextLong();

            System.out.print("Employee base salary : ");
            aSalary = in.nextDouble();

            Employee emp = new Employee(aName, anId, aSalary); // normal constructor

            empList.insertAtBack(emp);
        }
        empList.display();

        //EXERCISE 10  
        System.out.println(" ");
        System.out.println("INSERT AT INDEX");
        do {
            System.out.println("Enter the index you wish to insert: ");
            index = in.nextInt();
            if (index < 0 || index > empList.size()) {
                System.out.println("Error index! Reenter index: ");
            }
        } while (index < 0 || index > empList.size());
        System.out.print("------------------\nEmployee name : ");
        aName = (in.next());

        System.out.print("Employee id : ");
        anId = in.nextLong();

        System.out.print("Employee base salary : ");
        aSalary = in.nextDouble();

        Employee emp = new Employee(aName, anId, aSalary); // normal constructor

        empList.insertAtIndex(emp, index);
        empList.display();

        //EXERCISE 12
        System.out.println(" ");
        System.out.println("REMOVE FROM FRONT");
        empList.removeFromFront();
        empList.display();

        //EXERCISE 14
        System.out.println(" ");
        System.out.println("REMOVE FROM BACK");
        for (int i = 0; i < 2; i++) {
            empList.removeFromBack();
        }                
        empList.display();
        System.out.println(" ");


        //EXERCISE 15
        System.out.println(" ");
        for (int x = 0; x < 5; x++) {
            System.out.print("------------------\nEmployee name : ");
            aName = (in.next());

            System.out.print("Employee id : ");
            anId = in.nextLong();

            System.out.print("Employee base salary : ");
            aSalary = in.nextDouble();

            emp = new Employee(aName, anId, aSalary);
            empList.insertAtBack(emp);            
        }
        System.out.println(" ");
        Employee temp = (Employee) empList.get(0);
        min = temp.getSalary();
        max = temp.getSalary();
        
        for(int x = 0; x < empList.size(); x++) {
            Employee e=(Employee) empList.get(x);
            total+=e.getSalary();
            count++;
            if(e.getSalary()< min)
            {
                min = e.getSalary();
            }
            if(e.getSalary()> max)
            {
                max = e.getSalary();
            }
        }
        System.out.println(" ");
        System.out.println(" TOTAL SALARY: " +total);
        System.out.println(" AVERAGE SALARY: " +(total/count));
        System.out.println(" MINIMUM SALARY: " + min);
        System.out.println(" MAXIMUM SALARY: " + max);
        System.out.println(" ");
        
        MyArrayList empHigh = new MyArrayList();
        for (int x = 0; x < 5; x++) {
            Employee e=(Employee) empList.get(x);
            if(e.getSalary()>5000)
            {
                empHigh.insertAtBack(e);
            }
        }
        
        System.out.println(" ");
        System.out.println(" \nDETAILS EMP LIST \n");
        empList.display();
        System.out.println(" \nDETAILS EMPLOYEE WITH SALARY OVER 500 \n");
        empHigh.display();    
               
    }
}
