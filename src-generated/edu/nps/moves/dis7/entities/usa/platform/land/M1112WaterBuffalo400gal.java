// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M1112WaterBuffalo400gal</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1112WaterBuffalo400gal.createInstance()</code> or <code>new M1112WaterBuffalo400gal()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Water trailer = <code>17</code>; </li>
 *     <li> SubCategory: _11000gallons  = <code>1</code>; </li>
 *     <li> Specific: M1112WaterBuffalo400gal  = <code>4</code>; </li>
 *     <li> Entity type uid: 33018; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@c3719e5. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Watertrailer
 * @see SubCategory

 */
public final class M1112WaterBuffalo400gal extends EntityType
{
    /** Default constructor */
    public M1112WaterBuffalo400gal()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)17); // uid 10633, Water trailer
        setSubCategory((byte)1); // uid 10634, 1-1000 gallons
        setSpecific((byte)4); // uid 33018, M1112 Water Buffalo (400 gal)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1112WaterBuffalo400gal createInstance()
    {
            return new M1112WaterBuffalo400gal();
    }
}
