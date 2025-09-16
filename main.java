package reader;

/*
 * Main class
 *
 * This class should serve as the entry point for your program.
 *
 * Your main method should:
 *   - Create a database object to store all VideoObj instances.
 *   - Read in data from the ratings and basics .tsv files, and populate the database with VideoObj objects.
 *   - Call methods on the database to clean up, analyze, and print information about the videos (such as purging bad videos, printing statistics, etc.).
 *   - Print results to the console so you can see the output of your code.
 *
 * You may want to write helper methods for reading the .tsv files and for displaying results.
 *
 * This file is where you will put the code that "runs" your project and ties everything together.
 */
import java.io.BufferedReader;
import java.io.FileReader;

class Main {

    public static void main(String args[]){
        try{
        BufferedReader in = new BufferedReader(new FileReader("HW1/subset.title.basics.tsv"));
        String line = in.readLine();
        BufferedReader in2 = new BufferedReader(new FileReader("HW1/subset.title.ratings.tsv"));
        String line2 = in2.readLine();
        database database = new database();
        while(line != null){
                VideoObj thisVideo = new VideoObj();
                //System.out.println(line);
                try{
                line = in.readLine();
                String [] splitValues = line.split("\t");
                //System.out.println(splitValues.length);
                for(int i = 0; i < splitValues.length; i++){
                    if(splitValues[i] != null){
                        switch (i) {
                            case 0:
                                thisVideo.setTconst(splitValues[i]);
                                break;
                            case 1:
                                thisVideo.setTitleType(splitValues[i]);                            
                                break;
                            case 2:
                                thisVideo.setPrimaryTitle(splitValues[i]);
                                break;
                            case 3:
                                thisVideo.setOriginalTitle(splitValues[i]);
                                break;
                            case 4:
                                if(splitValues[i].equals("0")){
                                    thisVideo.setAdult(false);
                                }
                                else{
                                    thisVideo.setAdult(true);
                                }
                                break;
                            case 5:
                                try {
                                    thisVideo.setStartYear(Integer.parseInt(splitValues[i]));
                                } catch (NumberFormatException e) {
                                    thisVideo.setStartYear(-1);
                                }
                                break;
                            case 6:
                                try {
                                    thisVideo.setEndYear(Integer.parseInt(splitValues[i]));
                                } catch (NumberFormatException e) {
                                    thisVideo.setEndYear(thisVideo.getStartYear());
                                }
                                break;  
                            case 7:
                                try {
                                    thisVideo.setRuntimeMinutes(Integer.parseInt(splitValues[i]));
                                } catch (NumberFormatException e) {
                                    thisVideo.setRuntimeMinutes(-1);
                                }
                                break;                                
                            case 8:                                 
                                thisVideo.setGenres(splitValues[i].split(","));    
                            default:
                                break;
                        }
                    }



                }
                try{
                    line2 = in2.readLine();
                    String [] splitMoreValues = line2.split("\t");
                    for(int i = 0; i < splitMoreValues.length; i++){
                        if(splitMoreValues[i] != null){
                            switch (i) {
                            case 1:
                                try {
                                    thisVideo.setAverageRating(Double.parseDouble(splitMoreValues[i]));
                                } catch (NumberFormatException e) {
                                    thisVideo.setAverageRating(-1.0);
                                }
                                break;
                            case 2:
                                try {
                                    thisVideo.setNumVotes(Integer.parseInt(splitMoreValues[i]));
                                } catch (NumberFormatException e) {
                                    thisVideo.setNumVotes(-1);
                                }
                                break;
                        }
                    }
                }
            } catch(Exception e){
                System.err.println(e);
            }
            database.addVideo(thisVideo);
            //System.out.println(thisVideo.toString());        
        }
        catch (Exception e){
        if(line == null){
            System.out.println("Done reading files");
            in.close();
            in2.close();

        }

    }
    } 
    database.purgeBadVideos();
    System.out.println("Number of valid videos: " + database.getLength());
    System.out.println("Listing 20 videos:");
    database.listVideos(20);
    System.out.println("Top 10 highest rated videos:");
    database.getHighestRatedVideos(10);
    System.out.println("Rating distribution:");
    database.getRatingDistribution();
    }catch (Exception e) {
        System.err.println(e);
    }


    }
}    