package edu.nps.moves.dis7.entities.lka.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@b16e202;
 * Country: Sri Lanka (LKA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26426
 */
public class ColomboClassSeriesIII extends EntityType
{
    /** Default constructor */
    public ColomboClassSeriesIII()
    {
        setCountry(Country.SRI_LANKA_LKA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26422, Light/Patrol Craft
        setSubCategory((byte)1); // uid 26423, Colombo Class Ultra Fast Attack Craft
        setSpecific((byte)3); // uid 26426, Colombo Class Series III
    }
}