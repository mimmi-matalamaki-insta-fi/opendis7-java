// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.arg.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>B5CaboDeHornos</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>B5CaboDeHornos.createInstance()</code> or <code>new B5CaboDeHornos()</code>. </p>
 * <ul>
 *     <li> Country: Argentina (ARG) = <code>10</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: CostaSurClassTransportShipAKR  = <code>1</code>; </li>
 *     <li> Specific: B5CaboDeHornos  = <code>3</code>; </li>
 *     <li> Entity type uid: 33213; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4aa8f0b4. </p>
 * @see Country#ARGENTINA_ARG
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class B5CaboDeHornos extends EntityType
{
    /** Default constructor */
    public B5CaboDeHornos()
    {
        setCountry(Country.ARGENTINA_ARG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18757, Auxiliary
        setSubCategory((byte)1); // uid 18758, Costa Sur Class Transport Ship (AKR)
        setSpecific((byte)3); // uid 33213, B 5 Cabo De Hornos
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static B5CaboDeHornos createInstance()
    {
            return new B5CaboDeHornos();
    }
}