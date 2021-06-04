package com.br.cursoseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBarEscala;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarEscala = findViewById(R.id.seekBar_escala);
        textoResultado = findViewById(R.id.text_resultado);

        seekBarEscala.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            //Quando eu clico e arrasto o SeekBar
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
               textoResultado.setText("Progresso: " + i + "/" + seekBar.getMax());
            }

            //Quando eu clico em cima da seekBar
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //textoResultado.setText("onStartTrackingTouch");
            }

            //Quando eu clico e solto o seekBar
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //textoResultado.setText("onStopTrackingTouch");
            }
        });
    }

    public void recuperarProgresso(View view){
        textoResultado.setText("Escolhido: " + seekBarEscala.getProgress());
    }
}