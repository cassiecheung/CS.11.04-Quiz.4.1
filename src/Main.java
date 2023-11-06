public class Main {

    /** 1. Write a method called numberOfVowels that returns the number of vowels in a string.
     Consider a, e, i, o, u as vowels. **/
    // 1. numberOfVowels
    public static int numberOfVowels (String str) {
        int count = 0;
        for (int x = 0; x < str.length(); x++) {
            if (str.charAt(x) == 'a' || str.charAt(x) == 'e' || str.charAt(x) == 'i' || str.charAt(x) == 'o' || str.charAt(x) == 'u') {
                count++;
            }
        }
        return count;
    }
    

    /** 2. Write a method called notDivisibleBy235 that finds the number of natural numbers not exceeding N
     and not divisible by any of the numbers [2, 3, 5].
     Example
     Let's take the number 5 as an example:
     1 - doesn't divide integer by 2, 3, and 5
     2 - divides integer by 2
     3 - divides integer by 3
     4 - divides integer by 2
     5 - divides integer by 5
     Answer: 1 (only one number doesn't divide integer by any of 2, 3, 5) **/
    // 2. notDivisibleBy235
    public static int notDivisibleBy235 (int N) {
        int count = 0;
        for (int x = N; x <= N && x > 0; x--) {
            if (x % 2 != 0 && x % 3 != 0 && x % 5 != 0) {
                count++;
            }
        }
        return count;
    }


    /** 3. Write a method called camelCaseMe so that it converts dash/underscore delimited words into camel casing.
     * The first word within the output should be capitalized only if the original word was capitalized
     * (known as Upper Camel Case, also often referred to as Pascal case).
     * The next words should always be capitalized.
     Examples
     "the-stealth-warrior" gets converted to "theStealthWarrior"
     "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/
    // 3. camCaseMe
    public static String camelCaseMe (String str) {
        String print = "";
        if (str.charAt(0) == '-' || str.charAt(0) == '_') {
            str = str.substring(1);
            for (int x = 0; x < str.length(); x++) {
                if (str.charAt(x) == '-' || str.charAt(x) == '_') {
                    char charAfter = str.charAt(x + 1);
                    String charAfterToString = String.valueOf(charAfter);
                    String StringUpper = charAfterToString.toUpperCase();
                    print = print + str.substring(0, x) + StringUpper + str.substring(x + 2);
                } else {

                }
            }
        }
        for (int x = 0; x < str.length(); x++) {
            if (str.charAt(x) == '-' || str.charAt(x) == '_') {
                char charAfter = str.charAt(x + 1);
                String charAfterToString = String.valueOf(charAfter);
                String StringUpper = charAfterToString.toUpperCase();
                print = print + str.substring(0, x) + StringUpper + str.substring(x + 2);
            } else {

            }
        }
        return print;
    }
}

