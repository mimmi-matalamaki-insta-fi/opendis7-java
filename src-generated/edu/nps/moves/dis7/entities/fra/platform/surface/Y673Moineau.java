// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Y673Moineau</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Y673Moineau.createInstance()</code> or <code>new Y673Moineau()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary, Merchant Marine = <code>17</code>; </li>
 *     <li> SubCategory: HarbourtugsRemorqueursDePort  = <code>2</code>; </li>
 *     <li> Specific: _65tontype  = <code>3</code>; </li>
 *     <li> Entity type uid: 16128; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2796aeae. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AuxiliaryMerchantMarine
 * @see SubCategory

 */
public final class Y673Moineau extends EntityType
{
    /** Default constructor */
    public Y673Moineau()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 16080, Auxiliary, Merchant Marine
        setSubCategory((byte)2); // uid 16087, Harbour tugs (Remorqueurs De Port)
        setSpecific((byte)3); // uid 16117, 65-ton type
        setExtra((byte)11); // uid 16128, Y 673 Moineau
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Y673Moineau createInstance()
    {
            return new Y673Moineau();
    }
}
