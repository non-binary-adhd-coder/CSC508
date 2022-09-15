/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author hidayah
 */
import java.util.*;

public class StudentApp {

    public static void main(String args[]) {
        MyStack objStack = new MyStack();
        MyStack temp = new MyStack();
        Scanner in = new Scanner(System.in);

        // Input data for object
        String name;
        int prt, num, stuId;
        double cgpa;
        int total;
        double sum = 0.0;
        double average = 0.0;

        System.out.print("How many students? 3");
        num = in.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.print("\nEnter name:");
            name = in.next();
            System.out.print("Enter id:");
            stuId = in.nextInt();
            System.out.print("Enter part:");
            prt = in.nextInt();
            System.out.print("Enter score:");
            cgpa = in.nextDouble();

            // Create and store data into object
            Student stud = new Student(name, stuId, prt, cgpa);

            // Insert object at front into stack
            objStack.push(stud);
            sum = sum + stud.getScore();

        }

        objStack.display();

        // Calculate and display the total and average scores
        System.out.println("Total Score :" + sum);
        average = sum / num;
        System.out.println("Average Score:" + average);

        // Display the details of student who achieved the highest score
        Object o = objStack.pop();
        Student stu = (Student) o;
        double highest = stu.getScore();
        String details = stu.toString();

        while (!objStack.isEmpty()) {
            o = objStack.pop();
            Student s = (Student) o;
            if (s.getScore() > highest) {
                highest = s.getScore();
                details = s.toString();
            }
            temp.push(s);
        }
        while (!temp.isEmpty()) {
            Object ob = temp.pop();
            objStack.push(ob);
        }
        System.out.println("Student details with the highest score:" + details);

    }

}
