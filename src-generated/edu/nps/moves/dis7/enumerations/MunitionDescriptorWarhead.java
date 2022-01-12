// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 60,
 * marshal size 16;
 * MunitionDescriptorWarhead has 96 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum MunitionDescriptorWarhead 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0000, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cargo (Variable Submunitions) */
    // autogenerated using string template disenumpart2.txt
    CARGO_VARIABLE_SUBMUNITIONS (0010, "Cargo (Variable Submunitions)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Fuel/Air Explosive */
    // autogenerated using string template disenumpart2.txt
    FUEL_AIR_EXPLOSIVE (0020, "Fuel/Air Explosive"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Glass Beads */
    // autogenerated using string template disenumpart2.txt
    GLASS_BEADS (0030, "Glass Beads"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 1 um */
    // autogenerated using string template disenumpart2.txt
    _1_UM (0031, "1 um"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 5 um */
    // autogenerated using string template disenumpart2.txt
    _5_UM (0032, "5 um"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** 10 um */
    // autogenerated using string template disenumpart2.txt
    _10_UM (0033, "10 um"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** High Explosive (HE) */
    // autogenerated using string template disenumpart2.txt
    HIGH_EXPLOSIVE_HE (1000, "High Explosive (HE)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Plastic */
    // autogenerated using string template disenumpart2.txt
    HE_PLASTIC (1100, "HE, Plastic"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Incendiary */
    // autogenerated using string template disenumpart2.txt
    HE_INCENDIARY (1200, "HE, Incendiary"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Fragmentation */
    // autogenerated using string template disenumpart2.txt
    HE_FRAGMENTATION (1300, "HE, Fragmentation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Anti-Tank */
    // autogenerated using string template disenumpart2.txt
    HE_ANTI_TANK (1400, "HE, Anti-Tank"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Bomblets */
    // autogenerated using string template disenumpart2.txt
    HE_BOMBLETS (1500, "HE, Bomblets"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Shaped Charge */
    // autogenerated using string template disenumpart2.txt
    HE_SHAPED_CHARGE (1600, "HE, Shaped Charge"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Continuous Rod */
    // autogenerated using string template disenumpart2.txt
    HE_CONTINUOUS_ROD (1610, "HE, Continuous Rod"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Tungsten Ball */
    // autogenerated using string template disenumpart2.txt
    HE_TUNGSTEN_BALL (1615, "HE, Tungsten Ball"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Blast Fragmentation */
    // autogenerated using string template disenumpart2.txt
    HE_BLAST_FRAGMENTATION (1620, "HE, Blast Fragmentation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Steerable Darts with HE */
    // autogenerated using string template disenumpart2.txt
    HE_STEERABLE_DARTS_WITH_HE (1625, "HE, Steerable Darts with HE"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Darts */
    // autogenerated using string template disenumpart2.txt
    HE_DARTS (1630, "HE, Darts"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Flechettes */
    // autogenerated using string template disenumpart2.txt
    HE_FLECHETTES (1635, "HE, Flechettes"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Directed Fragmentation */
    // autogenerated using string template disenumpart2.txt
    HE_DIRECTED_FRAGMENTATION (1640, "HE, Directed Fragmentation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Semi-Armor Piercing (SAP) */
    // autogenerated using string template disenumpart2.txt
    HE_SEMI_ARMOR_PIERCING_SAP (1645, "HE, Semi-Armor Piercing (SAP)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Shaped Charge Fragmentation */
    // autogenerated using string template disenumpart2.txt
    HE_SHAPED_CHARGE_FRAGMENTATION (1650, "HE, Shaped Charge Fragmentation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Semi-Armor Piercing, Fragmentation */
    // autogenerated using string template disenumpart2.txt
    HE_SEMI_ARMOR_PIERCING_FRAGMENTATION (1655, "HE, Semi-Armor Piercing, Fragmentation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Hollow Charge */
    // autogenerated using string template disenumpart2.txt
    HE_HOLLOW_CHARGE (1660, "HE, Hollow Charge"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Double Hollow Charge */
    // autogenerated using string template disenumpart2.txt
    HE_DOUBLE_HOLLOW_CHARGE (1665, "HE, Double Hollow Charge"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, General Purpose */
    // autogenerated using string template disenumpart2.txt
    HE_GENERAL_PURPOSE (1670, "HE, General Purpose"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Blast Penetrator */
    // autogenerated using string template disenumpart2.txt
    HE_BLAST_PENETRATOR (1675, "HE, Blast Penetrator"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Rod Penetrator */
    // autogenerated using string template disenumpart2.txt
    HE_ROD_PENETRATOR (1680, "HE, Rod Penetrator"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Anti-Personnel */
    // autogenerated using string template disenumpart2.txt
    HE_ANTI_PERSONNEL (1685, "HE, Anti-Personnel"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Shaped Charge, Fragmentation, Incendiary */
    // autogenerated using string template disenumpart2.txt
    HE_SHAPED_CHARGE_FRAGMENTATION_INCENDIARY (1690, "HE, Shaped Charge, Fragmentation, Incendiary"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HE, Penetrator, Blast, Fragmentation */
    // autogenerated using string template disenumpart2.txt
    HE_PENETRATOR_BLAST_FRAGMENTATION (1695, "HE, Penetrator, Blast, Fragmentation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Smoke */
    // autogenerated using string template disenumpart2.txt
    SMOKE (2000, "Smoke"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** WP (White Phosphorus) */
    // autogenerated using string template disenumpart2.txt
    WP_WHITE_PHOSPHORUS (2005, "WP (White Phosphorus)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** FOGO (Fog Oil) */
    // autogenerated using string template disenumpart2.txt
    FOGO_FOG_OIL (2010, "FOGO (Fog Oil)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HC (HexaChloroEthane) */
    // autogenerated using string template disenumpart2.txt
    HC_HEXACHLOROETHANE (2015, "HC (HexaChloroEthane)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Illumination */
    // autogenerated using string template disenumpart2.txt
    ILLUMINATION (3000, "Illumination"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Practice */
    // autogenerated using string template disenumpart2.txt
    PRACTICE (4000, "Practice"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Blank */
    // autogenerated using string template disenumpart2.txt
    BLANK (4001, "Blank"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Dummy */
    // autogenerated using string template disenumpart2.txt
    DUMMY (4002, "Dummy"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Kinetic */
    // autogenerated using string template disenumpart2.txt
    KINETIC (5000, "Kinetic"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mines */
    // autogenerated using string template disenumpart2.txt
    MINES (6000, "Mines"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Nuclear */
    // autogenerated using string template disenumpart2.txt
    NUCLEAR (7000, "Nuclear"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Nuclear, IMT */
    // autogenerated using string template disenumpart2.txt
    NUCLEAR_IMT (7010, "Nuclear, IMT"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Chemical, General */
    // autogenerated using string template disenumpart2.txt
    CHEMICAL_GENERAL (8000, "Chemical, General"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Chemical, Blister Agent */
    // autogenerated using string template disenumpart2.txt
    CHEMICAL_BLISTER_AGENT (8100, "Chemical, Blister Agent"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HD (Mustard) */
    // autogenerated using string template disenumpart2.txt
    HD_MUSTARD (8110, "HD (Mustard)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Thickened HD (Mustard) */
    // autogenerated using string template disenumpart2.txt
    THICKENED_HD_MUSTARD (8115, "Thickened HD (Mustard)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Dusty HD (Mustard) */
    // autogenerated using string template disenumpart2.txt
    DUSTY_HD_MUSTARD (8120, "Dusty HD (Mustard)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** L (Lewisite) */
    // autogenerated using string template disenumpart2.txt
    L_LEWISITE (8125, "L (Lewisite)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HN3 (Nitrogen Mustard) */
    // autogenerated using string template disenumpart2.txt
    HN3_NITROGEN_MUSTARD (8130, "HN3 (Nitrogen Mustard)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HL (Mustard/Lewisite) */
    // autogenerated using string template disenumpart2.txt
    HL_MUSTARD_LEWISITE (8135, "HL (Mustard/Lewisite)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CX (Phosgene Oxime) */
    // autogenerated using string template disenumpart2.txt
    CX_PHOSGENE_OXIME (8140, "CX (Phosgene Oxime)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** DMMP (Phosphate Dimethyl Hydrogen) */
    // autogenerated using string template disenumpart2.txt
    DMMP_PHOSPHATE_DIMETHYL_HYDROGEN (8145, "DMMP (Phosphate Dimethyl Hydrogen)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** DMHP (Phosphite) */
    // autogenerated using string template disenumpart2.txt
    DMHP_PHOSPHITE (8150, "DMHP (Phosphite)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** DMA (Dimethyl Acrylate) */
    // autogenerated using string template disenumpart2.txt
    DMA_DIMETHYL_ACRYLATE (8155, "DMA (Dimethyl Acrylate)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** DEM */
    // autogenerated using string template disenumpart2.txt
    DEM (8160, "DEM"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** PX (P-xlene) */
    // autogenerated using string template disenumpart2.txt
    PX_P_XLENE (8165, "PX (P-xlene)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Chemical, Blood Agent */
    // autogenerated using string template disenumpart2.txt
    CHEMICAL_BLOOD_AGENT (8200, "Chemical, Blood Agent"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AC (HCN) */
    // autogenerated using string template disenumpart2.txt
    AC_HCN (8210, "AC (HCN)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CK (CNCI) */
    // autogenerated using string template disenumpart2.txt
    CK_CNCI (8215, "CK (CNCI)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CG (Phosgene) */
    // autogenerated using string template disenumpart2.txt
    CG_PHOSGENE (8220, "CG (Phosgene)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Chemical, Nerve Agent */
    // autogenerated using string template disenumpart2.txt
    CHEMICAL_NERVE_AGENT (8300, "Chemical, Nerve Agent"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** VX */
    // autogenerated using string template disenumpart2.txt
    VX (8310, "VX"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Thickened VX */
    // autogenerated using string template disenumpart2.txt
    THICKENED_VX (8315, "Thickened VX"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Dusty VX */
    // autogenerated using string template disenumpart2.txt
    DUSTY_VX (8320, "Dusty VX"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** GA (Tabun) */
    // autogenerated using string template disenumpart2.txt
    GA_TABUN (8325, "GA (Tabun)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Thickened GA (Tabun) */
    // autogenerated using string template disenumpart2.txt
    THICKENED_GA_TABUN (8330, "Thickened GA (Tabun)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Dusty GA (Tabun) */
    // autogenerated using string template disenumpart2.txt
    DUSTY_GA_TABUN (8335, "Dusty GA (Tabun)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** GB (Sarin) */
    // autogenerated using string template disenumpart2.txt
    GB_SARIN (8340, "GB (Sarin)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Thickened GB (Sarin) */
    // autogenerated using string template disenumpart2.txt
    THICKENED_GB_SARIN (8345, "Thickened GB (Sarin)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Dusty GB (Sarin) */
    // autogenerated using string template disenumpart2.txt
    DUSTY_GB_SARIN (8350, "Dusty GB (Sarin)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** GD (Soman) */
    // autogenerated using string template disenumpart2.txt
    GD_SOMAN (8355, "GD (Soman)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Thickened GD (Soman) */
    // autogenerated using string template disenumpart2.txt
    THICKENED_GD_SOMAN (8360, "Thickened GD (Soman)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Dusty GD (Soman) */
    // autogenerated using string template disenumpart2.txt
    DUSTY_GD_SOMAN (8365, "Dusty GD (Soman)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** GF */
    // autogenerated using string template disenumpart2.txt
    GF (8370, "GF"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Thickened GF */
    // autogenerated using string template disenumpart2.txt
    THICKENED_GF (8375, "Thickened GF"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Dusty GF */
    // autogenerated using string template disenumpart2.txt
    DUSTY_GF (8380, "Dusty GF"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** SVX (Soviet VX) */
    // autogenerated using string template disenumpart2.txt
    SVX_SOVIET_VX (8385, "SVX (Soviet VX)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** BIS */
    // autogenerated using string template disenumpart2.txt
    BIS (8410, "BIS"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TCP */
    // autogenerated using string template disenumpart2.txt
    TCP (8415, "TCP"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** MS (Methyl Salicylate) */
    // autogenerated using string template disenumpart2.txt
    MS_METHYL_SALICYLATE (8425, "MS (Methyl Salicylate)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TEP */
    // autogenerated using string template disenumpart2.txt
    TEP (8430, "TEP"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** H2O (Water) */
    // autogenerated using string template disenumpart2.txt
    H2O_WATER (8445, "H2O (Water)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TO1 (Toxic Organic 1) */
    // autogenerated using string template disenumpart2.txt
    TO1_TOXIC_ORGANIC_1 (8450, "TO1 (Toxic Organic 1)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TO2 (Toxic Organic 2) */
    // autogenerated using string template disenumpart2.txt
    TO2_TOXIC_ORGANIC_2 (8455, "TO2 (Toxic Organic 2)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TO3 (Toxic Organic 3) */
    // autogenerated using string template disenumpart2.txt
    TO3_TOXIC_ORGANIC_3 (8460, "TO3 (Toxic Organic 3)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Sulfur Hexafluoride */
    // autogenerated using string template disenumpart2.txt
    SULFUR_HEXAFLUORIDE (8465, "Sulfur Hexafluoride"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AA (Acetic Acid) */
    // autogenerated using string template disenumpart2.txt
    AA_ACETIC_ACID (8470, "AA (Acetic Acid)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HF (Hydrofluoric Acid) */
    // autogenerated using string template disenumpart2.txt
    HF_HYDROFLUORIC_ACID (8475, "HF (Hydrofluoric Acid)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Biological */
    // autogenerated using string template disenumpart2.txt
    BIOLOGICAL (9000, "Biological"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Biological, Virus */
    // autogenerated using string template disenumpart2.txt
    BIOLOGICAL_VIRUS (9100, "Biological, Virus"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Biological, Bacteria */
    // autogenerated using string template disenumpart2.txt
    BIOLOGICAL_BACTERIA (9200, "Biological, Bacteria"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Biological, Rickettsia */
    // autogenerated using string template disenumpart2.txt
    BIOLOGICAL_RICKETTSIA (9300, "Biological, Rickettsia"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Biological, Genetically Modified Micro-organisms */
    // autogenerated using string template disenumpart2.txt
    BIOLOGICAL_GENETICALLY_MODIFIED_MICRO_ORGANISMS (9400, "Biological, Genetically Modified Micro-organisms"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Biological, Toxin */
    // autogenerated using string template disenumpart2.txt
    BIOLOGICAL_TOXIN (9500, "Biological, Toxin"),;

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    MunitionDescriptorWarhead(int value, String description)
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
      return 16;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static MunitionDescriptorWarhead getEnumForValue(int value)
    {
       for (MunitionDescriptorWarhead nextEnum : MunitionDescriptorWarhead.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum MunitionDescriptorWarhead");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

    // autogenerated using string template disenumpart3_16.txt

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeShort(getValue());
    }

    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output
     * @throws IOException input-output error */
    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.putShort((short)getValue());
    }
    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static MunitionDescriptorWarhead unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static MunitionDescriptorWarhead unmarshalEnum (ByteBuffer byteBuffer) throws Exception
    {
        return getEnumForValue(byteBuffer.getShort());
    }   

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 2; // 16 bits
    }
    
  /**
   * Provide simple identifier
   * @return ID number and name
   */
    @Override
    public String toString()
    {
        return "MunitionDescriptorWarhead " + getValue() + " " + name(); 
    }
}
