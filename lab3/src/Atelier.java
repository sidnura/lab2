import Clothes.Clothes;
import Interfaces.MensClothing;
import Interfaces.WomenClothing;

public class Atelier {
    public static void dressMens(Clothes[] cloths){
        for(Clothes clothes : cloths){
            if(clothes instanceof MensClothing){
                ((MensClothing) clothes).dressMan();
            }
        }
    }

    public static void dressWomens(Clothes[] cloths) {
        for (Clothes clothes : cloths){
            if(clothes instanceof WomenClothing){
                ((WomenClothing) clothes).dressWoman();
            }
        }

    }

}