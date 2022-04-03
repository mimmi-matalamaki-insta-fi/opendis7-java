// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.environmental.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Cloudwithsleetfalling</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Cloudwithsleetfalling.createInstance()</code> or <code>new Cloudwithsleetfalling()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Environmental = <code>4</code>; </li>
 *     <li> Category: Cloud with sleet falling = <code>8</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 21920; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@290807e5. </p>
 * @see Country#OTHER
 * @see EntityKind#ENVIRONMENTAL
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Cloudwithsleetfalling

 */
public final class Cloudwithsleetfalling extends EntityType
{
    /** Default constructor */
    public Cloudwithsleetfalling()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.ENVIRONMENTAL);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 21920, Cloud with sleet falling
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Cloudwithsleetfalling createInstance()
    {
            return new Cloudwithsleetfalling();
    }
}
