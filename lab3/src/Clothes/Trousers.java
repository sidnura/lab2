package Clothes;
import Enums.Color;
import Enums.ClothingSize;
import Interfaces.*;
public  class Trousers extends Clothes implements MensClothing, WomenClothing {

    public Trousers(ClothingSize size, double price, Color color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел брюки размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надела брюки размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }
}
