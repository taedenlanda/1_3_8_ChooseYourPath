import java.util.Scanner;

public class ChooseYourPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ending = ""; // Tracks the type of ending for the final message

        System.out.println("Welcome to the Jungle Adventure!");
        System.out.println(
                "You are standing at the entrance of a dense, mysterious jungle. It's rumored to contain a hidden treasure but also many dangers.");
        System.out.print("Do you want to enter the jungle? Type 'yes' or 'no': ");
        String choice1 = scanner.nextLine();

        if (choice1.equals("yes")) {
            System.out.println("\nYou step into the jungle, and the dense foliage quickly surrounds you.");

            // First decision point: Two paths
            System.out.print(
                    "You see two paths: one looks narrow and risky, the other wider and safer. Type 'narrow' or 'wide': ");
            String choice2 = scanner.nextLine();

            if (choice2.equals("narrow")) {
                System.out.println("\nYou take the narrow path. It's dark, and the sounds of the jungle grow louder.");

                // Second decision: Strange noise
                System.out.print("You hear a strange noise nearby. Do you 'investigate' or 'ignore' it? ");
                String choice3 = scanner.nextLine();

                if (choice3.equals("investigate")) {
                    System.out.println(
                            "\nYou find a strange old man who seems to be lost himself. He offers to guide you.");

                    // Third decision: Trust the old man
                    System.out.print(
                            "Do you trust him to guide you, or do you refuse his offer? Type 'trust' or 'refuse': ");
                    String choice4 = scanner.nextLine();

                    if (choice4.equals("trust")) {
                        System.out.println(
                                "\nThe old man leads you down a hidden path to an ancient ruin with a golden chest inside.");

                        // Fourth decision: Open the chest or leave it alone
                        System.out.print("Do you open the chest or leave it alone? Type 'open' or 'leave': ");
                        String choice5 = scanner.nextLine();

                        if (choice5.equals("open")) {
                            System.out.println(
                                    "\nInside, you find priceless artifacts and gold. Congratulations! You've found the hidden treasure!");
                            ending = "treasure";
                        } else {
                            System.out.println(
                                    "\nYou decide not to risk it. As you turn to leave, the old man disappears, and the path back vanishes. You are lost.");
                            ending = "lost";
                        }
                    } else {
                        System.out.println(
                                "\nYou decide not to trust him and move on alone. The jungle becomes thicker, and you eventually lose your way.");
                        ending = "lost";
                    }
                } else {
                    System.out.println("\nYou ignore the noise and keep moving, but soon encounter a steep cliff.");

                    // Third decision: Climb down or find another way
                    System.out
                            .print("Do you try to climb down the cliff or find another way? Type 'climb' or 'other': ");
                    String choice4 = scanner.nextLine();

                    if (choice4.equals("climb")) {
                        System.out.println(
                                "\nYou slip on the rocks and fall. The jungle takes its toll. You didn't survive.");
                        ending = "death";
                    } else {
                        System.out.println(
                                "\nYou find a hidden trail that seems safer. It leads you to a small clearing with ancient markings.");

                        // Fourth decision: Follow the trail or avoid it
                        System.out.print("Do you follow the trail or avoid it? Type 'follow' or 'avoid': ");
                        String choice5 = scanner.nextLine();

                        if (choice5.equals("follow")) {
                            System.out.println(
                                    "\nThe trail leads you to a hidden waterfall with a golden glimmer at the bottom. You've found the treasure!");
                            ending = "treasure";
                        } else {
                            System.out.println(
                                    "\nYou decide to avoid the trail, but soon realize you're hopelessly lost in the thick jungle.");
                            ending = "lost";
                        }
                    }
                }
            } else if (choice2.equals("wide")) {
                System.out.println(
                        "\nYou take the wide path, which seems safer. After a while, you come across a river.");

                // Second decision: Cross the river or walk along it
                System.out.print("Do you cross the river or follow it? Type 'cross' or 'follow': ");
                String choice3 = scanner.nextLine();

                if (choice3.equals("cross")) {
                    System.out.println("\nThe river current is strong, and you struggle to stay afloat.");

                    // Third decision: Fight the current or let it carry you
                    System.out.print(
                            "Do you fight the current or let it carry you downstream? Type 'fight' or 'let go': ");
                    String choice4 = scanner.nextLine();

                    if (choice4.equals("fight")) {
                        System.out.println("\nYou fight the current, but your strength fails, and you are swept away.");
                        ending = "death";
                    } else {
                        System.out.println(
                                "\nThe current carries you to a secluded area where you find an ancient statue holding a key.");

                        // Fourth decision: Take the key or leave it
                        System.out.print("Do you take the key or leave it? Type 'take' or 'leave': ");
                        String choice5 = scanner.nextLine();

                        if (choice5.equals("take")) {
                            System.out.println(
                                    "\nWith the key in hand, you explore further and find a hidden door in the rocks, leading to a chamber filled with treasure.");
                            ending = "treasure";
                        } else {
                            System.out.println(
                                    "\nYou leave the key and continue walking, but soon realize the jungle has trapped you. You are lost.");
                            ending = "lost";
                        }
                    }
                } else {
                    System.out.println("\nYou follow the riverbank, hoping it will lead you out of the jungle.");

                    // Third decision: Set up camp or keep moving
                    System.out.print(
                            "It’s getting dark. Do you set up camp for the night or keep moving? Type 'camp' or 'move': ");
                    String choice4 = scanner.nextLine();

                    if (choice4.equals("camp")) {
                        System.out.println(
                                "\nAs you set up camp, you hear rustling nearby and realize it's a wild animal. You have no way to defend yourself.");
                        ending = "death";
                    } else {
                        System.out.println(
                                "\nYou keep moving, but the darkness makes it hard to see. Eventually, you lose your way in the thick jungle.");
                        ending = "lost";
                    }
                }
            }
        } else if (choice1.equals("no")) {
            System.out.println(
                    "\nYou decide to stay outside the jungle, safe and sound. Maybe the treasure wasn’t worth the risk!");
            ending = "safe";
        }

        // Final message based on the type of ending
        System.out.println("\n--- Your Jungle Adventure Conclusion ---");
        if (ending.equals("treasure")) {
            System.out.println(
                    "Congratulations! You've found the hidden treasure worth billions of dollars and safely escaped the jungle!");
        } else if (ending.equals("lost")) {
            System.out.println(
                    "You wandered too far into the jungle and became hopelessly lost. It seems you will live in the jungle forever.");
        } else if (ending.equals("death")) {
            System.out.println("Your jungle adventure has come to an unfortunate end. The jungle can be unforgiving.");
        } else if (ending.equals("safe")) {
            System.out.println(
                    "You chose to stay safe outside the jungle. Maybe another adventure awaits you in the future.");
        }
    }
}