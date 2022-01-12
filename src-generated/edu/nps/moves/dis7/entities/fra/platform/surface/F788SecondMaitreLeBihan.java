// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F788SecondMaitreLeBihan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F788SecondMaitreLeBihan.createInstance()</code> or <code>new F788SecondMaitreLeBihan()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate = <code>50</code>; </li>
 *     <li> SubCategory: DestienneDorvesTypeA69class  = <code>1</code>; </li>
 *     <li> Specific: F788SecondMaitreLeBihan  = <code>8</code>; </li>
 *     <li> Entity type uid: 16154; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@16c069df. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Frigate
 * @see SubCategory

 */
public final class F788SecondMaitreLeBihan extends EntityType
{
    /** Default constructor */
    public F788SecondMaitreLeBihan()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 16145, Frigate
        setSubCategory((byte)1); // uid 16146, Destienne Dorves (Type A 69) class
        setSpecific((byte)8); // uid 16154, F 788 Second Maitre Le Bihan
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F788SecondMaitreLeBihan createInstance()
    {
            return new F788SecondMaitreLeBihan();
    }
}
