//Alterado em 25/03/2018
package sgf.ssoftware.com.br.sgf.constants.dbsgf;

public class ConstantsDbSGF {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "SGF";

    //Strings nomeclatura das tabelas e campos
    public static final String NOME_TABELA_USUARIO_SGF = "usuario_sgf";
    public static final String [] CAMPOS_TABELA_USUARIO_SGF =
            {"id","nome","senha"};

    //Strings para criação das tabelas
    public static final String TABELA_USUARIO_SGF =
            "CREATE TABLE " + NOME_TABELA_USUARIO_SGF + "(" +
                    CAMPOS_TABELA_USUARIO_SGF[0] + " INTEGER PRIMARY KEY," +
                    CAMPOS_TABELA_USUARIO_SGF[1] + " TEXT," +
                    CAMPOS_TABELA_USUARIO_SGF[2] + " TEXT " +
                    ")";

    //Strings para atualização do banco
    public static final String EXCLUIR_TABELA_USUARIO = "DROP TABLE " + NOME_TABELA_USUARIO_SGF;

    public ConstantsDbSGF(){

    }
}
