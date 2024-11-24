package org.example;
public class Main {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; //შევქმენი მასივი
        int evennum=0; //შემოვიტანე ცვლადი ლუწი რიცხვების დასათვლელად

        for(int i=0; i<num.length; i++){   //ითვლის ლუწი რიცხვების რაოდენობას მასივში
            if(num[i]%2==0){
                evennum++;
            }
        }
        if(evennum>0) {    // ამოწმებს და ბეჭდავს ლუწი რიცხვების რაოდენობას,
            System.out.println("ამ მასივში არის " + evennum + " ლუწი რიცხვი");
        }
        else{  // თუ არ არის მასივში ლუწი რიცხვები გამოაქვს ეს ტექსტი
            System.out.println("მასივში არ არის ლუწი რიცხვი");
        }
    }
}