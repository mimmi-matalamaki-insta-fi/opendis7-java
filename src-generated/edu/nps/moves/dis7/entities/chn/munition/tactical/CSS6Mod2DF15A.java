package edu.nps.moves.dis7.entities.chn.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@62a6674f;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: TACTICAL;
 *
 * Entity type uid: 32443
 */
public class CSS6Mod2DF15A extends EntityType
{
    /** Default constructor */
    public CSS6Mod2DF15A()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32412, Guided
        setSubCategory((byte)11); // uid 32443, CSS-6 Mod-2 (DF-15A)
    }
}