/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template jammertechnique.txt

package edu.nps.moves.dis7.jammers.DeceptionandNoise.GateStealerandNoise.NoiseandVGPO;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v31 (2022-10-08)
 *
 * Jamming technique uid: 284
 */
public class NoiseandVGPO extends JammingTechnique
{
    /** Default constructor */
    public NoiseandVGPO()
    {
        setKind((byte)3); // Deception and Noise
        setCategory((byte)25); // Gate Stealer and Noise
        setSubCategory((byte)10); // Noise and VGPO
    }
}
