public class Student {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double gpa;
    private boolean inClub;

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isInClub() {
        return inClub;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setInClub(boolean inClub) {
        this.inClub = inClub;
    }

    // Constructor
    public Student(String first, String last, int gradYear, double gpa, boolean inClub) {
        firstName = first;
        lastName = last;
        this.gradYear = gradYear;
        this.gpa = gpa;
        this.inClub = inClub;
    }

    // Add getter and setter methods for ALL instance variables here!

    public String studentInfo() {
        return "first name: " + firstName + ", last name: " + lastName +
                ", grad year: " + gradYear + ", gpa: " + gpa +
                ", is in club: " + inClub;
    }
}
