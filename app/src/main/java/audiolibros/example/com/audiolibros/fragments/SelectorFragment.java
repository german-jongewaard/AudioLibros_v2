package audiolibros.example.com.audiolibros.fragments;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

import audiolibros.example.com.audiolibros.AdaptadorLibros;
import audiolibros.example.com.audiolibros.Libro;

/**
 * Created by german on 18-2-18.
 */

public class SelectorFragment extends Fragment {
    private Activity actividad;
    private RecyclerView recyclerView;
    private AdaptadorLibros adaptador;
    private Vector<Libro> vectorLibros;

    public void onAttach(Context contexto){
        super.onAttach(contexto);
        

    }

}
