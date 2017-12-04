
/**
 * Write a description of class CollegeGroup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.List;

public class CollegeGroup
{
    // instance variables - replace the example below with your own
    private College[] myColleges;
    
    List<College> colleges;
    
    /**
     * Constructor for objects of class CollegeGroup
     */
    public CollegeGroup() {
        this.colleges = new ArrayList<College>();
    }

    /**
     * Adds a college to a list of colleges
     * 
     * @param college The college that will be added to the list
     */
    public void add(College college) {
        colleges.add(college);
    }
    
    /**
     * Gives an array list containing colleges
     * 
     * @return An array list of colleges
     */
    public List<College> getCollegeGroup() {
        return colleges;
    }
        
    /**
     * Changes the tuition of a college
     *
     * @param collegeName The college that will be changed
     * @param newTuition The new tuition
     */
    public void updateTuition(String collegeName, int newTuition) {
        for (College c : colleges) {
            if (c.getName().equals(collegeName)) {
                c.setTuition(newTuition);
            }
        }
    }
    
    /**
     * Shows each college with the given requirements
     *
     * @param region The desired region
     * @param low The lowest desired tuition
     * @param high The highest desired tuition
     * @return A list of every college that fits the given requirements
     */
    public College[] getCollegeList(String region, int low, int high) {
        int count = 0;
        for (College c : colleges) {
            if (c.getRegion().equals(region) && c.getTuition() >= low && c.getTuition() <= high) {
                count++;
            }
        }
        College[] result = new College[count];
        int counttwo = 0;
        for (College c : colleges) {
            if (c.getRegion().equals(region) && c.getTuition() >= low && c.getTuition() <= high) {
                result[counttwo] = c;
                counttwo++;
            }
        }
        return result;
    }
}
