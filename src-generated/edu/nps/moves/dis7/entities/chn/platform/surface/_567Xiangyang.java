package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@25a65b77;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 25197
 */
public class _567Xiangyang extends EntityType
{
    /** Default constructor */
    public _567Xiangyang()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 17073, Guided Missile Frigate (FFG)
        setSubCategory((byte)10); // uid 25189, Jiangwei-II Class (Type 053H3)
        setSpecific((byte)8); // uid 25197, 567 Xiangyang
    }
}