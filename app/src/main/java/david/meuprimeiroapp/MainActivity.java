package david.meuprimeiroapp;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView campoText = (TextView) findViewById(R.id.textView);
        final EditText campoEdit = (EditText) findViewById(R.id.campoTexto);
        Button botaoToast = (Button) findViewById(R.id.botaoTexto);
        Button botaoCorFundo = (Button) findViewById(R.id.botaoCorFundo);
        Button botaoCorLetra = (Button) findViewById(R.id.botaoCorLetra);
//        final RelativeLayout tela = (RelativeLayout) findViewById(R.id.tela);

        // Ação para o botão "Mensagem Toast"
        botaoToast.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View view) {
                Toast mensToast;
                String menPadrao = "Campo Text vazio";

                // Verifica se o campo Text esta vazio, se estiver coloca no Toast uma mensagem padrão, caso contrário pega o valor do Text
                if (campoText.getText().toString().equals("")) {
                    mensToast = Toast.makeText(MainActivity.this, "Campo Text vazio" , Toast.LENGTH_SHORT);
                    mensToast.show();
                }else{
                        mensToast = Toast.makeText(MainActivity.this, (CharSequence) campoEdit.getText(), Toast.LENGTH_SHORT);
                        mensToast.show();
                    }
            }
        });

        // Ação para o botão "Mude a cor do fundo"
//        botaoCorFundo.setOnClickListener(new Button.OnClickListener() {

//            public void onClick(View view) {
//                tela.setBackgroundColor(Color.parseColor("FFA9B0D8"));
//            }
//        });

        // Ação para o botão "Mude a cor da letra do text"
        botaoCorLetra.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View view) {
                //campoText.setBackgroundColor(Color.parseColor("FFA9B0D8"));
                campoText.setTextColor(Integer.parseInt("FFA9B0D8"));
            }
        });
    }


}
