// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CRV7M267PRACTICEMPSMPracticeMultipurposeSubmunition</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CRV7M267PRACTICEMPSMPracticeMultipurposeSubmunition.createInstance()</code> or <code>new CRV7M267PRACTICEMPSMPracticeMultipurposeSubmunition()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _70mm275in  = <code>1</code>; </li>
 *     <li> Specific: CRV7M267PRACTICEMPSM_PracticeMultipurposeSubmunition  = <code>12</code>; </li>
 *     <li> Entity type uid: 21773; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v29 (2021-05-19)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5882b202. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class CRV7M267PRACTICEMPSMPracticeMultipurposeSubmunition extends EntityType
{
    /** Default constructor */
    public CRV7M267PRACTICEMPSMPracticeMultipurposeSubmunition()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21760, Ballistic
        setSubCategory((byte)1); // uid 21761, 70 mm(2.75in)
        setSpecific((byte)12); // uid 21773, CRV7 M267 PRACTICE MPSM: Practice Multipurpose Submunition
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CRV7M267PRACTICEMPSMPracticeMultipurposeSubmunition createInstance()
    {
            return new CRV7M267PRACTICEMPSMPracticeMultipurposeSubmunition();
    }
}
