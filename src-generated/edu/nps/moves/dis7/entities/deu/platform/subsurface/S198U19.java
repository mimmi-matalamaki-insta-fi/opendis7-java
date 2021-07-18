package edu.nps.moves.dis7.entities.deu.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@67d18ed7;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 16761
 */
public class S198U19 extends EntityType
{
    /** Default constructor */
    public S198U19()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 16757, SS (Conventional attack-torpedo patrol)
        setSubCategory((byte)1); // uid 16758, Type 206
        setSpecific((byte)3); // uid 16761, S 198 U 19
    }
}