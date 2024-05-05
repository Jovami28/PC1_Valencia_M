package com.example.pc1_valencia

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pc1_valencia.ui.theme.PC1_ValenciaTheme
import android.content.Intent;
import android.view.View;


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val txtParcial: EditText = findViewById(R.id.txtParcial)
        val txtFinal: EditText = findViewById(R.id.txtExamenFinal)
        val txtPEP: EditText = findViewById(R.id.txtPEP)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Parcial = Double.parseDouble(txtParcial.getText().toString());
                double Final = Double.parseDouble(txtFinal.getText().toString());
                double PEP = Double.parseDouble(txtPEP.getText().toString());

                double resultado = (Parcial * 0.2) + (Final * 0.2) + (PEP * 0.6);

                Intent intent = new Intent(MainActivity.this, ResultadoFinal.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        }
}