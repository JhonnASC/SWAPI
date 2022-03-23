package Tarea1.model;

import java.util.Arrays;

public class Circle {

    private String name;
    private String rotation_speed;
    private String orbital_period;
    private String diameter;
    private String climate;
    private String gravity;
    private String terrain;
    private String surface_water;
    private String population;
    private String[] residents;
    private String[] films;
    private String created;
    private String edited;
    private String url;

    public Circle(String name, String rotation_speed, String orbital_period, String diameter, String climate, String gravity, String terrain, String surface_water, String population, String[] residents, String[] films, String created, String edited, String url) {
        this.name = name;
        this.rotation_speed = rotation_speed;
        this.orbital_period = orbital_period;
        this.diameter = diameter;
        this.climate = climate;
        this.gravity = gravity;
        this.terrain = terrain;
        this.surface_water = surface_water;
        this.population = population;
        this.residents = residents;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }



    public String Printcircle(Circle circle){
       return "Name: " +  circle.getName()+
                "\nRotation_speed: " + circle.getRotation_speed() +
                "\nOrbital_period: " + circle.getOrbital_period() +
                "\nDiameter: " + circle.getDiameter() +
                "\nClimate: " + circle.getClimate() +
                "\nGravity: " + circle.getGravity() +
                "\nTerrain: " + circle.getTerrain() +
                "\nSurface_water: " + circle.getSurface_water() +
                "\nPopulation " + circle.getPopulation() +
                "\nResidents " + Arrays.toString(circle.getResidents()) +
                "\nFilms: " + Arrays.toString(circle.getFilms()) +
                "\nCreated: " + circle.getCreated() +
                "\nEdited: " + circle.getEdited() +
                "\nURL: " + circle.getUrl() +
                "";


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRotation_speed() {
        return rotation_speed;
    }

    public void setRotation_speed(String rotation_speed) {
        this.rotation_speed = rotation_speed;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(String surface_water) {
        this.surface_water = surface_water;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String[] getResidents() {
        return residents;
    }

    public void setResidents(String[] residents) {
        this.residents = residents;
    }

    public String[] getFilms() {
        return films;
    }

    public void setFilms(String[] films) {
        this.films = films;
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


