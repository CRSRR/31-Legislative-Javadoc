package eclipproj;

import java.util.ArrayList;
import java.util.List;

/**
 * class represents a session with a specific date, start time, end time, 
 * agenda, and a list of topics to be discussed during the session
 */
public class Session {
    
    // Private member variables
    private String sessionDate; 
    private int startHour; 
    private int startMinute; 
    private int endHour; 
    private int endMinute; 
    private String agenda;
    private List<String> topicsOfDiscussion;

    /**
     * Constructs a Session object with the specified date, start time, end time, 
     * and agenda.
     *
     * @param sessionDate   The date of the session
     * @param startHour     The hour when the session starts (0-23)
     * @param startMinute   The minute when the session starts (0-59)
     * @param endHour       The hour when the session ends (0-23)
     * @param endMinute     The minute when the session ends (0-59)
     * @param agenda        The agenda of the session.
     */
    public Session(String sessionDate, int startHour, int startMinute, int endHour, int endMinute, String agenda) {
        this.sessionDate = sessionDate;
        setStartHour(startHour); 
        setStartMinute(startMinute); 
        setEndHour(endHour); 
        setEndMinute(endMinute); 
        this.agenda = agenda;
        this.topicsOfDiscussion = new ArrayList<>();
    }

    /**
     * Sets the start hour of the session.
     *
     * @param startHour The hour when the session starts (0-23).
     * @throws IllegalArgumentException if the startHour is not between 0 and 23.
     */
    public void setStartHour(int startHour) {
        if (startHour < 0 || startHour > 23) {
            throw new IllegalArgumentException("Start hour must be between 0 and 23.");
        }
        this.startHour = startHour;
    }

    /**
     * Sets the start minute of the session.
     *
     * @param startMinute The minute when the session starts (0-59).
     * @throws IllegalArgumentException if the startMinute is not between 0 and 59.
     */
    public void setStartMinute(int startMinute) {
        if (startMinute < 0 || startMinute > 59) {
            throw new IllegalArgumentException("Start minute must be between 0 and 59.");
        }
        this.startMinute = startMinute;
    }

    /**
     * Sets the end hour of the session.
     *
     * @param endHour The hour when the session ends (0-23).
     * @throws IllegalArgumentException if the endHour is not between 0 and 23.
     */
    public void setEndHour(int endHour) {
        if (endHour < 0 || endHour > 23) {
            throw new IllegalArgumentException("End hour must be between 0 and 23.");
        }
        this.endHour = endHour;
    }

    /**
     * Sets the end minute of the session.
     *
     * @param endMinute The minute when the session ends (0-59).
     * @throws IllegalArgumentException if the endMinute is not between 0 and 59.
     */
    public void setEndMinute(int endMinute) {
        if (endMinute < 0 || endMinute > 59) {
            throw new IllegalArgumentException("End minute must be between 0 and 59.");
        }
        this.endMinute = endMinute;
    }

    /**
     * Adds a topic of discussion to the session's list of topics.
     *
     * @param topic The topic to be added to the discussion list.
     */
    public void addTopicOfDiscussion(String topic) {
        topicsOfDiscussion.add(topic);
    }

    /**
     * Gets the agenda of the session.
     *
     * @return The agenda of the session.
     */
    public String getAgenda() {
        return agenda;
    }

    /**
     * Displays information about the session, including the date, start time, 
     * end time, agenda, and topics of discussion.
     */
    public void displayInfo() {
        System.out.println("Session Date: " + sessionDate);
        System.out.printf("Start Time: %02d:%02d\n", startHour, startMinute);
        System.out.printf("End Time: %02d:%02d\n", endHour, endMinute);
        System.out.println("Agenda: " + agenda);
        System.out.println("Topics of Discussion:");
        for (String topic : topicsOfDiscussion) {
            System.out.println(" - " + topic);
        }
    }
}
