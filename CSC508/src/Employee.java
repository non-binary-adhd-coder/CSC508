/*
Name : SITI NURHIDAYAH BINTI HALIZAN
Sid# : 2021477726
Course: CSC508
Group#: CS2304A
Assign#: LAB 1
Due Date: 29 April 2022
Program Description: Employee
*/

public class Employee {
    
    private String name;
    private long empId;
    private double salary;
    
    public Employee() {
    }    

    public Employee(String name, long empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", empId=" + empId + ", salary=" + salary + '}';
    }

    
    
    
}
