package com.week3.cafe;

public class Mocha extends Decorator {
    public Mocha(Latte latte) {
        super(latte);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print("Mocha Syrup ");
    }
}
