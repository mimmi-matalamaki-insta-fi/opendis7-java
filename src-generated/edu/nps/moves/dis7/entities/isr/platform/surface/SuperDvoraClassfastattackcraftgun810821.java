// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.isr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SuperDvoraClassfastattackcraftgun810821</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SuperDvoraClassfastattackcraftgun810821.createInstance()</code> or <code>new SuperDvoraClassfastattackcraftgun810821()</code>. </p>
 * <ul>
 *     <li> Country: Israel (ISR) = <code>105</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: SuperDvoraClassfastattackcraftgun  = <code>5</code>; </li>
 *     <li> Specific: _810821  = <code>1</code>; </li>
 *     <li> Entity type uid: 18239; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f811d00. </p>
 * @see Country#ISRAEL_ISR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class SuperDvoraClassfastattackcraftgun810821 extends EntityType
{
    /** Default constructor */
    public SuperDvoraClassfastattackcraftgun810821()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18214, Light/Patrol Craft
        setSubCategory((byte)5); // uid 18238, Super Dvora Class (fast attack craft-gun)
        setSpecific((byte)1); // uid 18239, 810-821
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SuperDvoraClassfastattackcraftgun810821 createInstance()
    {
            return new SuperDvoraClassfastattackcraftgun810821();
    }
}
