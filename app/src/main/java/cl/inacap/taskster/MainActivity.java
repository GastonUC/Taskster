package cl.inacap.taskster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cl.inacap.taskster.modelo.Adaptador;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] s1;
    String[] s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        s1 = getResources().getStringArray(R.array.testRecyclerView);
        s2 = getResources().getStringArray(R.array.contentRecyclerView);

        Adaptador adaptador = new Adaptador(this, s1, s2);
        recyclerView.setAdapter(adaptador);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void AgregarNota(View view) {
        Intent intent=new Intent(this,NuevaNotaActivity.class);
        startActivity(intent);
    }
}