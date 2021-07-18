package edu.nps.moves.dis7.entities.twn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@74174a23;
 * Country: Taiwan, Province of China (TWN);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 19239
 */
public class HaiShihexGuppyII extends EntityType
{
    /** Default constructor */
    public HaiShihexGuppyII()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 19238, SS (Conventional Attack-Torpedo Patrol)
        setSubCategory((byte)1); // uid 19239, Hai Shih (ex. Guppy II)
    }
}