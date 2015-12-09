package com.example.karolina.mysecondapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question1 extends AppCompatActivity
{
    public final static int ID = 0;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
        addListenerOnButton();
    }


    private void addListenerOnButton()  {

        final Context context = this;

        Button zamek_czocha = (Button) findViewById(R.id.zamek_czocha_btn);
        Button zamek_ksiaz = (Button) findViewById(R.id.zamek_ksiaz_btn);
        Button palac_moszna = (Button) findViewById(R.id.palac_moszna_btn);

        if(State.zaznaczone[ID] != null){
            Button zaznaczony = (Button)findViewById(State.zaznaczone[ID]);
            zaznaczony.setBackgroundColor(Color.RED);
            palac_moszna.setTextColor(Color.GREEN);
        }

        View.OnClickListener clickListener = new View.OnClickListener()

        {
            public void onClick(View v) {
                State.zaznaczone[ID]=v.getId();
                Intent intent = new Intent(context, Question2.class);
                startActivity(intent);

            }

        };
        zamek_czocha.setOnClickListener(clickListener);
        zamek_ksiaz.setOnClickListener(clickListener);
        palac_moszna.setOnClickListener(clickListener);


    }


}
