// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.LinearObject.Obstaclemarker.MinefieldLaneMarker;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)
 *
 * ObjectType uid: 227
 */
public class MinefieldLaneMarker extends ObjectType
{
    /** Default constructor */
    public MinefieldLaneMarker()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(6)); // Obstacle marker
        setCategory((byte)1); // Minefield Lane Marker
    }
}
