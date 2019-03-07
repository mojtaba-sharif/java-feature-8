package me.jramon.sample2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        setData(list);
        list.stream().filter(String::isEmpty).forEach(System.out::println);
    }

    private static void setData(List<String> list) {
        list.add("JRamon");
        list.add("Amir");
        list.add("Mehran");
        list.add("Arsalan");
        list.add("Behnam");
        list.add("");
    }
}
