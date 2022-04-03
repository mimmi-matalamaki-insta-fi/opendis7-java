// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MJU50B</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MJU50B.createInstance()</code> or <code>new MJU50B()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Flare = <code>2</code>; </li>
 *     <li> SubCategory: MJU50Flare  = <code>18</code>; </li>
 *     <li> Specific: MJU50B  = <code>1</code>; </li>
 *     <li> Entity type uid: 24186; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5d93ff21. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Flare
 * @see SubCategory

 */
public final class MJU50B extends EntityType
{
    /** Default constructor */
    public MJU50B()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 22242, Flare
        setSubCategory((byte)18); // uid 24185, MJU-50 Flare
        setSpecific((byte)1); // uid 24186, MJU-50/B
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MJU50B createInstance()
    {
            return new MJU50B();
    }
}
