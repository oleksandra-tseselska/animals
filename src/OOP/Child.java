package OOP;

public class Child extends Lion{
    private int age;
    private boolean vaccinations;

    public Child(String name, int speed, String color, boolean mane, int age, boolean vaccinations) {
        super(name, speed, color, mane);
        this.age = age;
        this.vaccinations = vaccinations;
    }

    @Override
    public void catCharacteristic(){
        super.catCharacteristic();
        System.out.println("This lion cub is "+age+" month old");
        if(vaccinations) {
            System.out.println("This lion cub has vaccinations");
        } else {
            System.out.println("This lion cub hasn't vaccinations yet");
        }
    }
}
