package com.example.karolina.mysecondapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question3 extends AppCompatActivity {
    public final static int ID = 2;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question3);
        addListenerOnButton();
    }


    private void addListenerOnButton()  {

        final Context context = this;

        Button w_latach = (Button) findViewById(R.id.w_latach_btn);
        Button na_poczatku = (Button) findViewById(R.id.na_poczatku_wieku_btn);
        Button na_przelomie = (Button) findViewById(R.id.na_przelomie_btn);


        if(State.zaznaczone[ID] != null){
            Button zaznaczony = (Button)findViewById(State.zaznaczone[ID]);
            zaznaczony.setBackgroundColor(Color.RED);
            w_latach.setTextColor(Color.GREEN);
        }

        View.OnClickListener clickListener = new View.OnClickListener()

        {
            public void onClick(View v) {
                State.zaznaczone[ID]=v.getId();
                Intent intent = new Intent(context, Start_Analize.class);
                startActivity(intent);

            }

        };


        w_latach.setOnClickListener(clickListener);
        na_poczatku.setOnClickListener(clickListener);
        na_przelomie.setOnClickListener(clickListener);
    }

}
