/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einsa
 */
public class Books {
    private String name;
    private int pages;
    private int year;
    
    public Books(String iName, int iPages, int iYear) {
        this.name = iName;
        this.pages = iPages;
        this.year = iYear;
    }
    public String getName() {
        return this.name;
    }
    public int getPages() {
        return this.pages;
    }
    public int getYear() {
        return this.year;
    }
    @Override
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
}
