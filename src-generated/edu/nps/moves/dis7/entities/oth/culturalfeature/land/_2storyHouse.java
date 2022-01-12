// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_2storyHouse</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_2storyHouse.createInstance()</code> or <code>new _2storyHouse()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Camp Lejeune MOUT Collective Training Facility (CTF) = <code>14</code>; </li>
 *     <li> SubCategory: ResidentialBuilding  = <code>3</code>; </li>
 *     <li> Specific: _2storyHouse  = <code>3</code>; </li>
 *     <li> Entity type uid: 22057; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@559e3f67. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CampLejeuneMOUTCollectiveTrainingFacilityCTF
 * @see SubCategory

 */
public final class _2storyHouse extends EntityType
{
    /** Default constructor */
    public _2storyHouse()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 22040, Camp Lejeune MOUT Collective Training Facility (CTF)
        setSubCategory((byte)3); // uid 22054, Residential Building
        setSpecific((byte)3); // uid 22057, 2-story House
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _2storyHouse createInstance()
    {
            return new _2storyHouse();
    }
}
