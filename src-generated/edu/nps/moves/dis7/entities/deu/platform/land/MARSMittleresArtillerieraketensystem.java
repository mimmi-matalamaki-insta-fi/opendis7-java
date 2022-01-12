// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MARSMittleresArtillerieraketensystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MARSMittleresArtillerieraketensystem.createInstance()</code> or <code>new MARSMittleresArtillerieraketensystem()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: M270MultipleLaunchRocketSystemMLRS  = <code>3</code>; </li>
 *     <li> Specific: MARSMittleresArtillerieraketensystem  = <code>1</code>; </li>
 *     <li> Entity type uid: 22763; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4fbe37eb. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class MARSMittleresArtillerieraketensystem extends EntityType
{
    /** Default constructor */
    public MARSMittleresArtillerieraketensystem()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16273, Self-Propelled Artillery
        setSubCategory((byte)3); // uid 22762, M270 Multiple Launch Rocket System (MLRS)
        setSpecific((byte)1); // uid 22763, MARS (Mittleres Artillerieraketensystem)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MARSMittleresArtillerieraketensystem createInstance()
    {
            return new MARSMittleresArtillerieraketensystem();
    }
}
