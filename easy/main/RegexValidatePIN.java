/*
 * Challenge 8 - Regex validate PIN code
Problem: ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 
4 digits or exactly 6 digits. If the function is passed a valid PIN string, return true, else return false.
Examples (Input --> Output)
    "1234"   -->  true
    "12345"  -->  false
    "a234"   -->  false
*/

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
