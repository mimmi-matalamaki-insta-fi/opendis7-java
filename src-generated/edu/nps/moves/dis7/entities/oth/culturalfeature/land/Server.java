// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Server</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Server.createInstance()</code> or <code>new Server()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Electronics = <code>27</code>; </li>
 *     <li> SubCategory: Computer  = <code>2</code>; </li>
 *     <li> Specific: Server  = <code>4</code>; </li>
 *     <li> Entity type uid: 26524; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6cc56b32. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Electronics
 * @see SubCategory

 */
public final class Server extends EntityType
{
    /** Default constructor */
    public Server()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)27); // uid 26518, Electronics
        setSubCategory((byte)2); // uid 26520, Computer
        setSpecific((byte)4); // uid 26524, Server
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Server createInstance()
    {
            return new Server();
    }
}
