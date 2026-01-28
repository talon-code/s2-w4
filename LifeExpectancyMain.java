import java.io.IOException;

public class LifeExpectancyMain {
    
    /**
     * Main method to demonstrate usage
     */
    public static void main(String[] args) {
        LifeExpectancyAnalyzer analyzer = new LifeExpectancyAnalyzer();

        try {
            // Read the data file
            analyzer.readFromFile("life-expectancy-data.csv");

            // Display various analyses
            // analyzer.displayAllCountries();
            // analyzer.displayByRegion("Asia");
             analyzer.displayStatistics();

        } catch (IOException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
