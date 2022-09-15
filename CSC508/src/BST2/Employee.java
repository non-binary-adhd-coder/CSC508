/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BST2;

/**
 *
 * @author hidayah
 */
public class Employee {

    private String name;
    private long empId;
    private double base;
    private double allow;

    // Construct an Employee object.
    public Employee(String name, long empId, double base, double allow) {
        this.name = name;
        this.empId = empId;
        this.base = base;
        this.allow = allow;
    }

    // Returns the string represention of the object.
    public String toString() {
        return ("\nName : " + name + "\nEmployee ID : " + empId + "\nBase : " + base + "\nAllowance : " + allow);
    }

    // Accessors
    public String getName() {
        return name;
    }

    public long getId() {
        return empId;
    }

    public double getAllow() {
        return allow;
    }

    public double calSalary() {
        return base + allow;
    }
}
