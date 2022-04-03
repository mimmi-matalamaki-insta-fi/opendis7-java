// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kor.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>KSS1TolgoraeClassmidgetsubmarine051053</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>KSS1TolgoraeClassmidgetsubmarine051053.createInstance()</code> or <code>new KSS1TolgoraeClassmidgetsubmarine051053()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Republic of) (KOR) = <code>120</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSA (Conventional Auxiliary) = <code>7</code>; </li>
 *     <li> SubCategory: KSS1TolgoraeClassmidgetsubmarine  = <code>1</code>; </li>
 *     <li> Specific: _051053  = <code>1</code>; </li>
 *     <li> Entity type uid: 17744; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@66d57c1b. </p>
 * @see Country#KOREA_REPUBLIC_OF_KOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSAConventionalAuxiliary
 * @see SubCategory

 */
public final class KSS1TolgoraeClassmidgetsubmarine051053 extends EntityType
{
    /** Default constructor */
    public KSS1TolgoraeClassmidgetsubmarine051053()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)7); // uid 17742, SSA (Conventional Auxiliary)
        setSubCategory((byte)1); // uid 17743, KSS-1 Tolgorae Class (midget submarine)
        setSpecific((byte)1); // uid 17744, 051-053
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static KSS1TolgoraeClassmidgetsubmarine051053 createInstance()
    {
            return new KSS1TolgoraeClassmidgetsubmarine051053();
    }
}
