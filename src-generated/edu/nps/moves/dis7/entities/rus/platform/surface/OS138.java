// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>OS138</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>OS138.createInstance()</code> or <code>new OS138()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol craft = <code>7</code>; </li>
 *     <li> SubCategory: Potokclasstorpedoexperimentalships  = <code>16</code>; </li>
 *     <li> Specific: OS138  = <code>2</code>; </li>
 *     <li> Entity type uid: 13690; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2e51d054. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolcraft
 * @see SubCategory

 */
public final class OS138 extends EntityType
{
    /** Default constructor */
    public OS138()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 13670, Light/Patrol craft
        setSubCategory((byte)16); // uid 13688, Potok class (torpedo experimental ships)
        setSpecific((byte)2); // uid 13690, OS-138
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static OS138 createInstance()
    {
            return new OS138();
    }
}
