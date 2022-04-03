// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FiatLinea</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FiatLinea.createInstance()</code> or <code>new FiatLinea()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Car = <code>81</code>; </li>
 *     <li> SubCategory: _4DoorSedanEconomyCompactSmall  = <code>42</code>; </li>
 *     <li> Specific: FiatLinea  = <code>2</code>; </li>
 *     <li> Entity type uid: 24859; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@782a4fff. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Car
 * @see SubCategory

 */
public final class FiatLinea extends EntityType
{
    /** Default constructor */
    public FiatLinea()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24856, Car
        setSubCategory((byte)42); // uid 24857, 4-Door Sedan, Economy/Compact (Small)
        setSpecific((byte)2); // uid 24859, Fiat Linea
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FiatLinea createInstance()
    {
            return new FiatLinea();
    }
}
