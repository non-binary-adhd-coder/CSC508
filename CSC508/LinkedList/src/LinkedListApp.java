/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hidayah
 */

import java.util.*; 

public class LinkedListApp {

    public static void main(String args[]) {
        MyLinkedList studList = new MyLinkedList();  // Step 1: create the LinkedList object
        Scanner in = new Scanner(System.in);

        // Step 2: Input data for object
        String name;
        int prt, num, stuId;;
        double score;

        System.out.println(" How many students? ");
        num = in.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(" Enter name:");
            name = in.next();
            System.out.println(" Enter id:");
            stuId = in.nextInt();
            System.out.println(" Enter part:");
            prt = in.nextInt();
            System.out.println(" Enter score:");
            score = in.nextDouble();

            // Step 3: Create and store data into object
            Student stud = new Student(name, stuId, prt, score);

            // Step 4: insert object at front into linked list
            studList.insertAtBack(stud);

        }
        studList.display();// display the elements in the list

        // Find the total score
        double sum = 0;

        Student stud = (Student) studList.getFirst();
        while (stud != null) {
            sum += stud.getScore();
            stud = (Student) studList.getNext();
        }
        System.out.println(" Total score: " + sum);
        System.out.println(" ");
        System.out.println(" ");
        
        // To find the highest score        
        Student stud2 = (Student) studList.getFirst();
        Student studMax = (Student) studList.getFirst(); //set bar for max value
        double max = stud2.getScore();
        name = stud2.getName();
        int id = stud2.getStudId();
        
        while (stud2 != null) {
            if(stud2.getScore()>max)
            {
                max = stud2.getScore();
                name = stud2.getName();
                id = stud2.getStudId();
                studMax = stud2;
            }
            stud2 = (Student) studList.getNext();
        } //end while
        
        System.err.println("\nThe highest score is ");
        System.out.println(studMax.toString());
        System.out.println(" ");
        System.out.println(" ");
        
        // Count and display the number of students with score > 80.
        Student stud3 = (Student) studList.getFirst();
        int count = 0;
        
        while (stud3 != null) 
        {
            if(stud3.getScore()>80)
            {
                count++;
            }  
            stud3 = (Student) studList.getNext();         
        }
        System.out.println("\nThe number of students with score more than 80 is "+count);
        System.out.println(" ");
        System.out.println(" ");
        
        //  Display the name of student with id = 123456.
        Student stud4 = (Student) studList.getFirst();
        boolean check = true;
        
        while (stud4 != null) 
        {
            if(stud4.getStudId()== 123456)
            {
                System.out.println("Student name : "+ stud4.toString());
                System.out.println(" \n");
                check = false;
            }
            stud4 = (Student) studList.getNext();
        }
        if(check)
        {
            System.out.println("The student id does not exist.");
        }
    }
}
