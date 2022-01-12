// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.expendable.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ELVAMarker</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ELVAMarker.createInstance()</code> or <code>new ELVAMarker()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Combined Flare and Smoke Generator = <code>12</code>; </li>
 *     <li> SubCategory: ELVAMarker  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32653; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5a78b52b. </p>
 * @see Country#OTHER
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CombinedFlareandSmokeGenerator
 * @see SubCategory

 */
public final class ELVAMarker extends EntityType
{
    /** Default constructor */
    public ELVAMarker()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)12); // uid 32652, Combined Flare and Smoke Generator
        setSubCategory((byte)1); // uid 32653, ELVA Marker
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ELVAMarker createInstance()
    {
            return new ELVAMarker();
    }
}
