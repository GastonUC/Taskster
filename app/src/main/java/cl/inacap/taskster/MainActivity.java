package cl.inacap.taskster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AgregarNota(View view) {
        Intent intent=new Intent(this,NuevaNotaActivity.class);
        startActivity(intent);
    }
}