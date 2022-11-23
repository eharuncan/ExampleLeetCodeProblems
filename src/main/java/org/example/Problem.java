package org.example;

import java.util.Objects;

public class Problem {

    public Problem() {
        System.out.println();
    }

    protected void validator(Object object1, Object object2) {
        System.out.println(object1);
        System.out.println(object2);

        if (Objects.equals(object1, object2)) {
            System.out.println("Doğrulama başarılı");
        } else {
            System.out.println("Doğrulama başarısız");
        }
    }

    protected void lineBreak() {
        System.out.println();
    }

}
