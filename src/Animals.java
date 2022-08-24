import OOP.Cats;
import OOP.Child;
import OOP.Lion;

public class Animals {
    public static  void main(String[] arg) {
        Lion lion = new Lion("Patric", 60,"brown", true);
        Child lionChild = new Child("Snow", 15, "white", false, 6, true);

        lion.catCharacteristic();
        lionChild.catCharacteristic();
    }
}
