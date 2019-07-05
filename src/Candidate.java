import java.util.ArrayList;

public class Candidate extends AddressBook {

    private boolean innovation;
    private double grade;
    private double regulation;
    private String communication;

    public Candidate(String fn, String ln, boolean innov, double grade, double reg, String comm) {
        super(fn, "", ln);
        this.innovation = innov;
        this.grade = grade;
        this.regulation = reg;
        this.communication = comm;
    }

    public static ArrayList<Candidate> getEligible

    public boolean isInnovative() {
        return innovation;
    }

    public void setInnovation(boolean innovation) {
        this.innovation = innovation;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getRegulation() {
        return regulation;
    }

    public void setRegulation(double regulation) {
        this.regulation = regulation;
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

}
