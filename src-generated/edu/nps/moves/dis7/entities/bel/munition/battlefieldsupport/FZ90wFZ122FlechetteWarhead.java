// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bel.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FZ90wFZ122FlechetteWarhead</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FZ90wFZ122FlechetteWarhead.createInstance()</code> or <code>new FZ90wFZ122FlechetteWarhead()</code>. </p>
 * <ul>
 *     <li> Country: Belgium (BEL) = <code>21</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: FZFZ90WA70mm275in  = <code>3</code>; </li>
 *     <li> Specific: FZ90wFZ122FlechetteWarhead  = <code>6</code>; </li>
 *     <li> Entity type uid: 30352; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77ea806f. </p>
 * @see Country#BELGIUM_BEL
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class FZ90wFZ122FlechetteWarhead extends EntityType
{
    /** Default constructor */
    public FZ90wFZ122FlechetteWarhead()
    {
        setCountry(Country.BELGIUM_BEL);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 30331, Ballistic
        setSubCategory((byte)3); // uid 30346, FZ FZ90 WA (70 mm, 2.75 in)
        setSpecific((byte)6); // uid 30352, FZ90 w/ FZ122 Flechette Warhead
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FZ90wFZ122FlechetteWarhead createInstance()
    {
            return new FZ90wFZ122FlechetteWarhead();
    }
}
