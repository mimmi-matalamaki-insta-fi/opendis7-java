// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ACPB89Ararat</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ACPB89Ararat.createInstance()</code> or <code>new ACPB89Ararat()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: ArmidaleClass  = <code>3</code>; </li>
 *     <li> Specific: ACPB89Ararat  = <code>7</code>; </li>
 *     <li> Entity type uid: 25232; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@96532d6. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class ACPB89Ararat extends EntityType
{
    /** Default constructor */
    public ACPB89Ararat()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17524, Light/Patrol Craft
        setSubCategory((byte)3); // uid 25225, Armidale Class
        setSpecific((byte)7); // uid 25232, ACPB 89 Ararat
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ACPB89Ararat createInstance()
    {
            return new ACPB89Ararat();
    }
}
