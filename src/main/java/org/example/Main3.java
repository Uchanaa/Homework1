package org.example;

public class Main3 {
    public static void main(String[] args) {
        cheknumber(-2);


    }
    static  void    cheknumber(int number){ //ამოწმებს როგორია რიცხვი
        if (number>0){
            System.out.println("დადებითი");
        }
        else if (number<0){
            System.out.println("უარყოფითი");
        }
        else {
            System.out.println("ნოლი");
        }
    }

}