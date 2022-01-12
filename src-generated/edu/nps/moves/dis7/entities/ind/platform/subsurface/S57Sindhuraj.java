// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S57Sindhuraj</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S57Sindhuraj.createInstance()</code> or <code>new S57Sindhuraj()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack - Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: SindhughoshKiloClass  = <code>1</code>; </li>
 *     <li> Specific: S57Sindhuraj  = <code>3</code>; </li>
 *     <li> Entity type uid: 23193; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a5b3fee. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class S57Sindhuraj extends EntityType
{
    /** Default constructor */
    public S57Sindhuraj()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23189, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 23190, Sindhughosh (Kilo) Class
        setSpecific((byte)3); // uid 23193, S 57 Sindhuraj
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S57Sindhuraj createInstance()
    {
            return new S57Sindhuraj();
    }
}
