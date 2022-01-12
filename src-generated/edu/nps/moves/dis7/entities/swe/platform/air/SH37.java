// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SH37</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SH37.createInstance()</code> or <code>new SH37()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: Saab37Viggen  = <code>2</code>; </li>
 *     <li> Specific: SH37  = <code>4</code>; </li>
 *     <li> Entity type uid: 25623; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77049094. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class SH37 extends EntityType
{
    /** Default constructor */
    public SH37()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 17492, Fighter/Air Defense
        setSubCategory((byte)2); // uid 17494, Saab 37 Viggen
        setSpecific((byte)4); // uid 25623, SH 37
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SH37 createInstance()
    {
            return new SH37();
    }
}
