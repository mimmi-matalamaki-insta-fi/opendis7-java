// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MetompkinWPB1325</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MetompkinWPB1325.createInstance()</code> or <code>new MetompkinWPB1325()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Coast Guard Cutters = <code>62</code>; </li>
 *     <li> SubCategory: IslandClassWPB  = <code>5</code>; </li>
 *     <li> Specific: MetompkinWPB1325  = <code>30</code>; </li>
 *     <li> Entity type uid: 12179; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2365ea38. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CoastGuardCutters
 * @see SubCategory

 */
public final class MetompkinWPB1325 extends EntityType
{
    /** Default constructor */
    public MetompkinWPB1325()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 12104, Coast Guard Cutters
        setSubCategory((byte)5); // uid 12149, Island Class (WPB)
        setSpecific((byte)30); // uid 12179, Metompkin (WPB 1325)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MetompkinWPB1325 createInstance()
    {
            return new MetompkinWPB1325();
    }
}
