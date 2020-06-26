package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();

    }

    public String getName(){
        return this.name;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addStock(ISell itemToAdd){
        this.stock.add(itemToAdd);
    }

    public void removeStock(ISell itemToRemove){
        int index = stock.indexOf(itemToRemove);
        stock.remove(index);
    }
}
