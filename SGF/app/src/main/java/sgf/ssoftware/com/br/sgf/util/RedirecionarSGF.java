//Alterado em 25/03/2018
package sgf.ssoftware.com.br.sgf.util;

import android.content.Context;
import android.content.Intent;
import sgf.ssoftware.com.br.sgf.activity.main.SGFActivity;

public class RedirecionarSGF {

    public void redirecionarSGFActivity(Context context){

        Intent sgfActivity = new Intent(context, SGFActivity.class);
        context.startActivity(sgfActivity);
    }
}
