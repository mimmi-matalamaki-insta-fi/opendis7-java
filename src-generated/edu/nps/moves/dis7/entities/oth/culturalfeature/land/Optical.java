// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Optical</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Optical.createInstance()</code> or <code>new Optical()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Electronics = <code>27</code>; </li>
 *     <li> SubCategory: Storage  = <code>5</code>; </li>
 *     <li> Specific: Optical  = <code>1</code>; </li>
 *     <li> Entity type uid: 26531; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@30e143ff. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Electronics
 * @see SubCategory

 */
public final class Optical extends EntityType
{
    /** Default constructor */
    public Optical()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)27); // uid 26518, Electronics
        setSubCategory((byte)5); // uid 26530, Storage
        setSpecific((byte)1); // uid 26531, Optical
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Optical createInstance()
    {
            return new Optical();
    }
}
