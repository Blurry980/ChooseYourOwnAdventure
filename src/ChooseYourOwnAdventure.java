import java.util.Scanner;

// I would love to make an actual longer version at some point.
// It would include adventurer's life, stamina, hunger... etc

public class ChooseYourOwnAdventure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Endless Maze. Your goal, is to get out alive. Good luck, you're going to need it.");
        System.out.println();
        System.out.println("You wake up in a cold, dark room. You have no idea where you are or what you're even doing here. \n" +
                "In front of you, there is a closed chest. Inside are two weapons: a knife, a pistol, and a grenade.\n" +
                "Unfortunately, there is also a note. It says, that you can only take one. Which should you take?\n" +
                "Type either 'knife' or 'pistol' ");

        String choice1 = scan.nextLine();
        if (choice1.equalsIgnoreCase("pistol")) {
            System.out.println("Good choice.");
            System.out.println("After walking down a long, winding tunnel, you come to circular arena-like room. As you enter the arena, the doors shut behind you, and you find yourself facing a skeleton warrior holding a long spear. \n" +
                    "Type 'fight' or 'talk'");
            String choice2 = scan.nextLine();
            if (choice2.equalsIgnoreCase("talk")) {
                System.out.println("The skeleton looks at you calmly.Now your adventure truly begins.");
                System.out.println("The end for now.");
            } else {
                System.out.println("You are killed by an angry skeleton. Game Over");
            }
        } else {
            System.out.println("You chose wrong. Game over.");
        }
    }
}
