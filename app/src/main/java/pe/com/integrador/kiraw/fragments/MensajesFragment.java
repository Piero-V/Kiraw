package pe.com.integrador.kiraw.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pe.com.integrador.kiraw.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MensajesFragment extends Fragment {

    public MensajesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mensajes, container, false);
    }
}
