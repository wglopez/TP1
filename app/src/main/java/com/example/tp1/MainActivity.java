package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText mail;
    private EditText pass;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mail=findViewById(R.id.editTextTextEmailAddress);
        pass=findViewById(R.id.editTextTextPassword);
        btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.btnLogin):
                LinearLayout layout_login = new LinearLayout(this);
                TextView user = new TextView(this);
                Button btnBack = new Button(this);
                btnBack.setText("Back");
                user.setText("Bienvenido " + mail.getText());
                layout_login.addView(user);
                setContentView(layout_login);

        }
    }
}