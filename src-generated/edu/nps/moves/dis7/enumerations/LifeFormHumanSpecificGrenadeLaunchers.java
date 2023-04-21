/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 515,
 * marshal size 8;
 * LifeFormHumanSpecificGrenadeLaunchers has 41 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum LifeFormHumanSpecificGrenadeLaunchers 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm Arsenal UGGL-M1 */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_ARSENAL_UGGL_M1 (1, "40x46mm Arsenal UGGL-M1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm Arsenal MSGL */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_ARSENAL_MSGL (2, "40x46mm Arsenal MSGL"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm VOG Arsenal MSGL */
    // autogenerated using string template disenumpart2.txt
    _40MM_VOG_ARSENAL_MSGL (3, "40mm VOG Arsenal MSGL"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm Arsenal UBGL-M16 */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_ARSENAL_UBGL_M16 (4, "40x46mm Arsenal UBGL-M16"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm Arsenal UBGL-M8 */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_ARSENAL_UBGL_M8 (5, "40x46mm Arsenal UBGL-M8"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm Arsenal UBGL-M7 */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_ARSENAL_UBGL_M7 (6, "40x46mm Arsenal UBGL-M7"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 30mm BS-1 Tishina */
    // autogenerated using string template disenumpart2.txt
    _30MM_BS_1_TISHINA (10, "30mm BS-1 Tishina"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm BTS-203 */
    // autogenerated using string template disenumpart2.txt
    _40MM_BTS_203 (11, "40mm BTS-203"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm Indumil IMC-40 */
    // autogenerated using string template disenumpart2.txt
    _40MM_INDUMIL_IMC_40 (12, "40mm Indumil IMC-40"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm VOG BG-15 */
    // autogenerated using string template disenumpart2.txt
    _40MM_VOG_BG_15 (20, "40mm VOG BG-15"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm VOG GP-25 Kostoyor */
    // autogenerated using string template disenumpart2.txt
    _40MM_VOG_GP_25_KOSTOYOR (21, "40mm VOG GP-25 Kostoyor"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm VOG GP-30 Obuvka */
    // autogenerated using string template disenumpart2.txt
    _40MM_VOG_GP_30_OBUVKA (22, "40mm VOG GP-30 Obuvka"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm VOG GP-34 */
    // autogenerated using string template disenumpart2.txt
    _40MM_VOG_GP_34 (23, "40mm VOG GP-34"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm VOG RGM-40 Kastet */
    // autogenerated using string template disenumpart2.txt
    _40MM_VOG_RGM_40_KASTET (24, "40mm VOG RGM-40 Kastet"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm VOG RG-6 */
    // autogenerated using string template disenumpart2.txt
    _40MM_VOG_RG_6 (25, "40mm VOG RG-6"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm M79 */
    // autogenerated using string template disenumpart2.txt
    SUPPLEMENTAL_EMISSION_ENTITY_STATE (30, "40x46mm M79"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm M203 */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_M203 (31, "40x46mm M203"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x36mm M320 */
    // autogenerated using string template disenumpart2.txt
    _40X36MM_M320 (32, "40x36mm M320"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm CIS 40 GL */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_CIS_40_GL (35, "40x46mm CIS 40 GL"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm EAGLE GL */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_EAGLE_GL (36, "40x46mm EAGLE GL"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm HK AG36 */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_HK_AG36 (37, "40x46mm HK AG36"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm HK AG-C/GLM */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_HK_AG_C_GLM (38, "40x46mm HK AG-C/GLM"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm HK69A1 */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_HK69A1 (39, "40x46mm HK69A1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm Beretta GLX 160 */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_BERETTA_GLX_160 (40, "40x46mm Beretta GLX 160"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm ARDE UBGL */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_ARDE_UBGL (41, "40x46mm ARDE UBGL"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm XML148 */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_XML148 (42, "40x46mm XML148"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm China Lake GL */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_CHINA_LAKE_GL (43, "40x46mm China Lake GL"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x46mm Hawk MM-1 */
    // autogenerated using string template disenumpart2.txt
    _40X46MM_HAWK_MM_1 (44, "40x46mm Hawk MM-1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 25x40mm XM25 CDTE */
    // autogenerated using string template disenumpart2.txt
    LIVE_ENTITY_DETONATION (50, "25x40mm XM25 CDTE"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 37mm Milkor37/38 LL Stopper */
    // autogenerated using string template disenumpart2.txt
    DATA_RELIABLE (60, "37mm Milkor37/38 LL Stopper"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm Milkor40 GL */
    // autogenerated using string template disenumpart2.txt
    EVENT_REPORT_RELIABLE (61, "40mm Milkor40 GL"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40mm Milkor MGL */
    // autogenerated using string template disenumpart2.txt
    COMMENT_RELIABLE (62, "40mm Milkor MGL"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x47mm Pallad wz1974 */
    // autogenerated using string template disenumpart2.txt
    RECORD_QUERY_RELIABLE (65, "40x47mm Pallad wz1974"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x47mm Pallad wz1983 */
    // autogenerated using string template disenumpart2.txt
    _40X47MM_PALLAD_WZ1983 (66, "40x47mm Pallad wz1983"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** UGL 200 Canister RWGL-3 */
    // autogenerated using string template disenumpart2.txt
    UGL_200_CANISTER_RWGL_3 (70, "UGL 200 Canister RWGL-3"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 20x30mm ST Daewoo K11 */
    // autogenerated using string template disenumpart2.txt
    _20X30MM_ST_DAEWOO_K11 (80, "20x30mm ST Daewoo K11"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 35mm Type-91 BreechLoad GL */
    // autogenerated using string template disenumpart2.txt
    _35MM_TYPE_91_BREECHLOAD_GL (90, "35mm Type-91 BreechLoad GL"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 40x53mm CZW-40 */
    // autogenerated using string template disenumpart2.txt
    _40X53MM_CZW_40 (95, "40x53mm CZW-40"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 45mm DP-64 */
    // autogenerated using string template disenumpart2.txt
    _45MM_DP_64 (100, "45mm DP-64"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 20x42mm Neopup PAW-20 */
    // autogenerated using string template disenumpart2.txt
    _20X42MM_NEOPUP_PAW_20 (105, "20x42mm Neopup PAW-20");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    LifeFormHumanSpecificGrenadeLaunchers(int value, String description)
    {
        this.value = value;
        this.description = description;
    }
    /** Provide enumeration value
      * @return integer value */
    public int getValue()
    {
        return value;
    }

    /** Provide enumeration description
     * @return description
     */
    public String getDescription()
    {
        return description;
    }

    /** bit width for this enumeration
     * @return number of bits wide
     */
    public static int getEnumBitWidth()
    {
      return 8;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static LifeFormHumanSpecificGrenadeLaunchers getEnumForValue(int value)
    {
       for (LifeFormHumanSpecificGrenadeLaunchers nextEnum : LifeFormHumanSpecificGrenadeLaunchers.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum LifeFormHumanSpecificGrenadeLaunchers");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

    // autogenerated using string template disenumpart3_8.txt

    private boolean TRACE = false;

    /** Set tracing on/off for this object 
     * @param value whether tracing is on or off */
    public void setTRACE (boolean value)
    {
        TRACE = value;
    }

    /** Whether tracing is on or off for this object
     * @return whether tracing is on or off */
    public boolean getTRACE ()
    {
        return TRACE;
    }

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeByte(getValue());
    }
    
    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output
     * @throws IOException input-output error */
    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.put((byte)getValue());
    }

    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static LifeFormHumanSpecificGrenadeLaunchers unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static LifeFormHumanSpecificGrenadeLaunchers unmarshalEnum(ByteBuffer byteBuffer) throws Exception
    {
        /*
        try {
            value = (int)byteBuffer.get();
        }
        catch(Exception ex) {
            showError(ex);
        }
        */
        return getEnumForValue(byteBuffer.get());
    }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 1; // 8 bits
    }
  /**
   * Provide name
   * @return  name
   */
    public String getName()
    {
        return name();
    }

    
  /**
   * Provide simple identifier
   * @return class name, value and name
   */
    @Override
    public String toString()
    {
        String padding = new String();
        if (this.getClass().getName().endsWith("DisPduType") && (getValue() < 10))
            padding = "0"; // leading zero for column spacing
        String result = this.getClass().getSimpleName() + " " + padding + getValue() + " " + name();
        if (getTRACE())
            System.out.println ("*** enum " + this.getClass().getSimpleName() + " name=" + name() + ", value=" + getValue() + "; " +
               result); // debug diagnostic
        return result;
    }
}
