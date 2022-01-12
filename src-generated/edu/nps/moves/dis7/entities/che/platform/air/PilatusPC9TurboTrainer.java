// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.che.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PilatusPC9TurboTrainer</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PilatusPC9TurboTrainer.createInstance()</code> or <code>new PilatusPC9TurboTrainer()</code>. </p>
 * <ul>
 *     <li> Country: Switzerland (CHE) = <code>206</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trainer = <code>40</code>; </li>
 *     <li> SubCategory: PilatusPC9  = <code>2</code>; </li>
 *     <li> Specific: PilatusPC9TurboTrainer  = <code>1</code>; </li>
 *     <li> Entity type uid: 19053; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6732726. </p>
 * @see Country#SWITZERLAND_CHE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trainer
 * @see SubCategory

 */
public final class PilatusPC9TurboTrainer extends EntityType
{
    /** Default constructor */
    public PilatusPC9TurboTrainer()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 19048, Trainer
        setSubCategory((byte)2); // uid 19052, Pilatus PC-9
        setSpecific((byte)1); // uid 19053, Pilatus PC-9 Turbo Trainer
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PilatusPC9TurboTrainer createInstance()
    {
            return new PilatusPC9TurboTrainer();
    }
}
