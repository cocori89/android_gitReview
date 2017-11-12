package com.gmail.day4reviewcalculator;

/**
 * Created by User on 2017-11-12.
 */

/*계산기 연산 기능*/
public class Calculator {
    static int result;//결과 값
    static String resultText;//결과값 String 값

    static String  plus(String a, String b){
        int aNum = Integer.parseInt(a);
        int bNum = Integer.parseInt(b);
        result = aNum+bNum;
        resultText = String.valueOf(result);
        return resultText;
    }

    static String sub(String a, String b){
        int aNum = Integer.parseInt(a);
        int bNum = Integer.parseInt(b);
        result = aNum-bNum;
        resultText = String.valueOf(result);
        return resultText;
    }

    static String div(String a, String b){
        int aNum = Integer.parseInt(a);
        int bNum = Integer.parseInt(b);
        if(bNum==0){//나누기는 분모가 0이 올수 없기 때문이다.
            return resultText="0";
        }
        result = aNum/bNum;
        resultText = String.valueOf(result);
        return resultText;
    }

    static String mul(String a, String b){
        int aNum = Integer.parseInt(a);
        int bNum = Integer.parseInt(b);
        result = aNum*bNum;
        resultText = String.valueOf(result);
        return resultText;
    }

}
