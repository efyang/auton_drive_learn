public class Robot {
    // assume that these are set/nonnull
    private Drivebase drivebase;
    private NavigationalState navigationalState;

    public void moveTo(float x, float y, float heading) {
        moveTo(new Vector2F(x, y), heading);
    }

    // TODO: implement this
    public void moveTo(Vector2F targetPosition, float targetHeading) {
        
		Vector2F movementVect = new Vector2F();
		movementVect = targetPosition.subtract(navigationalState.position);
		//creates a vector describing how the robot will move
		
		float angleDifference = normalizeRadians(movementVect.getAngle() - navigationalState.getAngle());
		rotate(angleDifference);
		navigationalState.heading = movementVect.getAngle;
		//subtracts current angle from angle it needs to be at, then rotates by that difference
		//then changes navigationalState's heading to the current angle
		
		forwardDrive(movementVect.getMagnitude());
		navigationalState.position = targetPosition;
		//moves length of movementVect (distance to target) then updates position
		
		float angleToTarget = normalizeRadians(targetHeading - navigationalState.getAngle());
		rotate(angleToTarget);
		navigationalState.heading = targetHeading;
		//finally, subtracts target angle from current angle to put robot in the desired state
		
    }
}
