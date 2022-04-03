// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.egy.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PolnochnyAClass301</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PolnochnyAClass301.createInstance()</code> or <code>new PolnochnyAClass301()</code>. </p>
 * <ul>
 *     <li> Country: Egypt (EGY) = <code>62</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank Landing Ship = <code>10</code>; </li>
 *     <li> SubCategory: PolnochnyAClass  = <code>1</code>; </li>
 *     <li> Specific: _301  = <code>1</code>; </li>
 *     <li> Entity type uid: 33565; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d0d9fe7. </p>
 * @see Country#COMMENT_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankLandingShip
 * @see SubCategory

 */
public final class PolnochnyAClass301 extends EntityType
{
    /** Default constructor */
    public PolnochnyAClass301()
    {
        setCountry(Country.COMMENT_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 33563, Tank Landing Ship
        setSubCategory((byte)1); // uid 33564, Polnochny A Class
        setSpecific((byte)1); // uid 33565, 301
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PolnochnyAClass301 createInstance()
    {
            return new PolnochnyAClass301();
    }
}
