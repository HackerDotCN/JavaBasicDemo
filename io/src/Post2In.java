import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Author: zhang
 * Time: 9/23/2017
 * Description:
 */


class Intermediate {
    public String expr;
    public String oper;

    public Intermediate(String expr, String oper) {
        this.expr = expr;
        this.oper = oper;
    }


}

public class Post2In {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("+");
        list.add("c");
        list.add("*");
        System.out.print(PostfixToInfix(list));
    }

    public static String PostfixToInfix(List<String> postfixs) {
        String postfix = "";
        for (String s : postfixs)
            postfix += s;
        String[] postfixTokens = postfix.split("");
        Stack<Intermediate> stack = new Stack<>();
        for (String token : postfixTokens) {
            if (token.equals("+") || token.equals("-")) {
                Intermediate rightIntermediate = stack.pop();
                Intermediate leftIntermediate = stack.pop();
                String newExpr = leftIntermediate.expr + token + rightIntermediate.expr;
                stack.push(new Intermediate(newExpr, token));
            } else if (token.equals("*") || token.equals("/")) {
                String leftExpr, rightExpr;
                Intermediate rightIntermediate = stack.pop();
                if (rightIntermediate.oper.equals("+") || rightIntermediate.oper.equals("-")) {
                    rightExpr = "(" + rightIntermediate.expr + ")";
                } else {
                    rightExpr = rightIntermediate.expr;
                }
                Intermediate leftIntermediate = stack.pop();
                if (leftIntermediate.oper.equals("+") || leftIntermediate.oper.equals("-")) {
                    leftExpr = "(" + leftIntermediate.expr + ")";
                } else {
                    leftExpr = leftIntermediate.expr;
                }
                String newExpr = leftExpr + token + rightExpr;
                stack.push(new Intermediate(newExpr, token));
            } else {
                stack.push(new Intermediate(token, ""));
            }
        }
        return stack.peek().expr;
    }
}

