package OOP;

public class Lion extends Cats{
    private boolean mane;

    public Lion(String name, int speed, String color, boolean mane){
        super(name, speed, color);
        this.mane = mane;
    }

    @Override
    public void catCharacteristic(){
        super.catCharacteristic();
        if(mane) {
            System.out.println("Yoohoo we have a lion with a mane");
        } else {
            System.out.println("Yoohoo we have a lion without a mane");
        }
    }
}
