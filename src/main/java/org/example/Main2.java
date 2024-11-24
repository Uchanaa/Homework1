package org.example;

public class Main2 {
    public static void main(String[] args) {
        Length("ტექსტი");
    }

    static void Length(String text) {
        if (text.length() % 2 == 0) {    // ამოწმებს  ტექსტის სიგრძე ლუწია თუ კენტი
            System.out.println("ტექსტის სიგრძე ლუწია");
        } else {
            System.out.println("ტექსტის სიგრძე კენტია");
        }

    }
}