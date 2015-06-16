package me.johnkagga.rain;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by John Kagga on 6/16/2015.
 */
public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Oops, sorry")
                .setMessage("Please try again")
                .setPositiveButton("Ok",null);

        AlertDialog dialog = builder.create();

        return dialog;
    }
}
