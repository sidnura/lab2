import Clothes.*;
import Enums.Color;
import Enums.ClothingSize;
public class Main {
    public static void main (String[] args) {
//        Vector a = new Vector(1, 1, 5, 5);
//        Vector b = new Vector(2, 2, 4, 8);
//        System.out.println("скалярное произведение равно: " + Vector.ScalarProduct(a, b));
//        System.out.println("длина вектора a равна: " + Vector.VectorLength(a));
//        System.out.println("длина вектора b равна: " + Vector.VectorLength(b));
//
//        Vector c = Vector.multiplication(a,5);
//        Vector.print(c);
//
//        Vector d = Vector.multiplication(b,6);
//        Vector.print(d);
//
//        Vector e = Vector.summa(a, b);
//        Vector.print(e);
//
//        Vector f = Vector.difference(a, b);
//        Vector.print(f);

        Clothes[] clothes = {
                new TShirt(ClothingSize.M, 30, Color.PURPLE),
                new Skirt(ClothingSize.S, 35, Color.WHITE),
                new Tie(ClothingSize.L, 20, Color.BLACK),
                new Trousers(ClothingSize.XS, 40, Color.BROWN)
        };

        Atelier atelier = new Atelier();
        atelier.dressMens(clothes);
        atelier.dressWomens(clothes);



    }
}



