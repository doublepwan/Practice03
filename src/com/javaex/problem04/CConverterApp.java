package com.javaex.problem04;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        
        //백만원을 달러로 출력
        //100달려를 원으로 출력
        CConverter cc = new CConverter();
        won = 1000000;
        System.out.println("백만원은" + cc.toDoller(won)+" 달러입니다");
        dollar = 100;
        System.out.println("백달러는" + cc.toKWR(dollar)+" 입니다");
        
        
        
    }

}
