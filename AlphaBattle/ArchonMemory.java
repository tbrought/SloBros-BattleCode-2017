package AlphaBattle;
import battlecode.common.*;

public class ArchonMemory implements RobotMemory
{
	RobotController rc;
	
	public ArchonMemory(RobotController rc)
	{
		this.rc = rc;
	}
	
	public void updateMemory()
	{
		
	}
	
	public MapLocation getImportantLoc()
	{
		return null;
	}
}