/**
*
* Climbers manu and eddie find the treasure and bring it to the basecamp. // provide a brief description
*
* @author <Manu Gualandri>  // replace <...> with your name
* @version <1/11/2014> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {

     public static void main(String[] args) {
     Display.openWorld("maps/mountain.map");
     Display.setSize(16, 16);
     Display.setSpeed(8);
     Climber manu = new Climber(8);
     Climber eddie = new Climber(8);
     manu.climbUpRight();
     eddie.climbUpRight();
     manu.climbUpRight();
     eddie.climbUpRight();
     manu.move();
     eddie.move();
     manu.climbUpRight();
     eddie.climbUpRight();   
     manu.move();
     eddie.move();
     manu.climbUpRight();
     eddie.climbUpRight();
     manu.climbDownRight();
     eddie.climbDownRight();
     manu.turnAround();
     eddie.turnAround();
     manu.move();
     eddie.move();
     manu.turnAround();
     eddie.turnAround();
     manu.climbDownRight();
     eddie.climbDownRight();
     manu.turnAround();
     eddie.turnAround();
     manu.move();
     eddie.move();
     manu.pickBeeper();
     manu.turnAround();
     eddie.turnAround();
     manu.move();
     eddie.move();
     manu.climbUpLeft();
     eddie.climbUpLeft();
     manu.move();
     eddie.move();
     manu.climbUpLeft();
     eddie.climbUpLeft();
     manu.climbDownLeft();
     eddie.climbDownLeft();
     manu.climbDownLeft();
     eddie.climbDownLeft();
     manu.climbDownLeft();
     eddie.climbDownLeft();
     manu.climbDownLeft();
     eddie.climbDownLeft();
     manu.turnAround();
     eddie.turnAround();
     manu.move();
     eddie.move();
     manu.move();
     eddie.move();
     manu.turnRight();
     eddie.turnRight();  
     }
}
