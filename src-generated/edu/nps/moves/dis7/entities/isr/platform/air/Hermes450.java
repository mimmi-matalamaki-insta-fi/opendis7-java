package edu.nps.moves.dis7.entities.isr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@37ddb69a;
 * Country: Israel (ISR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 23488
 */
public class Hermes450 extends EntityType
{
    /** Default constructor */
    public Hermes450()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 23487, Unmanned
        setSubCategory((byte)1); // uid 23488, Hermes 450
    }
}