// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CG62Chancellorsville</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CG62Chancellorsville.createInstance()</code> or <code>new CG62Chancellorsville()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Cruiser = <code>3</code>; </li>
 *     <li> SubCategory: TiconderogaClass  = <code>1</code>; </li>
 *     <li> Specific: CG62Chancellorsville  = <code>16</code>; </li>
 *     <li> Entity type uid: 11340; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f95653f. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileCruiser
 * @see SubCategory

 */
public final class CG62Chancellorsville extends EntityType
{
    /** Default constructor */
    public CG62Chancellorsville()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)3); // uid 11323, Guided Missile Cruiser
        setSubCategory((byte)1); // uid 11324, Ticonderoga Class
        setSpecific((byte)16); // uid 11340, CG 62 Chancellorsville
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CG62Chancellorsville createInstance()
    {
            return new CG62Chancellorsville();
    }
}
