// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tur.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MKEKBoran105mmFieldGun</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MKEKBoran105mmFieldGun.createInstance()</code> or <code>new MKEKBoran105mmFieldGun()</code>. </p>
 * <ul>
 *     <li> Country: Turkey (TUR) = <code>218</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Towed Artillery = <code>5</code>; </li>
 *     <li> SubCategory: MKEKBoran105mmFieldGun  = <code>4</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 34316; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4232b34a. </p>
 * @see Country#TURKEY_TUR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TowedArtillery
 * @see SubCategory

 */
public final class MKEKBoran105mmFieldGun extends EntityType
{
    /** Default constructor */
    public MKEKBoran105mmFieldGun()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 34312, Towed Artillery
        setSubCategory((byte)4); // uid 34316, MKEK Boran 105 mm Field Gun
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MKEKBoran105mmFieldGun createInstance()
    {
            return new MKEKBoran105mmFieldGun();
    }
}
