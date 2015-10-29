class NamedCow extends Cow 
{
     private String myType;
     private String mySound;
     protected String myName;      
     public NamedCow(String type, String name, String sound)     {         
         myType = type;         
         mySound = sound;
         myName = name;

     }     
     public NamedCow()     {         
     	myType = "unknown";
        mySound = "unknown";
        myName = "unknown";
}
   public String getName() {return myName;} 	
}