public class Iphone implements Phone{
    private int capacity;
    private String color;
    @Override
    public void installApplication(String applicationName) {
        System.out.println(applicationName + " was installed from App Store!");
    }

    @Override
    public void updateSystem() {
        System.out.println("New version of IOS was installed!");
    }

    @Override
    public void getInfo() {
        System.out.println("IPhone: " + capacity + "Gb " + color);
    }

    public Iphone(int capacity, String color) {
        this.capacity = capacity;
        this.color = color;
    }
}
