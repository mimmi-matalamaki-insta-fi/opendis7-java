// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericRigidWingUltralightWeightshiftcontrol</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericRigidWingUltralightWeightshiftcontrol.createInstance()</code> or <code>new GenericRigidWingUltralightWeightshiftcontrol()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Ultralight Aircraft, Rigid Wing = <code>81</code>; </li>
 *     <li> SubCategory: GenericRigidWingUltralightWeightshiftcontrol  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24686; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@187eb9a8. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianUltralightAircraftRigidWing
 * @see SubCategory

 */
public final class GenericRigidWingUltralightWeightshiftcontrol extends EntityType
{
    /** Default constructor */
    public GenericRigidWingUltralightWeightshiftcontrol()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)81); // uid 24685, Civilian Ultralight Aircraft, Rigid Wing
        setSubCategory((byte)1); // uid 24686, Generic Rigid Wing Ultralight, Weight-shift control
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericRigidWingUltralightWeightshiftcontrol createInstance()
    {
            return new GenericRigidWingUltralightWeightshiftcontrol();
    }
}
