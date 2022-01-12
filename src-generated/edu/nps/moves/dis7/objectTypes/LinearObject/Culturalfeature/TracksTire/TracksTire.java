// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.LinearObject.Culturalfeature.TracksTire;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v29 (2021-05-19)
 *
 * ObjectType uid: 227
 */
public class TracksTire extends ObjectType
{
    /** Default constructor */
    public TracksTire()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)2); // Tracks, Tire
    }
}
