/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.States.OrderState;
import Models.States.PendingOrderState;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author jprod
 */
public class Order {
    private int id;
    private Customer customer;
    private HashMap<Product,Integer> products;
    private OrderState state;

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Iterator getProducts() {
        return products.keySet().iterator();
    }
    
    public int getQuantity(Product product){
        return products.get(product);
    }


    public void setProducts(HashMap products) {
        this.products = products;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public Order(int id, Customer customer, HashMap products) {
        this.id = id;
        this.customer = customer;
        this.products = products;
        this.state = new PendingOrderState(this);
    }

}
