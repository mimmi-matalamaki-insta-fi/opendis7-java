// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MK64Mod0SUSpracticeversionofMK61</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MK64Mod0SUSpracticeversionofMK61.createInstance()</code> or <code>new MK64Mod0SUSpracticeversionofMK61()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Signal = <code>7</code>; </li>
 *     <li> SubCategory: PyrotechnicSUSSignalUnderwaterSound  = <code>1</code>; </li>
 *     <li> Specific: MK64Mod0SUSpracticeversionofMK61  = <code>2</code>; </li>
 *     <li> Entity type uid: 25004; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1f85904a. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Signal
 * @see SubCategory

 */
public final class MK64Mod0SUSpracticeversionofMK61 extends EntityType
{
    /** Default constructor */
    public MK64Mod0SUSpracticeversionofMK61()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)7); // uid 25001, Signal
        setSubCategory((byte)1); // uid 25002, Pyrotechnic SUS (Signal Underwater Sound)
        setSpecific((byte)2); // uid 25004, MK 64 Mod 0 SUS (practice version of MK 61)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MK64Mod0SUSpracticeversionofMK61 createInstance()
    {
            return new MK64Mod0SUSpracticeversionofMK61();
    }
}
