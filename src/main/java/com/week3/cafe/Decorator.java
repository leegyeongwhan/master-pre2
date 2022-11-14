package com.week3.cafe;

abstract public class Decorator implements Coffee {
    private Coffee coffee;


    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
