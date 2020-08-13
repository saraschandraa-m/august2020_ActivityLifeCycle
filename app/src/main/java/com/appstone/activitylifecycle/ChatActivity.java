package com.appstone.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ChatActivity extends AppCompatActivity implements View.OnClickListener {

    String TAG = "Activity-Chat";

    private Button btnMoveProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Log.i(TAG, "onCreate Called");

        btnMoveProfile = findViewById(R.id.btn_move_to_profile);
        Button btnCloseMoveProfile = findViewById(R.id.btn_close_move_profile);

        btnMoveProfile.setOnClickListener(this);

//        btnMoveProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent profileIntent = new Intent(ChatActivity.this, ProfileActivity.class);
//                startActivity(profileIntent);
//            }
//        });

        btnCloseMoveProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(ChatActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
                finish();
            }
        });
    }

//    public void onMoveToProfileClicked(View view) {
//        Intent profileIntent = new Intent(ChatActivity.this, ProfileActivity.class);
//        startActivity(profileIntent);
//    }

    @Override
    public void onClick(View view) {
        if (view == btnMoveProfile) {
            Intent profileIntent = new Intent(ChatActivity.this, ProfileActivity.class);
            startActivity(profileIntent);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart Called");
    }


}