package com.example.ist_mac_16.week4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button map;
    Button btn;
    EditText edt1;
    EditText edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText) findViewById(R.id.edt1); //send to string
        edt2 = (EditText) findViewById(R.id.edt2);
        btn = (Button) findViewById(R.id.but);
        map = (Button) findViewById(R.id.map);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int ed1 = Integer.parseInt(edt1.getText().toString());
                int ed2 = Integer.parseInt(edt2.getText().toString());

                int result = ed1 + ed2;

                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("1234", result);
                startActivity(intent);

            }

        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String geoCode = "google.streetview:cbll=41.5020952,-81.6789717&cbp=1,270,,45,1&mz=1";

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoCode));
                startActivity(intent);

            }
        });
    }
}

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d(msg1, msg2 + "onStart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d(msg1, msg2 + "onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d(msg1, msg2 + "onPause");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d(msg1, msg2 + "onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(msg1, msg2 + "onDestroy");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d(msg1, msg2 + "onRestart");
//    }
//}
