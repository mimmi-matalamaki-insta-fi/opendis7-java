/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt



package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * The False Targets attribute record shall be used to communicate discrete values that are associated with false targets jamming that cannot be referenced to an emitter mode. The values provided in the False Targets attri- bute record shall be considered valid only for the victim radar beams listed in the jamming beam's Track/Jam Data records (provided in the associated Electromagnetic Emission PDU). Section 6.2.21.3
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class FalseTargetsAttribute extends Object implements Serializable
{
   /** record type */
   protected int recordType = (int)3502;

   /** The length of the record in octets. */
   protected short recordLength = (short)40;

   /** zero-filled array of padding bits for byte alignment and consistent sizing of PDU data */
   protected short padding = (short)0;

   /** This field indicates the emitter system generating the false targets. */
   protected byte emitterNumber;

   /** This field indicates the jamming beam generating the false targets.  */
   protected byte beamNumber;

   /** This field shall be used to indicate if false target data have changed since issuance of the last False Targets attribute record for this beam, if the False Targets attribute record is part of a heartbeat update to meet periodic update requirements or if false target data for the beam has ceased. uid 300 */
   protected EEAttributeStateIndicator stateIndicator = EEAttributeStateIndicator.values()[0];

   /** padding */
   protected byte padding2 = (byte)0;

   /** padding3 is an undescribed parameter... */
   protected short padding3 = (short)0;

   /** This field indicates the jamming beam generating the false targets.  */
   protected short falseTargetCount;

   /** This field shall specify the speed (in meters per second) at which false targets move toward the victim radar. Negative values shall indicate a velocity away from the victim radar.  */
   protected float walkSpeed;

   /** This field shall specify the rate (in meters per second squared) at which false tar- gets accelerate toward the victim radar. Negative values shall indicate an acceleration direction away from the victim radar.  */
   protected float walkAcceleration;

   /** This field shall specify the distance (in meters) that a false target is to walk before it pauses in range.  */
   protected float maximumWalkDistance;

   /** This field shall specify the time (in seconds) that a false target is to be held at the Maxi- mum Walk Distance before it resets to its initial position.  */
   protected float keepTime;

   /** This field shall specify the distance between false targets in meters. Positive values for this field shall indicate that second and subsequent false targets are initially placed at increasing ranges from the victim radar.  */
   protected float echoSpacing;

   /** Sets the position of the first false target relative to the jamming entity in meters. */
   protected float firstTargetOffset;


/** Constructor creates and configures a new instance object */
 public FalseTargetsAttribute()
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

   marshalSize += 4;  // recordType
   marshalSize += 2;  // recordLength
   marshalSize += 2;  // padding
   marshalSize += 1;  // emitterNumber
   marshalSize += 1;  // beamNumber
   if (stateIndicator != null)
       marshalSize += stateIndicator.getMarshalledSize();
   marshalSize += 1;  // padding2
   marshalSize += 2;  // padding3
   marshalSize += 2;  // falseTargetCount
   marshalSize += 4;  // walkSpeed
   marshalSize += 4;  // walkAcceleration
   marshalSize += 4;  // maximumWalkDistance
   marshalSize += 4;  // keepTime
   marshalSize += 4;  // echoSpacing
   marshalSize += 4;  // firstTargetOffset

   return marshalSize;
}


/** Setter for {@link FalseTargetsAttribute#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setRecordType(int pRecordType)
{
    recordType = pRecordType;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#recordType}
  * @return value of interest */
public int getRecordType()
{
    return recordType; 
}

/** Setter for {@link FalseTargetsAttribute#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setRecordLength(short pRecordLength)
{
    recordLength = pRecordLength;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setRecordLength(int pRecordLength){
    recordLength = (short) pRecordLength;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#recordLength}
  * @return value of interest */
public short getRecordLength()
{
    return recordLength; 
}

/** Setter for {@link FalseTargetsAttribute#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setPadding(short pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setPadding(int pPadding){
    padding = (short) pPadding;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#padding}
  * @return value of interest */
public short getPadding()
{
    return padding; 
}

/** Setter for {@link FalseTargetsAttribute#emitterNumber}
  * @param pEmitterNumber new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setEmitterNumber(byte pEmitterNumber)
{
    emitterNumber = pEmitterNumber;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#emitterNumber}
  * @param pEmitterNumber new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setEmitterNumber(int pEmitterNumber){
    emitterNumber = (byte) pEmitterNumber;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#emitterNumber}
  * @return value of interest */
public byte getEmitterNumber()
{
    return emitterNumber; 
}

/** Setter for {@link FalseTargetsAttribute#beamNumber}
  * @param pBeamNumber new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setBeamNumber(byte pBeamNumber)
{
    beamNumber = pBeamNumber;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#beamNumber}
  * @param pBeamNumber new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setBeamNumber(int pBeamNumber){
    beamNumber = (byte) pBeamNumber;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#beamNumber}
  * @return value of interest */
public byte getBeamNumber()
{
    return beamNumber; 
}

/** Setter for {@link FalseTargetsAttribute#stateIndicator}
  * @param pStateIndicator new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setStateIndicator(EEAttributeStateIndicator pStateIndicator)
{
    stateIndicator = pStateIndicator;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#stateIndicator}
  * @return value of interest */
