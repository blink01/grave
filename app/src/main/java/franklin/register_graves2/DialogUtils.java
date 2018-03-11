package franklin.register_graves2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Tim Newport on 3/11/2018.
 */

public final class DialogUtils {
    public static void showOkDialog(Context context, String message) {
        new AlertDialog.Builder(context)
                .setMessage(message)
                .setNeutralButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }
}
