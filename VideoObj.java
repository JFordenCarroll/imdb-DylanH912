package reader;

import java.util.Arrays;

public class VideoObj implements IMDB {
    private String tconst;
    private String titleType;
    private String primaryTitle;
    private String originalTitle;
    private boolean isAdult;
    private int startYear;
    private Integer endYear;
    private Integer runtimeMinutes;
    private String[] genres;
    private double averageRating;
    private int numVotes;

    

    public VideoObj(){
 
    }

    /*
    * VideoObj class
    *
    * This class should represent a single video (movie, TV show, etc.) and store all relevant information about it.
    * A VideoObj should be able to hold information collected from both the basics.tsv and ratings.tsv files.
    *
    * You should include fields for all the data you need (such as tconst, titleType, title, year, genres, rating, votes, etc.).
    *
    * This class implements the IMDB interface. An interface in Java is like a contract: it lists methods that a class must provide.
    * Look at the IMDB interface to see what methods you are required to implement in this class.
    *
    * You will need to write constructors, getters, setters, and any other methods needed to store and access video data.
    *
    * The toString() method below is provided as an example of how you might display a VideoObj's information.
    */

    // Getters and setters for each field
   
    @Override
    public String toString() {
        return "VideoObj{" +
                "tconst='" + tconst + '\'' +
                ", titleType='" + titleType + '\'' +
                ", primaryTitle='" + primaryTitle + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", isAdult=" + isAdult +
                ", startYear=" + startYear +
                ", endYear=" + endYear +
                ", runtimeMinutes=" + runtimeMinutes +
                ", genres=" + Arrays.toString(genres) +
                ", averageRating=" + averageRating +
                ", numVotes=" + numVotes +
                '}';
    }

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public Integer getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(Integer runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public int getNumVotes() {
        return numVotes;
    }

    public void setNumVotes(int numVotes) {
        this.numVotes = numVotes;
    }
}


