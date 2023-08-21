/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>WarningMarkerBiologicalContamination</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>WarningMarkerBiologicalContamination.createInstance()</code> or <code>new WarningMarkerBiologicalContamination()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Flags/markers = <code>6</code>; </li>
 *     <li> SubCategory: NBCHazardMarkers  = <code>3</code>; </li>
 *     <li> Specific: WarningMarkerBiologicalContamination  = <code>2</code>; </li>
 *     <li> Entity type uid: 27364; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@283bb8b7. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Flagsmarkers
 * @see SubCategory

 */
public final class WarningMarkerBiologicalContamination extends EntityType
{
    /** Default constructor */
    public WarningMarkerBiologicalContamination()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 21990, Flags/markers
        setSubCategory((byte)3); // uid 22888, NBC Hazard Markers
        setSpecific((byte)2); // uid 27364, Warning Marker - Biological Contamination
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static WarningMarkerBiologicalContamination createInstance()
    {
            return new WarningMarkerBiologicalContamination();
    }
}
