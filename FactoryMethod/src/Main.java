public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new AppleFactory();
        Phone newPhone = phoneFactory.sellPhone("IPhone user");
        newPhone.updateSystem();
        newPhone.installApplication("Brawl Stars");
        newPhone.getInfo();

        phoneFactory = new AndroidFactory();
        newPhone = phoneFactory.sellPhone("Android user");
        newPhone.updateSystem();
        newPhone.installApplication("Brawl Stars");
        newPhone.getInfo();
    }
}