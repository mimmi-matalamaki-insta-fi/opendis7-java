// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.PointObject.Obstacle.Abatis;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v29 (2021-05-19)
 *
 * ObjectType uid: 226
 */
public class _14Tree extends ObjectType
{
    /** Default constructor */
    public _14Tree()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)1); // Abatis
        setSubCategory((byte)2); // 14 Tree
    }
}
