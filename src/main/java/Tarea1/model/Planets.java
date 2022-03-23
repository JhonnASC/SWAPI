package Tarea1.model;

public class Planets {

    private int count;
    private String next;
    private String previous;
    private Circle[] results;

    public Planets(int count, String next, String previous, Circle[] results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public Circle[] getResults() {
        return results;
    }

    public void setResults(Circle[] results) {
        this.results = results;
    }
}


