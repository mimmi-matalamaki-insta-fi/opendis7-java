// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SSBN741Maine</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SSBN741Maine.createInstance()</code> or <code>new SSBN741Maine()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSBN (Nuclear Ballistic Missile) = <code>1</code>; </li>
 *     <li> SubCategory: Ohioclass  = <code>3</code>; </li>
 *     <li> Specific: SSBN741Maine  = <code>16</code>; </li>
 *     <li> Entity type uid: 12294; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@64440065. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSBNNuclearBallisticMissile
 * @see SubCategory

 */
public final class SSBN741Maine extends EntityType
{
    /** Default constructor */
    public SSBN741Maine()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)1); // uid 12262, SSBN (Nuclear Ballistic Missile)
        setSubCategory((byte)3); // uid 12278, Ohio class
        setSpecific((byte)16); // uid 12294, SSBN 741 Maine
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SSBN741Maine createInstance()
    {
            return new SSBN741Maine();
    }
}
