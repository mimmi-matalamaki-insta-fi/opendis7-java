/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */
// header autogenerated using string template dis7javalicense.txt

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Not specified in the standard. This is used by the ESPDU
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class DeadReckoningParameters extends Object implements Serializable
{
   /** Algorithm to use in computing dead reckoning. See EBV doc. uid 44 */
   protected DeadReckoningAlgorithm deadReckoningAlgorithm = DeadReckoningAlgorithm.values()[0];

   /** Dead reckoning parameters. Contents depends on algorithm. */
   protected byte[]  parameters = new byte[15]; 

   /** Linear acceleration of the entity */
   protected Vector3Float  entityLinearAcceleration = new Vector3Float(); 

   /** Angular velocity of the entity */
   protected Vector3Float  entityAngularVelocity = new Vector3Float(); 


/** Constructor creates and configures a new instance object */
 public DeadReckoningParameters()
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

   if (deadReckoningAlgorithm != null)
       marshalSize += deadReckoningAlgorithm.getMarshalledSize();
   if (parameters != null)
       marshalSize += parameters.length * 1;
   if (entityLinearAcceleration != null)
       marshalSize += entityLinearAcceleration.getMarshalledSize();
   if (entityAngularVelocity != null)
       marshalSize += entityAngularVelocity.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link DeadReckoningParameters#deadReckoningAlgorithm}
  * @param pDeadReckoningAlgorithm new value of interest
  * @return same object to permit progressive setters */
public DeadReckoningParameters setDeadReckoningAlgorithm(DeadReckoningAlgorithm pDeadReckoningAlgorithm)
{
    deadReckoningAlgorithm = pDeadReckoningAlgorithm;
    return this;
}
/** Getter for {@link DeadReckoningParameters#deadReckoningAlgorithm}
  * @return value of interest */
public DeadReckoningAlgorithm getDeadReckoningAlgorithm()
{
    return deadReckoningAlgorithm; 
}

/** Setter for {@link DeadReckoningParameters#parameters}
  * @param pParameters new value of interest
  * @return same object to permit progressive setters */
public DeadReckoningParameters setParameters(byte[] pParameters)
{
    parameters = Arrays.copyOf(pParameters, parameters.length);
    return this;
}
/** Getter for {@link DeadReckoningParameters#parameters}
  * @return value of interest */
public byte[] getParameters()
{
    return parameters; 
}

/** Setter for {@link DeadReckoningParameters#entityLinearAcceleration}
  * @param pEntityLinearAcceleration new value of interest
  * @return same object to permit progressive setters */
public DeadReckoningParameters setEntityLinearAcceleration(Vector3Float pEntityLinearAcceleration)
{
    entityLinearAcceleration = pEntityLinearAcceleration;
    return this;
}
/** Getter for {@link DeadReckoningParameters#entityLinearAcceleration}
  * @return value of interest */
public Vector3Float getEntityLinearAcceleration()
{
    return entityLinearAcceleration;
}


/** Setter for {@link DeadReckoningParameters#entityAngularVelocity}
  * @param pEntityAngularVelocity new value of interest
  * @return same object to permit progressive setters */
public DeadReckoningParameters setEntityAngularVelocity(Vector3Float pEntityAngularVelocity)
{
    entityAngularVelocity = pEntityAngularVelocity;
    return this;
}
/** Getter for {@link DeadReckoningParameters#entityAngularVelocity}
  * @return value of interest */
public Vector3Float getEntityAngularVelocity()
{
    return entityAngularVelocity;
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
       deadReckoningAlgorithm.marshal(dos);

       for (int idx = 0; idx < parameters.length; idx++)
           dos.writeByte(parameters[idx]);

       entityLinearAcceleration.marshal(dos);
       entityAngularVelocity.marshal(dos);
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
        deadReckoningAlgorithm = DeadReckoningAlgorithm.unmarshalEnum(dis);
        uPosition += deadReckoningAlgorithm.getMarshalledSize();
        for (int idx = 0; idx < parameters.length; idx++)
            parameters[idx] = dis.readByte();
        uPosition += (parameters.length * 1);
        uPosition += entityLinearAcceleration.unmarshal(dis);
        uPosition += entityAngularVelocity.unmarshal(dis);
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
   deadReckoningAlgorithm.marshal(byteBuffer);

   for (int idx = 0; idx < parameters.length; idx++)
       byteBuffer.put((byte)parameters[idx]);

   entityLinearAcceleration.marshal(byteBuffer);
   entityAngularVelocity.marshal(byteBuffer);
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
        // attribute deadReckoningAlgorithm marked as not serialized
        deadReckoningAlgorithm = DeadReckoningAlgorithm.unmarshalEnum(byteBuffer);
        // attribute parameters marked as not serialized
        for (int idx = 0; idx < parameters.length; idx++)
            parameters[idx] = byteBuffer.get();
        // attribute entityLinearAcceleration marked as not serialized
        entityLinearAcceleration.unmarshal(byteBuffer);
        // attribute entityAngularVelocity marked as not serialized
        entityAngularVelocity.unmarshal(byteBuffer);
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

     final DeadReckoningParameters rhs = (DeadReckoningParameters)obj;

     if( ! (deadReckoningAlgorithm == rhs.deadReckoningAlgorithm)) ivarsEqual = false;

     for (int idx = 0; idx < 15; idx++)
     {
          if(!(parameters[idx] == rhs.parameters[idx])) ivarsEqual = false;
     }

     if( ! (entityLinearAcceleration.equals( rhs.entityLinearAcceleration) )) ivarsEqual = false;
     if( ! (entityAngularVelocity.equals( rhs.entityAngularVelocity) )) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" deadReckoningAlgorithm:").append(deadReckoningAlgorithm); // writeOneToString
    sb.append(" parameters:");
    sb.append(Arrays.toString(parameters)); // writePrimitiveList
    sb.append(" entityLinearAcceleration:").append(entityLinearAcceleration); // writeOneToString
    sb.append(" entityAngularVelocity:").append(entityAngularVelocity); // writeOneToString

   return sb.toString();
 }
} // end of class
