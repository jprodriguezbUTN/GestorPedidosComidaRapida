/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Observer.IObserved;
import Models.Observer.IObserver;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jprod
 */
public class OrderManager{
    private HashMap<Integer,Order> orders;

    public OrderManager() {
        this.orders = new HashMap<>();
        
    }
    
    public int generateOrderId(){
        return orders.keySet().stream().max(Integer::compare).orElse(0)+1;
    }
    
    public Order getOrder(int id){
        return orders.get(id);
    }
    
    public void add(Order order){
        orders.put(order.getId(),order);
    }
    
    public void remove(Order order){
        orders.remove(order.getId());
    }

    public Order get(int key) {
        return orders.get(key);
    }
}
