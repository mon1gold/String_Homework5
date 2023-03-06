import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println(findSymbolOccurance("Java",'a'));
        // task 2
        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(findWordPosition("Apple","Planet"));
        // task 3
        System.out.println(stringReverse("Hello"));
        System.out.println(stringReverse2("Java"));
        // task 4
        System.out.println(isPalindrome("ERE"));
        System.out.println(isPalindrome("Java"));
        // task 5
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int index = new Random().nextInt(0, words.length);
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a word: ");
        String enterWord = scanner.nextLine();
        while (!enterWord.equals(words[index])) {
            System.out.println("You did not guess");
            for (int i = 0; i < 15; i++) {
                if (words[index].length() > i && enterWord.length() > i && words[index].charAt(i) == enterWord.charAt(i)) {
                    System.out.print(enterWord.charAt(i));
                } else {
                    System.out.print("#");
                }
            }
            System.out.print("\n Try again: ");
            enterWord = scanner.nextLine();
        }
        System.out.println("You are win! ");
    }
    public static int  findSymbolOccurance (String word, char letter) {
        int counter = 0;
        for (int i = 0; word.length() > i; i++) {
            if (word.charAt(i) == letter ) {
                counter ++;
            }
        }
        return counter;
    }

    public static int findWordPosition (String source, String target) {
        int index = source.indexOf(target);
        return index;
    }

    public static String  stringReverse (String word) {
        char[] charArray = word.toCharArray();
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += charArray[i];
        }
        return result;
    }
    public static String stringReverse2 (String word) {

        return  new StringBuilder(word).reverse().toString();
    }
    public static boolean isPalindrome (String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        String reversWord = stringBuilder.reverse().toString();
        return reversWord.equals(word);
    }


}