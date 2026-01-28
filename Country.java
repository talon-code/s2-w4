/**
 * Represents a country with life expectancy data
 * Used in Week 4: Reading Data with Scanner and ArrayList
 */
public class Country {
    private String name;
    private String region;
    private int population;  // in thousands
    private String incomeGroup;
    private double lifeExpectancy2010;
    private double lifeExpectancy2015;
    private double lifeExpectancy2020;

    /**
     * Constructor for Country
     * @param name country name
     * @param region geographic region
     * @param population population in thousands
     * @param incomeGroup income classification (low, lower-middle, upper-middle, high)
     * @param le2010 life expectancy in 2010
     * @param le2015 life expectancy in 2015
     * @param le2020 life expectancy in 2020
     */
    public Country(String name, String region, int population, String incomeGroup,
                   double le2010, double le2015, double le2020) {
        this.name = name;
        this.region = region;
        this.population = population;
        this.incomeGroup = incomeGroup;
        this.lifeExpectancy2010 = le2010;
        this.lifeExpectancy2015 = le2015;
        this.lifeExpectancy2020 = le2020;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public int getPopulation() {
        return population;
    }

    public String getIncomeGroup() {
        return incomeGroup;
    }

    public double getLifeExpectancy2010() {
        return lifeExpectancy2010;
    }

    public double getLifeExpectancy2015() {
        return lifeExpectancy2015;
    }

    public double getLifeExpectancy2020() {
        return lifeExpectancy2020;
    }

    /**
     * Calculate the change in life expectancy from 2010 to 2020
     * @return change in years
     */
    public double getChange2010To2020() {
        
    }

    /**
     * Calculate the average life expectancy across the three data points
     * @return average life expectancy
     */
    public double getAverageLifeExpectancy() {
        
    }

    /**
     * Check if a country is in a high-income group
     * @return true if high income, false otherwise
     */
    public boolean isHighIncome() {
        
    }

    /**
     * String representation of Country
     * Format: Country Name (Region) - 2020 Life Expectancy: XX.X years
     */

    public String toString() {
       return this.name + " (" + this.region + ") - Population: " + this.population + " - Income Group: " + incomeGroup + 
       " - 2010 Life Expectancy: " + this.lifeExpectancy2010 + " - 2015 Life Expectancy: " + this.lifeExpectancy2015 + " - 2020 Life Expectancy: " + this.lifeExpectancy2020;
    }


}
