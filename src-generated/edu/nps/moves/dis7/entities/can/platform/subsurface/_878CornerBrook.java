// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_878CornerBrook</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_878CornerBrook.createInstance()</code> or <code>new _878CornerBrook()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack - Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: VictoriaUpholderclass  = <code>1</code>; </li>
 *     <li> Specific: _878CornerBrook  = <code>3</code>; </li>
 *     <li> Entity type uid: 23127; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4bb4de6a. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class _878CornerBrook extends EntityType
{
    /** Default constructor */
    public _878CornerBrook()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23123, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 23124, Victoria (Upholder) class
        setSpecific((byte)3); // uid 23127, 878 Corner Brook
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _878CornerBrook createInstance()
    {
            return new _878CornerBrook();
    }
}
