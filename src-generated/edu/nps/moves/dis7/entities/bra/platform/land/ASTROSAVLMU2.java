// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ASTROSAVLMU2</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ASTROSAVLMU2.createInstance()</code> or <code>new ASTROSAVLMU2()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: LauncherASTROSAVLMU  = <code>1</code>; </li>
 *     <li> Specific: ASTROSAVLMU2  = <code>1</code>; </li>
 *     <li> Entity type uid: 32024; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@31ef45e3. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class ASTROSAVLMU2 extends EntityType
{
    /** Default constructor */
    public ASTROSAVLMU2()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 24386, Self-Propelled Artillery
        setSubCategory((byte)1); // uid 24387, Launcher ASTROS AV-LMU
        setSpecific((byte)1); // uid 32024, ASTROS AV-LMU 2
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ASTROSAVLMU2 createInstance()
    {
            return new ASTROSAVLMU2();
    }
}
