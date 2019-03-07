package me.jramon.sample1;

public class Main {

    public static void main(String[] args) {
        Search<String> interfaces;
        interfaces = SearchImp::search;
        boolean result1 = interfaces.search("");
        interfaces = SearchImp::searchBT;
        boolean result2 = interfaces.search("");
        interfaces = (input) -> {
            System.out.println(input);
            return false;
        };
        interfaces.search("");
    }
}
