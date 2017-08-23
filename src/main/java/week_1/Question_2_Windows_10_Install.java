package week_1;

import static input.InputUtils.*;

/**
 To upgrade to Windows 10, a computer needs to have:

 •	Either Windows 7 OR Windows 8 installed
 •	1 GHz or faster processor
 •	2 GB or more RAM

 Write a program that asks the user for the current version of their
 operating system, the CPU speed, and amount of RAM.

 Use && and || in conditions to display a message telling the user
 if they are able to install Windows 10.

 */

public class Question_2_Windows_10_Install {

    public static void main(String[] args) {

        String currentOS = stringInput("What is your current operating system?");
        double processorSpeed = doubleInput("What is your current processor speed, in GHz?");
        double ram = doubleInput("How much RAM do you have, in GB?");

        boolean canUpgradeToWindows10 = checkWindows10SystemRequirements(currentOS, processorSpeed, ram);

        if (canUpgradeToWindows10) {
            System.out.println("You can upgrade Windows 10");
        } else {
            System.out.println("Sorry, you can't upgrade to Windows 10");
        }

    }

    public static boolean checkWindows10SystemRequirements(String currentOS, double processorSpeed, double ram) {

        // The computer can be upgraded only if ALL the conditions are met.
        // The two valid currentOS values are the exact Strings "Windows 7" or "Windows 8"
        // Return true if the computer can be upgraded
        // Return false if the computer can't be upgraded.
        boolean result = false,validOS = false,validProcessor = false,validRam = false;

        if (currentOS.equals("Windows 7") || currentOS.equals("Windows 8")){
            validOS = true;
        }
        if (processorSpeed >= 1){
            validProcessor = true;
        }
        if(ram >= 2){
            validRam = true;
        }
        if(validOS&&validProcessor&&validRam){
            result = true;
        }
        return result;

    }
}
