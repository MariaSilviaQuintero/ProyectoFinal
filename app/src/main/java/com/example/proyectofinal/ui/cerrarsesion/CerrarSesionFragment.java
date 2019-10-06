package com.example.proyectofinal.ui.cerrarsesion;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.proyectofinal.MainActivity;
import com.example.proyectofinal.MenuActivity;
import com.example.proyectofinal.R;

public class CerrarSesionFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_cerrarsesion, container, false);

        salir();
        return root;
    }

    private void salir(){ new AlertDialog.Builder(getContext()).setMessage("¿Desea salir de la aplicación?").setPositiveButton("SI", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            System.exit(0);
        }
    }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {

            Intent ingresar = new Intent(getContext(), MenuActivity.class);
            startActivity(ingresar);
        }}).show();
    }
}