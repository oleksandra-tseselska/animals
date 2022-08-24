package OOP;

public class Cats {
    private String name;
    private int speed;
    private String color;

    public Cats(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    public void catCharacteristic() {
        System.out.println("This is "+name);
        System.out.println("Max peed "+speed);
        System.out.println("Color "+color);
    }
}
