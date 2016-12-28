/* Tests Virtual Cat
 * 
 * Allston Fojas
 * 9-29-15
 */
public class PetTester extends VirtualPet {
    
    public static void main(String[] args){ 
       VirtualPet ctest = new VirtualPet();
        
     //tests if hunger is less than or equal to 20 after the method is called.       
       ctest.hunger = 21;
       ctest.tiredness = 14;
       ctest.thirst = 0;
       ctest.happiness = 0;
       ctest.anxiety = 0;
       
       System.out.println("testing the feed method, when the cat is really hungry");
       ctest.feed();
       if (ctest.hunger <= 20){
           System.out.println ("Error: the value for hunger should be equal to or less than 20. (It's 21 right now.)");
       } else if (ctest.tiredness > 15) {
           System.out.println ("Correct (Error: the value for tiredness should be greater than 15 (It's 14 right now.))"); 
       } else if (ctest.hunger > 20) {
           System.out.println ("Correct (I became too hungry. Why didn't you feed me?)");
       }
     
    
       VirtualPet ctest2 = new VirtualPet();
       
     //tests if hunger is less than or equal to 20 after the method is called.       
       ctest2.hunger = 20;
       ctest2.tiredness = 16;
       
        System.out.println("testing the feed method, when the cat is eating");
       ctest2.feed();
       if (ctest2.hunger <= 20){
           System.out.println ("Correct");
       } else if (ctest2.tiredness > 15) {
           System.out.println ("Error: the if statement for hunger should have activated."); 
       } else {
           System.out.println ("Error: This should have worked.");
       }
       
       VirtualPet ctest3 = new VirtualPet();
       
     //tests if hunger is less than or equal to 20 after the method is called.       
       ctest3.hunger = 19;
       ctest3.tiredness = 16;
       
        System.out.println("testing the feed method, when the cat is eating");
       ctest3.feed();
       if (ctest3.hunger <= 20){
           System.out.println ("Correct");
       } else {
           System.out.println ("Error: This should have worked.");
       }
       
       VirtualPet ctest4 = new VirtualPet();
       
     //tests if tiredness is greater than 15 after the method is called.
       ctest4.hunger = 21;
       ctest4.tiredness = 16;
       
        System.out.println("testing the feed method, when the cat is really tired");
       ctest4.feed();
       if (ctest4.tiredness > 15){
           System.out.println ("Correct");
       } else {
           System.out.println ("Error: This should have worked.");
       }
       
       VirtualPet ctest5 = new VirtualPet();
       
     //tests if tiredness is greater than 15 after the method is called.       
       ctest5.hunger = 21;
       ctest5.tiredness = 15;
       
        System.out.println("testing the feed method, when the cat is not really tired");
       ctest5.feed();
       if (ctest5.tiredness > 15){
           System.out.println ("Error: tiredness needs to be greater than 15.");
       } else {
           System.out.println ("Correct");
       }
       
      VirtualPet ctest6 = new VirtualPet(); 
       
     //tests whether the correct part of the if statement was called.
      ctest6.hunger = 0;
      ctest6.thirst = 0;
      ctest6.happiness = 10;
      ctest6.anxiety = 0;
      ctest6.tiredness = 25;
      
       System.out.println("testing the exercise method, when the cat is tired");
      ctest6.exercise();
       if (ctest6.tiredness < 15){
           System.out.println ("Correct");
       } else {
           System.out.println ("Error: ctest6 should work.");
       }
       
      VirtualPet ctest7 = new VirtualPet();
       
     //tests whether the correct part of the if statement was called.
      ctest7.hunger = 0;
      ctest7.thirst = 0;
      ctest7.happiness = 2;
      ctest7.anxiety = 0;
      ctest7.tiredness = 15;
      
       System.out.println("testing the exercise method, when the cat is not as tired");
      ctest7.exercise();
       if (ctest7.tiredness > 15){
           System.out.println ("Error: tiredness needs to be greater than 15.");
       } else {
           System.out.println ("Correct");
       }
       
      VirtualPet ctest8 = new VirtualPet(); 
       
     //tests whether the correct part of the if statement was called.
      ctest8.hunger = 21;
      ctest8.thirst = 0;
      ctest8.happiness = 2;
      ctest8.anxiety = 0;
      ctest8.tiredness = 16;
      
      System.out.println("testing the exercise method, when the cat is hungry and tired");
      ctest8.exercise();
       if (ctest8.hunger > 20 && ctest8.tiredness > 15){
           System.out.println ("Correct");
       } else {
           System.out.println ("Error: This should work.");
       }
       
       VirtualPet ctest9 = new VirtualPet();
       
     //tests whether the correct part of the if statement was called.
      ctest9.hunger = 0;
      ctest9.thirst = 21;
      ctest9.happiness = 2;
      ctest9.anxiety = 0;
      ctest9.tiredness = 16;
      
      System.out.println("testing the exercise method, when the cat is thirsty and tired");
      ctest9.exercise();
       if (ctest9.thirst > 20 && ctest9.tiredness > 15){
           System.out.println ("Correct");
       } else {
           System.out.println ("Error: This should work.");
       }
       
       VirtualPet ctest10 = new VirtualPet();
       
     //tests whether the correct part of the if statement was called.
      ctest10.hunger = 0;
      ctest10.thirst = 0;
      ctest10.happiness = 2;
      ctest10.anxiety = 10;
      ctest10.tiredness = 16;
      
      System.out.println("testing the exercise method, when the cat is anxious and tired");
      ctest10.exercise();
       if (ctest10.anxiety <= 10 && ctest10.tiredness < 15){
           System.out.println ("Correct");
       } else {
           System.out.println ("Error: This should work.");
       }
       
       VirtualPet ctest11 = new VirtualPet(); 
       
     //tests whether the correct part of the if statement was called.
      ctest11.hunger = 0;
      ctest11.thirst = 0;
      ctest11.happiness = 2;
      ctest11.anxiety = 0;
      ctest11.tiredness = 14;
      
      System.out.println("testing the exercise method, when the cat is not really tired");
      ctest11.exercise();
       if (ctest11.tiredness < 15){
           System.out.println ("Correct (1, 2, 3, jump. Whew.)");
       } else {
           System.out.println ("Error: This should work.");
       }
       
      VirtualPet ctest12 = new VirtualPet(); 
       
     //tests whether the correct part of the if statement was called.
      ctest12.hunger = 21;
      ctest12.thirst = 0;
      
      System.out.println("testing the sleep method, when the cat is hungry");
      ctest12.sleep();
       if (ctest12.hunger > 20){
           System.out.println ("Correct (Awww, I'm too hungry!)");
       } else {
           System.out.println ("Error: This should work.");
       }
       
       VirtualPet ctest13 = new VirtualPet(); 
       
     //tests whether the correct part of the if statement was called.
      ctest13.hunger = 0;
      ctest13.thirst = 21;
      
      System.out.println("testing the sleep method, when the cat is thirsty");
      ctest13.sleep();
       if (ctest13.thirst > 20){
           System.out.println ("Correct (Oh man, I'm so thirsty!)");
       } else {
           System.out.println ("Error: This should work.");
       }
      
       VirtualPet ctest14 = new VirtualPet();
       
     //tests whether the correct part of the if statement was called.
      ctest14.hunger = 19;
      ctest14.thirst = 0;
      
      System.out.println("testing the sleep method, when the cat is not really hungry");
      ctest14.sleep();
       if (ctest14.hunger > 20){
           System.out.println ("Correct (zzzzzzzzzz)");
       } else {
           System.out.println ("Error: This should work.");
       }
      
      VirtualPet ctest15 = new VirtualPet();
       
     //tests whether the correct part of the if statement was called.
      ctest15.hunger = 0;
      ctest15.thirst = 0;
      ctest15.happiness = 2;
      ctest15.anxiety = 0;
      ctest15.tiredness = 16;
      
      System.out.println("testing the walk method, when the cat is tired");
      ctest15.walk();
       if (ctest15.tiredness < 15){
           System.out.println ("Correct (I'm... too... sleepy...)");
       } else {
           System.out.println ("Error: This should work.");
       }
      
      VirtualPet ctest16 = new VirtualPet(); 
       
     //tests whether the correct part of the if statement was called.
      ctest16.hunger = 13;
      ctest16.thirst = 0;
      ctest16.happiness = 2;
      ctest16.anxiety = 0;
      ctest16.tiredness = 16;
      
       System.out.println("testing the walk method, when the cat is hungry and tired");
      ctest16.walk();
       if (ctest.hunger > 12 && ctest16.tiredness < 15){
           System.out.println ("Correct (Oh man, I'm too hungry!)");
       } else {
           System.out.println ("Error: This should work.");
       }    
       
      VirtualPet ctest17 = new VirtualPet();
       
     //tests whether the correct part of the if statement was called.
      ctest17.hunger = 0;
      ctest17.thirst = 21;
      ctest17.happiness = 2;
      ctest17.anxiety = 0;
      ctest17.tiredness = 16;
      
       System.out.println("testing the walk method, when the cat is thirsty and tired");
      ctest17.walk();
       if (ctest17.thirst > 20 && ctest17.tiredness > 15){
           System.out.println ("Correct (Oh no, I'm so thirsty!)");
       } else {
           System.out.println ("Error: This should work.");
       }    
       
      VirtualPet ctest18 = new VirtualPet(); 
       
     //tests whether the correct part of the if statement was called.
      ctest18.hunger = 0;
      ctest18.thirst = 0;
      ctest18.happiness = 2;
      ctest18.anxiety = 10;
      ctest18.tiredness = 16;
      
       System.out.println("testing the walk method, when the cat is anxious and tired");
      ctest18.walk();
       if (ctest18.anxiety <= 10 && ctest18.tiredness < 15){
           System.out.println ("Correct (Oh man, I really needed to go to the bathroom!)");
       } else {
           System.out.println ("Error: This should work.");
       }
       
       VirtualPet ctest19 = new VirtualPet();
       
     //tests whether the correct part of the if statement was called.
      ctest19.hunger = 0;
      ctest19.thirst = 0;
      ctest19.happiness = 2;
      ctest19.anxiety = 0;
      ctest19.tiredness = 14;
      
       System.out.println("testing the walk method, when the cat is not really tired");
      ctest19.walk();
       if (ctest19.tiredness < 15){
           System.out.println ("Correct (I am getting such a workout from this.)");
       } else {
           System.out.println ("Error: This should work.");
       }
       
       VirtualPet ctest20 = new VirtualPet();
       
     //tests whether the correct part of the if statement was called.
      ctest20.thirst = 20;
      ctest20.anxiety = 0;
      
       System.out.println("testing the drink method, when the cat is not really thirsty");
      ctest20.drink();
       if (ctest20.thirst <= 20){
           System.out.println ("Correct (How refreshing! Thanks!)");
       } else {
           System.out.println ("Error: This should work.");
       }
       
        VirtualPet ctest21 = new VirtualPet(); 
       
     //tests whether the correct part of the if statement was called.
      ctest21.thirst = 21;
      ctest21.anxiety = 10;
      
       System.out.println("testing the drink method, when the cat is anxious");
      ctest21.drink();
       if (ctest21.anxiety >= 10){
           System.out.println ("Correct (Oh man, I really needed to go to the bathroom!)");
       } else {
           System.out.println ("Error: This should work.");
       }
     
       VirtualPet ctest22 = new VirtualPet();
       
     //tests whether the correct part of the if statement was called.
      ctest22.thirst = 21;
      ctest22.anxiety = 9;
      
       System.out.println("testing the drink method, when the cat is too thirsty");
      ctest22.drink();
       if (ctest22.thirst >= 20){
           System.out.println ("Correct (Oh no, I'm so thirsty!)");
       } else {
           System.out.println ("Error: This should work.");
       }
     
       VirtualPet ctest23 = new VirtualPet(); 
       
     //tests whether the correct part of the if statement was called.
      ctest23.thirst = 11;
      
       System.out.println("testing the bathroom method, when the cat is thirsty");
      ctest23.bathroom();
       if (ctest23.thirst > 10){
           System.out.println ("Correct (I'm so relieved! Thanks!)");
       } else {
           System.out.println ("Error: This should work.");
       }
     
       VirtualPet ctest24 = new VirtualPet();
       
     //tests whether the correct part of the if statement was called.
      ctest24.thirst = 10;
      
       System.out.println("testing the bathroom method, when the cat is not too thirsty");
      ctest24.bathroom();
       if (ctest24.thirst <= 10){
           System.out.println ("Correct (I don't need to go to the bathroom right now.)");
       } else {
           System.out.println ("Error: This should work.");
       }
     
       

  }
}

// end Cat Tester