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
 * Current Shaft RPM, Ordered Shaft RPM for use by Underwater Acoustic (UA) PDU. Section 7.6.4
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class ShaftRPM extends Object implements Serializable
{
   /** currentRPM is an undescribed parameter... */
   protected short currentRPM;

   /** orderedRPM is an undescribed parameter... */
   protected short orderedRPM;

   /** RPMrateOfChange is an undescribed parameter... */
   protected int RPMrateOfChange;


/** Constructor creates and configures a new instance object */
 public ShaftRPM()
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

   marshalSize += 2;  // currentRPM
   marshalSize += 2;  // orderedRPM
   marshalSize += 4;  // RPMrateOfChange

   return marshalSize;
}


/** Setter for {@link ShaftRPM#currentRPM}
  * @param pCurrentRPM new value of interest
  * @return same object to permit progressive setters */
public ShaftRPM setCurrentRPM(short pCurrentRPM)
{
    currentRPM = pCurrentRPM;
    return this;
}
/** Utility setter for {@link ShaftRPM#currentRPM}
  * @param pCurrentRPM new value of interest
  * @return same object to permit progressive setters */
public ShaftRPM setCurrentRPM(int pCurrentRPM){
    currentRPM = (short) pCurrentRPM;
    return this;
}
/** Getter for {@link ShaftRPM#currentRPM}
  * @return value of interest */
public short getCurrentRPM()
{
    return currentRPM; 
}

/** Setter for {@link ShaftRPM#orderedRPM}
  * @param pOrderedRPM new value of interest
  * @return same object to permit progressive setters */
public ShaftRPM setOrderedRPM(short pOrderedRPM)
{
    orderedRPM = pOrderedRPM;
    return this;
}
/** Utility setter for {@link ShaftRPM#orderedRPM}
  * @param pOrderedRPM new value of interest
  * @return same object to permit progressive setters */
public ShaftRPM setOrderedRPM(int pOrderedRPM){
    orderedRPM = (short) pOrderedRPM;
    return this;
}
/** Getter for {@link ShaftRPM#orderedRPM}
  * @return value of interest */
public short getOrderedRPM()
{
    return orderedRPM; 
}

/** Setter for {@link ShaftRPM#RPMrateOfChange}
  * @param pRPMrateOfChange new value of interest
  * @return same object to permit progressive setters */
public ShaftRPM setRPMrateOfChange(int pRPMrateOfChange)
{
    RPMrateOfChange = pRPMrateOfChange;
    return this;
}
/** Getter for {@link ShaftRPM#RPMrateOfChange}
  * @return value of interest */
public int getRPMrateOfChange()
{
    return RPMrateOfChange; 
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
       dos.writeShort(currentRPM);
       dos.writeShort(orderedRPM);
       dos.writeInt(RPMrateOfChange);
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
        currentRPM = (short)dis.readUnsignedShort();
        uPosition += 2;
        orderedRPM = (short)dis.readUnsignedShort();
        uPosition += 2;
        RPMrateOfChange = dis.readInt();
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
   byteBuffer.putShort( (short)currentRPM);
   byteBuffer.putShort( (short)orderedRPM);
   byteBuffer.putInt( (int)RPMrateOfChange);
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
        // attribute currentRPM marked as not serialized
        currentRPM = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute orderedRPM marked as not serialized
        orderedRPM = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute RPMrateOfChange marked as not serialized
        RPMrateOfChange = byteBuffer.getInt();
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
     boolean ivarsEqual = true;

     final ShaftRPM rhs = (ShaftRPM)obj;

     if( ! (currentRPM == rhs.currentRPM)) ivarsEqual = false;
     if( ! (orderedRPM == rhs.orderedRPM)) ivarsEqual = false;
     if( ! (RPMrateOfChange == rhs.RPMrateOfChange)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" currentRPM:").append(currentRPM); // writeOneToString
    sb.append(" orderedRPM:").append(orderedRPM); // writeOneToString
    sb.append(" RPMrateOfChange:").append(RPMrateOfChange); // writeOneToString

   return sb.toString();
 }
} // end of class
