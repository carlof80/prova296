package com.example.prova296;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bProva = (Button)findViewById(R.id.bProva);
        final TextView tvProva = (TextView)findViewById(R.id.tvProva);
        bProva.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                tvProva.setText(getString(R.string.str_saluto));
            }
        });
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "Inizio", Toast.LENGTH_LONG);
    }
}
