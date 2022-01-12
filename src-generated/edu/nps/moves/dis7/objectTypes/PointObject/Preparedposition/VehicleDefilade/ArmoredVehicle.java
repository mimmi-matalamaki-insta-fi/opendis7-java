// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.PointObject.Preparedposition.VehicleDefilade;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v29 (2021-05-19)
 *
 * ObjectType uid: 226
 */
public class ArmoredVehicle extends ObjectType
{
    /** Default constructor */
    public ArmoredVehicle()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(2)); // Prepared position
        setCategory((byte)1); // Vehicle Defilade
        setSubCategory((byte)1); // Armored Vehicle
    }
}
