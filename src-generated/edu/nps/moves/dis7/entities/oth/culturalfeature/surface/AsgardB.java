// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AsgardB</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AsgardB.createInstance()</code> or <code>new AsgardB()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Oil Platform = <code>1</code>; </li>
 *     <li> SubCategory: OilPlatformSemiSubmersible  = <code>3</code>; </li>
 *     <li> Specific: AsgardB  = <code>1</code>; </li>
 *     <li> Entity type uid: 29680; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@31443680. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see OilPlatform
 * @see SubCategory

 */
public final class AsgardB extends EntityType
{
    /** Default constructor */
    public AsgardB()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 22124, Oil Platform
        setSubCategory((byte)3); // uid 25246, Oil Platform, Semi-Submersible
        setSpecific((byte)1); // uid 29680, Asgard B
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AsgardB createInstance()
    {
            return new AsgardB();
    }
}
