package milespergallon;

/******************************************************************************
 * MilesPerGallon.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This program calculates miles per gallon (MPG) for a given trip as well as
 * the overall MPG for the vehicle
 *****************************************************************************/

public class MilesPerGallon {

    public static void main(String[] args) 
    {   
        MPG trip1 = new MPG(320.0, 29.0);
        MPG trip2 = new MPG(325.8, 32.1);
        MPG trip3 = new MPG(412.5, 35);
        MPG trip4 = new MPG(345, 32.6);
        
        System.out.println("Ch 7 MPG Project by JC Boyd\n");
        
        trip1.displayCurrentMPG();
        trip2.displayCurrentMPG();
        trip3.displayCurrentMPG();
        trip4.displayCurrentMPG();
        MPG.displayTotalMPG();
    } //end main
    
} //end class MilesPerGallon
