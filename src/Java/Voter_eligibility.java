package Java;

public class Voter_eligibility {
    public static void main(String[] args) {
        System.out.println("If the age of the person is greater than 20 then he is eligible for the voting");

        int age = 20;
        if (age > 20) {
            System.out.println("Person is now eligible for the Voting");
        } else if (age <= 20) {
            System.out.println("Sent to the Age review department is he eligible ?");
        } else {
            System.out.println("Not eligilbe for the voting");
        }
    }



}
