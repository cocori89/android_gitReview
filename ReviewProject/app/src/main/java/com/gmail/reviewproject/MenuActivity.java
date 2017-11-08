package com.gmail.reviewproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    /*클리하면 토스트 메세지를 보이며 로그인 화면으로 돌아가기 공통 분모기 떄문에 메소드로 뺀다.*/
    void gotoLogin(View v){
        Button myButton = findViewById(v.getId());// xml의 아이디를 얻습니다. (Object형)
        String menuText = myButton.getText().toString();//버튼의 아이디를 가져 오고 String 값으로 형 변환을 해준다.
        Toast.makeText(getApplicationContext(),menuText,Toast.LENGTH_LONG).show();//메뉴의 Text를 토스트 메세지로 뿌려준다.

        /*로그인 화면으로 다시 가기 위해서 Intent 객체를 생성한다. */
        Intent loginIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(loginIntent);//Intet를 실행한다.
    }


    void onClickCustomer(View v){
        gotoLogin(v);//작성한 메서드를 호출한다.
    }
    void onClickSales(View v){
        gotoLogin(v);//작성한 메서드를 호출한다.
    }
    void onClickProduct(View v){
        gotoLogin(v);//작성한 메서드를 호출한다.
    }
}
