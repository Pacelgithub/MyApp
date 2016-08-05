package com.example.zjs12638.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showview(View view){
        EditText username=(EditText) this.findViewById(R.id.eTusrname);
        EditText password=(EditText) this.findViewById(R.id.eTpsd);
        String usrName=username.getText().toString();
        String psd=password.getText().toString();
        String message="输入的用户名是:"+usrName+ "，密码是：" +psd;
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
        Intent intent=new Intent();
        intent.setClass(MainActivity.this,SecondActivity.class);
        startActivity(intent);

    }

}
