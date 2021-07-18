package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1200458e;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 10985
 */
public class OV10DPlus extends EntityType
{
    /** Default constructor */
    public OV10DPlus()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 10963, Anti-Submarine/patrol/observation
        setSubCategory((byte)3); // uid 10983, Rockwell International OV-10 Bronco
        setSpecific((byte)2); // uid 10985, OV-10D Plus
    }
}