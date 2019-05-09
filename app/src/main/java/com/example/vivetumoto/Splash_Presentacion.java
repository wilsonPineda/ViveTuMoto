package com.example.vivetumoto;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class Splash_Presentacion extends Activity {

    private final int TIEMPO_SPLASH = 4000;

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash__presentacion);

        new Handler().postDelayed(new Runnable() {
            public void run(){
                Intent intent = new Intent(Splash_Presentacion.this, MainActivity.class);
                startActivity(intent);
                finish();
            };
        }, TIEMPO_SPLASH);
    }
}
