package edu.nps.moves.dis7.entities.bra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@32e6e9c3;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25693
 */
public class EE11Urutu extends EntityType
{
    /** Default constructor */
    public EE11Urutu()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 25690, Armored Fighting Vehicle
        setSubCategory((byte)3); // uid 25693, EE-11 Urutu
    }
}