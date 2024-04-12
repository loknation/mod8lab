import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int favint;
        double favdob;
        Scanner Scanner = new Scanner(System.in);
        String username = SafeInput.getNonZeroLenString(Scanner, "what is your username");
        System.out.println("your username is " + username);
        favint = SafeInput.getInt(Scanner, "What is your fav int");
        favdob = SafeInput.getDouble(Scanner, "What is your fav double");
        System.out.println("fav double is" + favdob);
        System.out.println("fav int is" + favint);
        int year = SafeInput.getRangedInt(Scanner, "What year were you born: ", 1950, 2010);
        int month = SafeInput.getRangedInt(Scanner, "What month were you born: ", 1, 12);
        int day = 0;
        if (month == 2) {
            if (year % 4 == 0 && year / 400 != 0) {
                day = SafeInput.getRangedInt(Scanner, "What day were you born: ", 1, 29);
            }
            day = SafeInput.getRangedInt(Scanner, "What day were you born: ", 1, 28);
        }
        else if ((month - 1) % 2 == 0) {
            day = SafeInput.getRangedInt(Scanner, "What day were you born: ", 1, 31);
        }
        else {
            day = SafeInput.getRangedInt(Scanner, "What day were you born: ", 1, 30);
        }
        int hour = SafeInput.getRangedInt(Scanner, "What hour were you born: ", 1, 24);
        int minute = SafeInput.getRangedInt(Scanner, "What minute were you born: ", 1, 60);
        double price = 0;
        while (true) {
            price += SafeInput.getRangedDouble(Scanner, "What is the price: ", 0.5, 9.99);
            if (!SafeInput.getYN(Scanner, "Continue?")) break;
        }
        System.out.println("Total price: " + price);
        SafeInput.getRegEx(Scanner, "What is your SSN: ", "\\d{3}-\\d{2}-\\d{4}");
        SafeInput.getRegEx(Scanner, "What is your UC student number: ", "(M|m)\\d{5}");
        SafeInput.getRegEx(Scanner, "What is your menu choice: ", "[OoSsVvQq]");
    }
}
