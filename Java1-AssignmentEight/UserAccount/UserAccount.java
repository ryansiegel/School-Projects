//********************************************************************
//  UserAccount.java
//  Student name: Ryan Siegel
//    Date: 10.26.21
//  Purpose: Create useraccount class.
//********************************************************************

public class UserAccount
{
   private String userName;
   private String password;
   private int CaesarShift;
   
   //set to default values
    public UserAccount()
    {
        userName = "";
        password = "";
        CaesarShift = 0;
    }
    
    //check if password & username is between 8 to 16 chars, if not set to default.
    public UserAccount(String userNamee, String passwordd)
    {
        if (userNamee.length() >= 8 && userNamee.length() <= 16) {userName = userNamee;}
        else {userName = "";}
        if (passwordd.length() >= 8 && passwordd.length() <= 20) {password = passwordd;}
        else {password = "";}
    }
    
    public String getUserName() {return userName;}
    public String getPassword() {return password;}
    
    //check if password is between 8 to 16 chars, if not set to default.
    public void setPassword(String passwordd)
    {
        if (passwordd.length() >= 8 && passwordd.length() <= 20) {password = passwordd;}
    }
  
   //-----------------------------------------------------------------
   //  This method uses a Caesar  to encrypt the password. 
   //  The shift amount is passed in as a parameter.
   //  It will not encrypt an already encrypted password.
   //  The Caesar cipher shift is not restricted to certain characters
   //  such as letters.  It shifts based upon ASCII codes.
   //-----------------------------------------------------------------
   public void encrypt(int shift)
   {

      if (CaesarShift == 0 && (shift > 0 && shift < 20))
      {
          String masked = "";
         
          for (int index = 0; index < password.length(); index++)
          {masked = masked + (char)(password.charAt(index)+shift);}
        
          password = masked;
          CaesarShift = shift;
      }

   }
   
   // decrypt password
   public void decrypt()
   {
       //if password is currently encrypted
       if (CaesarShift > 0)
       {
           String unmasked = "";
           
           //return each char to it's original char
           for (int index=0; index < password.length(); index++)
           {unmasked = unmasked + (char)(password.charAt(index)-CaesarShift);}
           
           password = unmasked;
           //set to unencrypted
           CaesarShift = 0;
       }
   }
   
   public boolean isEncrypted()
   {
       if (CaesarShift == 0) {return false;}
       else {return true;}
   }
   
   public String toString()
   {
       return "Username:\t" + userName + "\nPassword:\t" + password;
   }
}
