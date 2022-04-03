// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F4F</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F4F.createInstance()</code> or <code>new F4F()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: McDonnellDouglasF4PhantomII  = <code>5</code>; </li>
 *     <li> Specific: F4F  = <code>1</code>; </li>
 *     <li> Entity type uid: 28045; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2445445a. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class F4F extends EntityType
{
    /** Default constructor */
    public F4F()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 16328, Fighter/Air Defense
        setSubCategory((byte)5); // uid 28044, McDonnell-Douglas F-4 Phantom II
        setSpecific((byte)1); // uid 28045, F-4F
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F4F createInstance()
    {
            return new F4F();
    }
}
