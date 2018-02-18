package audiolibros.example.com.audiolibros.actividades;

import android.app.Application;

import java.util.Vector;

import audiolibros.example.com.audiolibros.adaptadores.AdaptadorLibros;
import audiolibros.example.com.audiolibros.modelo.Libro;

/**
 * Created by german on 17-2-18.
 */

public class Aplicacion extends Application{

    private Vector<Libro> vectorLibros;
    private AdaptadorLibros adaptador;

    @Override
    public void onCreate() {
        super.onCreate();
        vectorLibros = Libro.ejemploLibros();
        adaptador = new AdaptadorLibros (this, vectorLibros);
    }

    public AdaptadorLibros getAdaptador(){
        return adaptador;
    }

    public Vector<Libro> getVectorLibros(){
        return vectorLibros;
    }

}
