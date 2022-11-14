package com.week3.cafe;

public class WhippedCream extends Decorator {
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print("And WippedCream");
    }
}
