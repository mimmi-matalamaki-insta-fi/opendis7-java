// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.PointObject.EnvironmentalObject.Flood;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v29 (2021-05-19)
 *
 * ObjectType uid: 226
 */
public class FloodMedium extends ObjectType
{
    /** Default constructor */
    public FloodMedium()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(8)); // Environmental Object
        setCategory((byte)1); // Flood
        setSubCategory((byte)2); // Flood, Medium
    }
}
