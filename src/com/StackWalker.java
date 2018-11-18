/*
package com;

import java.util.List;

public class StackWalker {
    public static void main(String[] args) {
        one().forEach(x -> System.out.println(x));
    }

    private static List<String> one() {
        return two();
    }

    private static List<String> two() {
        return StackWalker.getInstance().walk(s ->
                s.map(frame -> frame.getClassName() + "/" + frame.getMethodName()).collect(Collectors.toList()));
    }
}
*/
