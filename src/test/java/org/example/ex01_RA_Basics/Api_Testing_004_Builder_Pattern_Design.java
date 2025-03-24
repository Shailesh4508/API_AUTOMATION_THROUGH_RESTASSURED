package org.example.ex01_RA_Basics;

public class Api_Testing_004_Builder_Pattern_Design {

    public Api_Testing_004_Builder_Pattern_Design step1(){
        System.out.println("Step 1");
        return this;
    }

    public Api_Testing_004_Builder_Pattern_Design step2(){
        System.out.println("Step 2");
        return this;
    }

    public Api_Testing_004_Builder_Pattern_Design step3(String param1){
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        Api_Testing_004_Builder_Pattern_Design bp = new Api_Testing_004_Builder_Pattern_Design();
        bp.step1().step2().step3("Shailesh");
    }
}
