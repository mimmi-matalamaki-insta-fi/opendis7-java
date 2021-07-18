package edu.nps.moves.dis7.entities.lva.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@46074492;
 * Country: Latvia (LVA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27793
 */
public class VidarClass extends EntityType
{
    /** Default constructor */
    public VidarClass()
    {
        setCountry(Country.LATVIA_LVA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27786, Mine Countermeasure Ship/Craft
        setSubCategory((byte)2); // uid 27793, Vidar Class
    }
}