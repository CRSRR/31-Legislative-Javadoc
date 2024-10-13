package eclipproj;

/**
 * This class represents a member with information and
 * provides methods to access and modify this information.
 */
public class Member {
    
    private String name;
    private int age;
    private String constituency;
    private String party;
    private String position;

    /**
     * Constructs a Member object with the specified details.
     *
     * @param name          The name of the member.
     * @param age           The age of the member.
     * @param constituency  The constituency the member represents.
     * @param party         The political party of the member.
     * @param position      The position held by the member.
     */
    public Member(String name, int age, String constituency, String party, String position) {
        this.name = name;
        this.age = age;
        this.constituency = constituency;
        this.party = party;
        this.position = position;
    }

    /**
     * Gets the name of the member.
     * @return The name of the member.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the age of the member.
     * @return The age of the member.
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the constituency represented by the member.
     * @return The constituency of the member.
     */
    public String getConstituency() {
        return constituency;
    }

    /**
     * Gets the political party of the member.
     * @return The political party of the member.
     */
    public String getParty() {
        return party;
    }

    /**
     * Gets the position held by the member.
     * @return The position of the member.
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the age of the member.
     * @param age The new age of the member.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the political party of the member.
     * @param party The new political party of the member.
     */
    public void setParty(String party) {
        this.party = party;
    }

    /**
     * Sets the position held by the member.
     * @param position The new position of the member.
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Displays the information of the created member
     */
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Constituency: " + constituency);
        System.out.println("Party: " + party);
        System.out.println("Position: " + position);
    }
}

