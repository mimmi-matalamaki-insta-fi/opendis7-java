// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MJU52B</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MJU52B.createInstance()</code> or <code>new MJU52B()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Flare = <code>2</code>; </li>
 *     <li> SubCategory: MJU52Flare  = <code>40</code>; </li>
 *     <li> Specific: MJU52B  = <code>1</code>; </li>
 *     <li> Entity type uid: 30029; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5896b9f5. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Flare
 * @see SubCategory

 */
public final class MJU52B extends EntityType
{
    /** Default constructor */
    public MJU52B()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 22242, Flare
        setSubCategory((byte)40); // uid 30028, MJU-52 Flare
        setSpecific((byte)1); // uid 30029, MJU-52/B
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MJU52B createInstance()
    {
            return new MJU52B();
    }
}
