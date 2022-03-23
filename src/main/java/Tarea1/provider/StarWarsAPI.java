package Tarea1.provider;

import Tarea1.model.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface StarWarsAPI {

    //gets para people

    @GET("people/")
    Call<People>people();

    @GET("people/{personId}")
    Call<Person> people(@Path("personId") int peopleId);

    // gets para films

    @GET("films/")
    Call<Films>films();

    @GET("films/{filmsId}")
    Call<Movie>films(@Path("filmsId") int filmsId);

    // gets para planets

    @GET("planets/")
    Call<Planets>planets();

    @GET("planets/{planetsId}")
    Call<Circle>planets(@Path("planetsId")int planetsId);

    // gets para Starships

    @GET("starships/")
    Call<Starships>starships();

    @GET("starships/{starshipsId}")
    Call<Ship>starships(@Path("starshipsId")int starshipsId);


}

