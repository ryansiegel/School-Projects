//-------------------------------------------------
//   State Class
//   Java 1 - Ryan Siegel - 12/1/21 - State Class for the StateArray Driver to access.
//-------------------------------------------------
import java.util.Calendar;

public class State
{
    private String stateName;
    private String stateCapital;
    private String stateBird;
    private String stateFlower;
    private String stateNickName;
    private String dateEnteredUnion;
    private int yearSettled;


//--------------------------------------------------
//    Constructor for the State class
//--------------------------------------------------

    public State (String stateName, String stateCapital, String stateBird, String stateFlower, String stateNickName, String dateEnteredUnion, int yearSettled)
    {
        this.stateName = stateName;
        this.stateCapital = stateCapital;
        this.stateBird = stateBird;
        this.stateFlower = stateFlower;
        this.stateNickName = stateNickName;
        this.dateEnteredUnion = dateEnteredUnion;
        
        // Verify date was on 1400 or later, otherwise defaults to 1400
        if (yearSettled >= 1400 && yearSettled <= Calendar.getInstance().get(Calendar.YEAR))
        {    this.yearSettled = yearSettled;    }
        else {    yearSettled = 0;    }
    }

//--------------------------------------------------
//    Accessors for the State class
//--------------------------------------------------

    public String getStateName()
    {    return stateName;    }

    public String getStateCapital()
    {    return stateCapital;    }

    public String getStateBird()
    {    return stateBird;    }

    public String getStateFlower()
    {    return stateFlower;    }
    
    public String getStateNickName()
    {    return stateNickName;    }
    
    public String getDateEnteredUnion()
    {    return dateEnteredUnion;    }
    
    public int getYearSettled()
    {    return yearSettled;    }


//--------------------------------------------------
//    Mutators for the State class
//--------------------------------------------------

    public void setStateName(String stateName)
    {    this.stateName = stateName;    }

    public void setStateCapital(String stateCapital)
    {    this.stateCapital = stateCapital;    }

    public void setStateBird(String stateBird)
    {    this.stateBird = stateBird;    }

    public void setStateFlower(String stateFlower)
    {    this.stateFlower = stateFlower;    }
    
    public void setStateNickName(String stateNickName)
    {    this.stateNickName = stateNickName;    }
    
    public void setdateEnteredUnion(String dateEnteredUnion)
    {    this.dateEnteredUnion = dateEnteredUnion;    }
    
    public void setyearSettled(int yearSettled)
    {    
        // Verify date was on 1400 or later, otherwise don't change info.
        if (yearSettled >= 1400 && yearSettled <= Calendar.getInstance().get(Calendar.YEAR))
        {    this.yearSettled = yearSettled;    }
    }

//--------------------------------------------------
//    toString() method to override method from 
//      Object class
//--------------------------------------------------

    public String toString ()
    { return stateName + "\t" + stateCapital;    }

}