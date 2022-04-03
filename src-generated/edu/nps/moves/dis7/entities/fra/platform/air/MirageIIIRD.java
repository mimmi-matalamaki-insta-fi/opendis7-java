// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MirageIIIRD</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MirageIIIRD.createInstance()</code> or <code>new MirageIIIRD()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Reconnaissance = <code>7</code>; </li>
 *     <li> SubCategory: MirageIII  = <code>2</code>; </li>
 *     <li> Specific: MirageIIIRD  = <code>3</code>; </li>
 *     <li> Entity type uid: 15816; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f1c29b7. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Reconnaissance
 * @see SubCategory

 */
public final class MirageIIIRD extends EntityType
{
    /** Default constructor */
    public MirageIIIRD()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 15811, Reconnaissance
        setSubCategory((byte)2); // uid 15813, Mirage III
        setSpecific((byte)3); // uid 15816, Mirage IIIRD
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MirageIIIRD createInstance()
    {
            return new MirageIIIRD();
    }
}
