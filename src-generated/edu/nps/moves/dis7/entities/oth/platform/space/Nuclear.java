// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Nuclear</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Nuclear.createInstance()</code> or <code>new Nuclear()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Satellite - Earth Observation = <code>16</code>; </li>
 *     <li> SubCategory: MASINT  = <code>2</code>; </li>
 *     <li> Specific: Nuclear  = <code>2</code>; </li>
 *     <li> Entity type uid: 33124; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@15fdd1f2. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SatelliteEarthObservation
 * @see SubCategory

 */
public final class Nuclear extends EntityType
{
    /** Default constructor */
    public Nuclear()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)16); // uid 33119, Satellite - Earth Observation
        setSubCategory((byte)2); // uid 33122, MASINT
        setSpecific((byte)2); // uid 33124, Nuclear
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Nuclear createInstance()
    {
            return new Nuclear();
    }
}
