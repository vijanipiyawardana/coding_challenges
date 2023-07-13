/*
 * Challenge 10 - Password Validator
 Problem: Accept password which has
    at least 8 charactors
    at least 1 Uppercase
    at least 1 Lowercase
    at least 1 Number
    at least 1 Special charactor
 */


public class PasswordValidator {

    private static final Integer MIN_LENGTH = 8;

    public static boolean validatePassword(String password) {

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        boolean hasSpecialCharactor = false;

        if (password.length() >= MIN_LENGTH) { 
            for ( int i = 0 ; i < password.length(); i++ ) {
                if (!hasUpperCase && Character.isUpperCase(password.charAt(i))) {
                    hasUpperCase = true;
                    System.out.println("First UpperCase letter found at index: " + i);
                    i = 0;
                    continue;
                }
                if (!hasLowerCase && Character.isLowerCase(password.charAt(i))) {
                    hasLowerCase = true;
                    System.out.println("First LowerCase letter found at index: " + i);
                    i = 0;
                    continue;
                }
                if (!hasNumber && Character.isDigit(password.charAt(i))) {
                    hasNumber = true;
                    System.out.println("First Digit found at index: " + i);
                    i = 0;
                    continue;
                }
                if (!hasSpecialCharactor && !Character.isLetterOrDigit(password.charAt(i))) {
                    hasSpecialCharactor = true;
                    System.out.println("First SpecialCharactor found at index: " + i);
                    i = 0;
                    continue;
                }
            }
        }

        if (hasUpperCase && hasLowerCase && hasNumber && hasSpecialCharactor) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Password is valid? " +validatePassword("appleaaaaa"));
        System.out.println();
        System.out.println("Password is valid? " +validatePassword("Appleqqqqq"));
        System.out.println();
        System.out.println("Password is valid? " +validatePassword("aPp1eqqqqq"));
        System.out.println();
        System.out.println("Password is valid? " +validatePassword("App!eqqqqq"));
        System.out.println();
        System.out.println("Password is valid? " +validatePassword("#ppl3Aaaaa"));
        System.out.println();
    }
}
