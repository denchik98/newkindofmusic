package SecondSemestre.Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        char[] c = s.toCharArray();
        Stack stack = new ArraySt(c.length);
        char temp;
        for (char x : c) {
            if (x == '{' || x == '[' || x == '('){
                stack.push(x);
            }
            else {
                if (!stack.isEmpty()) {
                    temp = (char) stack.pop();
                    if (x == '}' && temp != '{')
                        return false;
                    else if (x == ']' && temp != '[')
                        return false;
                    else if (x == ')' && temp != '(')
                        return false;
                }
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
