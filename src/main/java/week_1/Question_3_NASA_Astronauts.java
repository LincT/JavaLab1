package week_1;

import static input.InputUtils.doubleInput;

/**
 * To become a NASA astronaut, you need to be between 58 and 76 inches tall, so you
 * are not too tall to fit in the spaceship, but are tall enough to can reach all the controls.

 You also need to be able to swim at least 75 meters when you make a water landing on return to earth.

 Write a program to ask the user questions about their height and swimming ability,
 and then use conditional statements to determine if they have potential as a NASA astronaut.

 There are many ways of doing this too - once you've written and tested a solution,
 can you think of another way of doing it? Make sure your tests still pass.

 */
public class Question_3_NASA_Astronauts {

    public static void main(String[] args) {

        double height = doubleInput("How tall are you, in inches?");
        double swimDistance = doubleInput("How far can you swim, in meters?");

        boolean astronautPotential = checkAstronautQualifications(height, swimDistance);

        if (astronautPotential) {
            System.out.println("You have astronaut potential");
        } else {
            System.out.println("Sorry, you don't meet the NASA qualifications.");
        }

    }

    public static boolean checkAstronautQualifications(double height, double swimDistance) {


        boolean validHeight = false,validSwimDistance = false,result = false;
        // return a boolean value representing whether the user meets these qualifications
        if (58<=height&&height<=76){
            validHeight = true;
        }
        if (swimDistance>= 75){
            validSwimDistance = true;
        }

        if(validHeight && validSwimDistance){
            result = true;
        }

        return result;


    }

}
