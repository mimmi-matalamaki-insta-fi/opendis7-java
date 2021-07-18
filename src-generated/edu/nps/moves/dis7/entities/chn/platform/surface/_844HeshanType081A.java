package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@78dd667e;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30553
 */
public class _844HeshanType081A extends EntityType
{
    /** Default constructor */
    public _844HeshanType081A()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17178, Mine Countermeasure Ship/Craft
        setSubCategory((byte)8); // uid 30545, Wochi Class (Type 081/081A)
        setSpecific((byte)8); // uid 30553, 844 Heshan (Type 081A)
    }
}