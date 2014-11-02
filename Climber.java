import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   public class Climber extends Athlete
  {
      public Climber()
     {
         super();
     }
      public Climber(int x)
     {
         super(x, 1, Display.NORTH, 1);
     }
      public void climbUpRight()
     {
     move();
     turnRight();
     move();
     turnLeft();
      
     }
      public void climbUpLeft()
     {
     move();
     turnLeft();
     move();
     turnRight();
      
     }
      public void climbDownRight()
     {
     turnRight();
     move();
     turnRight();
     move();
     turnAround();
     }
      public void climbDownLeft()
     {
     turnLeft();
     move();
     turnLeft();
     move();
     turnAround();
     }
}