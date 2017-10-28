package teestory.teestory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by satyanarayana pdv on 10/25/2017.
 */

public class SignUp extends AppCompatActivity {

    EditText edt_email,edt_name, edt_phone, edt_password;
    String email, name, phone, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        edt_email    = (EditText) findViewById(R.id.edt_email);
        edt_name     = (EditText) findViewById(R.id.edt_name);
        edt_phone    = (EditText) findViewById(R.id.edt_phone);
        edt_password = (EditText) findViewById(R.id.edt_password);

        email    = edt_email.getText().toString();
        name     = edt_name.getText().toString();
        phone    = edt_phone.getText().toString();
        password = edt_password.getText().toString();



    }
}