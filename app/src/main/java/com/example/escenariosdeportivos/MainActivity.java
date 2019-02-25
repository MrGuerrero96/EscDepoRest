package com.example.escenariosdeportivos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.escenariosdeportivos.Service.EscenarioService;
import com.example.escenariosdeportivos.escenariosPaquete.Escenario;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Retrofit retrofit;
    private static final String TAG="ESCENARIOS DEPORTIVOS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/resource/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        obtenerDatos();
    }

    private void obtenerDatos() {

        EscenarioService service = retrofit.create(EscenarioService.class);
        Call<ArrayList<Escenario>> municipioRespuestaCall = service.obtenerListaMunicipios();
        municipioRespuestaCall.enqueue(new Callback<ArrayList<Escenario>>() {

            @Override
            public void onResponse(Call<ArrayList<Escenario>> call, Response<ArrayList<Escenario>> response) {
                if(response.isSuccessful()){

                    ArrayList lista = response.body();


                    for(int i=0;i<lista.size();i++)
                    {

                        Escenario escenario=(Escenario)lista.get(i);
                        String x = escenario.getComuna();
                        if (x.equals("1")){
                            TextView asignacion = (TextView) findViewById(R.id.comuna1);
                            asignacion.setText(asignacion.getText() + "Barrio: " + escenario.getLocalizacion() +
                                    "  Nombre: " + escenario.getNombre() + "\n");
                        }
                        else if (x.equals("2")){
                            TextView asignacion = (TextView) findViewById(R.id.comuna2);
                            asignacion.setText(asignacion.getText() + "Barrio: " + escenario.getLocalizacion() +
                                    "  Nombre: " + escenario.getNombre()+ "\n");
                        }
                        else if (x.equals("3")){
                            TextView asignacion = (TextView) findViewById(R.id.comuna3);
                            asignacion.setText(asignacion.getText() + "Barrio: " + escenario.getLocalizacion() +
                                    "  Nombre: " + escenario.getNombre()+ "\n");
                        }
                        else if (x.equals("4")){
                            TextView asignacion = (TextView) findViewById(R.id.comuna4);
                            asignacion.setText(asignacion.getText() + "Barrio: " + escenario.getLocalizacion() +
                                    "  Nombre: " + escenario.getNombre()+ "\n");
                        }
                        else if (x.equals("5")){
                            TextView asignacion = (TextView) findViewById(R.id.comuna5);
                            asignacion.setText(asignacion.getText() + "Barrio: " + escenario.getLocalizacion() +
                                    "  Nombre: " + escenario.getNombre()+ "\n");
                        }
                        else if (x.equals("6")){
                            TextView asignacion = (TextView) findViewById(R.id.comuna6);
                            asignacion.setText(asignacion.getText() + "Barrio: " + escenario.getLocalizacion() +
                                    "  Nombre: " + escenario.getNombre()+ "\n");
                        }
                        else if (x.equals("7")){
                            TextView asignacion = (TextView) findViewById(R.id.comuna7);
                            asignacion.setText(asignacion.getText() + "Barrio: " + escenario.getLocalizacion() +
                                    "  Nombre: " + escenario.getNombre()+ "\n");
                        }
                        else if (x.equals("8")){
                            TextView asignacion = (TextView) findViewById(R.id.comuna8);
                            asignacion.setText(asignacion.getText() + "Barrio: " + escenario.getLocalizacion() +
                                    "  Nombre: " + escenario.getNombre()+ "\n");
                        }
                        else if (x.equals("9")){
                            TextView asignacion = (TextView) findViewById(R.id.comuna9);
                            asignacion.setText(asignacion.getText() + "Barrio: " + escenario.getLocalizacion() +
                                    "  Nombre: " + escenario.getNombre()+ "\n");
                        }
                        else if (x.equals("10")){
                            TextView asignacion = (TextView) findViewById(R.id.comuna10);
                            asignacion.setText(asignacion.getText() + "Barrio: " + escenario.getLocalizacion() +
                                    "  Nombre: " + escenario.getNombre()+ "\n");
                        }
                        else if (x.equals("11")){
                            TextView asignacion = (TextView) findViewById(R.id.comuna11);
                            asignacion.setText(asignacion.getText() + "Barrio: " + escenario.getLocalizacion() +
                                    "  Nombre: " + escenario.getNombre()+ "\n");
                        }
                        else if (x.equals("12")){
                            TextView asignacion = (TextView) findViewById(R.id.comuna12);
                            asignacion.setText(asignacion.getText() + "Barrio: " + escenario.getLocalizacion() +
                                    "  Nombre: " + escenario.getNombre()+ "\n");
                        }
                        Log.i(TAG," Escenarios: "+escenario.getComuna()+escenario.getNombre());
                    }


                }else
                {
                    Log.e(TAG, " onResponse: "+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Escenario>> call, Throwable t) {
                Log.e(TAG," onFailure: "+t.getMessage());
            }


        });

    }

    public void acercaDe(View view) {
        Intent i = new Intent(this,AcercaDe.class );
        startActivity(i);
    }
}
