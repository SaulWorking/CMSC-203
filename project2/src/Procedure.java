
/**
 * Contains information for each procedure
 */

public class Procedure {
    private String procedureName;
    private String date;
    private double charge;
    private String practitionerName;

    /**
     * Constructor for patient procedure
     */
    public Procedure() {
        this.procedureName = "";
        this.date = "";
        this.charge = 0.0;
        this.practitionerName = "";
    }
    /**
     * Constructor for patient procedure
     * @param procedureName the procedure name
     * @param date the procedure date
     */
    public Procedure(String procedureName, String date) {
        this.procedureName = procedureName;
        this.date = date;
        this.charge = 0.0;
        this.practitionerName = "";
    }
    /**
     * Constructor for patient procedure
     * @param procedureName the procedure name
     * @param date	the procedure date
     * @param charge the procedure charge
     * @param practitionerName the practitioner name
     */
    public Procedure(String procedureName, String date, double charge, String practitionerName) {
	this(procedureName, date);
        this.charge = charge;
        this.practitionerName = practitionerName;
    }
    /**
     * Returns procedure name
     * @return procedureName the procedure name
     */
    public String getProcedureName() { return procedureName; }
    /**
     * Returns procedure date
     * @return date the procedure date
     */
    public String getDate() { return date; }
    /**
     * Returns procedure cost
     * @return charge the procedure cost
     */
    public double getCharge() { return charge; }
    /**
     * Returns practitioner's name
     * @return practitionerName the practitioner's name
     */
    public String getPractitionerName() { return practitionerName; }
    /**
     * Sets procedure name
     * @param procedureName the procedure's name
     */

    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
    /**
     * Sets procedure date
     * @param date the procedure's date
     */
    public void setDate(String date) { this.date = date; }
    /**
     * Sets procedure cost
     * @param charge the procedure's cost
     */
    public void setCharge(double charge) { this.charge = charge; }
    /**
     * Sets practitioner's name
     * @param practitionerName the practitioner's name
     */
    public void setPractitionerName(String practitionerName) { this.practitionerName = practitionerName; }

	@Override
	public String toString() {
        return "\tProcedure: " + getProcedureName() + '\n' +
               "\tDate: " + getDate() + '\n' +
               "\tCharge: $" + getCharge() + '\n' +
               "\tPractitioner: " + getPractitionerName() + '\n';
    }
}
