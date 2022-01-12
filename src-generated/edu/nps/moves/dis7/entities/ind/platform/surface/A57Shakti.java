// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A57Shakti</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A57Shakti.createInstance()</code> or <code>new A57Shakti()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: DeepakClassReplenishmentTankerAOR  = <code>1</code>; </li>
 *     <li> Specific: A57Shakti  = <code>1</code>; </li>
 *     <li> Entity type uid: 18849; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@53f0a4cb. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A57Shakti extends EntityType
{
    /** Default constructor */
    public A57Shakti()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18847, Auxiliary
        setSubCategory((byte)1); // uid 18848, Deepak Class (Replenishment Tanker) ( AOR)
        setSpecific((byte)1); // uid 18849, A57 Shakti
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A57Shakti createInstance()
    {
            return new A57Shakti();
    }
}
