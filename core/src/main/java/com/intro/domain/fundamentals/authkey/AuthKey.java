package com.intro.domain.fundamentals.authkey;

public class AuthKey {

    String value;

    public AuthKey(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

    public static String name() {
        return "x-auth-key";
    }

}
