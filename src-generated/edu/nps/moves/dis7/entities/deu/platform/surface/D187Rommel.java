// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>D187Rommel</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>D187Rommel.createInstance()</code> or <code>new D187Rommel()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer = <code>4</code>; </li>
 *     <li> SubCategory: ExUSModifiedCharlesFAdamsclasstype103BDDGs  = <code>1</code>; </li>
 *     <li> Specific: D187Rommel  = <code>3</code>; </li>
 *     <li> Entity type uid: 16391; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c44c582. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyer
 * @see SubCategory

 */
public final class D187Rommel extends EntityType
{
    /** Default constructor */
    public D187Rommel()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 16387, Guided Missile Destroyer
        setSubCategory((byte)1); // uid 16388, Ex-US Modified Charles F. Adams class (type 103B) (DDGs)
        setSpecific((byte)3); // uid 16391, D187 Rommel
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static D187Rommel createInstance()
    {
            return new D187Rommel();
    }
}
