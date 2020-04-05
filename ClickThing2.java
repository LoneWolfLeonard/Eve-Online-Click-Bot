
package click.thing2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author leona
 */
public class ClickThing2 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws AWTException, InterruptedException {
        int x = 0;
        int y = 25;   
        
         TimeUnit.SECONDS.sleep(5);  
         
   Robot robot = new Robot(); 
   
   while(x != y)
   {
   //warp out to asteroid belt
  robot.keyPress(KeyEvent.VK_S);
        TimeUnit.SECONDS.sleep(1);    
          robot.mouseMove(1300, 300);         
                TimeUnit.SECONDS.sleep(1);    
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
      TimeUnit.SECONDS.sleep(1);    
        TimeUnit.SECONDS.sleep(1);    
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      TimeUnit.SECONDS.sleep(1);    
   robot.keyRelease(KeyEvent.VK_S);  
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    TimeUnit.SECONDS.sleep(1);    
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    TimeUnit.SECONDS.sleep(40);

 //Orbit Asteroid
   robot.keyPress(KeyEvent.VK_W);
        TimeUnit.SECONDS.sleep(1);    
          robot.mouseMove(1300, 350);         
                TimeUnit.SECONDS.sleep(1);    
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
      TimeUnit.SECONDS.sleep(1);    
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      TimeUnit.SECONDS.sleep(1);    
   robot.keyRelease(KeyEvent.VK_W);  
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    TimeUnit.SECONDS.sleep(1);    
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    TimeUnit.SECONDS.sleep(2);

     
    
    //turn on after burners then mine
    robot.keyPress(KeyEvent.VK_F3);
          TimeUnit.SECONDS.sleep(1);     
        robot.keyRelease(KeyEvent.VK_F3);  
              TimeUnit.SECONDS.sleep(40); 
             robot.keyPress(KeyEvent.VK_F2); 
             robot.keyPress(KeyEvent.VK_F1);
              TimeUnit.SECONDS.sleep(1);  
          robot.keyRelease(KeyEvent.VK_F2);  
            robot.keyRelease(KeyEvent.VK_F1);
                TimeUnit.SECONDS.sleep(1); 
                  robot.mouseMove(1390, 155);    
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    TimeUnit.SECONDS.sleep(1);    
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
      TimeUnit.SECONDS.sleep(1);    
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    
    // turn off afterburners
      TimeUnit.SECONDS.sleep(1);   
       robot.keyPress(KeyEvent.VK_F3);
          TimeUnit.SECONDS.sleep(1);     
        robot.keyRelease(KeyEvent.VK_F3);  
        
//wait for mining
TimeUnit.SECONDS.sleep(125);   

//navigate to station
    robot.mouseMove(890, 555);    
    robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
    TimeUnit.SECONDS.sleep(1);    
    robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    TimeUnit.SECONDS.sleep(1);  
    robot.mouseMove(930, 665);    
    TimeUnit.SECONDS.sleep(1); 
    robot.mouseMove(1150, 665);  
    TimeUnit.SECONDS.sleep(1); 
    robot.mouseMove(1350, 665);  
    TimeUnit.SECONDS.sleep(1); 
    robot.mouseMove(1350, 715);
    TimeUnit.SECONDS.sleep(1); 
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    TimeUnit.SECONDS.sleep(1);    
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
  
    //wait for travel back to base
    TimeUnit.SECONDS.sleep(70);   
  
   //open cargo hold
   robot.mouseMove(890, 505);    
   TimeUnit.SECONDS.sleep(1);  
   robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);    
   robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseMove(930, 585);
   TimeUnit.SECONDS.sleep(1); 
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1); 
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
     //select all ore then reprocess it
   robot.mouseMove(1120, 505);  
   TimeUnit.SECONDS.sleep(1);  
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseMove(870, 305);  
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseMove(970, 345);  
   TimeUnit.SECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   
   //agree to reprocess ore
   TimeUnit.SECONDS.sleep(1);
   robot.mouseMove(1145, 700);  
   TimeUnit.SECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   
      //Select Leftover Ore and move to item hold
   TimeUnit.SECONDS.sleep(1);
   robot.mouseMove(1120, 505);  
   TimeUnit.SECONDS.sleep(1);  
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseMove(870, 305);  
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseMove(870, 305);  
   TimeUnit.SECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);    
   TimeUnit.SECONDS.sleep(1);
   robot.mouseMove(780, 345); 
   TimeUnit.SECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   
   //Select Leftover Ore and move to item hold then sell all
   TimeUnit.SECONDS.sleep(1);
   robot.mouseMove(1120, 505);  
   TimeUnit.SECONDS.sleep(1);  
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseMove(870, 305);  
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseMove(900, 330);  
   TimeUnit.SECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseMove(850, 660); 
   TimeUnit.SECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   
   //Close Hanger Bay Item Window
   TimeUnit.SECONDS.sleep(1);  
   robot.mouseMove(1260, 230);  
   TimeUnit.SECONDS.sleep(1);  
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   
   //Close Refining Item Window
   TimeUnit.SECONDS.sleep(1);  
   robot.mouseMove(1163, 330);  
   TimeUnit.SECONDS.sleep(1);  
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   
   
   //Undock
   TimeUnit.SECONDS.sleep(1);  
   robot.mouseMove(820, 505);  
   TimeUnit.SECONDS.sleep(1);  
   robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseMove(875, 750);  
   TimeUnit.SECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(25);
   x=x+1;
   }
  }
}