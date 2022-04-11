//package AngelAlfxro;
import java.util.Arrays;

public class tvShows {
    private String name;
    private int year;
    private int seasons;
    private int numEpisodes;
    private String network;
    private String genre;
    private String maleLead;
    private String femaleLead;

    // Constructor
    public tvShows(String [] tvShowArray){
        this.name = tvShowArray[0];
        this.year = Integer.parseInt(tvShowArray[1]);
        this.seasons = Integer.parseInt(tvShowArray[2]);
        this.numEpisodes = Integer.parseInt(tvShowArray[3]);
        this.network = tvShowArray[4];
        this.genre = tvShowArray[5];
        this.maleLead = tvShowArray[6];
        this.femaleLead = tvShowArray[7];
        System.out.println(Arrays.toString(tvShowArray));
    }


    @Override
    public String toString(){
        return this.name + ", " + this.year + ", " + this.seasons + ", " + this.numEpisodes + ", " + this.network + ", " + this.genre + ", " + this.maleLead + ", " + this.femaleLead;
    }

    // getters
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }

    public int getSeasons(){
        return seasons;
    }

    public int getNumEpisodes(){
        return numEpisodes;
    }

    public String getNetwork(){
        return network;
    }

    public String getGenre(){
        return genre;
    }

    public String getMaleLead(){
        return maleLead;
    }

    public String getFemaleLead(){
        return femaleLead;
    }

    // setters
    public void setName(String newName){
        this.name = newName;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }

    public void setSeasons(int numSeasons){
        this.seasons = numSeasons;
    }

    public void setNumEpisodes(int newNumEpisodes){
        this.numEpisodes = newNumEpisodes;
    }

    public void setNetwork(String newNetwork){
        this.network = newNetwork;
    }

    public void setGenre(String newGenre){
        this.genre = newGenre;
    }

    public void setMaleLead(String newMaleLead){
        this.maleLead = newMaleLead;
    }

    public void setFemaleLead(String newFemaleLead){
        this.femaleLead = newFemaleLead;
    }

}
