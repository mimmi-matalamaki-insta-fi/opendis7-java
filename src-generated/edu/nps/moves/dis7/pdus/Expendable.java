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
 * An entity's expendable (chaff, flares, etc.) information. Section 6.2.36
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class Expendable extends Object implements Serializable
{
   /** Type of expendable */
   protected EntityType  expendable = new EntityType(); 

   /** station is an undescribed parameter... */
   protected int station;

   /** quantity is an undescribed parameter... */
   protected short quantity;

   /**  uid 327 */
   protected MunitionExpendableStatus expendableStatus = MunitionExpendableStatus.values()[0];

   /** zero-filled array of padding bits for byte alignment and consistent sizing of PDU data */
   protected byte padding = (byte)0;


/** Constructor creates and configures a new instance object */
 public Expendable()
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

   if (expendable != null)
       marshalSize += expendable.getMarshalledSize();
   marshalSize += 4;  // station
   marshalSize += 2;  // quantity
   if (expendableStatus != null)
       marshalSize += expendableStatus.getMarshalledSize();
   marshalSize += 1;  // padding

   return marshalSize;
}


/** Setter for {@link Expendable#expendable}
  * @param pExpendable new value of interest
  * @return same object to permit progressive setters */
public Expendable setExpendable(EntityType pExpendable)
{
    expendable = pExpendable;
    return this;
}
/** Getter for {@link Expendable#expendable}
  * @return value of interest */
public EntityType getExpendable()
{
    return expendable;
}


/** Setter for {@link Expendable#station}
  * @param pStation new value of interest
  * @return same object to permit progressive setters */
public Expendable setStation(int pStation)
{
    station = pStation;
    return this;
}
/** Getter for {@link Expendable#station}
  * @return value of interest */
public int getStation()
{
    return station; 
}

/** Setter for {@link Expendable#quantity}
  * @param pQuantity new value of interest
  * @return same object to permit progressive setters */
public Expendable setQuantity(short pQuantity)
{
    quantity = pQuantity;
    return this;
}
/** Utility setter for {@link Expendable#quantity}
  * @param pQuantity new value of interest
  * @return same object to permit progressive setters */
public Expendable setQuantity(int pQuantity){
    quantity = (short) pQuantity;
    return this;
}
/** Getter for {@link Expendable#quantity}
  * @return value of interest */
public short getQuantity()
{
    return quantity; 
}

/** Setter for {@link Expendable#expendableStatus}
  * @param pExpendableStatus new value of interest
  * @return same object to permit progressive setters */
public Expendable setExpendableStatus(MunitionExpendableStatus pExpendableStatus)
{
    expendableStatus = pExpendableStatus;
    return this;
}
/** Getter for {@link Expendable#expendableStatus}
  * @return value of interest */
public MunitionExpendableStatus getExpendableStatus()
{
    return expendableStatus; 
}

/** Setter for {@link Expendable#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public Expendable setPadding(byte pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link Expendable#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public Expendable setPadding(int pPadding){
    padding = (byte) pPadding;
    return this;
}
/** Getter for {@link Expendable#padding}
  * @return value of interest */
public byte getPadding()
{
    return padding; 
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
       expendable.marshal(dos);
       dos.writeInt(station);
       dos.writeShort(quantity);
       expendableStatus.marshal(dos);
       dos.writeByte(padding);
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
        uPosition += expendable.unmarshal(dis);
        station = dis.readInt();
        uPosition += 4;
        quantity = (short)dis.readUnsignedShort();
        uPosition += 2;
        expendableStatus = MunitionExpendableStatus.unmarshalEnum(dis);
        uPosition += expendableStatus.getMarshalledSize();
        padding = (byte)dis.readUnsignedByte();
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
   expendable.marshal(byteBuffer);
   byteBuffer.putInt( (int)station);
   byteBuffer.putShort( (short)quantity);
   expendableStatus.marshal(byteBuffer);
   byteBuffer.put( (byte)padding);
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
        // attribute expendable marked as not serialized
        expendable.unmarshal(byteBuffer);
        // attribute station marked as not serialized
        station = byteBuffer.getInt();
        // attribute quantity marked as not serialized
        quantity = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute expendableStatus marked as not serialized
        expendableStatus = MunitionExpendableStatus.unmarshalEnum(byteBuffer);
        // attribute padding marked as not serialized
        padding = (byte)(byteBuffer.get() & 0xFF);
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
     final Expendable rhs = (Expendable)obj;

     if( ! Objects.equals(expendable, rhs.expendable) ) return false;
     if( ! (station == rhs.station)) return false;
     if( ! (quantity == rhs.quantity)) return false;
     if( ! (expendableStatus == rhs.expendableStatus)) return false;
     if( ! (padding == rhs.padding)) return false;
    return true;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" expendable:").append(expendable); // writeOneToString
    sb.append(" station:").append(station); // writeOneToString
    sb.append(" quantity:").append(quantity); // writeOneToString
    sb.append(" expendableStatus:").append(expendableStatus); // writeOneToString
    sb.append(" padding:").append(padding); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.expendable,
	                     this.station,
	                     this.quantity,
	                     this.expendableStatus,
	                     this.padding);
 }
} // end of class
