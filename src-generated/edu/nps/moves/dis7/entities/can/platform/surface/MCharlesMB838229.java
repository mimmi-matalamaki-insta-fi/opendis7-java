// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MCharlesMB838229</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MCharlesMB838229.createInstance()</code> or <code>new MCharlesMB838229()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Coast Guard Cutters = <code>62</code>; </li>
 *     <li> SubCategory: MidshorePatrolVessel  = <code>8</code>; </li>
 *     <li> Specific: MCharlesMB838229  = <code>11</code>; </li>
 *     <li> Entity type uid: 30948; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@704921a5. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CoastGuardCutters
 * @see SubCategory

 */
public final class MCharlesMB838229 extends EntityType
{
    /** Default constructor */
    public MCharlesMB838229()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 26269, Coast Guard Cutters
        setSubCategory((byte)8); // uid 30938, Midshore Patrol Vessel
        setSpecific((byte)11); // uid 30948, M. Charles M.B. (838229)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MCharlesMB838229 createInstance()
    {
            return new MCharlesMB838229();
    }
}
