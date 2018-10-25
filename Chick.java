class Chick implements Animal {     
     private String myType;     
     private String mySound; 
     private String mySecondSound;
     public Chick(String type, String sound,String sound2)     {         
         myType = type;         
         mySound = sound; 
         mySecondSound = sound2;
         if (Math.random()<.5){
           mySound = mySecondSound;
         }
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";  
         mySecondSound = "unknown";     
      
     }      
     public String getSound(){return mySound;} 
     
     public String getType(){return myType;} 
}
