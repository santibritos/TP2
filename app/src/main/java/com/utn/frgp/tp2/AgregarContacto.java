package com.utn.frgp.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.appbar.MaterialToolbar;

public class AgregarContacto extends AppCompatActivity {

    private Spinner sp1;
    private Spinner sp2;
    private EditText txtNombre;
    private EditText txtApellido;
    private EditText txtTelefono;
    private EditText txtEmail;
    private EditText txtDireccion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_agregar_contacto);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String [] opciones = {"casa","trabajo","Movil"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,opciones);
        sp1.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_en_activity,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if(id == R.id.AgregarContacto)
        {
            Intent next = new Intent(this,AgregarContacto.class);
            startActivity(next);
            return true;
        }
        else if (id == R.id.ListadoContactos)
        {
            Intent next = new Intent(this,ListadoContactos.class);
            startActivity(next);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}