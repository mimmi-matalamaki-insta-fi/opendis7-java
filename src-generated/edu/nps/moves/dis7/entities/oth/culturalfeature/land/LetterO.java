// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LetterO</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LetterO.createInstance()</code> or <code>new LetterO()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Flags/markers = <code>6</code>; </li>
 *     <li> SubCategory: GroundMarkings  = <code>4</code>; </li>
 *     <li> Specific: Letters  = <code>3</code>; </li>
 *     <li> Entity type uid: 23733; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1e8bccfb. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Flagsmarkers
 * @see SubCategory

 */
public final class LetterO extends EntityType
{
    /** Default constructor */
    public LetterO()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 21990, Flags/markers
        setSubCategory((byte)4); // uid 22889, Ground Markings
        setSpecific((byte)3); // uid 23731, Letters
        setExtra((byte)2); // uid 23733, Letter, O
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LetterO createInstance()
    {
            return new LetterO();
    }
}
