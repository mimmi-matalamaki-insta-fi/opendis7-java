// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prk.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NoDongChemicalGBND1GB</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NoDongChemicalGBND1GB.createInstance()</code> or <code>new NoDongChemicalGBND1GB()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Democratic Peoples Republic of) (PRK) = <code>119</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>STRATEGIC</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: NoDong  = <code>2</code>; </li>
 *     <li> Specific: NoDongSeparatedWarhead  = <code>1</code>; </li>
 *     <li> Entity type uid: 32818; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@bf2aa32. </p>
 * @see Country#KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class NoDongChemicalGBND1GB extends EntityType
{
    /** Default constructor */
    public NoDongChemicalGBND1GB()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21602, Guided
        setSubCategory((byte)2); // uid 21609, No Dong
        setSpecific((byte)1); // uid 21610, No Dong Separated Warhead
        setExtra((byte)2); // uid 32818, No Dong, Chemical GB, ND-1-GB
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NoDongChemicalGBND1GB createInstance()
    {
            return new NoDongChemicalGBND1GB();
    }
}
