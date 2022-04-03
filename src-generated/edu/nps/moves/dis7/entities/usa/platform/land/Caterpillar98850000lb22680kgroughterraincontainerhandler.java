// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Caterpillar98850000lb22680kgroughterraincontainerhandler</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Caterpillar98850000lb22680kgroughterraincontainerhandler.createInstance()</code> or <code>new Caterpillar98850000lb22680kgroughterraincontainerhandler()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Tracked Utility Vehicle = <code>9</code>; </li>
 *     <li> SubCategory: Caterpillar98850000lb22680kgroughterraincontainerhandler  = <code>6</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 10602; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6f1c3f18. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeTrackedUtilityVehicle
 * @see SubCategory

 */
public final class Caterpillar98850000lb22680kgroughterraincontainerhandler extends EntityType
{
    /** Default constructor */
    public Caterpillar98850000lb22680kgroughterraincontainerhandler()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 10578, Large Tracked Utility Vehicle
        setSubCategory((byte)6); // uid 10602, Caterpillar 988 50 000-lb (22 680-kg) rough terrain container handler
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Caterpillar98850000lb22680kgroughterraincontainerhandler createInstance()
    {
            return new Caterpillar98850000lb22680kgroughterraincontainerhandler();
    }
}
