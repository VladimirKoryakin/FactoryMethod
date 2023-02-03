import java.util.Scanner;

public interface PhoneFactory {
    default Phone sellPhone(String customerName) {
        System.out.println("Hi, " + customerName + "! What phone do you want? Please, type the capacity and the color:");
        Scanner in = new Scanner(System.in);
        int capacity = in.nextInt();
        String color = in.nextLine();
        return createPhone(capacity, color);
    }
    Phone createPhone(int capacity, String color);
}
