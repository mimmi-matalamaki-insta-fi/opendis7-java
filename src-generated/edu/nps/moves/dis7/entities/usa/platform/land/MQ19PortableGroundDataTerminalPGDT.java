// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MQ19PortableGroundDataTerminalPGDT</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MQ19PortableGroundDataTerminalPGDT.createInstance()</code> or <code>new MQ19PortableGroundDataTerminalPGDT()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Communications Facility = <code>33</code>; </li>
 *     <li> SubCategory: MQ19C2DataLinkTerminal  = <code>5</code>; </li>
 *     <li> Specific: MQ19PortableGroundDataTerminalPGDT  = <code>2</code>; </li>
 *     <li> Entity type uid: 30189; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@68ef01a5. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CommunicationsFacility
 * @see SubCategory

 */
public final class MQ19PortableGroundDataTerminalPGDT extends EntityType
{
    /** Default constructor */
    public MQ19PortableGroundDataTerminalPGDT()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)33); // uid 10746, Communications Facility
        setSubCategory((byte)5); // uid 30187, MQ-1/9 C2 Data Link Terminal
        setSpecific((byte)2); // uid 30189, MQ-1/9 Portable Ground Data Terminal (PGDT)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MQ19PortableGroundDataTerminalPGDT createInstance()
    {
            return new MQ19PortableGroundDataTerminalPGDT();
    }
}
