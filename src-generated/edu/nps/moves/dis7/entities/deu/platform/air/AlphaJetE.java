// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AlphaJetE</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AlphaJetE.createInstance()</code> or <code>new AlphaJetE()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trainer = <code>40</code>; </li>
 *     <li> SubCategory: DassaultDornierAlphaJet  = <code>1</code>; </li>
 *     <li> Specific: AlphaJetE  = <code>1</code>; </li>
 *     <li> Entity type uid: 16384; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@16eccb2e. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trainer
 * @see SubCategory

 */
public final class AlphaJetE extends EntityType
{
    /** Default constructor */
    public AlphaJetE()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 16382, Trainer
        setSubCategory((byte)1); // uid 16383, Dassault/Dornier Alpha Jet
        setSpecific((byte)1); // uid 16384, Alpha Jet E
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AlphaJetE createInstance()
    {
            return new AlphaJetE();
    }
}
