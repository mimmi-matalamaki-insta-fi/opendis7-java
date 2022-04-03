// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.arg.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>B3CanalBeagle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>B3CanalBeagle.createInstance()</code> or <code>new B3CanalBeagle()</code>. </p>
 * <ul>
 *     <li> Country: Argentina (ARG) = <code>10</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: CostaSurClassTransportShipAKR  = <code>1</code>; </li>
 *     <li> Specific: B3CanalBeagle  = <code>1</code>; </li>
 *     <li> Entity type uid: 33211; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59f95c5d. </p>
 * @see Country#ARGENTINA_ARG
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class B3CanalBeagle extends EntityType
{
    /** Default constructor */
    public B3CanalBeagle()
    {
        setCountry(Country.ARGENTINA_ARG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18757, Auxiliary
        setSubCategory((byte)1); // uid 18758, Costa Sur Class Transport Ship (AKR)
        setSpecific((byte)1); // uid 33211, B 3 Canal Beagle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static B3CanalBeagle createInstance()
    {
            return new B3CanalBeagle();
    }
}
