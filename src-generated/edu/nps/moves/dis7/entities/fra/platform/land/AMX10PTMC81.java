// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AMX10PTMC81</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AMX10PTMC81.createInstance()</code> or <code>new AMX10PTMC81()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: AMX10PIFV  = <code>8</code>; </li>
 *     <li> Specific: AMX10PTMC81  = <code>4</code>; </li>
 *     <li> Entity type uid: 33196; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@97e93f1. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class AMX10PTMC81 extends EntityType
{
    /** Default constructor */
    public AMX10PTMC81()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 15645, Armored Fighting Vehicle
        setSubCategory((byte)8); // uid 15653, AMX-10P IFV
        setSpecific((byte)4); // uid 33196, AMX-10P TMC-81
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AMX10PTMC81 createInstance()
    {
            return new AMX10PTMC81();
    }
}
