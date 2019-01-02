public class ExtendedMath {
    // TODO: implement this

    public static float normalizeRadians2pi(float rad) {
        //Converts into [0, 2pi]

        if (rad < 0) {
            return (rad % (-2 * math.pi)) + (2 * math.pi);
        }
            //If the input is negative it finds the mod of it with 2pi and then adds it to 2pi
        else {
            return rad % (2 * math.pi);
        }
    }

    public static float normalizeRadians(float rad) {

        float normalizedRadians = normalizeRadians2pi(rad);
        //Uses helper function to normalize into [0, 2pi]

        if (normalizedRadians > pi) {
            return -(normalizedRadians - math.pi);
        }
        else {
            return normalizedRadians;
        }
        //this if-else converts it from [0, 2pi] into +/- pi

    }
}