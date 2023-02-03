public class AndroidFactory implements PhoneFactory{
    @Override
    public Phone createPhone(int capacity, String color) {
        System.out.println("Here's your new Android Phone!");
        return new AndroidPhone(capacity, color);
    }
}
