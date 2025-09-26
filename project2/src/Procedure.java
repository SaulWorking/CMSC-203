public class Procedure {
    private String procedureName;
    private String date;
    private double charge;
    private String practitionerName;

    public Procedure() {
        this.procedureName = "";
        this.date = "";
        this.charge = 0.0;
        this.practitionerName = "";
    }

    public Procedure(String procedureName, String date) {
        this.procedureName = procedureName;
        this.date = date;
        this.charge = 0.0;
        this.practitionerName = "";
    }

    public Procedure(String procedureName, String date, double charge, String practitionerName) {
        this.procedureName = procedureName;
        this.date = date;
        this.charge = charge;
        this.practitionerName = practitionerName;
    }

    public String getProcedureName() { return procedureName; }
    public String getDate() { return date; }
    public double getCharge() { return charge; }
    public String getPractitionerName() { return practitionerName; }

    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
    public void setDate(String date) { this.date = date; }
    public void setCharge(double charge) { this.charge = charge; }
    public void setPractitionerName(String practitionerName) { this.practitionerName = practitionerName; }

	@Override
	public String toString() {
        return "Procedure Information:\n" +
               "Procedure Name: " + getProcedureName() + "\n" +
               "Date: " + getDate() + "\n" +
               "Charge: $" + getCharge() + "\n" +
               "Practitioner: " + getPractitionerName();
    }
}