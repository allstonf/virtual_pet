/* Virtual Cat
 * 
 * @author Allston Fojas
 * @date 9-29-15
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger;   // how hungry the cat is.
    int tiredness; // how tired the cat is.
    int thirst; // how thirsty the cat is.
    int happiness; // how happy the cat is.
    int anxiety; // how anxious the cat is.

    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normalcat");
        face.setMessage("Hi, I am Kit Kat.");
        hunger = 0;
        tiredness = 0;
        thirst = 0;
        happiness = 10;
        anxiety = 0;
    }
    //The following methods are used to return the cat's status.
    public int getHungerLevel() {
        return hunger;
    }
    public int getTirednessLevel() {
        return tiredness;
    }    
    public int getThirstLevel() {
        return thirst;
    }    
    public int getHappinessLevel() {
        return happiness;
    }    
    public int getAnxietyLevel() {
        return anxiety;
    }
    //feeds the cat if hunger is less than or equal to 20. makes the cat go to sleep if tiredness is also greater than 15. makes the cat die if hunger is greater than 20.
    public void feed () {
        if (hunger <= 20) {
            hunger = 0;
            thirst = thirst + 3;
            happiness = happiness + 4;
            tiredness = tiredness + 2;
            anxiety = 0;
            face.setMessage("That was delicious, thanks!");
            face.setImage("normalcat");
            if (tiredness > 15) {
            face.setMessage("I'm... too... sleepy...");
            sleep();
         }
         } else if (hunger > 20) {
            face.setMessage("I became too hungry. Why didn't you feed me?");
            face.setImage("deadcat");
         }

        
    }
    //exercises the cat; makes the cat sleep if its tiredness is greater than 15. makes the cat die if hunger or thirst is greater than 20.
    public void exercise () {
        happiness = happiness - 2;
        hunger = hunger + 3;
        tiredness = tiredness + 5;
        thirst = thirst + 4;
        anxiety = anxiety + 4;
        if (tiredness > 15) {
            face.setMessage("I'm... too... sleepy...");
            sleep();
        }
        else if (hunger > 20 && tiredness > 15) {
            face.setMessage("Urk, I'm too hungry!");
            face.setImage("deadcat");
        } 
        else if (thirst > 20 && tiredness > 15) {
            face.setMessage("Oh man, I'm so thirsty!");
            face.setImage("deadcat");
        } 
        else if (anxiety >= 10 && tiredness > 15) {
            face.setMessage("Oh man, I really needed to go to the bathroom!");
            face.setImage("bathroomcat");
        } else {   
            face.setMessage("1, 2, 3, jump.  Whew.");
            face.setImage("tiredcat");
        }
    }
    //makes the cat sleep; makes the cat die if its hunger is greater than 12, else the cat goes to sleep
    public void sleep () {
        if (hunger > 20) {
            face.setMessage("Awww, I'm too hungry!");
            face.setImage("deadcat");
        } else if (thirst > 20) {
            face.setMessage("Oh man, I'm so thirsty!");
            face.setImage("deadcat");
        } else {
            hunger = hunger + 2;
            thirst = thirst + 2;
            tiredness = 0;
            happiness = happiness + 4;
            anxiety = 0;
            face.setMessage("zzzzzzzzzz");
            face.setImage("asleepcat");
        }
    }
    //walks the cat; makes the cat sleep if tiredness is greater than 15. makes the cat die if hunger is greater than 12 or thirst is greater than 20.
    public void walk () {
        hunger = hunger + 2;
        tiredness = tiredness + 3;
        thirst = thirst + 5;
        happiness --;
        anxiety = anxiety + 2;
        if (tiredness > 15) {
            face.setMessage("I'm... too... sleepy...");
            sleep();
        }
        else if (hunger > 12 && tiredness > 15) {
            face.setMessage("Oh man, I'm too hungry!");
            face.setImage("deadcat");
        }
        else if (thirst > 20 && tiredness > 15) {
            face.setMessage("Oh no, I'm so thirsty!");
            face.setImage("deadcat");
        } 
        else if (anxiety >= 10 && tiredness > 15) {
            face.setMessage("Oh man, I really needed to go to the bathroom!");
            face.setImage("bathroomcat");
        } else {   
            face.setMessage("I am getting such a workout from this.");
            face.setImage("tiredcat");
        }
    }
    //makes the cat drink; resets thirst if thirst is less than or equal to 20. 
    public void drink () {
        if (thirst <= 20) {
            thirst = 0;
            happiness = happiness + 3;
            face.setMessage("How refreshing! Thanks!");
            face.setImage("normalcat");
        } else if (anxiety >= 10) {
            face.setMessage("Oh man, I really needed to go to the bathroom!");
            face.setImage("bathroomcat");
        } else {
            face.setMessage("Oh no, I'm so thirsty!");
            face.setImage("deadcat");
        }
        }  
    //makes the cat go to the bathroom
    public void bathroom () {
        if (thirst > 10) {
           face.setMessage("I'm so relieved! Thanks!");
           face.setImage("normalcat");
           happiness = happiness + 5;
           anxiety = 0;
        } else if (thirst <= 10) {
           face.setMessage("I don't need to go to the bathroom right now.");
           face.setImage("normalcat");
        }
    }
    
} 

// end Virtual Cat
