package edu.nps.moves.dis7.objectTypes.PointObject.Preparedposition.InfantryFightingPosition;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class HastyFightingPosition extends ObjectType
{
    /** Default constructor */
    public HastyFightingPosition()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(2)); // Prepared position
        setCategory((byte)2); // Infantry Fighting Position
        setSubCategory((byte)5); // Hasty Fighting Position
    }
}