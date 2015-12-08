package com.example.karolina.mysecondapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class Question2 extends AppCompatActivity
{

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

        w_okolicach_malborka.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Question3.class);
                startActivity(intent);

            }

        });

        w_wielkopolsce.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(context, Question3.class);
                startActivity(intent2);

            }
        });


        w_walbrzychu.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(context, Question3.class);
                startActivity(intent3);

            }
        });
    }

}
