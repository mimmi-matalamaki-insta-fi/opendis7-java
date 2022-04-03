// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CT156HarvardII</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CT156HarvardII.createInstance()</code> or <code>new CT156HarvardII()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trainer = <code>40</code>; </li>
 *     <li> SubCategory: RaytheonPilatusPC9MkIIBeechMkII  = <code>2</code>; </li>
 *     <li> Specific: CT156HarvardII  = <code>1</code>; </li>
 *     <li> Entity type uid: 28703; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59906517. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trainer
 * @see SubCategory

 */
public final class CT156HarvardII extends EntityType
{
    /** Default constructor */
    public CT156HarvardII()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28527, Trainer
        setSubCategory((byte)2); // uid 28702, Raytheon / Pilatus PC-9 Mk II (Beech Mk II)
        setSpecific((byte)1); // uid 28703, CT-156 Harvard II
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CT156HarvardII createInstance()
    {
            return new CT156HarvardII();
    }
}
