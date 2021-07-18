package edu.nps.moves.dis7.entities.chn.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@231cdda8;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: TACTICAL;
 *
 * Entity type uid: 21575
 */
public class Ballistic extends EntityType
{
    /** Default constructor */
    public Ballistic()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)2); // uid 21575, Ballistic
    }
}