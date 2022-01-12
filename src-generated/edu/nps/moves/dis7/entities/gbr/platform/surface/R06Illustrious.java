// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>R06Illustrious</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>R06Illustrious.createInstance()</code> or <code>new R06Illustrious()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light carrier = <code>12</code>; </li>
 *     <li> SubCategory: LightaircraftcarrierCVSG  = <code>1</code>; </li>
 *     <li> Specific: R06Illustrious  = <code>2</code>; </li>
 *     <li> Entity type uid: 15367; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e977098. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Lightcarrier
 * @see SubCategory

 */
public final class R06Illustrious extends EntityType
{
    /** Default constructor */
    public R06Illustrious()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)12); // uid 15364, Light carrier
        setSubCategory((byte)1); // uid 15365, Light aircraft carrier (CVSG)
        setSpecific((byte)2); // uid 15367, R 06 Illustrious
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static R06Illustrious createInstance()
    {
            return new R06Illustrious();
    }
}
