package audiolibros.example.com.audiolibros.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import audiolibros.example.com.audiolibros.adaptadores.AdaptadorLibros;
import audiolibros.example.com.audiolibros.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    public AdaptadorLibros adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adaptador = ((Aplicacion)getApplicationContext()).getAdaptador();



        /*Aplicacion app = (Aplicacion) getApplication();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(app.getAdaptador());
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        app.getAdaptador().setOnItemClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Seleccionado el elemento: "
                        + recyclerView.getChildAdapterPosition(v), Toast.LENGTH_SHORT).show();
            }
        });*/


    }

}
