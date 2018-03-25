//Alterado em 25/03/2018
package sgf.ssoftware.com.br.sgf.util;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import sgf.ssoftware.com.br.sgf.constants.util.ConstantsUtilSGF;

public class MensagemAlertSGF {

    public static void apresentarCaixaDeDialogoValidacao(String msg, Context context){

        AlertDialog.Builder alerta = new AlertDialog.Builder(context);
        alerta.setTitle(ConstantsUtilSGF.MSG_ATENCAO);
        alerta.setMessage(msg);
        alerta.setPositiveButton(ConstantsUtilSGF.MSG_OK, null);
        alerta.show();
    }

    public static void apresentarCaixaDeDialogoSucesso(String msg, final Context context){

        AlertDialog.Builder alerta = new AlertDialog.Builder(context);
        alerta.setTitle(ConstantsUtilSGF.MSG_SUCESSO);
        alerta.setMessage(msg);
        alerta.setPositiveButton(ConstantsUtilSGF.MSG_OK, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                RedirecionarSGF redirecionarSGF = new RedirecionarSGF();
                redirecionarSGF.redirecionarSGFActivity(context);
            }
        });
        alerta.show();
    }
}
