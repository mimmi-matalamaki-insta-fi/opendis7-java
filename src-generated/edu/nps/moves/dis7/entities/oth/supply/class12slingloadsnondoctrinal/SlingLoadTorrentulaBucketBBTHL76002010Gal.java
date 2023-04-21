/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SlingLoadTorrentulaBucketBBTHL76002010Gal</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SlingLoadTorrentulaBucketBBTHL76002010Gal.createInstance()</code> or <code>new SlingLoadTorrentulaBucketBBTHL76002010Gal()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_12_SLING_LOADS_NON_DOCTRINAL</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Sling Load, Water Bucket = <code>4</code>; </li>
 *     <li> SubCategory: SlingLoadTorrentulaBucketBBTHL76002010Gal  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30828; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1a3c4b3e. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see SlingLoadWaterBucket
 * @see SubCategory

 */
public final class SlingLoadTorrentulaBucketBBTHL76002010Gal extends EntityType
{
    /** Default constructor */
    public SlingLoadTorrentulaBucketBBTHL76002010Gal()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)4); // uid 30825, Sling Load, Water Bucket
        setSubCategory((byte)3); // uid 30828, Sling Load, Torrentula Bucket (BBTHL7600), 2010 Gal
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SlingLoadTorrentulaBucketBBTHL76002010Gal createInstance()
    {
            return new SlingLoadTorrentulaBucketBBTHL76002010Gal();
    }
}
