// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tur.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S354Sakarya</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S354Sakarya.createInstance()</code> or <code>new S354Sakarya()</code>. </p>
 * <ul>
 *     <li> Country: Turkey (TUR) = <code>218</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack-Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: Prevezeclass  = <code>2</code>; </li>
 *     <li> Specific: S354Sakarya  = <code>2</code>; </li>
 *     <li> Entity type uid: 23203; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@28f9fedd. </p>
 * @see Country#TURKEY_TUR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class S354Sakarya extends EntityType
{
    /** Default constructor */
    public S354Sakarya()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 19067, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)2); // uid 23201, Preveze class
        setSpecific((byte)2); // uid 23203, S354 Sakarya
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S354Sakarya createInstance()
    {
            return new S354Sakarya();
    }
}
