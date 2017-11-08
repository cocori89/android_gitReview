package com.gmail.reviewproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*로그인 버튼을 누르면 MenuActivity로 이동*/
    public void signinClick(View v){
        /*Intent 객체를 만들어서 Menu로 이동한다.*/
        Intent menuIntent = new Intent(getApplicationContext(),MenuActivity.class);
        startActivity(menuIntent);//객체를 실행한다
    }
}
