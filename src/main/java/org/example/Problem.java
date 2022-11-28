package org.example;

import java.util.Objects;

public class Problem {

    public Problem() {
        System.out.println();
    }

    public void validate(Object expectedObject, Object resultObject) {
        if (Objects.equals(expectedObject, resultObject)) {
            System.out.println("Doğrulama başarılı");
        } else {
            System.out.println("Doğrulama başarısız");
        }
        System.out.println(expectedObject.toString());
        System.out.println(resultObject.toString());
    }

    protected void lineBreak() {
        System.out.println();
    }

}
