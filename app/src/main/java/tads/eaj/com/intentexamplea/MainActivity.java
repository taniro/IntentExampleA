package tads.eaj.com.intentexamplea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click (View b){
        Intent i = new Intent("tads.eaj.com.intentexampleb.TESTE");
        // Verify that the intent will resolve to an activity
        //if (i.resolveActivity(getPackageManager()) != null) {
            startActivity(i);
        //}
    }
}
