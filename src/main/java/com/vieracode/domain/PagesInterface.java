package com.vieracode.domain;

public interface PagesInterface<T extends PagesInterface<T>> {

    public int getPagesNumber();

    default T getMaxPages(T next) {
        return this.getPagesNumber() > next.getPagesNumber() ? (T)this : next;
    }
}
