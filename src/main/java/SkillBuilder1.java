import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine

        system.out.printLn("Enter a floating-point number:")
        double spice = input.nextDouble();
        double mathVal = ((4.0/3.0) * Math.pow(2), sqrt(5)/Math.pow(spice,3)));
        double finalValue = (int)(100.0*mathVal) / 100.0;

        System.out.println("Well %'s, the spice value resulted in %.4f\n",name, mathVal);
        System.out.println("And the converted value is %.2f\n", finalValue);

    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        double wallArea = wallHieght * wallWidth;
        double gallonsNeeded = wallArea/ squareFeetPerGallons;
        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        int cansNeeded = (int) Math.ceil(gallonsNeeded / gallonsPerCans);
        System.out.println("wall area: " + (int)wallArea + "square feet");
        System.out.println("Paint needed: %.2f gallons\n", gallonsNeeded);
        System.out.println("Cans needed: " + cansNeeded + "can(s)");

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
    }
}
