// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F786QuartierMaitreAnquetil</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F786QuartierMaitreAnquetil.createInstance()</code> or <code>new F786QuartierMaitreAnquetil()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate = <code>50</code>; </li>
 *     <li> SubCategory: DestienneDorvesTypeA69class  = <code>1</code>; </li>
 *     <li> Specific: F786QuartierMaitreAnquetil  = <code>6</code>; </li>
 *     <li> Entity type uid: 16152; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@78d6692f. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Frigate
 * @see SubCategory

 */
public final class F786QuartierMaitreAnquetil extends EntityType
{
    /** Default constructor */
    public F786QuartierMaitreAnquetil()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 16145, Frigate
        setSubCategory((byte)1); // uid 16146, D'estienne D'orves (Type A 69) class
        setSpecific((byte)6); // uid 16152, F 786 Quartier Maitre Anquetil
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F786QuartierMaitreAnquetil createInstance()
    {
            return new F786QuartierMaitreAnquetil();
    }
}
