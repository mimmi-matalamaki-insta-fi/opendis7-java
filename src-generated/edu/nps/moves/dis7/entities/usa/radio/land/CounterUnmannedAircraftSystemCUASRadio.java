package edu.nps.moves.dis7.entities.usa.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@627acb38;
 * Country: United States of America (USA);
 * Entity kind: Radio;
 * Domain: LAND;
 *
 * Entity type uid: 31309
 */
public class CounterUnmannedAircraftSystemCUASRadio extends EntityType
{
    /** Default constructor */
    public CounterUnmannedAircraftSystemCUASRadio()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)41); // uid 31309, Counter Unmanned Aircraft System (C-UAS) Radio
    }
}