/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.LinearObject.Obstaclemarker.MinefieldLaneMarker;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v31 (2022-10-08)
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
