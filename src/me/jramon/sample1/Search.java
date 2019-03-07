package me.jramon.sample1;

@FunctionalInterface
public interface Search<T> {

    boolean search(T input);
}
