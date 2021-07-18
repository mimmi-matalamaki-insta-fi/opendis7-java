package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@15deb1dc;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31583
 */
public class GenericUtilityTruck075Ton extends EntityType
{
    /** Default constructor */
    public GenericUtilityTruck075Ton()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24831, Single Unit Cargo Truck
        setSubCategory((byte)2); // uid 25818, Generic Pickup Truck, Mid-Size
        setSpecific((byte)2); // uid 31583, Generic Utility Truck 0.75 Ton
    }
}