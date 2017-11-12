package com.gmail.day4reviewcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("쌀집 계산기");
    }

    /*전역변수*/
    String firstNum="";//연산시 처음 시작하는 숫자
    String secondNum="";//연산지 두번째로 연산하는 숫자
    String tepmNum="";//임시로 숫자를 저장
    String sign="";//연산자를 받아주는 객체


    String result;//결과 값
    /*버튼의 숫자 를 받아주는 객체 */
    void getButtonText(View v){
    Button buttonNumber = (Button) findViewById(v.getId());
    String buttonNum = buttonNumber.getText().toString();
    tepmNum = tepmNum + buttonNum;
    EditText editText0 = (EditText) findViewById(R.id.editText);
    editText0.setText(tepmNum);
    }

    /*연산 버튼*/
    /*버튼을 누르면 임시 버튼 첫번쨰에 들어감*/
    void operatorButton(View v){
        /*Equal버튼 혹은 연속해서 버튼을 물렀을경우*/
        if(firstNum.equals("")){
            firstNum = tepmNum;// 임시숫자 첫번째 숫자 넘어감
            tepmNum="";//임시 숫자 초기화
            EditText editText0 = (EditText) findViewById(R.id.editText);
            editText0.setText(tepmNum);//숫자 세팅
        }else {
            firstNum = result;
            buttonEqualClick(v);
            tepmNum="";//임시 숫자 초기화
        }
    }
    /*나누기 */
    void buttonDivClick(View v){
        sign = "/";
        operatorButton(v);
    }
    /*곱하기*/
    void buttonMulClick(View v){
        sign = "*";
        operatorButton(v);
    }
    /*뺴기*/
    void buttonSubClick(View v){
        sign = "-";
        operatorButton(v);
    }
    /*더하기*/
    void buttonPlus(View v){
        sign = "+";
        operatorButton(v);
    }

    /*Equal버튼*/
    void buttonEqualClick(View v){
        secondNum = tepmNum;// 임시숫자 2번째 숫자 넘어감
        if(sign.equals("+")){
            result = Calculator.plus(firstNum,secondNum);
        }else if(sign.equals("-")){
            result = Calculator.sub(firstNum,secondNum);
        }else if(sign.equals("/")){
            result = Calculator.div(firstNum,secondNum);
        }else if(sign.equals("*")){
            result = Calculator.mul(firstNum,secondNum);
        }
        /*Equal버튼을 한번더 누르면 다시 출력 될수 있도록하는 것*/
        firstNum = result;

        /*결과 토스트로 출력*/
        Toast.makeText(getApplicationContext(),"정답은"+result+"입니다." , Toast.LENGTH_SHORT).show();
        EditText editText0 = (EditText) findViewById(R.id.editText);
        editText0.setText(result);//결과 세팅
    }

    void buttonResetClick(View v){
        firstNum="";
        secondNum="";
        sign="";
        tepmNum="";
        EditText editText0 = (EditText) findViewById(R.id.editText);
        editText0.setText("0");//결과 세팅
    }



}
