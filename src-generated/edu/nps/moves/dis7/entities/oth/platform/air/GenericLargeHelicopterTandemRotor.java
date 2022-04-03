// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericLargeHelicopterTandemRotor</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericLargeHelicopterTandemRotor.createInstance()</code> or <code>new GenericLargeHelicopterTandemRotor()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Helicopter, Large (above 20,000 lbs / 9,072 kg) = <code>92</code>; </li>
 *     <li> SubCategory: GenericLargeHelicopterTandemRotor  = <code>21</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24732; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4e25147a. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianHelicopterLargeabove20000lbs9072kg
 * @see SubCategory

 */
public final class GenericLargeHelicopterTandemRotor extends EntityType
{
    /** Default constructor */
    public GenericLargeHelicopterTandemRotor()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)92); // uid 24729, Civilian Helicopter, Large (above 20,000 lbs / 9,072 kg)
        setSubCategory((byte)21); // uid 24732, Generic Large Helicopter, Tandem Rotor
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericLargeHelicopterTandemRotor createInstance()
    {
            return new GenericLargeHelicopterTandemRotor();
    }
}
