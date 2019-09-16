package com.example.anfaas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  public void clicker()
  {  Button btn=(Button) findViewById(R.id.anfaas);
      Intent intent=Intent(MainActivity.class, anfaas.class) ;
      startActivity(intent);
  }
}
