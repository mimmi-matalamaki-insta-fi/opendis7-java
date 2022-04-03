// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ukr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BG52GrigoryGnatenko</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BG52GrigoryGnatenko.createInstance()</code> or <code>new BG52GrigoryGnatenko()</code>. </p>
 * <ul>
 *     <li> Country: Ukraine (UKR) = <code>265</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: PaukIClass  = <code>1</code>; </li>
 *     <li> Specific: BG52GrigoryGnatenko  = <code>3</code>; </li>
 *     <li> Entity type uid: 27866; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@705a8dbc. </p>
 * @see Country#UKRAINE_UKR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class BG52GrigoryGnatenko extends EntityType
{
    /** Default constructor */
    public BG52GrigoryGnatenko()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27862, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27863, Pauk I Class
        setSpecific((byte)3); // uid 27866, BG 52 Grigory Gnatenko
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BG52GrigoryGnatenko createInstance()
    {
            return new BG52GrigoryGnatenko();
    }
}
