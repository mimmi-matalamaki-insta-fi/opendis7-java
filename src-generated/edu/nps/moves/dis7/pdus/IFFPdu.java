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
import java.nio.ByteBuffer;

/**
 * 7.6.5.1 Information about military and civilian interrogators, transponders, and specific other electronic systems. See 5.7.6
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class IFFPdu extends DistributedEmissionsRegenerationFamilyPdu implements Serializable
{
   /** ID of the entity that is the source of the emissions */
   protected EntityID  emittingEntityId = new EntityID(); 

   /** Number generated by the issuing simulation to associate realted events. */
   protected EventIdentifier  eventID = new EventIdentifier(); 

   /** Location wrt entity. There is some ambiguity in the standard here, but this is the order it is listed in the table. */
   protected Vector3Float  location = new Vector3Float(); 

   /** System ID information */
   protected SystemIdentifier  systemID = new SystemIdentifier(); 

   /** systemDesignator is an undescribed parameter... */
   protected byte systemDesignator;

   /** systemSpecificData is an undescribed parameter... */
   protected byte systemSpecificData;

   /** fundamental parameters */
   protected FundamentalOperationalData  fundamentalParameters = new FundamentalOperationalData(); 


/** Constructor creates and configures a new instance object */
 public IFFPdu()
 {
    setPduType( DisPduType.IDENTIFICATION_FRIEND_OR_FOE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public IFFPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public IFFPdu copyByteBuffer()
 {
     IFFPdu newCopy = new IFFPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("IFFPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
         e.printStackTrace();
         System.exit(-1);
     }
     return newCopy;
 }

/** byteArrayOutputStream (baos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/** dataOutputStream (dos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected DataOutputStream      dataOutputStream      = new DataOutputStream(byteArrayOutputStream);

/** copy method creates a deep copy of current object using DataOutputStream methods.
 * @return deep copy of PDU */
 public IFFPdu copyDataOutputStream()
 {
     IFFPdu newCopy = new IFFPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("IFFPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
         e.printStackTrace();
         System.exit(-1);
     }
        try
        {
                 dataOutputStream.flush();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.reset();
        }
        catch (IOException ioe)
        {
            System.out.println("IFFPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
        }
     return newCopy;
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   if (emittingEntityId != null)
       marshalSize += emittingEntityId.getMarshalledSize();
   if (eventID != null)
       marshalSize += eventID.getMarshalledSize();
   if (location != null)
       marshalSize += location.getMarshalledSize();
   if (systemID != null)
       marshalSize += systemID.getMarshalledSize();
   marshalSize += 1;  // systemDesignator
   marshalSize += 1;  // systemSpecificData
   if (fundamentalParameters != null)
       marshalSize += fundamentalParameters.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link IFFPdu#emittingEntityId}
  * @param pEmittingEntityId new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setEmittingEntityId(EntityID pEmittingEntityId)
{
    emittingEntityId = pEmittingEntityId;
    return this;
}
/** Getter for {@link IFFPdu#emittingEntityId}
  * @return value of interest */
public EntityID getEmittingEntityId()
{
    return emittingEntityId;
}


/** Setter for {@link IFFPdu#eventID}
  * @param pEventID new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setEventID(EventIdentifier pEventID)
{
    eventID = pEventID;
    return this;
}
/** Getter for {@link IFFPdu#eventID}
  * @return value of interest */
public EventIdentifier getEventID()
{
    return eventID;
}


/** Setter for {@link IFFPdu#location}
  * @param pLocation new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setLocation(Vector3Float pLocation)
{
    location = pLocation;
    return this;
}
/** Getter for {@link IFFPdu#location}
  * @return value of interest */
public Vector3Float getLocation()
{
    return location;
}


/** Setter for {@link IFFPdu#systemID}
  * @param pSystemID new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setSystemID(SystemIdentifier pSystemID)
{
    systemID = pSystemID;
    return this;
}
/** Getter for {@link IFFPdu#systemID}
  * @return value of interest */
public SystemIdentifier getSystemID()
{
    return systemID;
}


/** Setter for {@link IFFPdu#systemDesignator}
  * @param pSystemDesignator new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setSystemDesignator(byte pSystemDesignator)
{
    systemDesignator = pSystemDesignator;
    return this;
}
/** Utility setter for {@link IFFPdu#systemDesignator}
  * @param pSystemDesignator new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setSystemDesignator(int pSystemDesignator){
    systemDesignator = (byte) pSystemDesignator;
    return this;
}
/** Getter for {@link IFFPdu#systemDesignator}
  * @return value of interest */
public byte getSystemDesignator()
{
    return systemDesignator; 
}

/** Setter for {@link IFFPdu#systemSpecificData}
  * @param pSystemSpecificData new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setSystemSpecificData(byte pSystemSpecificData)
{
    systemSpecificData = pSystemSpecificData;
    return this;
}
/** Utility setter for {@link IFFPdu#systemSpecificData}
  * @param pSystemSpecificData new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setSystemSpecificData(int pSystemSpecificData){
    systemSpecificData = (byte) pSystemSpecificData;
    return this;
}
/** Getter for {@link IFFPdu#systemSpecificData}
  * @return value of interest */
public byte getSystemSpecificData()
{
    return systemSpecificData; 
}

/** Setter for {@link IFFPdu#fundamentalParameters}
  * @param pFundamentalParameters new value of interest
  * @return same object to permit progressive setters */
public IFFPdu setFundamentalParameters(FundamentalOperationalData pFundamentalParameters)
{
    fundamentalParameters = pFundamentalParameters;
    return this;
}
/** Getter for {@link IFFPdu#fundamentalParameters}
  * @return value of interest */
public FundamentalOperationalData getFundamentalParameters()
{
    return fundamentalParameters;
}


/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       emittingEntityId.marshal(dos);
       eventID.marshal(dos);
       location.marshal(dos);
       systemID.marshal(dos);
       dos.writeByte(systemDesignator);
       dos.writeByte(systemSpecificData);
       fundamentalParameters.marshal(dos);
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
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += emittingEntityId.unmarshal(dis);
        uPosition += eventID.unmarshal(dis);
        uPosition += location.unmarshal(dis);
        uPosition += systemID.unmarshal(dis);
        systemDesignator = (byte)dis.readUnsignedByte();
        uPosition += 1;
        systemSpecificData = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += fundamentalParameters.unmarshal(dis);
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
   super.marshal(byteBuffer);
   emittingEntityId.marshal(byteBuffer);
   eventID.marshal(byteBuffer);
   location.marshal(byteBuffer);
   systemID.marshal(byteBuffer);
   byteBuffer.put( (byte)systemDesignator);
   byteBuffer.put( (byte)systemSpecificData);
   fundamentalParameters.marshal(byteBuffer);
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
    super.unmarshal(byteBuffer);

    try
    {
        // attribute emittingEntityId marked as not serialized
        emittingEntityId.unmarshal(byteBuffer);
        // attribute eventID marked as not serialized
        eventID.unmarshal(byteBuffer);
        // attribute location marked as not serialized
        location.unmarshal(byteBuffer);
        // attribute systemID marked as not serialized
        systemID.unmarshal(byteBuffer);
        // attribute systemDesignator marked as not serialized
        systemDesignator = (byte)(byteBuffer.get() & 0xFF);
        // attribute systemSpecificData marked as not serialized
        systemSpecificData = (byte)(byteBuffer.get() & 0xFF);
        // attribute fundamentalParameters marked as not serialized
        fundamentalParameters.unmarshal(byteBuffer);
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

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final IFFPdu rhs = (IFFPdu)obj;

     if( ! (emittingEntityId.equals( rhs.emittingEntityId) )) ivarsEqual = false;
     if( ! (eventID.equals( rhs.eventID) )) ivarsEqual = false;
     if( ! (location.equals( rhs.location) )) ivarsEqual = false;
     if( ! (systemID.equals( rhs.systemID) )) ivarsEqual = false;
     if( ! (systemDesignator == rhs.systemDesignator)) ivarsEqual = false;
     if( ! (systemSpecificData == rhs.systemSpecificData)) ivarsEqual = false;
     if( ! (fundamentalParameters.equals( rhs.fundamentalParameters) )) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" emittingEntityId:").append(emittingEntityId); // writeOneToString
    sb.append(" eventID:").append(eventID); // writeOneToString
    sb.append(" location:").append(location); // writeOneToString
    sb.append(" systemID:").append(systemID); // writeOneToString
    sb.append(" systemDesignator:").append(systemDesignator); // writeOneToString
    sb.append(" systemSpecificData:").append(systemSpecificData); // writeOneToString
    sb.append(" fundamentalParameters:").append(fundamentalParameters); // writeOneToString

   return sb.toString();
 }
} // end of class
