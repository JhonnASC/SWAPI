package Tarea1.model;

import java.util.Arrays;

public class Movie {

    private String title;
    private int episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private String release_date;
    private String[] characters;
    private String[] planets;
    private String[] starships;
    private String[] vehicles;
    private String[] species;
    private String created;
    private String edited;
    private String url;


    public Movie(String title, int episode_id, String opening_crawl, String director, String producer, String release_date, String[] characters, String[] planets, String[] starships, String[] vehicles, String[] species, String created, String edited, String url) {
        this.title = title;
        this.episode_id = episode_id;
        this.opening_crawl = opening_crawl;
        this.director = director;
        this.producer = producer;
        this.release_date = release_date;
        this.characters = characters;
        this.planets = planets;
        this.starships = starships;
        this.vehicles = vehicles;
        this.species = species;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public String Printmovie(Movie movie){
        return "Title: " + movie.getTitle() +
                "\nEpisode_id: " + movie.getEpisode_id() +
                "\nOpening_crawl: " + movie.getOpening_crawl() +
                "\nDirector: " + movie.getDirector() +
                "\nProducer: " + movie.getProducer() +
                "\nRelease date: " + movie.getRelease_date() +
                "\nCharacters: " + Arrays.toString(movie.getCharacters())+
                "\nPlanets: " + Arrays.toString(movie.getPlanets()) +
                "\nStarships " + Arrays.toString(movie.getStarships()) +
                "\nVehicles: " + Arrays.toString(movie.getVehicles()) +
                "\nSpecies: " + Arrays.toString(movie.getSpecies()) +
                "\nCreated: " + movie.getCreated() +
                "\nEdited: " + movie.getEdited() +
                "\nURL: " + movie.getUrl() +
                "";

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(int episode_id) {
        this.episode_id = episode_id;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public void setOpening_crawl(String opening_crawl) {
        this.opening_crawl = opening_crawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String[] getCharacters() {
        return characters;
    }

    public void setCharacters(String[] characters) {
        this.characters = characters;
    }

    public String[] getPlanets() {
        return planets;
    }

    public void setPlanets(String[] planets) {
        this.planets = planets;
    }

    public String[] getStarships() {
        return starships;
    }

    public void setStarships(String[] starships) {
        this.starships = starships;
    }

    public String[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(String[] vehicles) {
        this.vehicles = vehicles;
    }

    public String[] getSpecies() {
        return species;
    }

    public void setSpecies(String[] species) {
        this.species = species;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}



