package Tarea1.cli;

import Tarea1.model.Circle;
import Tarea1.model.Films;
import Tarea1.model.Movie;
import Tarea1.model.Planets;
import Tarea1.provider.StarWarsAPI;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import java.io.IOException;


@Command(name = "Planets", description = "Get planets information")
public class PlanetsCommand implements Runnable {


    @Parameters(paramLabel = "<planets id>", description = "planets id to be resolved", defaultValue = "")
    private String planetsId;

    @Override
    public void run() {
        if(planetsId.equals("")) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://swapi.dev/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            try {
                StarWarsAPI service = retrofit.create(StarWarsAPI.class);

                Call<Planets> planetsCall = service.planets();
                var planets  = planetsCall.execute().body();


                for(Circle p: planets.getResults()){
                    System.out.println(p.Printcircle(p));
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.exit(0);

        }


        int pId = Integer.parseInt(planetsId);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://swapi.dev/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        try {
            StarWarsAPI service = retrofit.create(StarWarsAPI.class);

            Call<Circle> circleCall = service.planets(pId);
            var circle = circleCall.execute().body();
            //System.out.println(people.getName() + " - " + people.getBirth_year() );
            System.out.println(circle.Printcircle(circle));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.exit(0);



    }
}