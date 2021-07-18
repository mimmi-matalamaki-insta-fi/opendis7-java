package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1894e40d;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27662
 */
public class CombatVehicleCV90TankCV90120 extends EntityType
{
    /** Default constructor */
    public CombatVehicleCV90TankCV90120()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 17469, Tank
        setSubCategory((byte)2); // uid 27662, Combat Vehicle CV90 Tank (CV90120)
    }
}