//Alterado 25/03/2018
package sgf.ssoftware.com.br.sgf.teste.cadastro;

import android.content.Context;

import sgf.ssoftware.com.br.sgf.dao.usuario.UsuarioDaoSGF;
import sgf.ssoftware.com.br.sgf.javabeans.usuario.UsuarioSGF;

public class TesteInserirUsuarioSGF {

    public TesteInserirUsuarioSGF(){

    }

    public void testarInserirUsuario(Context context){

        UsuarioSGF usuarioSGF = new UsuarioSGF("1g40","123456");
        UsuarioDaoSGF dao = new UsuarioDaoSGF(context);
        System.out.println(dao.inserir(usuarioSGF));
    }
}
