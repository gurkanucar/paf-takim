import java.util.*;

public class Question3 {

    public static Stack<String> stack;
    public static Map<String, String> bracketCharacters;

    public static void main(String[] args) {

        stack = new Stack<String>();

        bracketCharacters = new HashMap<>();
        bracketCharacters.put(")", "(");
        bracketCharacters.put("]", "[");
        bracketCharacters.put("}", "{");


        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            stack.clear();
            String input = sc.next();
            System.out.println(isCorrect(input));
        }

    }

    public static boolean isCorrect(String input) {
        for (char c : input.toCharArray()) {
            if (isOpeningChar(c + "")) {
                stack.push(c + "");
            } else if (isClosingChar(c + "")) {
                if (!stack.isEmpty()) {
                    String temp = stack.pop();
                    if (!temp.equals(bracketCharacters.get(c + ""))) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isOpeningChar(String c) {
        return checkIfEquals(bracketCharacters.values().toArray(new String[0]), c);
    }

    public static boolean isClosingChar(String c) {
        return checkIfEquals(bracketCharacters.keySet().toArray(new String[0]), c);
    }

    public static boolean checkIfEquals(String[] chars, String data) {
        for (String temp : chars) {
            if (temp.equals(data)) {
                return true;
            }
        }
        return false;
    }

}
