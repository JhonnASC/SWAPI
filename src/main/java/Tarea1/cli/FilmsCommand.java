package Tarea1.cli;


import Tarea1.model.Films;
import Tarea1.model.Movie;
import Tarea1.provider.StarWarsAPI;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import java.io.IOException;


@Command(name = "Films", description = "Get films information")
public class FilmsCommand implements Runnable {


    @Parameters(paramLabel = "<film id>", description = "film id to be resolved", defaultValue = "")
    private String filmsId;

    @Override
    public void run() {
        if(filmsId.equals("")) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://swapi.dev/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            try {
                StarWarsAPI service = retrofit.create(StarWarsAPI.class);

                Call<Films> filmsCall = service.films();
                var films  = filmsCall.execute().body();


                for(Movie p: films.getResults()){
                    System.out.println(p.Printmovie(p));
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.exit(0);

        }


        int pId = Integer.parseInt(filmsId);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://swapi.dev/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        try {
            StarWarsAPI service = retrofit.create(StarWarsAPI.class);

            Call<Movie> movieCall = service.films(pId);
            var movie = movieCall.execute().body();
            //System.out.println(people.getName() + " - " + people.getBirth_year() );
            System.out.println(movie.Printmovie(movie));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.exit(0);



    }
}
