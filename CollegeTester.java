
/**
 * Write a description of class CollegeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollegeTester {
    public static void main (String[] args) {
        College c1 = new College("Colgate University", "Northeast", 27025);
        College c2 = new College("Duke University", "Southeast", 26000);
        College c3 = new College("Kalamazoo College", "Midwest", 19764);
        College c4 = new College("Stanford University", "West", 25917);
        College c5 = new College("Florida International University", "Southeast", 10800);
        College c6 = new College("Dartmouth College", "Northeast", 27764);
        College c7 = new College("Spelman College", "Southeast", 11455);
        
        CollegeGroup group = new CollegeGroup();
        group.add(c1);
        group.add(c2);
        group.add(c3);
        group.add(c4);
        group.add(c5);
        group.add(c6);
        group.add(c7);
        
        for (College c : group.getCollegeGroup()) {
              System.out.print(c.getName() + ", ");
              System.out.print(c.getRegion() + ", ");
              System.out.println(c.getTuition());
        }
        System.out.println();
        group.updateTuition("Colgate University", 27500);
        for (College c : group.getCollegeGroup()) {
              if (c.getName().equals("Colgate University")) {
                  System.out.print(c.getName() + ", ");
                  System.out.print(c.getRegion() + ", ");
                  System.out.println(c.getTuition());      
                  System.out.println();
              }
        }
        
        College[] list = group.getCollegeList("Southeast", 10000, 20000);
        CollegeGroup list1 = new CollegeGroup();
        for (College c : list) {
            list1.add(c);
        }
        
        for (College c : list1.getCollegeGroup()) {
            System.out.print(c.getName() + ", ");
            System.out.print(c.getRegion() + ", ");
            System.out.println(c.getTuition());
        }
    }
}
