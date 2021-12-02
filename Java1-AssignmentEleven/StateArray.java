//-------------------------------------------------
//   State Class
//   Java 1 - Ryan Siegel - 12/1/21 - StateArray Driver that accesses a file, prints all info, and prints out stats based on stored info.
//-------------------------------------------------
import java.util.Scanner;
import java.io.*;

public class StateArray
{

    public static void main (String[] args) throws IOException
    {
        Scanner fileScan, lineScan;
        State stateArray [] = new State [50];
        String fileRecord = "";
        String stateName = "", stateCapital = "", stateBird = "", stateFlower = "", stateNickName = "", dateEnteredUnion = "", firstSettledState = "";
        int yearSettled = 0, count = 0, settledCount = 0, cardinalCount = 0, firstSettledYear = 0;
        
        //grab info from file
        fileScan = new Scanner (new File("StateData.txt"));
        
        //assign all info from file into the array
        while (fileScan.hasNext())
           {
               fileRecord = fileScan.nextLine();
                
               //read line and seperate via a comma
               lineScan = new Scanner(fileRecord);
               lineScan.useDelimiter(",");
               
               //get info and assign it to var
               stateName = lineScan.next();
               stateCapital = lineScan.next();
               stateBird = lineScan.next();
               stateFlower = lineScan.next();
               stateNickName = lineScan.next();
               dateEnteredUnion = lineScan.next();
               yearSettled = lineScan.nextInt();
                
               //assign var info to array
               stateArray[count] = new State(stateName, stateCapital, stateBird, stateFlower, stateNickName, dateEnteredUnion, yearSettled);
               count++;
           }
        
        //reset count, use count to print title in first line
        count = 0;
        
        //print list and results
        for (State strTemp : stateArray)
        {
            //turn string to int
            int yearSettledInt = Integer.valueOf(strTemp.getYearSettled());
            //first line is title
            if (count == 0) 
            {
                System.out.printf("STATE NAME\t\tNICKNAME\t\t\tDATE RATIFIED%n%-24s%-32s%s-%s%n", strTemp.getStateName(), strTemp.getStateNickName(),strTemp.getDateEnteredUnion().substring(5,10),strTemp.getDateEnteredUnion().substring(0,4));
                //make the first state the first settled
                firstSettledYear = yearSettledInt;
                firstSettledState = strTemp.getStateName();
            }
            //everything after is info after first line
            else {System.out.printf("%-24s%-32s%s-%s%n", strTemp.getStateName(), strTemp.getStateNickName(),strTemp.getDateEnteredUnion().substring(5,10),strTemp.getDateEnteredUnion().substring(0,4));}
            
            //if year settled is before or equal to 1675 & not before 1400, add to settled count
            if (yearSettledInt <= 1675 && yearSettledInt >= 1400)
                {
                    settledCount++;
                }
            
            //if state bird contains a cardinal, add to cardinal count
            if (strTemp.getStateBird().contains("Cardinal"))
                {
                    cardinalCount++;
                }
            
            //see if the state is the earliest settled
            if (yearSettledInt < firstSettledYear)
                {
                    firstSettledYear = yearSettledInt;
                    firstSettledState = strTemp.getStateName();
                }
            count++;
        }
        
        //print stats
        System.out.printf("%nNumber of states settled before 1675: %s%n", settledCount);
        System.out.printf("Number of states with some type of Cardinal as a state bird: %s%n", cardinalCount);
        System.out.printf("First state settled: %s in %d", firstSettledState, firstSettledYear);
    }
}
