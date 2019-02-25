package com.example.escenariosdeportivos.Service;

import com.example.escenariosdeportivos.escenariosPaquete.Escenario;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EscenarioService {

    @GET("vx6j-j5fb.json")
    Call<ArrayList<Escenario>> obtenerListaMunicipios();

}
