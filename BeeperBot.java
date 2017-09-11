
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        while(frontIsClear()){
            collectBeeperSteeple();
        }
    }
    public void collectBeeperSteeple(){
        while(frontIsClear()){
            findBeepers();
            turnLeft();
            pickLine();
            comeDown();
            turnLeft();
    }
}
public void comeDown(){
    turnLeft();
    turnLeft();
    while(frontIsClear()){
       move();
    }
}
public void pickLine(){
    while(nextToABeeper()){
                pickBeeper();
                move();
            }
}
public void findBeepers(){
        faceEast();
        while(!nextToABeeper()){
            move();
        }
    }
    public void faceEast(){
        while(!facingEast()){
            turnLeft();
        }
    }
}