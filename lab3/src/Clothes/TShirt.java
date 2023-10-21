package Clothes;

import Enums.Color;
import Enums.ClothingSize;
import Interfaces.*;

public  class TShirt extends Clothes implements MensClothing, WomenClothing {
    public TShirt(ClothingSize size, double price, Color color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел футболку размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надела футболку размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }

}