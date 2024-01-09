package com.myblog.myblog1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClass1 {

    public static void main(String[] args) {

//        Predicate<Integer> val =y->y%2==0;
//        boolean r = val.test(10);
//        System.out.println(r);
//*****************************************************************************************************************************************
//        Predicate<String> val =  str->str.equals("mike");
//        boolean r = val.test("Stallin");
//        System.out.println(r);
//*****************************************************************************************************************************************
//        List<Integer> num = Arrays.asList(10,20,4,6,23,30);
//        System.out.println(num);
//        List<Integer> even = num.stream().filter(z -> z % 2 == 0).collect(Collectors.toList());
//        System.out.println(even);
//*****************************************************************************************************************************************
//        List<Integer> num = Arrays.asList(10,20,4,6,23,30);
//        List<Integer> odd = num.stream().filter(z -> z % 2 != 0).collect(Collectors.toList());
//        System.out.println(odd);
//*****************************************************************************************************************************************
// give thw name that starts with letter m:

//        List<String> nam = Arrays.asList("mateen", "mohammed","mubarak","Imran","qadri");
//        List<String> names = nam.stream().filter(z -> z.startsWith("m")).collect(Collectors.toList());
//        List<String> names1 = nam.stream().filter(z -> z.equals("Imran")).collect(Collectors.toList());
//        List<String> names2 = nam.stream().filter(z -> z.endsWith("d")).collect(Collectors.toList());
//        System.out.println(names);
//        System.out.println(names1);
//        System.out.println(names2);
//*****************************************************************************************************************************************
//        Function<String,Integer> res = str->str.length();
//        Integer val = res.apply("mike");
//        System.out.println(val);
//*****************************************************************************************************************************************
        Function<Integer,Integer> res = i->i+10;
        Integer val = res.apply(10);
        System.out.println(val);


    }
}
