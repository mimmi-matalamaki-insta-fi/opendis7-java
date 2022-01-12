// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.esp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A14Patino</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A14Patino.createInstance()</code> or <code>new A14Patino()</code>. </p>
 * <ul>
 *     <li> Country: Spain (ESP) = <code>198</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: PatinoClassFleetLogisticTankerAOR  = <code>1</code>; </li>
 *     <li> Specific: A14Patino  = <code>1</code>; </li>
 *     <li> Entity type uid: 19028; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@10c72a6f. </p>
 * @see Country#SPAIN_ESP
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A14Patino extends EntityType
{
    /** Default constructor */
    public A14Patino()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 19026, Auxiliary
        setSubCategory((byte)1); // uid 19027, Patino Class (Fleet Logistic Tanker) (AOR)
        setSpecific((byte)1); // uid 19028, A14 Patino
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A14Patino createInstance()
    {
            return new A14Patino();
    }
}
