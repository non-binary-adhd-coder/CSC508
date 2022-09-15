/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author hidayah
 */
public class Student {

    private String name;
    private int studId;
    private int part;
    private double score;

    public Student() {
        name = "";
        studId = 1;
        part = 1;
        score = 1.0;

    }

    public Student(String nm, int sid, int pt, double sc) {
        name = nm;
        studId = sid;
        part = pt;
        score = sc;
    }

    public void setStudent(String nm, int sid, int pt, double sc) {
        name = nm;
        studId = sid;
        part = pt;
        score = sc;
    }

    public String toString() {
        return "\nName : " + name
                + "\nStudent ID :  " + studId
                + "\nPart : " + part + "\nScore : " + score;

    }

    public String getName() {
        return name;
    }

    public int getStudId() {
        return studId;
    }

    public int getPart() {
        return part;
    }

    public double getScore() {
        return score;
    }
}
