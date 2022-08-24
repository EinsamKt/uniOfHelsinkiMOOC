/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einsa
 */
public class Product {
    private String name;
    private double price;
    private int qtd;
    
    public Product(String iname, double iprice, int iqtd) {
        this.name = iname;
        this.price = iprice;
        this.qtd = iqtd;
    }
    public void printProduct() {
        System.out.println(this.name + ", " + this.price + ", " + this.qtd);
    }
    
}
