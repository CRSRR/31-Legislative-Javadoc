package eclipproj;

import java.util.ArrayList;
import java.util.List;

/**
 * class represents a constituency, allowing members to be added 
 * and displaying the constituency details along with its members.
 */
public class Constituency {
    
    private String name;
    private List<Member> members;

    /**
     * Constructs a Constituency object with the specified name.
     * @param name The name of the constituency.
     */
    public Constituency(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    /**
     * Gets the name of the constituency.
     * @return The name of the constituency.
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a member to the constituency.
     * @param member The member to be added to the constituency.
     */
    public void addMember(Member member) {
        members.add(member);
    }

    /**
     * Displays the details of the constituency, including the name 
    */
    public void displayInfo() {
        System.out.println("Constituency: " + name);
        System.out.println("Members:");
        for (Member member : members) {
            member.displayInfo();
        }
    }
}