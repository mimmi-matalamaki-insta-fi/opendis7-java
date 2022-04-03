// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>L9893SanMarco</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>L9893SanMarco.createInstance()</code> or <code>new L9893SanMarco()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Transport Dock = <code>56</code>; </li>
 *     <li> SubCategory: SanGiorgioClassLPDs  = <code>1</code>; </li>
 *     <li> Specific: L9893SanMarco  = <code>2</code>; </li>
 *     <li> Entity type uid: 18638; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@372b0d86. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousTransportDock
 * @see SubCategory

 */
public final class L9893SanMarco extends EntityType
{
    /** Default constructor */
    public L9893SanMarco()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 18635, Amphibious Transport Dock
        setSubCategory((byte)1); // uid 18636, San Giorgio Class (LPDs)
        setSpecific((byte)2); // uid 18638, L9893 San Marco
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static L9893SanMarco createInstance()
    {
            return new L9893SanMarco();
    }
}
