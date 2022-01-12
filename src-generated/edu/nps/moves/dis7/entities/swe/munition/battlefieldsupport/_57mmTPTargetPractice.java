// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_57mmTPTargetPractice</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_57mmTPTargetPractice.createInstance()</code> or <code>new _57mmTPTargetPractice()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _57mm  = <code>3</code>; </li>
 *     <li> Specific: _57mmTPTargetPractice  = <code>4</code>; </li>
 *     <li> Entity type uid: 27456; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@15e8c040. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _57mmTPTargetPractice extends EntityType
{
    /** Default constructor */
    public _57mmTPTargetPractice()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21657, Ballistic
        setSubCategory((byte)3); // uid 27452, 57 mm
        setSpecific((byte)4); // uid 27456, 57 mm TP (Target Practice)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _57mmTPTargetPractice createInstance()
    {
            return new _57mmTPTargetPractice();
    }
}
