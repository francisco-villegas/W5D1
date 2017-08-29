package com.example.francisco.w5d1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ButterKnife.bind(this);
        mAuth = FirebaseAuth.getInstance();

    }

    @OnClick({R.id.btnLogOut})
    public void OnClick(View view){
        switch (view.getId()){
            case R.id.btnLogOut:
                mAuth.signOut();
                LoginManager.getInstance().logOut();
                Toast.makeText(this, "Sign out successfully", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startMain);
    }
}
