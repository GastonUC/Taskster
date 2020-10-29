package cl.inacap.taskster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ContenidoNotaActivity extends AppCompatActivity {

    TextView title;
    TextView descripcion;

    String data1;
    String data2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido_nota);

        title = findViewById(R.id.title);
        descripcion = findViewById(R.id.desc);

        getData();
        setData();
    }

    private void getData() {
        if(getIntent().hasExtra("data1") && getIntent().hasExtra("data2")) {
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");

        }else{
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        title.setText(data1);
        descripcion.setText(data2);
    }
}