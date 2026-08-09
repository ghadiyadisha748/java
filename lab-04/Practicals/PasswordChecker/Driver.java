public class Driver {

    public static void main(String[] args) {

        String[] p = {
                "Abc@1234",
                "abc@1234",
                "Abc1234",
                "Abc@abcd",
                "Abc@12",
                "abc@12",
                "ABC@1234"
        };

        for (String pw : p) {
            PasswordChecker.strong(pw);
        }
    }
}