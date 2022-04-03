// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BathythermalSensor</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BathythermalSensor.createInstance()</code> or <code>new BathythermalSensor()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Thermal (temperature sensing) = <code>9</code>; </li>
 *     <li> SubCategory: BathythermalSensor  = <code>78</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 22597; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4cacccbf. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Thermaltemperaturesensing
 * @see SubCategory

 */
public final class BathythermalSensor extends EntityType
{
    /** Default constructor */
    public BathythermalSensor()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)9); // uid 22596, Thermal (temperature sensing)
        setSubCategory((byte)78); // uid 22597, Bathythermal Sensor
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BathythermalSensor createInstance()
    {
            return new BathythermalSensor();
    }
}
