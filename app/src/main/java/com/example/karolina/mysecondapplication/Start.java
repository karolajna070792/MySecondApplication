package com.example.karolina.mysecondapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class Start extends Activity
{
    public void onCreate(Bundle savedInstanceState)
    {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.start);

            addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        Button rozpocznij = (Button) findViewById(R.id.rozpocznij_btn);

        rozpocznij.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Question1.class);
                startActivity(intent);

            }

        });

        }
}




