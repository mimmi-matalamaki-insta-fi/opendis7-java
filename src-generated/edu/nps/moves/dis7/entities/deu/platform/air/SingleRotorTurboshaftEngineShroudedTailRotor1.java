package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4d518b32;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 31749
 */
public class SingleRotorTurboshaftEngineShroudedTailRotor1 extends EntityType
{
    /** Default constructor */
    public SingleRotorTurboshaftEngineShroudedTailRotor1()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)91); // uid 31746, Civilian Helicopter, Medium (up to 20,000 lbs / 9,072 kg)
        setSubCategory((byte)13); // uid 31749, Single Rotor, Turboshaft Engine, Shrouded Tail Rotor
    }
}