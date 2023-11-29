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
 * An entity's associations with other entities and/or locations. For each association, this record shall specify the type of the association, the associated entity's EntityID and/or the associated location's world coordinates. This record may be used (optionally) in a transfer transaction to send internal state data from the divesting simulation to the acquiring simulation (see 5.9.4). This record may also be used for other purposes. Section 6.2.9
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class Association extends Object implements Serializable
{
   /** This field shall indicate the type of association. It shall be represented by an 8-bit enumeration. Values for this field are found in Section 14 of SISO-REF-010 330 */
   protected EntityAssociationAssociationType associationType = EntityAssociationAssociationType.values()[0];

   /** zero-filled array of padding bits for byte alignment and consistent sizing of PDU data */
   protected byte padding;

   /** identity of associated entity. If none, NO_SPECIFIC_ENTITY */
   protected EntityIdentifier  associatedEntityID = new EntityIdentifier(); 

   /** location, in world coordinates */
   protected Vector3Double  associatedLocation = new Vector3Double(); 


/** Constructor creates and configures a new instance object */
 public Association()
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

   if (associationType != null)
       marshalSize += associationType.getMarshalledSize();
   marshalSize += 1;  // padding
   if (associatedEntityID != null)
       marshalSize += associatedEntityID.getMarshalledSize();
   if (associatedLocation != null)
       marshalSize += associatedLocation.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link Association#associationType}
  * @param pAssociationType new value of interest
  * @return same object to permit progressive setters */
public Association setAssociationType(EntityAssociationAssociationType pAssociationType)
{
    associationType = pAssociationType;
    return this;
}
/** Getter for {@link Association#associationType}
  * @return value of interest */
public EntityAssociationAssociationType getAssociationType()
{
    return associationType; 
}

/** Setter for {@link Association#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public Association setPadding(byte pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link Association#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public Association setPadding(int pPadding){
    padding = (byte) pPadding;
    return this;
}
/** Getter for {@link Association#padding}
  * @return value of interest */
public byte getPadding()
{
    return padding; 
}

/** Setter for {@link Association#associatedEntityID}
  * @param pAssociatedEntityID new value of interest
  * @return same object to permit progressive setters */
public Association setAssociatedEntityID(EntityIdentifier pAssociatedEntityID)
{
    associatedEntityID = pAssociatedEntityID;
    return this;
}
/** Getter for {@link Association#associatedEntityID}
  * @return value of interest */
public EntityIdentifier getAssociatedEntityID()
{
    return associatedEntityID;
}


/** Setter for {@link Association#associatedLocation}
  * @param pAssociatedLocation new value of interest
  * @return same object to permit progressive setters */
public Association setAssociatedLocation(Vector3Double pAssociatedLocation)
{
    associatedLocation = pAssociatedLocation;
    return this;
}
/** Getter for {@link Association#associatedLocation}
  * @return value of interest */
public Vector3Double getAssociatedLocation()
{
    return associatedLocation;
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
       associationType.marshal(dos);
       dos.writeByte(padding);
       associatedEntityID.marshal(dos);
       associatedLocation.marshal(dos);
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
        associationType = EntityAssociationAssociationType.unmarshalEnum(dis);
        uPosition += associationType.getMarshalledSize();
        padding = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += associatedEntityID.unmarshal(dis);
        uPosition += associatedLocation.unmarshal(dis);
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
   associationType.marshal(byteBuffer);
   byteBuffer.put( (byte)padding);
   associatedEntityID.marshal(byteBuffer);
   associatedLocation.marshal(byteBuffer);
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
        // attribute associationType marked as not serialized
        associationType = EntityAssociationAssociationType.unmarshalEnum(byteBuffer);
        // attribute padding marked as not serialized
        padding = (byte)(byteBuffer.get() & 0xFF);
        // attribute associatedEntityID marked as not serialized
        associatedEntityID.unmarshal(byteBuffer);
        // attribute associatedLocation marked as not serialized
        associatedLocation.unmarshal(byteBuffer);
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
     final Association rhs = (Association)obj;

     if( ! (associationType == rhs.associationType)) return false;
     if( ! (padding == rhs.padding)) return false;
     if( ! Objects.equals(associatedEntityID, rhs.associatedEntityID) ) return false;
     if( ! Objects.equals(associatedLocation, rhs.associatedLocation) ) return false;
    return true;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" associationType:").append(associationType); // writeOneToString
    sb.append(" padding:").append(padding); // writeOneToString
    sb.append(" associatedEntityID:").append(associatedEntityID); // writeOneToString
    sb.append(" associatedLocation:").append(associatedLocation); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.associationType,
	                     this.padding,
	                     this.associatedEntityID,
	                     this.associatedLocation);
 }
} // end of class
