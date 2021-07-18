package edu.nps.moves.dis7.entities.vnm.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5e599100;
 * Country: Viet Nam (VNM);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27840
 */
public class HQ373 extends EntityType
{
    /** Default constructor */
    public HQ373()
    {
        setCountry(Country.VIET_NAM_VNM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 27836, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 27837, Tarantul I Class
        setSpecific((byte)3); // uid 27840, HQ-373
    }
}