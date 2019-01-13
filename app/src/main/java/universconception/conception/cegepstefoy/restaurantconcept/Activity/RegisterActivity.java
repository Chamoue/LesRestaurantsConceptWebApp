package universconception.conception.cegepstefoy.restaurantconcept.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import universconception.conception.cegepstefoy.restaurantconcept.Data.DataBase;
import universconception.conception.cegepstefoy.restaurantconcept.Model.CompteUsager;
import universconception.conception.cegepstefoy.restaurantconcept.Model.Courriel;
import universconception.conception.cegepstefoy.restaurantconcept.Model.Password;
import universconception.conception.cegepstefoy.restaurantconcept.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText courrielInput;
    private EditText passwordInput;
    private EditText confirmPasswordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        this.courrielInput = findViewById(R.id.courrielRegisterInput);
        this.passwordInput = findViewById(R.id.passwordRegisterInput);
        this.confirmPasswordInput = findViewById(R.id.confirmPasswordInput);
    }

    public void onLoginTextClicked(View view) {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public boolean validations() {
        //TODO
        return true;
    }

    public void registerUser() {
        if (validations()){
            DataBase.getInstance().addUser(new Courriel(this.courrielInput.getText().toString()), new Password(this.passwordInput.getText().toString()));
        }
    }

    public void passwordDoNotMatch() {
        if (this.passwordInput.getText().toString().equals(this.confirmPasswordInput.getText().toString())) {
            //PASSWORDS FINE
        }
        else {
            // TODO : ERROR - PASSWORD DONT MATCH
        }
    }

}
