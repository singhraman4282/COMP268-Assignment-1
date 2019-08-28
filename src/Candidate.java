import java.util.ArrayList;

public class Candidate extends AddressBook {

    private boolean innovation;
    private double grade;
    private double regulation;
    private String communication;

    /**
     * Initialzer
     */
    public Candidate(String fn, String ln, boolean innov, double grade, double reg, String comm) {
        super(fn, "", ln);
        this.innovation = innov;
        this.grade = grade;
        this.regulation = reg;
        this.communication = comm;
    }

    /**
     * returns an arraylist of all elgiible candidates
     * @param cands Candidate[]
     * @return ArrayList<Candidate>
     */
    public static ArrayList<Candidate> getEligibleCandidates(Candidate[] cands) {
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        for (Candidate cand : cands) {
            if (cand.getGrade() >= 85) {
                candidates.add(cand);
            } else {
                if (cand.getRegulation() >= 0.5) {
                    if (cand.getCommunication() == "average" || cand.getCommunication() == "excellent") {
                        candidates.add(cand);
                    } else if (cand.isInnovative()) {
                        candidates.add(cand);
                    }
                }
            }

        }
        return candidates;
    }

    /**
     * returns whether the candidate is innovative
     * @return boolean value
     */
    public boolean isInnovative() {
        return innovation;
    }

    /**
     * sets isInnovative property for a candidate
     * @param innovation boolean
     */
    public void setInnovation(boolean innovation) {
        this.innovation = innovation;
    }

    /**
     * returns candidate's grades
     * @return double
     */
    public double getGrade() {
        return grade;
    }

    /**
     * sets condidate's grades
     * @param grade double
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * returns candidate's regulation
     * @return double
     */
    public double getRegulation() {
        return regulation;
    }

    /**
     * sets candidate regulation
     * @param regulation double
     */
    public void setRegulation(double regulation) {
        this.regulation = regulation;
    }

    /**
     * retunrs candidate communication
     * @return String
     */
    public String getCommunication() {
        return communication;
    }

    /**
     * sets candidate communication
     * @param communication String
     */
    public void setCommunication(String communication) {
        this.communication = communication;
    }

}
