package fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import teestory.teestory.R;

/**
 * Created by satyanarayana pdv on 10/28/2017.
 */

public class SignUpFragment  extends Fragment implements View.OnClickListener {

    private View rootView;
    private Context mContext;
    Context context;
    EditText edt_email,edt_name, edt_phone, edt_password;
    String email, name, phone, password;
    Button btn_signup, btn_login;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.signup, container, false);
        this.mContext = context;
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        initUI();
        return rootView;
    }

    public void initUI(){
        edt_email    =  rootView.findViewById(R.id.edt_email);
        edt_name     =  rootView.findViewById(R.id.edt_name);
        edt_phone    =  rootView.findViewById(R.id.edt_phone);
        edt_password =  rootView.findViewById(R.id.edt_password);

        btn_signup    =  rootView.findViewById(R.id.btn_sign_up);
        email    = edt_email.getText().toString();
        name     = edt_name.getText().toString();
        phone    = edt_phone.getText().toString();
        password = edt_password.getText().toString();

        btn_signup.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

    }
}
