package com.week4.mission1._6;

public class GenericPrinter<T extends Material> {

    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return this.material;
    }

    @Override
    public String toString() {
        return "재료는" + material.toString() + "입니다";
    }
}
