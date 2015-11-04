class Chick implements Animal 
{     
     //your code here
     private String myType;
     private String mySound;
     private String mySound2;
     private  int random = (int)(Math.random()*2);
     public Chick(String type, String sound, String sound2) {
       myType = type;
       mySound = sound;
       mySound2 = sound2;
     }
     public Chick() {
       myType = "hi";
       mySound = "hi";
       mySound2 = "hi";
     }
     public String getSound(){
       if(random == 0) {
         return mySound;
       } else {
         return mySound2;
       }
         
     }
     public String getType(){return myType;}
}
