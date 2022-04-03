// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HARMTargetingSystemPod</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HARMTargetingSystemPod.createInstance()</code> or <code>new HARMTargetingSystemPod()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_7_MAJOR_ITEMS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Targeting Pod = <code>25</code>; </li>
 *     <li> SubCategory: HARMTargetingSystemPod  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30773; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@38923cfe. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see TargetingPod
 * @see SubCategory

 */
public final class HARMTargetingSystemPod extends EntityType
{
    /** Default constructor */
    public HARMTargetingSystemPod()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)25); // uid 30772, Targeting Pod
        setSubCategory((byte)1); // uid 30773, HARM Targeting System Pod
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HARMTargetingSystemPod createInstance()
    {
            return new HARMTargetingSystemPod();
    }
}
