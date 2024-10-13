package eclipproj;

/**
 * This class represents a bill with a title, description, proposer, 
 * date introduced, and a status indicating its current state.
 */
public class Bill {

    /**
     * Enum representing the possible statuses of a bill.
     */
    public enum BillStatus {
        PROPOSED,
        PENDING,
        APPROVED,
        REJECTED
    }

    // Private member variables
    private String title;
    private String description;
    private String proposer;
    private String dateIntroduced;
    private BillStatus status;

    /**
     * Constructs a Bill object with the specified title, description, proposer, 
     * date introduced, and status.
     *
     * @param title           The title of the bill.
     * @param description     A brief description of the bill.
     * @param proposer        The name of the person or entity proposing the bill.
     * @param dateIntroduced  The date the bill was introduced.
     * @param status          The current status of the bill (e.g., proposed, passed, rejected).
     */
    public Bill(String title, String description, String proposer, String dateIntroduced, BillStatus status) {
        this.title = title;
        this.description = description;
        this.proposer = proposer;
        this.dateIntroduced = dateIntroduced;
        this.status = status;
    }

    /**
     * Gets the title of the bill.
     *
     * @return The title of the bill.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the description of the bill.
     *
     * @return The description of the bill.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the proposer of the bill.
     *
     * @return The name of the person or entity proposing the bill.
     */
    public String getProposer() {
        return proposer;
    }

    /**
     * Gets the date the bill was introduced.
     *
     * @return The date the bill was introduced.
     */
    public String getDateIntroduced() {
        return dateIntroduced;
    }

    /**
     * Gets the current status of the bill.
     *
     * @return The current status of the bill.
     */
    public BillStatus getStatus() {
        return status;
    }

    /**
     * Sets the status of the bill.
     * @param status The new status of the bill.
     */
    public void setStatus(BillStatus status) {
        this.status = status;
    }

    /**
     * Displays information about created bill
     */
    public void displayInfo() {
        System.out.println("Bill Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Proposer: " + proposer);
        System.out.println("Date Introduced: " + dateIntroduced);
        System.out.println("Status: " + status);
    }
}
