package it.spacecoding.broacastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastExample extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        boolean isAirplaneModeEnabled = intent.getBooleanExtra("state", false);
        if (isAirplaneModeEnabled) {
            Toast.makeText(context, "Device is in airplane mode", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, "Device is not in airplane mode", Toast.LENGTH_LONG).show();
        }
    }
}
