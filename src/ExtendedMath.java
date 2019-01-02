public class ExtendedMath {
    // TODO: implement this
	
	public static float normalizeRadians2pi(float radians) {
		//normalizes within [0, 2pi]
		
		if (radians < 0)
			return (radians % (-2 * pi)) + (2 * pi);
		//if the input is negative it finds mod -2pi then adds to 2pi
		
		else
			return radians % (2 * pi);
		//otherwise it just does mod 2pi
	}
	
    public static float normalizeRadians(float radians) {
        
		float normalized = normalizeRadians2pi(radians);
		//first normalizes it,
		
		if (normalized > pi)
			return -1 * (normalized - pi);
		else
			return normalized;
		//then if greater than pi puts in in proper negative form, otherwise leaves it
		
    }
}
