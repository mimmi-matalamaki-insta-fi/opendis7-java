// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.PointObject.Culturalfeature.TreeEvergreen;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v29 (2021-05-19)
 *
 * ObjectType uid: 226
 */
public class TreeEvergreen extends ObjectType
{
    /** Default constructor */
    public TreeEvergreen()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)11); // Tree, Evergreen
    }
}
