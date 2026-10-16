import java.util.Scanner;

public class FavNumbers {
    static void main() {
        Scanner in = new Scanner(System.in);
        int favInt = SafeInput.getInt(in, "What is your favorite integer? ");
        double favDouble = SafeInput.getDouble(in, "What is your favorite double? ");

        System.out.printf("> Your favorite int: %d\n> Your favorite double: %f", favInt, favDouble);
    }
}
