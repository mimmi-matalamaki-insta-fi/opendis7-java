// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Ladder22ftMakeshift</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Ladder22ftMakeshift.createInstance()</code> or <code>new Ladder22ftMakeshift()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Tools = <code>25</code>; </li>
 *     <li> SubCategory: Garden  = <code>3</code>; </li>
 *     <li> Specific: Ladder  = <code>1</code>; </li>
 *     <li> Entity type uid: 28483; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7fb44737. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tools
 * @see SubCategory

 */
public final class Ladder22ftMakeshift extends EntityType
{
    /** Default constructor */
    public Ladder22ftMakeshift()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)25); // uid 26509, Tools
        setSubCategory((byte)3); // uid 26512, Garden
        setSpecific((byte)1); // uid 28482, Ladder
        setExtra((byte)1); // uid 28483, Ladder, 22ft, Makeshift
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Ladder22ftMakeshift createInstance()
    {
            return new Ladder22ftMakeshift();
    }
}
