package namnguyen.tdmu.mymoney.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import namnguyen.tdmu.mymoney.R;
import namnguyen.tdmu.mymoney.database.DBHelper;


public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button btnlogin,btnregister;
    DBHelper DB;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username1);
        password = (EditText) findViewById(R.id.password1);
        btnlogin = (Button) findViewById(R.id.btnsignin1);
        btnregister = (Button) findViewById(R.id.btnregister);
        DB = new DBHelper(this);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String user = username.getText().toString();
//                String pass = password.getText().toString();
//
//                if (user.equals("")||pass.equals(""))
//                    Toast.makeText(LoginActivity.this,"Please enter all the fields",Toast.LENGTH_SHORT).show();
//                else {
//                    Boolean checkusserpass = DB.checkusernamepassword(user,pass);
//                    if (checkusserpass==true){
//                        Toast.makeText(LoginActivity.this,"Sign in successfull",Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                        startActivity(intent);
//                    }else {
//                        Toast.makeText(LoginActivity.this,"Invalid Credentails",Toast.LENGTH_SHORT).show();
//                    }
//                }
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        btnregister.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RigisterActivity.class);
                startActivity(intent);
            }
        }));
    }
}
