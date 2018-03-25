package sgf.ssoftware.com.br.sgf.dao.usuario;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import sgf.ssoftware.com.br.sgf.constants.dbsgf.ConstantsDbSGF;
import sgf.ssoftware.com.br.sgf.dbsgf.DbSGF;
import sgf.ssoftware.com.br.sgf.javabeans.usuario.UsuarioSGF;

public class UsuarioDaoSGF {

    private Context context;

    public UsuarioDaoSGF(Context context){

        this.context = context;
    }

    public boolean inserir(UsuarioSGF usuarioSGF){

        boolean inseriu = true;
        DbSGF dbSGF = new DbSGF(context);
        SQLiteDatabase sqLiteDatabase = dbSGF.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantsDbSGF.CAMPOS_TABELA_USUARIO_SGF[1], usuarioSGF.getNome());
        contentValues.put(ConstantsDbSGF.CAMPOS_TABELA_USUARIO_SGF[2], usuarioSGF.getSenha());
        try {

            sqLiteDatabase.insert(ConstantsDbSGF.NOME_TABELA_USUARIO_SGF, null, contentValues);
        }catch (Exception e){

            e.printStackTrace();
            inseriu = false;
        }finally {

            sqLiteDatabase.close();
            return inseriu;
        }
    }
}
