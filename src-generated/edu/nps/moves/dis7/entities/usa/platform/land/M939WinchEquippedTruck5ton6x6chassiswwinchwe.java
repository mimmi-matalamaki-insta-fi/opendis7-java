package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5b20706;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10460
 */
public class M939WinchEquippedTruck5ton6x6chassiswwinchwe extends EntityType
{
    /** Default constructor */
    public M939WinchEquippedTruck5ton6x6chassiswwinchwe()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)5); // uid 10435, M939 6X6 5-ton cargo truck
        setSpecific((byte)25); // uid 10460, M939 [Winch Equipped] - Truck, 5-ton, 6x6, chassis, w/winch, w/e
    }
}