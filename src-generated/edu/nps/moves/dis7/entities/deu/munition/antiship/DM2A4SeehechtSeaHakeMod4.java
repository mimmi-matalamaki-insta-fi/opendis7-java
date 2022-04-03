// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DM2A4SeehechtSeaHakeMod4</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DM2A4SeehechtSeaHakeMod4.createInstance()</code> or <code>new DM2A4SeehechtSeaHakeMod4()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_SHIP</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: DM2SeriesTorpedoes  = <code>5</code>; </li>
 *     <li> Specific: DM2A4SeehechtSeaHakeMod4  = <code>3</code>; </li>
 *     <li> Entity type uid: 28093; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75e0a54c. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class DM2A4SeehechtSeaHakeMod4 extends EntityType
{
    /** Default constructor */
    public DM2A4SeehechtSeaHakeMod4()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21234, Guided
        setSubCategory((byte)5); // uid 21239, DM2 Series Torpedoes
        setSpecific((byte)3); // uid 28093, DM2A4 Seehecht / SeaHake Mod 4
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DM2A4SeehechtSeaHakeMod4 createInstance()
    {
            return new DM2A4SeehechtSeaHakeMod4();
    }
}
