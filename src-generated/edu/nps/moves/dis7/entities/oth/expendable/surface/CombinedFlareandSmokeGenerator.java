// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.expendable.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CombinedFlareandSmokeGenerator</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CombinedFlareandSmokeGenerator.createInstance()</code> or <code>new CombinedFlareandSmokeGenerator()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Combined Flare and Smoke Generator = <code>12</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32652; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@18887028. </p>
 * @see Country#OTHER
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CombinedFlareandSmokeGenerator

 */
public final class CombinedFlareandSmokeGenerator extends EntityType
{
    /** Default constructor */
    public CombinedFlareandSmokeGenerator()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)12); // uid 32652, Combined Flare and Smoke Generator
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CombinedFlareandSmokeGenerator createInstance()
    {
            return new CombinedFlareandSmokeGenerator();
    }
}
