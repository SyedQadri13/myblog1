package com.myblog.myblog1;

import com.myblog.myblog1.config.LoginDto;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
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
//        List<String> names3 = nam.stream().filter(z -> z.endsWith("d")).collect(Collectors.toList());
//        System.out.println(names);
//        System.out.println(names1);
//        System.out.println(names2);
//*****************************************************************************************************************************************
//        Function<String,Integer> res = str->str.length();
//        Integer val = res.apply("mike");
//        System.out.println(val);
//*****************************************************************************************************************************************
//        Function<Integer,Integer> res = i->i+10;
//        Integer val = res.apply(10);
//        System.out.println(val);
//*****************************************************************************************************************************************

//        List<String> num= Arrays.asList("mike","stallin","jawad","syed");
//        List<String> newNum = num.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newNum);

//*****************************************************************************************************************************************
//        List<Integer> names = Arrays.asList(10,8,20,6);
//        List<Integer> newNames=names.stream().sorted().collect(Collectors.toList());
//        System.out.println(newNames);
//*****************************************************************************************************************************************
//        List<Integer> names = Arrays.asList(10,8,20,6,10,8,20);
//        List<Integer> newNames=names.stream().distinct().collect(Collectors.toList());
//        System.out.println(newNames);
//*****************************************************************************************************************************************
//        List<String> names = Arrays.asList("qadar","imran","ahmed","ahmed","imran");
//        List<String> newNames=names.stream().distinct().collect(Collectors.toList());
//        System.out.println(newNames);
//********************************************************************************************************************************************


//        List<Integer> lst1=Arrays.asList(1,2);
//        List<Integer> lst2=Arrays.asList(3,4);
//        List<Integer> lst3=Arrays.asList(5,6);
//
//        List<List<Integer>> finalList = Arrays.asList(lst1, lst2, lst3);
//        List<Integer> res = finalList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
//        System.out.println(res);
//        List<Integer> newNum = res.stream().map(i -> i+6).collect(Collectors.toList());
//        System.out.println(newNum);
//****************************************************************************************************************************************
//        Consumer<Integer> res = num -> System.out.println(num);
//        res.accept(100);
//********************************************************************************************************************************************
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//        Consumer<String> val = name -> System.out.println(name);
//        names.forEach(val);
//        names.forEach(name -> System.out.println(name));
//********************************************************************************************************************************************


//        Supplier<Integer> x = () -> new Random().nextInt(500);
//        Integer z = x.get();
//        System.out.println(z);
// ********************************************************************************************************************************************

        List<Login> logins = Arrays.asList(
                new Login("mike", "testing"),
                new Login("syed", "testing"),
                new Login("qadri","testing")
        );

        List<LoginDto> dtos = logins.stream().map(login -> mapToDto(login)).collect(Collectors.toList());
        System.out.println(dtos);
        }
        static LoginDto mapToDto(Login login){
        LoginDto dto = new LoginDto();
        dto.setUserName(login.getUserName());
        dto.setPassword(login.getPassword());
        return dto;
        }


    }
