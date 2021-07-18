package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f2c995b;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 27368
 */
public class RangeMarkerMiddle extends EntityType
{
    /** Default constructor */
    public RangeMarkerMiddle()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 21990, Flags/markers
        setSubCategory((byte)10); // uid 26044, Range Flags/Markers
        setSpecific((byte)2); // uid 27368, Range Marker, Middle
    }
}