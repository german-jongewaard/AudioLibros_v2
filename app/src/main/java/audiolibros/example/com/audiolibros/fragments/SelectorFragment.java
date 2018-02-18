package audiolibros.example.com.audiolibros.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.Vector;

import audiolibros.example.com.audiolibros.AdaptadorLibros;
import audiolibros.example.com.audiolibros.Aplicacion;
import audiolibros.example.com.audiolibros.Libro;
import audiolibros.example.com.audiolibros.R;

/**
 * Created by german on 18-2-18.
 */

public class SelectorFragment extends Fragment {

    private Activity actividad;
    private RecyclerView recyclerView;
    private AdaptadorLibros adaptador;
    private Vector<Libro> vectorLibros;

    @Override public void onAttach(Context contexto) {
        super.onAttach(contexto);

        if (contexto instanceof Activity) {
            this.actividad = (Activity) contexto;
            Aplicacion app = (Aplicacion)
                    actividad.getApplication();
            adaptador = app.getAdaptador();
            vectorLibros = app.getVectorLibros();
        }
    }
    @Override public View onCreateView(LayoutInflater inflador,
                                       ViewGroup contenedor, Bundle savedInstanceState) {

        View vista = inflador.inflate(R.layout.fragment_selector,contenedor, false);

        recyclerView = (RecyclerView) vista.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(actividad,2));
        recyclerView.setAdapter(adaptador);

        adaptador.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Toast.makeText(actividad, "Seleccionado el elemento: "
                        + recyclerView.getChildAdapterPosition(v), Toast.LENGTH_SHORT).show();
            }
        });
        return vista;
    }
}