/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.*;

/**
 *
 * @author hidayah
 */
public class MyQueueApp {

    public static void main(String args[]) {
        MyQueue qList = new MyQueue();  // Step 1: create the queue object
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
            qList.enqueue(stud);
        }
        qList.print(); // display the elements in the list

        // Find the total score
        double sum = 0;
        Student obj;
        while (!qList.isEmpty()) {
            obj = (Student) qList.dequeue();
            sum += obj.getScore();
        }
        System.out.println("Total score " + sum);

        // Complete the exercises
        // Find the highest and lowest score in the queue
        // Calculate how many students earned score above 80
    }
}
