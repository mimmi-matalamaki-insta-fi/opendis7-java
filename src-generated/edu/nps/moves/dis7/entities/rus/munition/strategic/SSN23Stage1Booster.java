package edu.nps.moves.dis7.entities.rus.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4ff66917;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 32371
 */
public class SSN23Stage1Booster extends EntityType
{
    /** Default constructor */
    public SSN23Stage1Booster()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 20919, Guided
        setSubCategory((byte)40); // uid 32367, SS-N-23 Skiff
        setSpecific((byte)5); // uid 32371, SS-N-23 Stage 1 Booster
    }
}