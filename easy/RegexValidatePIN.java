public class RegexValidatePIN {

    // method 1
    public static boolean validatePin(String pin) {
        if (pin.matches("[0-9]{4}") || pin.matches("[0-9]{6}")) {
            return true;
        }
        return false;
    }

    // method 2
    public static boolean validatePin1(String pin) {
        return pin.matches("[0-9]{4}|[0-9]{6}");
    }

    public static void main(String[] args) {
        System.out.println(validatePin("1234")); // true
        System.out.println(validatePin("12345")); // false
        System.out.println(validatePin("a234")); // false
        System.out.println(validatePin("123456")); // true
    }
}
