/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.PointObject.Passageway.AVLB;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v31 (2022-10-08)
 *
 * ObjectType uid: 226
 */
public class MTU20 extends ObjectType
{
    /** Default constructor */
    public MTU20()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(4)); // Passageway
        setCategory((byte)2); // AVLB
        setSubCategory((byte)2); // MTU20
    }
}
