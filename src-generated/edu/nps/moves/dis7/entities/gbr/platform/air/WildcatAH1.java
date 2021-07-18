package edu.nps.moves.dis7.entities.gbr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4397a639;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 30260
 */
public class WildcatAH1 extends EntityType
{
    /** Default constructor */
    public WildcatAH1()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 15091, Utility helicopter
        setSubCategory((byte)20); // uid 30259, AgustaWestland AW159 Wildcat
        setSpecific((byte)1); // uid 30260, Wildcat AH1
    }
}