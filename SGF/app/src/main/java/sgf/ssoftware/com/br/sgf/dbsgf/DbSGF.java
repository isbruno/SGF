//Alterado em 25/03/2018
package sgf.ssoftware.com.br.sgf.dbsgf;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import sgf.ssoftware.com.br.sgf.constants.dbsgf.ConstantsDbSGF;

public class DbSGF extends SQLiteOpenHelper{

    public DbSGF(Context ctx){

        super(ctx, ConstantsDbSGF.DATABASE_NAME, null, ConstantsDbSGF.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase dbsgf) {

        dbsgf.execSQL(ConstantsDbSGF.TABELA_USUARIO_SGF);
    }

    @Override
    public void onUpgrade(SQLiteDatabase dbsgf, int versaoAntiga, int versaoNova) {

        dbsgf.execSQL(ConstantsDbSGF.EXCLUIR_TABELA_USUARIO);
        onCreate(dbsgf);
    }
}
