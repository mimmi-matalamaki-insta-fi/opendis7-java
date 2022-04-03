// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TupolevTU154Careless</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TupolevTU154Careless.createInstance()</code> or <code>new TupolevTU154Careless()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg) = <code>87</code>; </li>
 *     <li> SubCategory: TriJet  = <code>33</code>; </li>
 *     <li> Specific: TupolevTU154Careless  = <code>1</code>; </li>
 *     <li> Entity type uid: 23825; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@12968227. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftLargeupto255000lbs115666kg
 * @see SubCategory

 */
public final class TupolevTU154Careless extends EntityType
{
    /** Default constructor */
    public TupolevTU154Careless()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 23823, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)33); // uid 23824, Tri Jet
        setSpecific((byte)1); // uid 23825, Tupolev TU-154 Careless
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TupolevTU154Careless createInstance()
    {
            return new TupolevTU154Careless();
    }
}
