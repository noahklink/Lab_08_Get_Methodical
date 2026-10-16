import java.util.Scanner;

public class Reggie {
    static void main() {
        Scanner in = new Scanner(System.in);
        String userSSN = SafeInput.getRegExString(
                in,
                "What is your SSN? Use the format xxx-xx-xxxx: ",
                "^\\d{3}-\\d{2}-\\d{4}$",
                "xxx-xx-xxxx"
        );
        String userMNo = SafeInput.getRegExString(
                in,
                "What is your M#? (include M. ex: M12345678): ",
                "^(M|m)\\d{8}$",
                "M########"
        );
        String userMenuChoice = SafeInput.getRegExString(
                in,
                "What is your menu choice? ",
                "^[OoSsVvQq]$",
                "[o/s/v/q]"
        );

        switch (userMenuChoice) {
            case "O", "o" -> System.out.printf("> Opened user file with SSN %s and M# %s",  userSSN, userMNo);
            case "S", "s" -> System.out.printf("> Saved user file with SSN %s and M# %s",  userSSN, userMNo);
            case "V", "v" -> System.out.printf("> Viewed user file with SSN %s and M# %s",  userSSN, userMNo);
            case "Q", "q" -> System.out.printf("> Quit user file with SSN %s and M# %s",  userSSN, userMNo);
        }
    }
}
