// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.PointObject.Obstacle.Barrier;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)
 *
 * ObjectType uid: 226
 */
public class BarrierFenceWood6foot extends ObjectType
{
    /** Default constructor */
    public BarrierFenceWood6foot()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)4); // Barrier
        setSubCategory((byte)9); // Barrier, Fence, Wood, 6-foot
    }
}
