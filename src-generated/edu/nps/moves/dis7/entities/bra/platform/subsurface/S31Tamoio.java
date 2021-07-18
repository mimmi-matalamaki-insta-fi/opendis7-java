package edu.nps.moves.dis7.entities.bra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d4b1c02;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 32646
 */
public class S31Tamoio extends EntityType
{
    /** Default constructor */
    public S31Tamoio()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 32643, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)2); // uid 32644, Tupi Class
        setSpecific((byte)2); // uid 32646, S31 Tamoio
    }
}