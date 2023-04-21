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
 * Three double precision floating point values, x, y, and z. Used for world coordinates Section 6.2.97.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class Vector3Double extends Object implements Serializable
{
   /** X value */
   protected double x;

   /** y Value */
   protected double y;

   /** Z value */
   protected double z;


/** Constructor creates and configures a new instance object */
 public Vector3Double()
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

   marshalSize += 8;  // x
   marshalSize += 8;  // y
   marshalSize += 8;  // z

   return marshalSize;
}


/** Setter for {@link Vector3Double#x}
  * @param pX new value of interest
  * @return same object to permit progressive setters */
public Vector3Double setX(double pX)
{
    x = pX;
    return this;
}
/** Getter for {@link Vector3Double#x}
  * @return value of interest */
public double getX()
{
    return x; 
}

/** Setter for {@link Vector3Double#y}
  * @param pY new value of interest
  * @return same object to permit progressive setters */
public Vector3Double setY(double pY)
{
    y = pY;
    return this;
}
/** Getter for {@link Vector3Double#y}
  * @return value of interest */
public double getY()
{
    return y; 
}

/** Setter for {@link Vector3Double#z}
  * @param pZ new value of interest
  * @return same object to permit progressive setters */
public Vector3Double setZ(double pZ)
{
    z = pZ;
    return this;
}
/** Getter for {@link Vector3Double#z}
  * @return value of interest */
public double getZ()
{
    return z; 
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
       dos.writeDouble(x);
       dos.writeDouble(y);
       dos.writeDouble(z);
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
        x = dis.readDouble();
        uPosition += 4;
        y = dis.readDouble();
        uPosition += 4;
        z = dis.readDouble();
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
   byteBuffer.putDouble( (double)x);
   byteBuffer.putDouble( (double)y);
   byteBuffer.putDouble( (double)z);
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
        // attribute x marked as not serialized
        x = byteBuffer.getDouble();
        // attribute y marked as not serialized
        y = byteBuffer.getDouble();
        // attribute z marked as not serialized
        z = byteBuffer.getDouble();
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

     final Vector3Double rhs = (Vector3Double)obj;

     if( ! (x == rhs.x)) ivarsEqual = false;
     if( ! (y == rhs.y)) ivarsEqual = false;
     if( ! (z == rhs.z)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" x:").append(x); // writeOneToString
    sb.append(" y:").append(y); // writeOneToString
    sb.append(" z:").append(z); // writeOneToString

   return sb.toString();
 }
} // end of class
