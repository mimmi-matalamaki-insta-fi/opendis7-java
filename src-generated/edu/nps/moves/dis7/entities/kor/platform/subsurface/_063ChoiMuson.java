// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kor.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_063ChoiMuson</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_063ChoiMuson.createInstance()</code> or <code>new _063ChoiMuson()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Republic of) (KOR) = <code>120</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack-Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: ChangBogoType209Class  = <code>1</code>; </li>
 *     <li> Specific: _063ChoiMuson  = <code>3</code>; </li>
 *     <li> Entity type uid: 17741; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@38b972d7. </p>
 * @see Country#KOREA_REPUBLIC_OF_KOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class _063ChoiMuson extends EntityType
{
    /** Default constructor */
    public _063ChoiMuson()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 17737, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)1); // uid 17738, Chang Bogo (Type 209) Class)
        setSpecific((byte)3); // uid 17741, 063 Choi Muson
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _063ChoiMuson createInstance()
    {
            return new _063ChoiMuson();
    }
}
