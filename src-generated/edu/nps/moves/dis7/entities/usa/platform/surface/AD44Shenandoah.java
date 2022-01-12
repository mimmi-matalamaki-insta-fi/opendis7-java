// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AD44Shenandoah</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AD44Shenandoah.createInstance()</code> or <code>new AD44Shenandoah()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Destroyer Tender = <code>53</code>; </li>
 *     <li> SubCategory: SamGompersYellowstoneClass  = <code>1</code>; </li>
 *     <li> Specific: AD44Shenandoah  = <code>6</code>; </li>
 *     <li> Entity type uid: 11963; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@544e3679. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DestroyerTender
 * @see SubCategory

 */
public final class AD44Shenandoah extends EntityType
{
    /** Default constructor */
    public AD44Shenandoah()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)53); // uid 11956, Destroyer Tender
        setSubCategory((byte)1); // uid 11957, Sam Gompers/Yellowstone Class
        setSpecific((byte)6); // uid 11963, AD 44 Shenandoah
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AD44Shenandoah createInstance()
    {
            return new AD44Shenandoah();
    }
}
