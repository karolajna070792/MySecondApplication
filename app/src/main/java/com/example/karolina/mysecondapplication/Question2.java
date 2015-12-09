package com.example.karolina.mysecondapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class Question2 extends AppCompatActivity
{

    public final static int ID = 1;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2);
        addListenerOnButton();
    }


    private void addListenerOnButton()  {

        final Context context = this;

        Button w_okolicach_malborka = (Button) findViewById(R.id.w_okolicach_malborka_btn);
        Button w_wielkopolsce = (Button) findViewById(R.id.w_wielkopolsce_btn);
        Button w_walbrzychu = (Button) findViewById(R.id.w_walbrzychu_btn);

        if(State.zaznaczone[ID] != null){
            Button zaznaczony = (Button)findViewById(State.zaznaczone[ID]);
            zaznaczony.setBackgroundColor(Color.RED);
            w_walbrzychu.setTextColor(Color.GREEN);
        }
        View.OnClickListener clickListener = new View.OnClickListener()

        {
            public void onClick(View v) {
                State.zaznaczone[ID]=v.getId();
                Intent intent = new Intent(context, Question3.class);
                startActivity(intent);

            }

        };

        w_okolicach_malborka.setOnClickListener(clickListener);
        w_wielkopolsce.setOnClickListener(clickListener);
        w_walbrzychu.setOnClickListener(clickListener);
    }

}
