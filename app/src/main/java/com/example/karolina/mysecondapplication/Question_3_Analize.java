package com.example.karolina.mysecondapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question_3_Analize extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_3_analize);
        addListenerOnButton();
    }

    private void addListenerOnButton()  {

        final Context context = this;


        Button good_answer = (Button) findViewById(R.id.w_latach_btn);

        good_answer.getBackground().setColorFilter(0xff00ff00, PorterDuff.Mode.MULTIPLY);


    }
}
