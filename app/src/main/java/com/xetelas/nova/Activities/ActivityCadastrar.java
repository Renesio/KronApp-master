package com.xetelas.nova.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.xetelas.nova.R;

public class ActivityCadastrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        Button botaocadastro = findViewById(R.id.bot_cadastrar);
        botaocadastro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }

    public void onRadioTipo(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radio_buscar:
                if (checked)
                    break;
            case R.id.radio_oferecer:
                if (checked)
                    break;
        }
    }

    public void onRadioDestino(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radio_picos:
                if (checked)
                    break;
            case R.id.radio_teresina:
                if (checked)
                    break;
        }
    }
}
