package com.example.karolina.mysecondapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question3 extends AppCompatActivity {

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

        w_latach.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Start_Analize.class);
                startActivity(intent);

            }

        });

        na_poczatku.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(context, Start_Analize.class);
                startActivity(intent2);

            }
        });


        na_przelomie.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(context, Start_Analize.class);
                startActivity(intent3);

            }
        });
    }

}
