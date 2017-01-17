package edu.washington.zubinc.activityspy;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate event fired");
    }

    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart event fired");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart event fired");
    }

    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume event fired");
    }

    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause event fired");
    }

    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop event fired");
    }

    protected void onDestroy() {
        Log.e(TAG, "We're going down, Captain!");
    }
}
