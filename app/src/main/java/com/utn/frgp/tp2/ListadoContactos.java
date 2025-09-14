package com.utn.frgp.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.appbar.MaterialToolbar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ListadoContactos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_listado_contactos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

        private List<Contacto> leerContactosDesdeArchivo() {
            List<Contacto> contactos = new ArrayList<>();
            File file = new File(getFilesDir(), FILE_NAME);
            if (!file.exists()) {
                return contactos;
            }

            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] campos = linea.split("\\|");
                    if (campos.length == 9) {
                        Contacto contacto = new Contacto(
                                campos[0],
                                campos[1],
                                campos[2],
                                campos[3],
                                Boolean.parseBoolean(campos[4]),
                                Boolean.parseBoolean(campos[5]),
                                campos[6],
                                campos[7],
                                Date.valueOf(campos[8])
                        );
                        contactos.add(contacto);
                    }
                }
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return contactos;
        }
}