// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>JAS39E</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>JAS39E.createInstance()</code> or <code>new JAS39E()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: SAABJAS39Gripen  = <code>3</code>; </li>
 *     <li> Specific: JAS39E  = <code>5</code>; </li>
 *     <li> Entity type uid: 25606; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@280d4882. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class JAS39E extends EntityType
{
    /** Default constructor */
    public JAS39E()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 17492, Fighter/Air Defense
        setSubCategory((byte)3); // uid 17495, SAAB JAS 39 Gripen
        setSpecific((byte)5); // uid 25606, JAS 39E
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static JAS39E createInstance()
    {
            return new JAS39E();
    }
}
