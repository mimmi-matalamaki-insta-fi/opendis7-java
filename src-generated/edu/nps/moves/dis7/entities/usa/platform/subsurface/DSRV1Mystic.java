// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DSRV1Mystic</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DSRV1Mystic.createInstance()</code> or <code>new DSRV1Mystic()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSA(Conventional Auxiliary) = <code>7</code>; </li>
 *     <li> SubCategory: DeepSubmergenceRescueVehicleDSRV  = <code>3</code>; </li>
 *     <li> Specific: DSRV1Mystic  = <code>1</code>; </li>
 *     <li> Entity type uid: 22950; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@43e8f1c. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSAConventionalAuxiliary
 * @see SubCategory

 */
public final class DSRV1Mystic extends EntityType
{
    /** Default constructor */
    public DSRV1Mystic()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)7); // uid 12410, SSA(Conventional Auxiliary)
        setSubCategory((byte)3); // uid 22949, Deep Submergence Rescue Vehicle (DSRV)
        setSpecific((byte)1); // uid 22950, DSRV-1 Mystic
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DSRV1Mystic createInstance()
    {
            return new DSRV1Mystic();
    }
}
