package com.codeit.javaExam;

public class OriginalPrice {
    protected String name;
    protected int price;

    public OriginalPrice(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println(String.format("상품(%s)의 가격은 %s원 입니다.", this.name, this.price));
    }
}
