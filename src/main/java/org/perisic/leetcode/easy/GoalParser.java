package org.perisic.leetcode.easy;

public class GoalParser {

    /**
     * https://leetcode.com/problems/goal-parser-interpretation/
     */

    public static void main(String[] args) {

        String command1 = "G()(al)";
        String command2 = "G()()()()(al)";
        String command3 = "(al)G(al)()()G";

        System.out.println("## " + interpret(command1));
        System.out.println("## " + interpret(command2));
        System.out.println("## " + interpret(command3));
    }


    private static String interpret(String command) {

        StringBuilder result = new StringBuilder(command.length());

        int i = 0;
        while (i <= (command.length() - 1)) {
            char current = command.charAt(i);

            if (current == 'G') {
                result.append("G");
                i++;
            } else if (command.charAt(i + 1) == ')') {
                result.append("o");
                i = i + 2;
            } else {
                result.append("al");
                i = i + 4;
            }
        }
        return result.toString();
    }
}
