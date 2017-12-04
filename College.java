
/**
 * Write a description of class College here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class College
{
    // instance variables - replace the example below with your own
    String name;
    String region;
    int tuition;

    /**
     * Constructor for objects of class College
     */
    public College(String name, String region, int tuition)
    {
        this.name = name;
        this.region = region;
        this.tuition = tuition;
    }

    /**
     * Finds the college's name
     *
     * @return The college's name
     */
    public String getName() {
        return name;
    }


    /**
     * Finds the college's region
     *
     * @return The college's region
     */
    public String getRegion() {
        return region;
    }


    /**
     * Finds the college's tuition
     *
     * @return The college's tuition
     */
    public int getTuition() {
        return tuition;
    }


    /**
     * Changes the college's tuition
     * 
     * @param newTuition The new tuition
     */
    public void setTuition (int newTuition) {
        this.tuition = newTuition;
    }
}
