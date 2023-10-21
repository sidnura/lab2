package Clothes;

import Enums.ClothingSize;
import Interfaces.WomenClothing;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double price, Enums.Color color) {
        super(size, price, color);
    }
    @Override
    public void dressWoman() {
        System.out.println("Женщина надела юбку размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }
}