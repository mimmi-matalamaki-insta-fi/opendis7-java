// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SlingLoadCH146Griffon</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SlingLoadCH146Griffon.createInstance()</code> or <code>new SlingLoadCH146Griffon()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_12_SLING_LOADS_NON_DOCTRINAL</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Sling Load, Helicopters = <code>10</code>; </li>
 *     <li> SubCategory: SlingLoadApacheAH64  = <code>1</code>; </li>
 *     <li> Specific: SlingLoadCH146Griffon  = <code>3</code>; </li>
 *     <li> Entity type uid: 30862; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@672d8370. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see SlingLoadHelicopters
 * @see SubCategory

 */
public final class SlingLoadCH146Griffon extends EntityType
{
    /** Default constructor */
    public SlingLoadCH146Griffon()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)10); // uid 30858, Sling Load, Helicopters
        setSubCategory((byte)1); // uid 30859, Sling Load, Apache AH-64
        setSpecific((byte)3); // uid 30862, Sling Load, CH-146 Griffon
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SlingLoadCH146Griffon createInstance()
    {
            return new SlingLoadCH146Griffon();
    }
}
