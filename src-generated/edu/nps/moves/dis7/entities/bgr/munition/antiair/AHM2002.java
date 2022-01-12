// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bgr.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AHM2002</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AHM2002.createInstance()</code> or <code>new AHM2002()</code>. </p>
 * <ul>
 *     <li> Country: Bulgaria (BGR) = <code>33</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Fixed = <code>3</code>; </li>
 *     <li> SubCategory: AntiHelicopterMineAHM  = <code>1</code>; </li>
 *     <li> Specific: AHM2002  = <code>2</code>; </li>
 *     <li> Entity type uid: 28728; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@74fb5b59. </p>
 * @see Country#BULGARIA_BGR
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Fixed
 * @see SubCategory

 */
public final class AHM2002 extends EntityType
{
    /** Default constructor */
    public AHM2002()
    {
        setCountry(Country.BULGARIA_BGR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)3); // uid 28725, Fixed
        setSubCategory((byte)1); // uid 28726, Anti-Helicopter Mine (AHM)
        setSpecific((byte)2); // uid 28728, AHM-200-2
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AHM2002 createInstance()
    {
            return new AHM2002();
    }
}
