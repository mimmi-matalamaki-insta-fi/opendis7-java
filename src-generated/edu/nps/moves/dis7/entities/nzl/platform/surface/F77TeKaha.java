// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nzl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F77TeKaha</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F77TeKaha.createInstance()</code> or <code>new F77TeKaha()</code>. </p>
 * <ul>
 *     <li> Country: New Zealand (NZL) = <code>156</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: ANZACClassMeko200  = <code>1</code>; </li>
 *     <li> Specific: F77TeKaha  = <code>1</code>; </li>
 *     <li> Entity type uid: 31743; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7808fb9. </p>
 * @see Country#NEW_ZEALAND_NZL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F77TeKaha extends EntityType
{
    /** Default constructor */
    public F77TeKaha()
    {
        setCountry(Country.NEW_ZEALAND_NZL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 31741, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 31742, ANZAC Class (Meko 200)
        setSpecific((byte)1); // uid 31743, F77 Te Kaha
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F77TeKaha createInstance()
    {
            return new F77TeKaha();
    }
}
