// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AlligatorClassLST</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AlligatorClassLST.createInstance()</code> or <code>new AlligatorClassLST()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Republic of) (KOR) = <code>120</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank Landing Ship = <code>10</code>; </li>
 *     <li> SubCategory: AlligatorClassLST  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 17710; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@65e7f52a. </p>
 * @see Country#KOREA_REPUBLIC_OF_KOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankLandingShip
 * @see SubCategory

 */
public final class AlligatorClassLST extends EntityType
{
    /** Default constructor */
    public AlligatorClassLST()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 17709, Tank Landing Ship
        setSubCategory((byte)1); // uid 17710, Alligator Class (LST)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AlligatorClassLST createInstance()
    {
            return new AlligatorClassLST();
    }
}
