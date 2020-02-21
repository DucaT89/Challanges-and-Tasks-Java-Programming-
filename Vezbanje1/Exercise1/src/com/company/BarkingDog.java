package com.company;

public class BarkingDog {

    public static boolean ShouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking) {
            if (hourOfDay >= 0 && hourOfDay < 8) {
                return true;
            } else if (hourOfDay > 22) {
                return true;
            }
        }
         return false;
    }
}
