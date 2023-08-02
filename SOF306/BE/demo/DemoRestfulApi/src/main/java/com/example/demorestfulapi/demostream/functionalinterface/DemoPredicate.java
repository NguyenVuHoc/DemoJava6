package com.example.demorestfulapi.demostream.functionalinterface;

import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args) {
        System.out.println(isPhoneValidPredicate.test("07000000000"));
        System.out.println(isPhoneValidPredicate.test("0700000000"));
        System.out.println(isPhoneValidPredicate.test("09f00000000"));
    }

    static Predicate<String> isPhoneValidPredicate =
            phone ->  phone.startsWith("07")
                    && phone.length() == 11;

    static boolean isPhoneValid(String phone) {
        return phone.startsWith("07") && phone.length() == 11;
    }
}
