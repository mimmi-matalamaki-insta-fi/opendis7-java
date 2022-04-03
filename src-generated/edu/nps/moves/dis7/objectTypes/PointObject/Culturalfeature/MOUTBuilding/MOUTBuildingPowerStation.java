// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.PointObject.Culturalfeature.MOUTBuilding;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)
 *
 * ObjectType uid: 226
 */
public class MOUTBuildingPowerStation extends ObjectType
{
    /** Default constructor */
    public MOUTBuildingPowerStation()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)7); // MOUT Building
        setSubCategory((byte)11); // MOUT Building, Power Station
    }
}
