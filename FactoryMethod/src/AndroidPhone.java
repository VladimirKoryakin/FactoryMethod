public class AndroidPhone implements Phone {
    private int capacity;
    private String color;

    @Override
    public void installApplication(String applicationName) {
        System.out.println(applicationName + " was installed from Play Market!");
    }

    @Override
    public void updateSystem() {
        System.out.println("New version of Android was installed!");
    }

    @Override
    public void getInfo() {
        System.out.println("Android Phone: " + capacity + "Gb " + color);
    }


    public AndroidPhone(int capacity, String color) {
        this.capacity = capacity;
        this.color = color;
    }
}
