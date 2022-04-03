// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kwt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SimmoneauStandard12Classinshorepatrolcraft</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SimmoneauStandard12Classinshorepatrolcraft.createInstance()</code> or <code>new SimmoneauStandard12Classinshorepatrolcraft()</code>. </p>
 * <ul>
 *     <li> Country: Kuwait (KWT) = <code>121</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: SimmoneauStandard12Classinshorepatrolcraft  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 17920; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3088660d. </p>
 * @see Country#KUWAIT_KWT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class SimmoneauStandard12Classinshorepatrolcraft extends EntityType
{
    /** Default constructor */
    public SimmoneauStandard12Classinshorepatrolcraft()
    {
        setCountry(Country.KUWAIT_KWT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17912, Light/Patrol Craft
        setSubCategory((byte)3); // uid 17920, Simmoneau Standard 12 Class (inshore patrol craft)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SimmoneauStandard12Classinshorepatrolcraft createInstance()
    {
            return new SimmoneauStandard12Classinshorepatrolcraft();
    }
}
