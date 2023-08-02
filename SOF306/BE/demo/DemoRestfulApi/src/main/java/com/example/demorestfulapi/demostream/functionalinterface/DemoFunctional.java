package com.example.demorestfulapi.demostream.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunctional {
    public static void main(String[] args) {
//        Function take 1 arg and produces 1 result
//        int increment = increment(1);
//        System.out.println(increment);
//
//        int increment2 = incrementByOneFuntion.apply(1);
//        System.out.println(increment2);
//
//        int incrementAndMutiply = incrementByOneFuntion.andThen(multiply).apply(2);
//        System.out.println(incrementAndMutiply);

        //        Function take 2 arg and produces 1 result
        System.out.println(incrementAndMultiply.andThen(incrementByOneFuntion).apply(4,100));
    }

    static Function<Integer, Integer> incrementByOneFuntion = number -> number + 1;

    static Function<Integer, Integer> multiply = number -> number * 10;

    static int increment(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementAndMultiply =
            (numberToIncre, numberToMultiply) -> (numberToIncre+1)*numberToMultiply;
}
