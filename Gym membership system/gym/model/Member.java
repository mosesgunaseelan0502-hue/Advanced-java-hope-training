package gym.model;

public class Member {

    private String name;
    private String plan;
    private int validity;
    private String status;
    private String payment;
    private String trainer;

    public Member(String name, String plan, int validity, String status, String payment, String trainer) {
        this.name = name;
        this.plan = plan;
        this.validity = validity;
        this.status = status;
        this.payment = payment;
        this.trainer = trainer;
    }

    public String getName() {
        return name;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
}