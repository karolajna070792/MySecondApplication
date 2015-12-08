package com.example.karolina.mysecondapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question1 extends AppCompatActivity
{
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

        zamek_czocha.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Question2.class);
                startActivity(intent);

            }

        });

        zamek_ksiaz.setOnClickListener( new View.OnClickListener()
        {


            @Override
            public void onClick(View v)
            {
                Intent intent2 = new Intent(context, Question2.class);
                startActivity(intent2);

            }
        });


        palac_moszna.setOnClickListener( new View.OnClickListener()
        {


            @Override
            public void onClick(View v)
            {
                Intent intent3 = new Intent(context, Question2.class);
                startActivity(intent3);

            }
        });
    }


}
