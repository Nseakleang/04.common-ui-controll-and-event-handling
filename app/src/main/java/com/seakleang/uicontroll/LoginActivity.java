package com.seakleang.uicontroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.txtUsername) EditText txtUsername;
    @BindView(R.id.txtPassword) EditText txtPassword;
    @BindView(R.id.btnLogin) Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLogin)
    void onClick(View view){
        String username = txtUsername.getText().toString();
        String password = txtPassword.getText().toString();

        if(username.equals("admin")&&password.equals("admin")){
            showsmg("Login success");
        }
        else {
            showsmg("Something wrong!");
        }
    }

    void showsmg(String smg){
        Toast.makeText(this,smg,Toast.LENGTH_SHORT).show();
    }

}
