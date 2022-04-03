// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BackhoeLoaderCaterpillar420E</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BackhoeLoaderCaterpillar420E.createInstance()</code> or <code>new BackhoeLoaderCaterpillar420E()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Engineer Equipment = <code>18</code>; </li>
 *     <li> SubCategory: ScoopLoaderTypeDED4x4  = <code>6</code>; </li>
 *     <li> Specific: BackhoeLoaderCaterpillar420E  = <code>3</code>; </li>
 *     <li> Entity type uid: 33507; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@15c6027d. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see EngineerEquipment
 * @see SubCategory

 */
public final class BackhoeLoaderCaterpillar420E extends EntityType
{
    /** Default constructor */
    public BackhoeLoaderCaterpillar420E()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)18); // uid 10638, Engineer Equipment
        setSubCategory((byte)6); // uid 22978, Scoop Loader, Type DED, 4x4
        setSpecific((byte)3); // uid 33507, Backhoe Loader, Caterpillar 420E
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BackhoeLoaderCaterpillar420E createInstance()
    {
            return new BackhoeLoaderCaterpillar420E();
    }
}
