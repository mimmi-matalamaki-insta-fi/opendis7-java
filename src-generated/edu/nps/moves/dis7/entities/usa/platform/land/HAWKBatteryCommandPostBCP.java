package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@787508ca;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10684
 */
public class HAWKBatteryCommandPostBCP extends EntityType
{
    /** Default constructor */
    public HAWKBatteryCommandPostBCP()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 10679, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 10680, MIM-23 Raytheon HAWK Low-to-Medium Altitude SAM System
        setSpecific((byte)2); // uid 10683, Battery
        setExtra((byte)1); // uid 10684, HAWK Battery Command Post (BCP)
    }
}