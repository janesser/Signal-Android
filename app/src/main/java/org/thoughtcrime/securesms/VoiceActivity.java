package org.thoughtcrime.securesms;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import org.signal.core.util.logging.Log;

public class VoiceActivity extends Activity {

  @SuppressLint("LogTagInlined") @Override
  protected void onCreate(Bundle savedInstanceState) {
    final Intent intent = getIntent();
    Log.d("JESSER", intent.getDataString());

    final Intent i = new Intent(
        this,
        SmsSendtoActivity.class
    );
    i.setAction(Intent.ACTION_SENDTO);

    startActivity(i);
    finish();
    super.onCreate(savedInstanceState);
  }
}
