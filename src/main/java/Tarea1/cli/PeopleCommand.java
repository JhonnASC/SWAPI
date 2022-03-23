package Tarea1.cli;

import Tarea1.provider.StarWarsAPI;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import retrofit2.Call;
import retrofit2.Retrofit;
import Tarea1.model.People;
import Tarea1.model.Person;
import retrofit2.converter.gson.GsonConverterFactory;


import java.io.IOException;


@Command(name = "People", description = "Get people involved in Starwars Universe")
public class PeopleCommand implements Runnable {


    @Parameters(paramLabel = "<people id>", description = "people id to be resolved", defaultValue = "")
    private String peopleId;

    @Override
    public void run() {
        if(peopleId.equals("")) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://swapi.dev/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            try {
                StarWarsAPI service = retrofit.create(StarWarsAPI.class);

                Call<People> peopleCall = service.people();
                var people  = peopleCall.execute().body();


                for(Person p: people.getResults()){
                    System.out.println(p.Printperson(p));
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.exit(0);

        }


        int pId = Integer.parseInt(peopleId);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://swapi.dev/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        try {
            StarWarsAPI service = retrofit.create(StarWarsAPI.class);

            Call<Person> personCall = service.people(pId);
            var people = personCall.execute().body();
            //System.out.println(people.getName() + " - " + people.getBirth_year() );
            System.out.println(people.Printperson(people));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.exit(0);



    }
}
