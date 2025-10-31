package edu.eci.arsw.myrestaurant.model;

public class OrderPriceTuple {

    private Order order;
    private Integer price;

    public OrderPriceTuple(Order order, Integer price) {
        this.order = order;
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
