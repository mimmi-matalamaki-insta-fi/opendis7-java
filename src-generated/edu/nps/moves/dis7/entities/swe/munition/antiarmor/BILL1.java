// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BILL1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BILL1.createInstance()</code> or <code>new BILL1()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: BILLAntiTankMissile  = <code>1</code>; </li>
 *     <li> Specific: BILL1  = <code>1</code>; </li>
 *     <li> Entity type uid: 25586; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5432dca2. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class BILL1 extends EntityType
{
    /** Default constructor */
    public BILL1()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 25584, Guided
        setSubCategory((byte)1); // uid 25585, BILL Anti-Tank Missile
        setSpecific((byte)1); // uid 25586, BILL 1
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BILL1 createInstance()
    {
            return new BILL1();
    }
}
