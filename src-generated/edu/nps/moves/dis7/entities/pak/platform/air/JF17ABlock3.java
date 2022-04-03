// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pak.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>JF17ABlock3</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>JF17ABlock3.createInstance()</code> or <code>new JF17ABlock3()</code>. </p>
 * <ul>
 *     <li> Country: Pakistan (PAK) = <code>165</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: JF17  = <code>2</code>; </li>
 *     <li> Specific: JF17A  = <code>1</code>; </li>
 *     <li> Entity type uid: 34464; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@5af97169. </p>
 * @see Country#PAKISTAN_PAK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class JF17ABlock3 extends EntityType
{
    /** Default constructor */
    public JF17ABlock3()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 34455, Fighter/Air Defense
        setSubCategory((byte)2); // uid 34460, JF-17
        setSpecific((byte)1); // uid 34461, JF-17A
        setExtra((byte)3); // uid 34464, JF-17A Block 3
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static JF17ABlock3 createInstance()
    {
            return new JF17ABlock3();
    }
}
