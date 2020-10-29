package cl.inacap.taskster.modelo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import cl.inacap.taskster.ContenidoNotaActivity;
import cl.inacap.taskster.R;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {

    String[] data1;
    String[] data2;
    Context context;

    public Adaptador(Context ct, String[] s1, String s2[]) {
        context = ct;
        data1 = s1;
        data2 = s2;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.mi_lista, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.text1.setText(data1[position]);
        holder.text2.setText(data2[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ContenidoNotaActivity.class);
                intent.putExtra("data1", data1[position]);
                intent.putExtra("data2", data2[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView text1, text2;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.tit_tarjeta);
            text2 = itemView.findViewById(R.id.conten_tarjeta);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
