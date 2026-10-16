import java.util.Scanner;

public class DevTest {
    void main() {
        Scanner in = new Scanner(System.in);

        String prompt = SafeInput.getRegExString(
                in,
                "What is your phone number? Answer in format xxx-xxx-xxxx: ",
                "(\\([0-9]+\\) [0-9]+-[0-9]+)|([0-9]+-[0-9]+-[0-9]+)",
                "xxx-xxx-xxxx"
        );

        IO.println("> Your phone #: " + prompt);
    }
}
