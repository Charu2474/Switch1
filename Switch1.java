import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner t=new Scanner(System.in);
        String str=t.nextLine();
        switch(str)
        {
            case "RED":
                System.out.println("The Chromatic Horizon reveals: It is Dusk");
                break;
            case "BLUE":
                System.out.println("The Chromatic Horizon whispers: It is Dawn");
                break;
            default:
                System.out.println("The Chromatic Riddle unfolds: Invalid Input");
        }
    }
}
