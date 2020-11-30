package cl.inacap.taskster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NuevaNotaActivity extends AppCompatActivity {

    EditText TitN;
    EditText DescN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_nota);
    }

    public void getData() {

    }

    public void main(View view) {
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}