//PROPERTY OF CHRISTOPHER PASKIE
//NOTE: most of the code for the complete class has been omitted by Ben Tomasulo

package TKM;
import TNM.*;

public class Block //extends TrackElement
{
    public static final boolean DIRECTION_FWD = false;
    public static final boolean DIRECTION_REV = true; 

    /* For sane double comparisons */
    public static final double SMALL_DOUBLE = 0.000001;

    /* TODO: clean this up */

    /* Static info */
    public double length;
    public double grade;
    public double speedLimit;
    public boolean isBidir;
    public boolean isUground;
    public boolean isYard;
    public boolean isStation;
    public boolean isCrossing;
    public String stationName;
    public String transponderMessage;
    //public TrackElement prev;
    //public TrackElement next;

    /* Dynamic info*/
    public boolean occupied;
    public boolean brokenRailFailure;
    public boolean trackCircuitFailure;
    public boolean powerFailure;

    //public double mbSpeed;
    //public double mbAuthority;
    public double fbSpeed;
    public double fbAuthority;

    /* etc */
    public int fwdId;
    public int revId;
    public int mapX2;
    public int mapY2;
	public int id;
	private String lineId;
	private String sectionId;


    public Block() {
        Block prev = null;
        Block next = null;
        id = -1;
        transponderMessage = null;
    }

    public Block(int id, String lineId, String sectionId, double length, double grade,
                    double speedLimit, boolean isBidir, boolean isUground, boolean isYard,
                    boolean isStation, boolean isCrossing, String stationName,
                    boolean brokenRailFailure, boolean trackCircuitFailure, boolean powerFailure) {
        this.id = id;
        this.lineId = lineId;   
        this.sectionId = sectionId;
        this.length = length;
        this.grade = grade;
        this.speedLimit = speedLimit;
        this.isBidir = isBidir;
        this.isUground = isUground;
        this.isYard = isYard;
        this.isStation = isStation;
        this.isCrossing = isCrossing;
        this.stationName = stationName;
        this.brokenRailFailure = brokenRailFailure;
        this.trackCircuitFailure = trackCircuitFailure;
        this.powerFailure = powerFailure;
    }
                        

    public boolean isOccupied() {
        /* TODO: Correctly evaluate failure mode */
        return occupied;
    }



    public Block getNext(boolean direction) {
        return null; //getNext(direction, true);
    }



    public String toString()
    {
        return ("Block " + Integer.toString(id));
    }
}
