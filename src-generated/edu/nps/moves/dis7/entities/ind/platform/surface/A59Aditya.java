// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A59Aditya</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A59Aditya.createInstance()</code> or <code>new A59Aditya()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: AdityaClassReplenishmentandRepairShipAORAR  = <code>3</code>; </li>
 *     <li> Specific: A59Aditya  = <code>1</code>; </li>
 *     <li> Entity type uid: 18853; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@37efd131. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A59Aditya extends EntityType
{
    /** Default constructor */
    public A59Aditya()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18847, Auxiliary
        setSubCategory((byte)3); // uid 18852, Aditya Class (Replenishment and Repair Ship) (AOR/AR)
        setSpecific((byte)1); // uid 18853, A59 Aditya
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A59Aditya createInstance()
    {
            return new A59Aditya();
    }
}
