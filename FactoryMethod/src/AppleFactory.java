public class AppleFactory implements PhoneFactory{
    @Override
    public Phone createPhone(int capacity, String color) {
        System.out.println("Here's your new Iphone!");
        return new Iphone(capacity, color);
    }
}
