package Tarea1.cli;

import Tarea1.model.*;
import Tarea1.provider.StarWarsAPI;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import java.io.IOException;


@Command(name = "Starships", description = "Get starships information")
public class StarshipsCommand implements Runnable {


    @Parameters(paramLabel = "<starships id>", description = "starships id to be resolved", defaultValue = "")
    private String starshipsId;

    @Override
    public void run() {
        if(starshipsId.equals("")) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://swapi.dev/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            try {
                StarWarsAPI service = retrofit.create(StarWarsAPI.class);

                Call<Starships> starshipsCall = service.starships();
                var starships  = starshipsCall.execute().body();


                for(Ship p: starships.getResults()){
                    System.out.println(p.Printship(p));
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.exit(0);

        }


        int pId = Integer.parseInt(starshipsId);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://swapi.dev/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        try {
            StarWarsAPI service = retrofit.create(StarWarsAPI.class);

            Call<Ship> shipCall = service.starships(pId);
            var ship = shipCall.execute().body();

            System.out.println(ship.Printship(ship));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.exit(0);



    }
}