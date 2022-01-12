// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.PointObject.Tacticalsmoke.AirBurst;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v29 (2021-05-19)
 *
 * ObjectType uid: 226
 */
public class Grenade extends ObjectType
{
    /** Default constructor */
    public Grenade()
    {
        setDomain(PlatformDomain.getEnumForValue(0));
        setObjectKind(ObjectKind.getEnumForValue(5)); // Tactical smoke
        setCategory((byte)2); // Air Burst
        setSubCategory((byte)1); // Grenade
    }
}
