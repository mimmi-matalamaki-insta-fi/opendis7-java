// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericTroller</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericTroller.createInstance()</code> or <code>new GenericTroller()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fishing Vessel = <code>86</code>; </li>
 *     <li> SubCategory: GenericMediumFishingVesselupto65ft198m  = <code>2</code>; </li>
 *     <li> Specific: GenericTroller  = <code>1</code>; </li>
 *     <li> Entity type uid: 26561; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d91790b. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FishingVessel
 * @see SubCategory

 */
public final class GenericTroller extends EntityType
{
    /** Default constructor */
    public GenericTroller()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)86); // uid 24650, Fishing Vessel
        setSubCategory((byte)2); // uid 24652, Generic Medium Fishing Vessel (up to 65ft/19.8m)
        setSpecific((byte)1); // uid 26561, Generic Troller
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericTroller createInstance()
    {
            return new GenericTroller();
    }
}
