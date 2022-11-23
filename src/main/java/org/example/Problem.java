package org.example;

import java.util.Objects;

public class Problem {

    private String name;
    private String url;

    public Problem() {
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void validator(Object object1, Object object2) {
        System.out.println(object1);
        System.out.println(object2);

        if (Objects.equals(object1, object2)) {
            System.out.println("Doğrulama başarılı");
        } else {
            System.out.println("Doğrulama başarısız");
        }
    }

}
