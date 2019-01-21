//Needed to Reference PI
import java.lang.Math.*;

public class ExtendedMath {
    public static float normalizeRadians(float radians) {

        //Limiting the range to [-2pi, 2pi]
        float newRad = radians % (2 * Math.PI) ;

        //Remapping the angles in the bounds (-pi, -2pi] U (pi, 2pi] to their respective counterparts
        if (newRad < (-1 * Math.PI)) {
            newRad += (2 * Math.PI);
        }
        else {if (newRad > Math.PI) {
            newRad -= (2 * Math.PI)
        }}

        //Returning the new angle now bounded in the range [-pi, pi]
        return newRad;
    }
}
