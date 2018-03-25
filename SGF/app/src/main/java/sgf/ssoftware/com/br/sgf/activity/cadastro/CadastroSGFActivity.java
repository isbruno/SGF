//Alterado em 25/03/2018
package sgf.ssoftware.com.br.sgf.activity.cadastro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import sgf.ssoftware.com.br.sgf.R;
import sgf.ssoftware.com.br.sgf.constants.cadastro.ConstantsCadastroSGF;
import sgf.ssoftware.com.br.sgf.dao.usuario.UsuarioDaoSGF;
import sgf.ssoftware.com.br.sgf.javabeans.usuario.UsuarioSGF;
import sgf.ssoftware.com.br.sgf.util.MensagemAlertSGF;

public class CadastroSGFActivity extends AppCompatActivity {

    private EditText etNome;
    private EditText etSenha;
    private EditText etConfirmarSenha;
    private Button btnCriarNovaConta;

    public CadastroSGFActivity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        criarElementos();
        clickBtnCriarNovaConta();
    }

    private void criarElementos(){

        this.etNome = (EditText) findViewById(R.id.et_cadastroNome);
        this.etSenha = (EditText) findViewById(R.id.et_cadastroSenha);
        this.etConfirmarSenha = (EditText) findViewById(R.id.et_cadastroConfirmarSehna);
        this.btnCriarNovaConta = (Button) findViewById(R.id.btn_criarNovaConta);
    }

    private void clickBtnCriarNovaConta(){

        btnCriarNovaConta.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                MensagemAlertSGF mensagemAlert = new MensagemAlertSGF();
                if(verificarCamposVazios())

                    mensagemAlert.apresentarCaixaDeDialogoValidacao(ConstantsCadastroSGF.MSG_CAMPO_VAZIO,
                            CadastroSGFActivity.this);

                    else if(!verificarTamanhoCampoSenha())

                        mensagemAlert.apresentarCaixaDeDialogoValidacao(
                                ConstantsCadastroSGF.MSG_TAMANHO_CAMPO_SENHA,
                                CadastroSGFActivity.this);

                    else if(!verificarIgualdadeSenha())

                            mensagemAlert.apresentarCaixaDeDialogoValidacao(
                                ConstantsCadastroSGF.MSG_SENHAS_NAO_CONFEREM,
                                CadastroSGFActivity.this);

                    else if(!inserirUsuario())

                            mensagemAlert.apresentarCaixaDeDialogoValidacao(
                                ConstantsCadastroSGF.MSG_SENHAS_NAO_CONFEREM,
                                CadastroSGFActivity.this);

                    else {

                        mensagemAlert.apresentarCaixaDeDialogoSucesso(
                                ConstantsCadastroSGF.MGS_CADASTRO_CONCLUIDO,
                                CadastroSGFActivity.this);
                    }
                }
            });
    }

    //Validação de campos:

    private boolean verificarIgualdadeSenha(){

        return etSenha.getText().toString().equals(etConfirmarSenha.getText().toString());
    }

    private boolean verificarCamposVazios(){

        return etNome.getText().length() == 0 || etSenha.getText().length() == 0
                || etConfirmarSenha.getText().length() == 0;
    }

    private boolean verificarTamanhoCampoSenha(){

        return etSenha.getText().length() >=4;
    }

    private boolean inserirUsuario(){

        UsuarioSGF usuarioSGF = new UsuarioSGF(etNome.getText().toString(), etSenha.getText().toString());
        UsuarioDaoSGF usuarioDaoSGF = new UsuarioDaoSGF(this);
        return usuarioDaoSGF.inserir(usuarioSGF);
    }
}