public EEAttributeStateIndicator getStateIndicator()
{
    return stateIndicator; 
}

/** Setter for {@link FalseTargetsAttribute#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setPadding2(byte pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setPadding2(int pPadding2){
    padding2 = (byte) pPadding2;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#padding2}
  * @return value of interest */
public byte getPadding2()
{
    return padding2; 
}

/** Setter for {@link FalseTargetsAttribute#padding3}
  * @param pPadding3 new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setPadding3(short pPadding3)
{
    padding3 = pPadding3;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#padding3}
  * @param pPadding3 new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setPadding3(int pPadding3){
    padding3 = (short) pPadding3;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#padding3}
  * @return value of interest */
public short getPadding3()
{
    return padding3; 
}

/** Setter for {@link FalseTargetsAttribute#falseTargetCount}
  * @param pFalseTargetCount new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setFalseTargetCount(short pFalseTargetCount)
{
    falseTargetCount = pFalseTargetCount;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#falseTargetCount}
  * @param pFalseTargetCount new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setFalseTargetCount(int pFalseTargetCount){
    falseTargetCount = (short) pFalseTargetCount;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#falseTargetCount}
  * @return value of interest */
public short getFalseTargetCount()
{
    return falseTargetCount; 
}

/** Setter for {@link FalseTargetsAttribute#walkSpeed}
  * @param pWalkSpeed new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setWalkSpeed(float pWalkSpeed)
{
    walkSpeed = pWalkSpeed;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#walkSpeed}
  * @return value of interest */
public float getWalkSpeed()
{
    return walkSpeed; 
}

/** Setter for {@link FalseTargetsAttribute#walkAcceleration}
  * @param pWalkAcceleration new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setWalkAcceleration(float pWalkAcceleration)
{
    walkAcceleration = pWalkAcceleration;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#walkAcceleration}
  * @return value of interest */
public float getWalkAcceleration()
{
    return walkAcceleration; 
}

/** Setter for {@link FalseTargetsAttribute#maximumWalkDistance}
  * @param pMaximumWalkDistance new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setMaximumWalkDistance(float pMaximumWalkDistance)
{
    maximumWalkDistance = pMaximumWalkDistance;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#maximumWalkDistance}
  * @return value of interest */
public float getMaximumWalkDistance()
{
    return maximumWalkDistance; 
}

/** Setter for {@link FalseTargetsAttribute#keepTime}
  * @param pKeepTime new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setKeepTime(float pKeepTime)
{
    keepTime = pKeepTime;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#keepTime}
  * @return value of interest */
public float getKeepTime()
{
    return keepTime; 
}

/** Setter for {@link FalseTargetsAttribute#echoSpacing}
  * @param pEchoSpacing new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setEchoSpacing(float pEchoSpacing)
{
    echoSpacing = pEchoSpacing;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#echoSpacing}
  * @return value of interest */
public float getEchoSpacing()
{
    return echoSpacing; 
}

/** Setter for {@link FalseTargetsAttribute#firstTargetOffset}
  * @param pFirstTargetOffset new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setFirstTargetOffset(float pFirstTargetOffset)
{
    firstTargetOffset = pFirstTargetOffset;
    return this;
}
/** Getter for {@link FalseTargetsAttribute#firstTargetOffset}
  * @return value of interest */
