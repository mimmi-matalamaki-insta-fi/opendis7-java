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
 * 16-bit fixed binaries
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class LiveEntityOrientation16 extends Object implements Serializable
{
   /** psi is an undescribed parameter... */
   protected short psi;

   /** theta is an undescribed parameter... */
   protected short theta;

   /** phi is an undescribed parameter... */
   protected short phi;


/** Constructor creates and configures a new instance object */
 public LiveEntityOrientation16()
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

   marshalSize += 2;  // psi
   marshalSize += 2;  // theta
   marshalSize += 2;  // phi

   return marshalSize;
}


/** Setter for {@link LiveEntityOrientation16#psi}
  * @param pPsi new value of interest
  * @return same object to permit progressive setters */
public LiveEntityOrientation16 setPsi(short pPsi)
{
    psi = pPsi;
    return this;
}
/** Utility setter for {@link LiveEntityOrientation16#psi}
  * @param pPsi new value of interest
  * @return same object to permit progressive setters */
public LiveEntityOrientation16 setPsi(int pPsi){
    psi = (short) pPsi;
    return this;
}
/** Getter for {@link LiveEntityOrientation16#psi}
  * @return value of interest */
public short getPsi()
{
    return psi; 
}

/** Setter for {@link LiveEntityOrientation16#theta}
  * @param pTheta new value of interest
  * @return same object to permit progressive setters */
public LiveEntityOrientation16 setTheta(short pTheta)
{
    theta = pTheta;
    return this;
}
/** Utility setter for {@link LiveEntityOrientation16#theta}
  * @param pTheta new value of interest
  * @return same object to permit progressive setters */
public LiveEntityOrientation16 setTheta(int pTheta){
    theta = (short) pTheta;
    return this;
}
/** Getter for {@link LiveEntityOrientation16#theta}
  * @return value of interest */
public short getTheta()
{
    return theta; 
}

/** Setter for {@link LiveEntityOrientation16#phi}
  * @param pPhi new value of interest
  * @return same object to permit progressive setters */
public LiveEntityOrientation16 setPhi(short pPhi)
{
    phi = pPhi;
    return this;
}
/** Utility setter for {@link LiveEntityOrientation16#phi}
  * @param pPhi new value of interest
  * @return same object to permit progressive setters */
public LiveEntityOrientation16 setPhi(int pPhi){
    phi = (short) pPhi;
    return this;
}
/** Getter for {@link LiveEntityOrientation16#phi}
  * @return value of interest */
public short getPhi()
{
    return phi; 
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
       dos.writeShort(psi);
       dos.writeShort(theta);
       dos.writeShort(phi);
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
        psi = (short)dis.readUnsignedShort();
        uPosition += 2;
        theta = (short)dis.readUnsignedShort();
        uPosition += 2;
        phi = (short)dis.readUnsignedShort();
        uPosition += 2;
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
   byteBuffer.putShort( (short)psi);
   byteBuffer.putShort( (short)theta);
   byteBuffer.putShort( (short)phi);
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
        // attribute psi marked as not serialized
        psi = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute theta marked as not serialized
        theta = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute phi marked as not serialized
        phi = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final LiveEntityOrientation16 rhs = (LiveEntityOrientation16)obj;

     if( ! (psi == rhs.psi)) ivarsEqual = false;
     if( ! (theta == rhs.theta)) ivarsEqual = false;
     if( ! (phi == rhs.phi)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" psi:").append(psi); // writeOneToString
    sb.append(" theta:").append(theta); // writeOneToString
    sb.append(" phi:").append(phi); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.psi,
	                     this.theta,
	                     this.phi);
 }
} // end of class
