// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SeaeyeSabertoothSingleHull</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SeaeyeSabertoothSingleHull.createInstance()</code> or <code>new SeaeyeSabertoothSingleHull()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned Underwater Vehicle (UUV) = <code>8</code>; </li>
 *     <li> SubCategory: SAABSeaeye  = <code>5</code>; </li>
 *     <li> Specific: SeaeyeSabertooth  = <code>12</code>; </li>
 *     <li> Entity type uid: 29287; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@806996. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UnmannedUnderwaterVehicleUUV
 * @see SubCategory

 */
public final class SeaeyeSabertoothSingleHull extends EntityType
{
    /** Default constructor */
    public SeaeyeSabertoothSingleHull()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)8); // uid 25264, Unmanned Underwater Vehicle (UUV)
        setSubCategory((byte)5); // uid 29274, SAAB Seaeye
        setSpecific((byte)12); // uid 29286, Seaeye Sabertooth
        setExtra((byte)1); // uid 29287, Seaeye Sabertooth Single Hull
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SeaeyeSabertoothSingleHull createInstance()
    {
            return new SeaeyeSabertoothSingleHull();
    }
}
