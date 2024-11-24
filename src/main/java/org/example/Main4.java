package org.example;

public class Main4 {
    public static void main(String[] args) {
        hasTeen(12, 16, 34);
    }
    static  void  hasTeen(int a, int b, int c){
        if((a>=13 &&a<=19) || (b>=13 && b<=19)||(c>=13 && c<=19)){ //ამოწმებს დიაპაზონს
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

}