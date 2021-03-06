package yahtzee.domain;

/**
 * Corresponds with a row in User table.
 * 
 * @author pertjenn
 */
public class User {
    private final String username;
    private int highScore;
    private int lowScore;
    private int gamesPlayed;
    
    /**
     * Creates a new user with zero values.
     * 
     * @param username Input by user.
     */
    public User(String username) {
        this(username, 0, 421, 0); // 421 = max possible score + 1
    }
    
    /**
     * Creates a new instance of an existing user.
     * 
     * @param username Input by user.
     * @param hs Highscore associated with existing user.
     * @param ls Lowscore associated with existing user.
     * @param gp Number of games played by existing user.
     */
    public User(String username, int hs, int ls, int gp) {
        this.username = username;
        this.highScore = hs;
        this.lowScore = ls;
        this.gamesPlayed = gp;
    }
    
    public String getUsername() {
        return username;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int points) {
        this.highScore = points;
    }

    public int getLowScore() {
        return lowScore;
    }

    public void setLowScore(int lowScore) {
        this.lowScore = lowScore;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    /**
     * Updates the number of games played by the current user.
     */
    public void play() {
        this.gamesPlayed++;
    }
    
    /**
     * Used in unit testing.
     * 
     * @return 
     */
    @Override
    public String toString() {
        return username + ", " + highScore + ", " + lowScore + ", " + gamesPlayed;
    }
}
