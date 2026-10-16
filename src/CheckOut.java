import java.util.Scanner;

public class CheckOut {
    static void main() {
        Scanner in = new Scanner(System.in);
        boolean moreItems = true;
        double totalPrice = 0;

        do {
            double itemPrice = SafeInput.getRangedDouble(in, "What is the price of your item? $", .5, 10.);
            totalPrice += itemPrice;

            moreItems = SafeInput.getYNConfirm(in, "Do you have more items? [y/n]: ");
        } while (moreItems);

        System.out.printf("> Your total price is $%.2f\n", totalPrice);
    }
}
