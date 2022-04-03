// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HispanicCivilianwLaserDesignator</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HispanicCivilianwLaserDesignator.createInstance()</code> or <code>new HispanicCivilianwLaserDesignator()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Civilian = <code>130</code>; </li>
 *     <li> SubCategory: Lasers  = <code>153</code>; </li>
 *     <li> Specific: CivilianwLaserDesignator  = <code>1</code>; </li>
 *     <li> Entity type uid: 32749; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@36d7a68a. </p>
 * @see Country#OTHER
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Civilian
 * @see SubCategory

 */
public final class HispanicCivilianwLaserDesignator extends EntityType
{
    /** Default constructor */
    public HispanicCivilianwLaserDesignator()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)130); // uid 32731, Civilian
        setSubCategory((byte)153); // uid 32743, Lasers
        setSpecific((byte)1); // uid 32744, Civilian w/ Laser Designator
        setExtra((byte)5); // uid 32749, Hispanic Civilian w/ Laser Designator
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HispanicCivilianwLaserDesignator createInstance()
    {
            return new HispanicCivilianwLaserDesignator();
    }
}
