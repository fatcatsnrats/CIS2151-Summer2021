package project3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Project3 {

    private static ArrayList<ArrayList<Space>> gridSpace;
    private static Space space;
    private static Space space1;
    private static Space space2;
    private static Space space3;
    private static int i;
    private static int j;
    private static Player player;

    public static void main(String[] args) {
        i = 5;
        j = 0;
        player = new Player();
        game();

    }

    public static void game() {
        Island island = new Island();
        System.out.println(island);
        gridSpace = island.getGrid();
        direction();

    }

    public static void direction() {
        if (i >= 1) {
            space = gridSpace.get(i - 1).get(j);
            System.out.println("Above you is a ");
            System.out.println(space);
        }
        if (j <= 12) {
            space1 = gridSpace.get(i).get(j + 1);
            System.out.println("To the right of you is a ");
            System.out.println(space1);
        }
        if (i <= 10) {
            space2 = gridSpace.get(i + 1).get(j);
            System.out.println("Below you is a ");
            System.out.println(space2);
        }
        if (j >= 1) {
            space3 = gridSpace.get(i).get(j - 1);
            System.out.println("To the left of you is a ");
            System.out.println(space3);
        }
        
        System.out.println("What direction do you want to go to?");
        Scanner keyboard = new Scanner(System.in);
        String keyboardString = keyboard.nextLine();
        if (keyboardString.equalsIgnoreCase("Above")) {
            i--;
            spaceAction(space);
        } else if (keyboardString.equalsIgnoreCase("Below")) {
            i++;
            spaceAction(space2);
        } else if (keyboardString.equalsIgnoreCase("Right")) {
            j++;
            spaceAction(space1);
        } else if (keyboardString.equalsIgnoreCase("Left")) {
            j--;
            spaceAction(space3);
        }
    }

    public static void spaceAction(Space designatedSpace) {
        boolean temp;
        if (designatedSpace.getDescription().equalsIgnoreCase("Woodland")) {
            System.out.println("Do you want to chop, build, or go somewhere else?");
            Scanner keyboard = new Scanner(System.in);
            if (keyboard.nextLine().equalsIgnoreCase("chop")) {
                temp = designatedSpace.chop(player);
                if (!temp) {
                    System.out.println("You dont have to right tool!");
                    spaceAction(designatedSpace);
                } else {
                    direction();
                }
            } else if (keyboard.nextLine().equalsIgnoreCase("build")) {
                temp = designatedSpace.build(player);
                if (!temp) {
                    System.out.println("You dont have to right tool!");
                    spaceAction(designatedSpace);
                } else {
                    direction();
                }
            } else {
                direction();
            }
        } else if (designatedSpace.getDescription().equalsIgnoreCase("Empty")) {
            System.out.println("Do you want to dig, build, or go somewhere else?");
            Scanner keyboard = new Scanner(System.in);
            if (keyboard.nextLine().equalsIgnoreCase("dig")) {
                temp = designatedSpace.dig(player);
                if (!temp) {
                    System.out.println("You dont have to right tool!");
                    spaceAction(designatedSpace);
                } else {
                    direction();
                }
            } else if (keyboard.nextLine().equalsIgnoreCase("build")) {
                temp = designatedSpace.build(player);
                if (!temp) {
                    System.out.println("You dont have to right tool!");
                    spaceAction(designatedSpace);
                } else {
                    direction();
                }
            } else {
                direction();
            }
        } else {
            Random rand = new Random();
            Player player = new Player();
            int randInt2 = rand.nextInt(9);
            if (randInt2 <= 3) {
                player.setTools("axe");
                System.out.println("You picked up an Axe!");
                ///pickup axe
            } else if (randInt2 <= 6) {
                player.setTools("shovel");
                System.out.println("You picked up a Shovel!");
                ///pickup shovel
            } else {
                player.setTools("hammer");
                System.out.println("You picked up a Hammer!");
                //pickup hammer
            }
            designatedSpace.setDescription("Empty");
            direction();
        }
    }
}
