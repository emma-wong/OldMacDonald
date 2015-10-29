class Farm  {     
   private Animal[] aBunchOfAnimals = new Animal[3];    
   public Farm()     {       
      aBunchOfAnimals[0] = new NamedCow("Cow","Elsie", "Moo");           
      aBunchOfAnimals[1] = new Chick("Chick","Cluck","Cheep");       
      aBunchOfAnimals[2] = new Pig("Pig","Oink");   
      }         
   public void animalSounds()    {       
       System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() ); 
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());      
      }    
    } 
} 
