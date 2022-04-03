// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SelfPropelledAcousticMagneticSAMMinesweeperUnmanned</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SelfPropelledAcousticMagneticSAMMinesweeperUnmanned.createInstance()</code> or <code>new SelfPropelledAcousticMagneticSAMMinesweeperUnmanned()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned Surface Vehicle (USV) = <code>19</code>; </li>
 *     <li> SubCategory: SelfPropelledAcousticMagneticSAMMinesweeperUnmanned  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 26842; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@436bd4df. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UnmannedSurfaceVehicleUSV
 * @see SubCategory

 */
public final class SelfPropelledAcousticMagneticSAMMinesweeperUnmanned extends EntityType
{
    /** Default constructor */
    public SelfPropelledAcousticMagneticSAMMinesweeperUnmanned()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)19); // uid 26841, Unmanned Surface Vehicle (USV)
        setSubCategory((byte)1); // uid 26842, Self-Propelled Acoustic/Magnetic (SAM) Minesweeper (Unmanned)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SelfPropelledAcousticMagneticSAMMinesweeperUnmanned createInstance()
    {
            return new SelfPropelledAcousticMagneticSAMMinesweeperUnmanned();
    }
}
