package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@766653e6;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30300
 */
public class F224SachsenAnhalt extends EntityType
{
    /** Default constructor */
    public F224SachsenAnhalt()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 16397, Guided Missile Frigate
        setSubCategory((byte)4); // uid 30297, Baden-Wurttemberg Class (Type 125)
        setSpecific((byte)3); // uid 30300, F224 Sachsen-Anhalt
    }
}