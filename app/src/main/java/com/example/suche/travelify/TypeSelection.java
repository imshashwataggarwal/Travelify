package com.example.suche.travelify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by Shashwat Uttam on 4/4/2017.
 */

public class TypeSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.type_selection);

        CardView type1 = (CardView) findViewById(R.id.type1);
        CardView type2 = (CardView) findViewById(R.id.type2);
        CardView type3 = (CardView) findViewById(R.id.type3);
        CardView type4 = (CardView) findViewById(R.id.type4);

        type1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TypeSelection.this,MainActivity.class);
                i.putExtra("TYPE",1);
                startActivity(i);
            }
        });

        type2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TypeSelection.this,MainActivity.class);
                i.putExtra("TYPE",2);
                startActivity(i);
            }
        });

        type3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TypeSelection.this,MainActivity.class);
                i.putExtra("TYPE",3);
                startActivity(i);
            }
        });

        type4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TypeSelection.this,MainActivity.class);
                i.putExtra("TYPE",4);
                startActivity(i);
            }
        });
    }
}
