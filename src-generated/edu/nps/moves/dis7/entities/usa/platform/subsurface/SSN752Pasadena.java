// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SSN752Pasadena</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SSN752Pasadena.createInstance()</code> or <code>new SSN752Pasadena()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSN (Nuclear Attack-Torpedo) = <code>3</code>; </li>
 *     <li> SubCategory: LosAngelesclass  = <code>4</code>; </li>
 *     <li> Specific: SSN752Pasadena  = <code>41</code>; </li>
 *     <li> Entity type uid: 12383; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@49653791. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSNNuclearAttackTorpedo
 * @see SubCategory

 */
public final class SSN752Pasadena extends EntityType
{
    /** Default constructor */
    public SSN752Pasadena()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 12301, SSN (Nuclear Attack-Torpedo)
        setSubCategory((byte)4); // uid 12342, Los Angeles class
        setSpecific((byte)41); // uid 12383, SSN 752 Pasadena
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SSN752Pasadena createInstance()
    {
            return new SSN752Pasadena();
    }
}
