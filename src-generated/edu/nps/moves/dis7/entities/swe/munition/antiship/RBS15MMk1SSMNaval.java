// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RBS15MMk1SSMNaval</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RBS15MMk1SSMNaval.createInstance()</code> or <code>new RBS15MMk1SSMNaval()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_SHIP</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: RBS15SSMASM  = <code>1</code>; </li>
 *     <li> Specific: RBS15MMk1SSMNaval  = <code>1</code>; </li>
 *     <li> Entity type uid: 27303; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59313495. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class RBS15MMk1SSMNaval extends EntityType
{
    /** Default constructor */
    public RBS15MMk1SSMNaval()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 27301, Guided
        setSubCategory((byte)1); // uid 27302, RBS-15 (SSM/ASM)
        setSpecific((byte)1); // uid 27303, RBS-15M Mk1 (SSM Naval)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RBS15MMk1SSMNaval createInstance()
    {
            return new RBS15MMk1SSMNaval();
    }
}
