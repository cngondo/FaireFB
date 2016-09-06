package firebase.example.com.fairefb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {
    //Bind all the views using Butterknife
    @BindView(R.id.emailField) EditText mEmail;
    @BindView(R.id.passwordField) EditText mPassword;
    @BindView(R.id.loginButton) EditText btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
}
