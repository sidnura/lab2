package Clothes;


import Enums.Color;
import Enums.ClothingSize;
import Interfaces.*;
public class Tie extends Clothes implements MensClothing {
    public Tie(ClothingSize size, double price, Color color) {
        super(size, price, color);
    }
    @Override
    public void dressMan() {
        System.out.println("Мужчина надел галтус размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }

}