// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F35ACTOL</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F35ACTOL.createInstance()</code> or <code>new F35ACTOL()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: F35JointStrikeFighterJSF  = <code>2</code>; </li>
 *     <li> Specific: F35ACTOL  = <code>1</code>; </li>
 *     <li> Entity type uid: 29314; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@66048bfd. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class F35ACTOL extends EntityType
{
    /** Default constructor */
    public F35ACTOL()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 29312, Fighter/Air Defense
        setSubCategory((byte)2); // uid 29313, F-35 Joint Strike Fighter (JSF)
        setSpecific((byte)1); // uid 29314, F-35A CTOL
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F35ACTOL createInstance()
    {
            return new F35ACTOL();
    }
}
