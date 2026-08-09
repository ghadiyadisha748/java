import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        String[] logs = {
                "10:05 om Hello there",
                "10:10 Anshika How are you?",
                "10:15",
                "10:20 Disha Good morning"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();

        String output = ChatFilter.ChatFilter(logs, keyword);

        System.out.println(output);

        sc.close();
    }
}
