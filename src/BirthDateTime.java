import java.util.Scanner;

public class BirthDateTime {
    static void main() {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "What is your birth year? ", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "What is your birth month? [1-12]: ", 1, 12);
        int birthDay = 0;

        switch (birthMonth) {
            case 1, 3, 5, 7, 8, 10, 12 -> birthDay = SafeInput.getRangedInt(in, "What is your birth day? ", 1, 31);
            case 4, 6, 9, 11 -> birthDay = SafeInput.getRangedInt(in, "What is your birth day? ", 1, 30);
            case 2 -> birthDay = SafeInput.getRangedInt(in, "What is your birth day? ", 1, 29);
        }

        int birthHour = SafeInput.getRangedInt(in, "What is your birth hour? ", 1, 12);
        int birthMinute = SafeInput.getRangedInt(in, "What is your birth minute? ", 0, 59);

        System.out.printf("> You were born on %d/%d/%d at %d:%d",
                birthMonth,
                birthDay,
                birthYear,
                birthHour,
                birthMinute
        );
    }
}
