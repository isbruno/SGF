//Alterado 25/03/2018
package sgf.ssoftware.com.br.sgf.activity.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sgf.ssoftware.com.br.sgf.R;
import sgf.ssoftware.com.br.sgf.teste.cadastro.TesteInserirUsuarioSGF;

public class SGF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgf);
        TesteInserirUsuarioSGF teste = new TesteInserirUsuarioSGF();
        teste.testarInserirUsuario(this);
    }
}