public float getFirstTargetOffset()
{
    return firstTargetOffset; 
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
       dos.writeInt(recordType);
       dos.writeShort(recordLength);
       dos.writeShort(padding);
       dos.writeByte(emitterNumber);
       dos.writeByte(beamNumber);
       stateIndicator.marshal(dos);
       dos.writeByte(padding2);
       dos.writeShort(padding3);
       dos.writeShort(falseTargetCount);
       dos.writeFloat(walkSpeed);
       dos.writeFloat(walkAcceleration);
       dos.writeFloat(maximumWalkDistance);
       dos.writeFloat(keepTime);
       dos.writeFloat(echoSpacing);
       dos.writeFloat(firstTargetOffset);
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
        recordType = dis.readInt();
        uPosition += 4;
        recordLength = (short)dis.readUnsignedShort();
        uPosition += 2;
        padding = (short)dis.readUnsignedShort();
        uPosition += 2;
        emitterNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        beamNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        stateIndicator = EEAttributeStateIndicator.unmarshalEnum(dis);
        uPosition += stateIndicator.getMarshalledSize();
        padding2 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding3 = (short)dis.readUnsignedShort();
        uPosition += 2;
        falseTargetCount = (short)dis.readUnsignedShort();
        uPosition += 2;
        walkSpeed = dis.readFloat();
        uPosition += 4;
        walkAcceleration = dis.readFloat();
        uPosition += 4;
        maximumWalkDistance = dis.readFloat();
        uPosition += 4;
        keepTime = dis.readFloat();
        uPosition += 4;
        echoSpacing = dis.readFloat();
        uPosition += 4;
        firstTargetOffset = dis.readFloat();
        uPosition += 4;
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
   byteBuffer.putInt( (int)recordType);
   byteBuffer.putShort( (short)recordLength);
   byteBuffer.putShort( (short)padding);
   byteBuffer.put( (byte)emitterNumber);
   byteBuffer.put( (byte)beamNumber);
   stateIndicator.marshal(byteBuffer);
   byteBuffer.put( (byte)padding2);
   byteBuffer.putShort( (short)padding3);
   byteBuffer.putShort( (short)falseTargetCount);
   byteBuffer.putFloat( (float)walkSpeed);
   byteBuffer.putFloat( (float)walkAcceleration);
   byteBuffer.putFloat( (float)maximumWalkDistance);
   byteBuffer.putFloat( (float)keepTime);
   byteBuffer.putFloat( (float)echoSpacing);
   byteBuffer.putFloat( (float)firstTargetOffset);
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
    try
    {
        // attribute recordType marked as not serialized
        recordType = byteBuffer.getInt();
        // attribute recordLength marked as not serialized
        recordLength = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute padding marked as not serialized
        padding = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute emitterNumber marked as not serialized
        emitterNumber = (byte)(byteBuffer.get() & 0xFF);
        // attribute beamNumber marked as not serialized
        beamNumber = (byte)(byteBuffer.get() & 0xFF);
        // attribute stateIndicator marked as not serialized
        stateIndicator = EEAttributeStateIndicator.unmarshalEnum(byteBuffer);
        // attribute padding2 marked as not serialized
        padding2 = (byte)(byteBuffer.get() & 0xFF);
        // attribute padding3 marked as not serialized
        padding3 = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute falseTargetCount marked as not serialized
        falseTargetCount = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute walkSpeed marked as not serialized
        walkSpeed = byteBuffer.getFloat();
        // attribute walkAcceleration marked as not serialized
        walkAcceleration = byteBuffer.getFloat();
        // attribute maximumWalkDistance marked as not serialized
        maximumWalkDistance = byteBuffer.getFloat();
        // attribute keepTime marked as not serialized
        keepTime = byteBuffer.getFloat();
        // attribute echoSpacing marked as not serialized
        echoSpacing = byteBuffer.getFloat();
        // attribute firstTargetOffset marked as not serialized
        firstTargetOffset = byteBuffer.getFloat();
    }
    catch (java.nio.BufferUnderflowException bue)
    {
        System.err.println("*** buffer underflow error while unmarshalling " + this.getClass().getName());
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
     final FalseTargetsAttribute rhs = (FalseTargetsAttribute)obj;

     if( ! (recordType == rhs.recordType)) return false;
     if( ! (recordLength == rhs.recordLength)) return false;
     if( ! (padding == rhs.padding)) return false;
     if( ! (emitterNumber == rhs.emitterNumber)) return false;
     if( ! (beamNumber == rhs.beamNumber)) return false;
     if( ! (stateIndicator == rhs.stateIndicator)) return false;
     if( ! (padding2 == rhs.padding2)) return false;
     if( ! (padding3 == rhs.padding3)) return false;
     if( ! (falseTargetCount == rhs.falseTargetCount)) return false;
     if( ! (walkSpeed == rhs.walkSpeed)) return false;
     if( ! (walkAcceleration == rhs.walkAcceleration)) return false;
     if( ! (maximumWalkDistance == rhs.maximumWalkDistance)) return false;
     if( ! (keepTime == rhs.keepTime)) return false;
     if( ! (echoSpacing == rhs.echoSpacing)) return false;
     if( ! (firstTargetOffset == rhs.firstTargetOffset)) return false;
    return true;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" recordType:").append(recordType); // writeOneToString
    sb.append(" recordLength:").append(recordLength); // writeOneToString
    sb.append(" padding:").append(padding); // writeOneToString
    sb.append(" emitterNumber:").append(emitterNumber); // writeOneToString
    sb.append(" beamNumber:").append(beamNumber); // writeOneToString
    sb.append(" stateIndicator:").append(stateIndicator); // writeOneToString
    sb.append(" padding2:").append(padding2); // writeOneToString
    sb.append(" padding3:").append(padding3); // writeOneToString
    sb.append(" falseTargetCount:").append(falseTargetCount); // writeOneToString
    sb.append(" walkSpeed:").append(walkSpeed); // writeOneToString
    sb.append(" walkAcceleration:").append(walkAcceleration); // writeOneToString
    sb.append(" maximumWalkDistance:").append(maximumWalkDistance); // writeOneToString
    sb.append(" keepTime:").append(keepTime); // writeOneToString
    sb.append(" echoSpacing:").append(echoSpacing); // writeOneToString
    sb.append(" firstTargetOffset:").append(firstTargetOffset); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.recordType,
	                     this.recordLength,
	                     this.padding,
	                     this.emitterNumber,
	                     this.beamNumber,
	                     this.stateIndicator,
	                     this.padding2,
	                     this.padding3,
	                     this.falseTargetCount,
	                     this.walkSpeed,
	                     this.walkAcceleration,
	                     this.maximumWalkDistance,
	                     this.keepTime,
	                     this.echoSpacing,
	                     this.firstTargetOffset);
 }
} // end of class
