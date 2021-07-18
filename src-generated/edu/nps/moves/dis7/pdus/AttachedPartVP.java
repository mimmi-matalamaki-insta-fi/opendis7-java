/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Removable parts that may be attached to an entity.  Section 6.2.93.3
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class AttachedPartVP extends Object implements Serializable
{
   /** The identification of the Variable Parameter record. Enumeration from EBV uid 56 */
   protected VariableParameterRecordType recordType = VariableParameterRecordType.ATTACHED_PART;

   /** 0 = attached, 1 = detached. See I.2.3.1 for state transition diagram uid 415 */
   protected AttachedPartDetachedIndicator detachedIndicator = AttachedPartDetachedIndicator.values()[0];

   /** The identification of the articulated part to which this articulation parameter is attached. This field shall be specified by a 16-bit unsigned integer. This field shall contain the value zero if the articulated part is attached directly to the entity. */
   protected short  partAttachedTo = (short)0;

   /** The location or station to which the part is attached uid 57 */
   protected AttachedParts parameterType = AttachedParts.values()[0];

   /** The definition of the 64-bits shall be determined based on the type of parameter specified in the Parameter Type field  */
   protected EntityType  attachedPartType = new EntityType(); 


/** Constructor */
 public AttachedPartVP()
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

   marshalSize += recordType.getMarshalledSize();
   marshalSize += detachedIndicator.getMarshalledSize();
   marshalSize += 2;  // partAttachedTo
   marshalSize += parameterType.getMarshalledSize();
   marshalSize += attachedPartType.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link AttachedPartVP#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public AttachedPartVP setRecordType(VariableParameterRecordType pRecordType)
{
    recordType = pRecordType;
    return this;
}

/** Getter for {@link AttachedPartVP#recordType}
  * @return value of interest */
public VariableParameterRecordType getRecordType()
{
    return recordType; 
}

/** Setter for {@link AttachedPartVP#detachedIndicator}
  * @param pDetachedIndicator new value of interest
  * @return same object to permit progressive setters */
public AttachedPartVP setDetachedIndicator(AttachedPartDetachedIndicator pDetachedIndicator)
{
    detachedIndicator = pDetachedIndicator;
    return this;
}

/** Getter for {@link AttachedPartVP#detachedIndicator}
  * @return value of interest */
public AttachedPartDetachedIndicator getDetachedIndicator()
{
    return detachedIndicator; 
}

/** Setter for {@link AttachedPartVP#partAttachedTo}
  * @param pPartAttachedTo new value of interest
  * @return same object to permit progressive setters */
public AttachedPartVP setPartAttachedTo(short pPartAttachedTo)
{
    partAttachedTo = pPartAttachedTo;
    return this;
}
/** Utility setter for {@link AttachedPartVP#partAttachedTo}
  * @param pPartAttachedTo new value of interest
  * @return same object to permit progressive setters */
public AttachedPartVP setPartAttachedTo(int pPartAttachedTo){
    partAttachedTo = (short) pPartAttachedTo;
    return this;
}

/** Getter for {@link AttachedPartVP#partAttachedTo}
  * @return value of interest */
public short getPartAttachedTo()
{
    return partAttachedTo; 
}

/** Setter for {@link AttachedPartVP#parameterType}
  * @param pParameterType new value of interest
  * @return same object to permit progressive setters */
public AttachedPartVP setParameterType(AttachedParts pParameterType)
{
    parameterType = pParameterType;
    return this;
}

/** Getter for {@link AttachedPartVP#parameterType}
  * @return value of interest */
public AttachedParts getParameterType()
{
    return parameterType; 
}

/** Setter for {@link AttachedPartVP#attachedPartType}
  * @param pAttachedPartType new value of interest
  * @return same object to permit progressive setters */
public AttachedPartVP setAttachedPartType(EntityType pAttachedPartType)
{
    attachedPartType = pAttachedPartType;
    return this;
}

/** Getter for {@link AttachedPartVP#attachedPartType}
  * @return value of interest */
public EntityType getAttachedPartType()
{
    return attachedPartType; 
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
       recordType.marshal(dos);
       detachedIndicator.marshal(dos);
       dos.writeShort(partAttachedTo);
       parameterType.marshal(dos);
       attachedPartType.marshal(dos);
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
        recordType = VariableParameterRecordType.unmarshalEnum(dis);
        uPosition += recordType.getMarshalledSize();
        detachedIndicator = AttachedPartDetachedIndicator.unmarshalEnum(dis);
        uPosition += detachedIndicator.getMarshalledSize();
        partAttachedTo = (short)dis.readUnsignedShort();
        uPosition += 2;
        parameterType = AttachedParts.unmarshalEnum(dis);
        uPosition += parameterType.getMarshalledSize();
        uPosition += attachedPartType.unmarshal(dis);
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
   recordType.marshal(byteBuffer);
   detachedIndicator.marshal(byteBuffer);
   byteBuffer.putShort( (short)partAttachedTo);
   parameterType.marshal(byteBuffer);
   attachedPartType.marshal(byteBuffer);
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
    recordType = VariableParameterRecordType.unmarshalEnum(byteBuffer);
    detachedIndicator = AttachedPartDetachedIndicator.unmarshalEnum(byteBuffer);
    partAttachedTo = (short)(byteBuffer.getShort() & 0xFFFF);
    parameterType = AttachedParts.unmarshalEnum(byteBuffer);
    attachedPartType.unmarshal(byteBuffer);
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

     final AttachedPartVP rhs = (AttachedPartVP)obj;

     if( ! (recordType == rhs.recordType)) ivarsEqual = false;
     if( ! (detachedIndicator == rhs.detachedIndicator)) ivarsEqual = false;
     if( ! (partAttachedTo == rhs.partAttachedTo)) ivarsEqual = false;
     if( ! (parameterType == rhs.parameterType)) ivarsEqual = false;
     if( ! (attachedPartType.equals( rhs.attachedPartType) )) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" recordType: ").append(recordType).append("\n");
    sb.append(" detachedIndicator: ").append(detachedIndicator).append("\n");
    sb.append(" partAttachedTo: ").append(partAttachedTo).append("\n");
    sb.append(" parameterType: ").append(parameterType).append("\n");
    sb.append(" attachedPartType: ").append(attachedPartType).append("\n");

   return sb.toString();
 }
} // end of class