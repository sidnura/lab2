package Clothes;
import Enums.Color;
import Enums.ClothingSize;
public abstract class Clothes {
    private ClothingSize size;
    private double price;
    private Color Color;

    public Clothes(ClothingSize size, double price, Color color) {
        this.size = size;
        this.price = price;
        Color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color color) {
        Color = color;
    }
}