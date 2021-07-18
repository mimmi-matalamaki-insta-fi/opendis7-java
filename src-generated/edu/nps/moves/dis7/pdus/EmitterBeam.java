/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class EmitterBeam extends Object implements Serializable
{
   /** beamDataLength is an undescribed parameter... */
   protected byte  beamDataLength;

   /** beamNumber is an undescribed parameter... */
   protected byte  beamNumber;

   /** beamParameterIndex is an undescribed parameter... */
   protected short  beamParameterIndex;

   /** fundamentalParameterData is an undescribed parameter... */
   protected EEFundamentalParameterData  fundamentalParameterData = new EEFundamentalParameterData(); 

   /** beamData is an undescribed parameter... */
   protected BeamData  beamData = new BeamData(); 

   /**  uid 78 */
   protected ElectromagneticEmissionBeamFunction beamFunction = ElectromagneticEmissionBeamFunction.values()[0];

   /** numberOfTargets is an undescribed parameter... */
   protected byte  numberOfTargets;

   /**  uid 79 */
   protected HighDensityTrackJam highDensityTrackJam = HighDensityTrackJam.values()[0];

   /** beamStatus is an undescribed parameter... */
   protected BeamStatus  beamStatus = new BeamStatus(); 

   /** jammingTechnique is an undescribed parameter... */
   protected JammingTechnique  jammingTechnique = new JammingTechnique(); 

   /** trackJamData is an undescribed parameter... */
   protected List< TrackJamData > trackJamData = new ArrayList< TrackJamData >();
 

/** Constructor */
 public EmitterBeam()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 1;  // beamDataLength
   marshalSize += 1;  // beamNumber
   marshalSize += 2;  // beamParameterIndex
   marshalSize += fundamentalParameterData.getMarshalledSize();
   marshalSize += beamData.getMarshalledSize();
   marshalSize += beamFunction.getMarshalledSize();
   marshalSize += 1;  // numberOfTargets
   marshalSize += highDensityTrackJam.getMarshalledSize();
   marshalSize += beamStatus.getMarshalledSize();
   marshalSize += jammingTechnique.getMarshalledSize();
   for(int idx=0; idx < trackJamData.size(); idx++)
   {
        TrackJamData listElement = trackJamData.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link EmitterBeam#beamDataLength}
  * @param pBeamDataLength new value of interest
  * @return same object to permit progressive setters */
public EmitterBeam setBeamDataLength(byte pBeamDataLength)
{
    beamDataLength = pBeamDataLength;
    return this;
}
/** Utility setter for {@link EmitterBeam#beamDataLength}
  * @param pBeamDataLength new value of interest
  * @return same object to permit progressive setters */
public EmitterBeam setBeamDataLength(int pBeamDataLength){
    beamDataLength = (byte) pBeamDataLength;
    return this;
}

/** Getter for {@link EmitterBeam#beamDataLength}
  * @return value of interest */
public byte getBeamDataLength()
{
    return beamDataLength; 
}

/** Setter for {@link EmitterBeam#beamNumber}
  * @param pBeamNumber new value of interest
  * @return same object to permit progressive setters */
public EmitterBeam setBeamNumber(byte pBeamNumber)
{
    beamNumber = pBeamNumber;
    return this;
}
/** Utility setter for {@link EmitterBeam#beamNumber}
  * @param pBeamNumber new value of interest
  * @return same object to permit progressive setters */
public EmitterBeam setBeamNumber(int pBeamNumber){
    beamNumber = (byte) pBeamNumber;
    return this;
}

/** Getter for {@link EmitterBeam#beamNumber}
  * @return value of interest */
public byte getBeamNumber()
{
    return beamNumber; 
}

/** Setter for {@link EmitterBeam#beamParameterIndex}
  * @param pBeamParameterIndex new value of interest
  * @return same object to permit progressive setters */
public EmitterBeam setBeamParameterIndex(short pBeamParameterIndex)
{
    beamParameterIndex = pBeamParameterIndex;
    return this;
}
/** Utility setter for {@link EmitterBeam#beamParameterIndex}
  * @param pBeamParameterIndex new value of interest
  * @return same object to permit progressive setters */
public EmitterBeam setBeamParameterIndex(int pBeamParameterIndex){
    beamParameterIndex = (short) pBeamParameterIndex;
    return this;
}

/** Getter for {@link EmitterBeam#beamParameterIndex}
  * @return value of interest */
public short getBeamParameterIndex()
{
    return beamParameterIndex; 
}

/** Setter for {@link EmitterBeam#fundamentalParameterData}
  * @param pFundamentalParameterData new value of interest
  * @return same object to permit progressive setters */
public EmitterBeam setFundamentalParameterData(EEFundamentalParameterData pFundamentalParameterData)
{
    fundamentalParameterData = pFundamentalParameterData;
    return this;
}

/** Getter for {@link EmitterBeam#fundamentalParameterData}
  * @return value of interest */
public EEFundamentalParameterData getFundamentalParameterData()
{
    return fundamentalParameterData; 
}

/** Setter for {@link EmitterBeam#beamData}
  * @param pBeamData new value of interest
  * @return same object to permit progressive setters */
public EmitterBeam setBeamData(BeamData pBeamData)
{
    beamData = pBeamData;
    return this;
}

/** Getter for {@link EmitterBeam#beamData}
  * @return value of interest */
public BeamData getBeamData()
{
    return beamData; 
}

/** Setter for {@link EmitterBeam#beamFunction}
  * @param pBeamFunction new value of interest
  * @return same object to permit progressive setters */
public EmitterBeam setBeamFunction(ElectromagneticEmissionBeamFunction pBeamFunction)
{
    beamFunction = pBeamFunction;
    return this;
}

/** Getter for {@link EmitterBeam#beamFunction}
  * @return value of interest */
public ElectromagneticEmissionBeamFunction getBeamFunction()
{
    return beamFunction; 
}

/** Setter for {@link EmitterBeam#highDensityTrackJam}
  * @param pHighDensityTrackJam new value of interest
  * @return same object to permit progressive setters */
public EmitterBeam setHighDensityTrackJam(HighDensityTrackJam pHighDensityTrackJam)
{
    highDensityTrackJam = pHighDensityTrackJam;
    return this;
}

/** Getter for {@link EmitterBeam#highDensityTrackJam}
  * @return value of interest */
public HighDensityTrackJam getHighDensityTrackJam()
{
    return highDensityTrackJam; 
}

/** Setter for {@link EmitterBeam#beamStatus}
  * @param pBeamStatus new value of interest
  * @return same object to permit progressive setters */
public EmitterBeam setBeamStatus(BeamStatus pBeamStatus)
{
    beamStatus = pBeamStatus;
    return this;
}

/** Getter for {@link EmitterBeam#beamStatus}
  * @return value of interest */
public BeamStatus getBeamStatus()
{
    return beamStatus; 
}

/** Setter for {@link EmitterBeam#jammingTechnique}
  * @param pJammingTechnique new value of interest
  * @return same object to permit progressive setters */
public EmitterBeam setJammingTechnique(JammingTechnique pJammingTechnique)
{
    jammingTechnique = pJammingTechnique;
    return this;
}

/** Getter for {@link EmitterBeam#jammingTechnique}
  * @return value of interest */
public JammingTechnique getJammingTechnique()
{
    return jammingTechnique; 
}

/** Setter for {@link EmitterBeam#trackJamData}
  * @param pTrackJamData new value of interest
  * @return same object to permit progressive setters */
public EmitterBeam setTrackJamData(List<TrackJamData> pTrackJamData)
{
    trackJamData = pTrackJamData;
    return this;
}

/** Getter for {@link EmitterBeam#trackJamData}
  * @return value of interest */
public List<TrackJamData> getTrackJamData()
{
    return trackJamData; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       dos.writeByte(beamDataLength);
       dos.writeByte(beamNumber);
       dos.writeShort(beamParameterIndex);
       fundamentalParameterData.marshal(dos);
       beamData.marshal(dos);
       beamFunction.marshal(dos);
       dos.writeByte(trackJamData.size());
       highDensityTrackJam.marshal(dos);
       beamStatus.marshal(dos);
       jammingTechnique.marshal(dos);

       for(int idx = 0; idx < trackJamData.size(); idx++)
       {
            TrackJamData aTrackJamData = trackJamData.get(idx);
            aTrackJamData.marshal(dos);
       }

    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Deserializes an object from a DataInputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataInputStream
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        beamDataLength = (byte)dis.readUnsignedByte();
        uPosition += 1;
        beamNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        beamParameterIndex = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += fundamentalParameterData.unmarshal(dis);
        uPosition += beamData.unmarshal(dis);
        beamFunction = ElectromagneticEmissionBeamFunction.unmarshalEnum(dis);
        uPosition += beamFunction.getMarshalledSize();
        numberOfTargets = (byte)dis.readUnsignedByte();
        uPosition += 1;
        highDensityTrackJam = HighDensityTrackJam.unmarshalEnum(dis);
        uPosition += highDensityTrackJam.getMarshalledSize();
        uPosition += beamStatus.unmarshal(dis);
        uPosition += jammingTechnique.unmarshal(dis);
        for(int idx = 0; idx < numberOfTargets; idx++)
        {
            TrackJamData anX = new TrackJamData();
            uPosition += anX.unmarshal(dis);
            trackJamData.add(anX);
        }

    }
    catch(Exception e)
    { 
      System.err.println(e); 
    }
    return getMarshalledSize();
}

/**
 * Packs an object into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if byteBuffer is too small
 * @throws java.nio.ReadOnlyBufferException if byteBuffer is read only
 * @see java.nio.ByteBuffer
 * @param byteBuffer The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   byteBuffer.put( (byte)beamDataLength);
   byteBuffer.put( (byte)beamNumber);
   byteBuffer.putShort( (short)beamParameterIndex);
   fundamentalParameterData.marshal(byteBuffer);
   beamData.marshal(byteBuffer);
   beamFunction.marshal(byteBuffer);
   byteBuffer.put( (byte)trackJamData.size());
   highDensityTrackJam.marshal(byteBuffer);
   beamStatus.marshal(byteBuffer);
   jammingTechnique.marshal(byteBuffer);

   for(int idx = 0; idx < trackJamData.size(); idx++)
   {
        TrackJamData aTrackJamData = trackJamData.get(idx);
        aTrackJamData.marshal(byteBuffer);
   }

}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    beamDataLength = (byte)(byteBuffer.get() & 0xFF);
    beamNumber = (byte)(byteBuffer.get() & 0xFF);
    beamParameterIndex = (short)(byteBuffer.getShort() & 0xFFFF);
    fundamentalParameterData.unmarshal(byteBuffer);
    beamData.unmarshal(byteBuffer);
    beamFunction = ElectromagneticEmissionBeamFunction.unmarshalEnum(byteBuffer);
    numberOfTargets = (byte)(byteBuffer.get() & 0xFF);
    highDensityTrackJam = HighDensityTrackJam.unmarshalEnum(byteBuffer);
    beamStatus.unmarshal(byteBuffer);
    jammingTechnique.unmarshal(byteBuffer);
    for(int idx = 0; idx < numberOfTargets; idx++)
    {
    TrackJamData anX = new TrackJamData();
    anX.unmarshal(byteBuffer);
    trackJamData.add(anX);
    }

    return getMarshalledSize();
}

 /*
  * Override of default equals method.  Calls equalsImpl() for content comparison.
  */
@Override
 public boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(!getClass().isAssignableFrom(obj.getClass())) //if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final EmitterBeam rhs = (EmitterBeam)obj;

     if( ! (beamDataLength == rhs.beamDataLength)) ivarsEqual = false;
     if( ! (beamNumber == rhs.beamNumber)) ivarsEqual = false;
     if( ! (beamParameterIndex == rhs.beamParameterIndex)) ivarsEqual = false;
     if( ! (fundamentalParameterData.equals( rhs.fundamentalParameterData) )) ivarsEqual = false;
     if( ! (beamData.equals( rhs.beamData) )) ivarsEqual = false;
     if( ! (beamFunction == rhs.beamFunction)) ivarsEqual = false;
     if( ! (highDensityTrackJam == rhs.highDensityTrackJam)) ivarsEqual = false;
     if( ! (beamStatus.equals( rhs.beamStatus) )) ivarsEqual = false;
     if( ! (jammingTechnique.equals( rhs.jammingTechnique) )) ivarsEqual = false;

     for(int idx = 0; idx < trackJamData.size(); idx++)
        if( ! ( trackJamData.get(idx).equals(rhs.trackJamData.get(idx)))) ivarsEqual = false;

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" beamDataLength: ").append(beamDataLength).append("\n");
    sb.append(" beamNumber: ").append(beamNumber).append("\n");
    sb.append(" beamParameterIndex: ").append(beamParameterIndex).append("\n");
    sb.append(" fundamentalParameterData: ").append(fundamentalParameterData).append("\n");
    sb.append(" beamData: ").append(beamData).append("\n");
    sb.append(" beamFunction: ").append(beamFunction).append("\n");
    sb.append(" highDensityTrackJam: ").append(highDensityTrackJam).append("\n");
    sb.append(" beamStatus: ").append(beamStatus).append("\n");
    sb.append(" jammingTechnique: ").append(jammingTechnique).append("\n");
    sb.append(" trackJamData: ").append("\n");
    trackJamData.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class