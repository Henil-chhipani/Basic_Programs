import java.util.*;

public class p69 {
    static Stack stack = new Stack();

    static boolean areBracketsBalanced(String expr) {

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                continue;
            }

            if (stack.isEmpty())
                return false;

            char check;

            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check != '(')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    stack.pop();
                    if (check != '{')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check != '[')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String expr = "([{}]())";

        if (areBracketsBalanced(expr))
            System.out.println("Parentheses are Balanced");
        else
            System.out.println("Parentheses are Not Balanced");
    }
}
/*
 * ([{
 * }
 */