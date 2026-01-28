import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * Demonstrates reading data from a CSV file using Scanner
 * Creates an ArrayList of Country objects
 * Week 4: ArrayList + Scanner + File I/O
 */
public class LifeExpectancyAnalyzer {
    private ArrayList<Country> countries;

    /**
     * Constructor initializes an empty ArrayList
     */
    public LifeExpectancyAnalyzer() {
        countries = new ArrayList<Country>();
    }

    /**
     * Reads country data from a CSV file and populates the ArrayList
     * CSV format: country,region,population,income_group,life_expectancy_2010,life_expectancy_2015,life_expectancy_2020
     * 
     * @param filename path to the CSV file
     * @throws IOFoundException if the file is not found
     */


    //in order to deal with scanner, have to deal with exception
    //if error, throughs exception back, which is caught in the main class
    public void readFromFile(String filename) throws IOException {
        File f = new File(filename);
        Scanner s = new Scanner(f);
        s.nextLine();

        //try {
        //     File f = new File(filename);
        // Scanner s = new Scanner(f);
        // } catch(Exception e){
        //     System.out.println("couldn't read file");
        // }

        while(s.hasNextLine()){
            String line = s.nextLine();
            String[] items = line.split(",");
            Country temp = new Country(items[0], 
                                    items[1], 
                                    Integer.parseInt(items[2]), 
                                    items[3], 
                                    Double.parseDouble(items[4]), 
                                    Double.parseDouble(items[5]), 
                                    Double.parseDouble(items[6]));
            countries.add(temp);
        }
        System.out.println(countries.size());
        s.close();
    }

    /**
     * Display all countries in the list
     */
    public void displayAllCountries() {
        for(Country c: countries){
            System.out.println(c.getName());
        }
    }

    /**
     * Display countries from a specific region
     * @param region the region to filter by
     */
    public void displayByRegion(String region) {
        for(Country c: countries){
            if(c.getRegion().equals(region))
            System.out.println(c.getName());
        }
    }

    /**
     * Find the country with the highest life expectancy in 2020
     * @return the Country with the highest life expectancy, or null if list is empty
     */
    public Country findHighestLifeExpectancy() {
        if(countries.size() == 0)
            return null;
       Country highest = countries.get(0);
        
        for(Country c: countries){
            if(c.getLifeExpectancy2020() > highest.getLifeExpectancy2020());
                highest = c;
        }

        return highest;

    }

    /**
     * Find the country with the lowest life expectancy in 2020
     * @return the Country with the lowest life expectancy, or null if list is empty
     */
    public Country findLowestLifeExpectancy() {
        if(countries.size() == 0)
            return null;
       Country lowest = countries.get(0);
        
        for(Country c: countries){
            if(c.getLifeExpectancy2020() < lowest.getLifeExpectancy2020());
                lowest = c;
        }

        return lowest;
    }

    /**
     * Calculate the average life expectancy across all countries
     * @return average life expectancy in 2020, or 0 if list is empty
     */
    public double calculateAverageLifeExpectancy() {
        if(countries.size() == 0)
            return 0;
        double sum = 0;
        for(Country c: countries){
            sum += c.getLifeExpectancy2020();
        }
        return sum / countries.size();
    }

    /**
     * Count how many countries are in a specific income group
     * @param incomeGroup the income group to count
     * @return number of countries in that income group
     */
    public int countByIncomeGroup(String incomeGroup) {
        int count = 0;
        for(Country c: countries){
            if(c.getIncomeGroup().equals(incomeGroup))
                count++;
        }
        return count;
    }

    /**
     * Find the country with the most improvement in life expectancy (2010 to 2020)
     * @return the Country with the largest improvement, or null if list is empty
     */
    public Country findMostImprovement() {
        if(countries.size() == 0)
            return null;

        Country dif = countries.get(0);

        for(Country c: countries){
            if(c.getLifeExpectancy2020() - c.getLifeExpectancy2010() > dif.getLifeExpectancy2020() - dif.getLifeExpectancy2010()){
                dif = c;
            }
        }
        return dif;
    }

    /**
     * Display summary statistics
     */
    public void displayStatistics() {
        System.out.println("Highest Life Expectancy 2020: " + this.findHighestLifeExpectancy());
        System.out.println("Lowest Life Expectancy 2020: " + this.findLowestLifeExpectancy());
        System.out.println("Average Life Expectancy 2020: " + this.calculateAverageLifeExpectancy());
        System.out.println("Most Improved: " + this.findMostImprovement());

    }

}
