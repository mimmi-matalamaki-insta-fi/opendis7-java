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
 * Information about a specific UA emitter. Section 6.2.2.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class AcousticEmitter extends Object implements Serializable
{
   /** The system for a particular UA emitter, and an enumeration uid 144 */
   protected UAAcousticSystemName acousticSystemName = UAAcousticSystemName.values()[0];

   /** The function of the acoustic system uid 145 */
   protected UAAcousticEmitterSystemFunction acousticFunction = UAAcousticEmitterSystemFunction.values()[0];

   /** The UA emitter identification number relative to a specific system */
   protected byte acousticIDNumber;


/** Constructor creates and configures a new instance object */
 public AcousticEmitter()
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

   if (acousticSystemName != null)
       marshalSize += acousticSystemName.getMarshalledSize();
   if (acousticFunction != null)
       marshalSize += acousticFunction.getMarshalledSize();
   marshalSize += 1;  // acousticIDNumber

   return marshalSize;
}


/** Setter for {@link AcousticEmitter#acousticSystemName}
  * @param pAcousticSystemName new value of interest
  * @return same object to permit progressive setters */
public AcousticEmitter setAcousticSystemName(UAAcousticSystemName pAcousticSystemName)
{
    acousticSystemName = pAcousticSystemName;
    return this;
}
/** Getter for {@link AcousticEmitter#acousticSystemName}
  * @return value of interest */
public UAAcousticSystemName getAcousticSystemName()
{
    return acousticSystemName; 
}

/** Setter for {@link AcousticEmitter#acousticFunction}
  * @param pAcousticFunction new value of interest
  * @return same object to permit progressive setters */
public AcousticEmitter setAcousticFunction(UAAcousticEmitterSystemFunction pAcousticFunction)
{
    acousticFunction = pAcousticFunction;
    return this;
}
/** Getter for {@link AcousticEmitter#acousticFunction}
  * @return value of interest */
public UAAcousticEmitterSystemFunction getAcousticFunction()
{
    return acousticFunction; 
}

/** Setter for {@link AcousticEmitter#acousticIDNumber}
  * @param pAcousticIDNumber new value of interest
  * @return same object to permit progressive setters */
public AcousticEmitter setAcousticIDNumber(byte pAcousticIDNumber)
{
    acousticIDNumber = pAcousticIDNumber;
    return this;
}
/** Utility setter for {@link AcousticEmitter#acousticIDNumber}
  * @param pAcousticIDNumber new value of interest
  * @return same object to permit progressive setters */
public AcousticEmitter setAcousticIDNumber(int pAcousticIDNumber){
    acousticIDNumber = (byte) pAcousticIDNumber;
    return this;
}
/** Getter for {@link AcousticEmitter#acousticIDNumber}
  * @return value of interest */
public byte getAcousticIDNumber()
{
    return acousticIDNumber; 
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
       acousticSystemName.marshal(dos);
       acousticFunction.marshal(dos);
       dos.writeByte(acousticIDNumber);
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
        acousticSystemName = UAAcousticSystemName.unmarshalEnum(dis);
        uPosition += acousticSystemName.getMarshalledSize();
        acousticFunction = UAAcousticEmitterSystemFunction.unmarshalEnum(dis);
        uPosition += acousticFunction.getMarshalledSize();
        acousticIDNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
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
   acousticSystemName.marshal(byteBuffer);
   acousticFunction.marshal(byteBuffer);
   byteBuffer.put( (byte)acousticIDNumber);
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
        // attribute acousticSystemName marked as not serialized
        acousticSystemName = UAAcousticSystemName.unmarshalEnum(byteBuffer);
        // attribute acousticFunction marked as not serialized
        acousticFunction = UAAcousticEmitterSystemFunction.unmarshalEnum(byteBuffer);
        // attribute acousticIDNumber marked as not serialized
        acousticIDNumber = (byte)(byteBuffer.get() & 0xFF);
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
     final AcousticEmitter rhs = (AcousticEmitter)obj;

     if( ! (acousticSystemName == rhs.acousticSystemName)) return false;
     if( ! (acousticFunction == rhs.acousticFunction)) return false;
     if( ! (acousticIDNumber == rhs.acousticIDNumber)) return false;
    return true;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" acousticSystemName:").append(acousticSystemName); // writeOneToString
    sb.append(" acousticFunction:").append(acousticFunction); // writeOneToString
    sb.append(" acousticIDNumber:").append(acousticIDNumber); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.acousticSystemName,
	                     this.acousticFunction,
	                     this.acousticIDNumber);
 }
} // end of class
