// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.qat.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Q03Rbigah</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Q03Rbigah.createInstance()</code> or <code>new Q03Rbigah()</code>. </p>
 * <ul>
 *     <li> Country: Qatar (QAT) = <code>178</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: DamsahCombattanteIIIMClassfastattackcraftmissile  = <code>1</code>; </li>
 *     <li> Specific: Q03Rbigah  = <code>3</code>; </li>
 *     <li> Entity type uid: 17832; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1bcf67e8. </p>
 * @see Country#QATAR_QAT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class Q03Rbigah extends EntityType
{
    /** Default constructor */
    public Q03Rbigah()
    {
        setCountry(Country.QATAR_QAT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17828, Light/Patrol Craft
        setSubCategory((byte)1); // uid 17829, Damsah (Combattante III M) Class (fast attack craft-missile)
        setSpecific((byte)3); // uid 17832, Q03 Rbigah
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Q03Rbigah createInstance()
    {
            return new Q03Rbigah();
    }
}
