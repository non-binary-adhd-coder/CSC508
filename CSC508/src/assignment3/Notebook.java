/*
Name : 
Sid# : 
Course: CSC508
Group#: 
Assign#: LAB 3 (ON BST)
Due Date: 15 JULAI 2022
Program Description: Notebook
 */
package assignment3;

/**
 *
 * @author hidayah
 */
public class Notebook {

    private String serialNo;
    private String brand; // HP, Acer, Lenovo, etc.
    private double price;
    private String model; // HP ProBook, Acer Aspire, Lenovo Pad, etc.

    public Notebook(String serialNo, String brand, double price, String model) {
        this.serialNo = serialNo;
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

   
// definition of other methods

    public String getSN() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString()
    {
        return ("\nSerial Number: " + serialNo + "\nBrand: " + brand + 
        "\nPrice: RM " + price + "\nModel : " + model);
    }   
    
}
