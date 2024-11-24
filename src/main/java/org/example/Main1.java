package org.example;
public class Main1 {
    public static void main(String[] args) {
        While ("afssaffcsfzdwrzzwdryz");
    }

    static void While (String text) { //while-ის დარქმევა კლასსზე არ შეიძლება
        int i = 2;
        while (i < text.length()) { //შემოივლის ტექსტის ყველა სიმბოლს
            char currentChar = text.charAt(i);
            System.out.println(currentChar);
            if (currentChar == 'z') {   // პოლობს z სიმბოლოს
                System.out.println("ნაპოვნია Z სიმბოლო, ციკლი დასრულდება");
                break;
            }
            i += 3;
        }
    }
}