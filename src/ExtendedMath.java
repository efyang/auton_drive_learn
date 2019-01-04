public class ExtendedMath {
    // TODO: implement this
    public static float normalizeRadians(float radians) {
        // should take in any number of radians, and output the equivalent in the range [-pi, pi]
        // do NOT use a loop.
        // hint: maybe make another function called normalizeRadians2pi which normalizes to [0, 2pi] first
        return (normalizeRad2pi(radians % (float)(2 * Math.PI)));
    }

    public static float normalizeRad2pi(float rad){
        float result = rad;
        //only normalizes if radians > pi
        if(rad > Math.PI){
            //pi = -pi ; 3pi/2 = -pi/2; 2pi = 0
            result = (float)(rad - (2 * Math.PI));
        }
        return result;
    }
}
