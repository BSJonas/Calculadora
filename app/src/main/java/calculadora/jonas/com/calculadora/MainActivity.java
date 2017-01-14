package calculadora.jonas.com.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_somar = (Button) findViewById(R.id.btn_somar);
        btn_somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText txtN1 = (EditText) findViewById(R.id.txtN1);
                EditText txtN2 = (EditText) findViewById(R.id.txtN2);
                double resultado = Double.parseDouble(txtN1.getText().toString()) + Double.parseDouble(txtN2.getText().toString());

                TextView txvResultado = (TextView) findViewById(R.id.txvResultado);
                txvResultado.setText(String.valueOf("Resultado: " + resultado));

                //Toast.makeText(getBaseContext(), String.valueOf(resultado),Toast.LENGTH_LONG).show();

3            }
        });


        Button btn_subtrair = (Button) findViewById(R.id.btn_subtrair);
        btn_subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText txtN1 = (EditText) findViewById(R.id.txtN1);
                EditText txtN2 = (EditText) findViewById(R.id.txtN2);
                double resultado = Double.parseDouble(txtN1.getText().toString()) - Double.parseDouble(txtN2.getText().toString());

                TextView txvResultado = (TextView) findViewById(R.id.txvResultado);
                txvResultado.setText(String.valueOf("Resultado: " + resultado));

                //Toast.makeText(getBaseContext(), String.valueOf(resultado),Toast.LENGTH_LONG).show();

            }
        });

        Button btn_multiplicar = (Button) findViewById(R.id.btn_multiplicar);
        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText txtN1 = (EditText) findViewById(R.id.txtN1);
                EditText txtN2 = (EditText) findViewById(R.id.txtN2);
                double resultado = Double.parseDouble(txtN1.getText().toString()) * Double.parseDouble(txtN2.getText().toString());

                TextView txvResultado = (TextView) findViewById(R.id.txvResultado);
                txvResultado.setText(String.valueOf("Resultado: " + resultado));

                //Toast.makeText(getBaseContext(),String.valueOf(resultado),Toast.LENGTH_LONG).show();

            }
        });

        Button btn_dividir = (Button) findViewById(R.id.btn_dividir);
        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText txtN1 = (EditText) findViewById(R.id.txtN1);
                EditText txtN2 = (EditText) findViewById(R.id.txtN2);
                double resultado = Double.parseDouble(txtN1.getText().toString()) / Double.parseDouble(txtN2.getText().toString());

                TextView txvResultado = (TextView) findViewById(R.id.txvResultado);
                txvResultado.setText(String.valueOf("Resultado: " + resultado));

                //Toast.makeText(getBaseContext(),String.valueOf(resultado),Toast.LENGTH_LONG).show();

            }
        });


    }
}
