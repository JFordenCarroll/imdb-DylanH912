package reader;
import java.util.TreeMap;

public class database {

    private TreeMap<String, VideoObj> videoList;

    public database() {
        videoList = new TreeMap<>();
    }

    public void addVideo(VideoObj video) {
        videoList.put(video.getTconst(), video);
    }

    public VideoObj getVideo(String tConst){
    return videoList.get(tConst);
    }

    public void purgeBadVideos() {
    // Remove videos from videoList that are considered "bad" or invalid.
    // Think about what makes a video "bad" in this context...
         videoList.values().removeIf(video -> video.getAverageRating() < 0 || video.getNumVotes() < 0 || video.getPrimaryTitle() == null || video.getStartYear() < 0);
    }

    public void listVideos(int amount) {
        // Print up to 'amount' videos from the videoList.
        // For each video, use the toString() function you wrote in your VideoObj class to display its information.
        for(int i = 0; i < amount && i < videoList.size(); i++) {
            System.out.println(videoList.values().toArray()[i].toString());
        }
    }
    public int getLength(){
    // Return the number of videos currently stored in the videoList.
    return videoList.size();
    }

    public void getHighestRatedVideos(int amount) {
    /*
     * This function should print out the top 'amount' videos with the highest average ratings.
     * A "highest rated" video is one with a higher average rating compared to others.
     * You should sort the videos by their average rating (highest first), then print the top N.
     * For each video, use the toString() function you wrote in your VideoObj class to display its information.
     *
     * Example: If amount is 5, print the 5 videos with the highest ratings.
     */
        videoList.values().stream()
                .sorted((v1, v2) -> Double.compare(v2.getAverageRating(), v1.getAverageRating()))
                .limit(amount)
                .forEach(video -> System.out.println(video.toString()));
    }
    // 
    public void getRatingDistribution(){
    /*
     * This function should calculate and print the distribution of movie ratings.
     * A "distribution" shows how data is spread across different categories or values.
     * In this case, it means showing what percentage of movies have each possible rating (0 to 10).
     * For example, you might find that 20% of movies have a rating of 7, 10% have a rating of 8, etc.
     * This helps you see which ratings are most common in your dataset.
     * The function should count how many movies have each rating, then print the percentage for each rating.
     */
    // Use the following print line for the results.
        int[] ratingCount = new int[11];
        double percentage;
        double totalMovies = videoList.size();
        VideoObj[] videos = videoList.values().toArray(new VideoObj[0]);
    for(int i = 0; i < totalMovies; i++) {
        int roundedRating = (int) Math.round((double) videos[i].getAverageRating());
        switch(roundedRating) {
            case 0:
                ratingCount[0]++;
                break;
            case 1:
                ratingCount[1]++;
                break;
            case 2:
                ratingCount[2]++;
                break;
            case 3:
                ratingCount[3]++;
                break;
            case 4:
                ratingCount[4]++;
                break;
            case 5:
                ratingCount[5]++;
                break;
            case 6:
                ratingCount[6]++;
                break;
            case 7:
                ratingCount[7]++;
                break;
            case 8:
                ratingCount[8]++;
                break;
            case 9:
                ratingCount[9]++;
                break;
            case 10:
                ratingCount[10]++;
                break;
        }
       // System.out.println("Counting movie: " + (i+1));
    }


        for(int i = 0; i < ratingCount.length; i++) {
            percentage = (ratingCount[i] / totalMovies) * 100;
            System.out.printf("%.2f%% of movies had a rating of: %d%n", percentage, i);
        }

    }
}
