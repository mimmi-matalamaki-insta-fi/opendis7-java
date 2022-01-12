// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.isr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GabrielMk2launcher</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GabrielMk2launcher.createInstance()</code> or <code>new GabrielMk2launcher()</code>. </p>
 * <ul>
 *     <li> Country: Israel (ISR) = <code>105</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: GabrielMk2launcher  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 18176; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@666b83a4. </p>
 * @see Country#ISRAEL_ISR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class GabrielMk2launcher extends EntityType
{
    /** Default constructor */
    public GabrielMk2launcher()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 18174, Self-Propelled Artillery
        setSubCategory((byte)2); // uid 18176, Gabriel Mk 2 launcher
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GabrielMk2launcher createInstance()
    {
            return new GabrielMk2launcher();
    }
}
