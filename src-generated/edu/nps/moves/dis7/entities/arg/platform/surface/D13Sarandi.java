// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.arg.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>D13Sarandi</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>D13Sarandi.createInstance()</code> or <code>new D13Sarandi()</code>. </p>
 * <ul>
 *     <li> Country: Argentina (ARG) = <code>10</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer = <code>4</code>; </li>
 *     <li> SubCategory: AlmiranteBrownClassMeko360H2  = <code>1</code>; </li>
 *     <li> Specific: D13Sarandi  = <code>4</code>; </li>
 *     <li> Entity type uid: 31256; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d591d15. </p>
 * @see Country#ARGENTINA_ARG
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyer
 * @see SubCategory

 */
public final class D13Sarandi extends EntityType
{
    /** Default constructor */
    public D13Sarandi()
    {
        setCountry(Country.ARGENTINA_ARG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 18755, Guided Missile Destroyer
        setSubCategory((byte)1); // uid 18756, Almirante Brown Class (Meko 360H2)
        setSpecific((byte)4); // uid 31256, D 13 Sarandi
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static D13Sarandi createInstance()
    {
            return new D13Sarandi();
    }
}
