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
 * 5.5.5 Communicate information associated with one entity requesting a service from another.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class ServiceRequestPdu extends LogisticsFamilyPdu implements Serializable
{
   /** Entity that is requesting service (see 6.2.28), Section 7.4.2 */
   protected EntityID  requestingEntityID = new EntityID(); 

   /** Entity that is providing the service (see 6.2.28), Section 7.4.2 */
   protected EntityID  servicingEntityID = new EntityID(); 

   /** Type of service requested, Section 7.4.2 uid 63 */
   protected ServiceRequestServiceTypeRequested serviceTypeRequested = ServiceRequestServiceTypeRequested.values()[0];

   /** How many requested, Section 7.4.2 */
   protected byte numberOfSupplyTypes;

   /** padding1 is an undescribed parameter... */
   protected short padding1 = (short)0;

   /** supplies is an undescribed parameter... */
   protected List< SupplyQuantity > supplies = new ArrayList< SupplyQuantity >();
 

/** Constructor creates and configures a new instance object */
 public ServiceRequestPdu()
 {
    setPduType( DisPduType.SERVICE_REQUEST );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public ServiceRequestPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public ServiceRequestPdu copyByteBuffer()
 {
     ServiceRequestPdu newCopy = new ServiceRequestPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("ServiceRequestPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public ServiceRequestPdu copyDataOutputStream()
 {
     ServiceRequestPdu newCopy = new ServiceRequestPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("ServiceRequestPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.out.println("ServiceRequestPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (requestingEntityID != null)
       marshalSize += requestingEntityID.getMarshalledSize();
   if (servicingEntityID != null)
       marshalSize += servicingEntityID.getMarshalledSize();
   if (serviceTypeRequested != null)
       marshalSize += serviceTypeRequested.getMarshalledSize();
   marshalSize += 1;  // numberOfSupplyTypes
   marshalSize += 2;  // padding1
   if (supplies != null)
       for (int idx=0; idx < supplies.size(); idx++)
       {
            SupplyQuantity listElement = supplies.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link ServiceRequestPdu#requestingEntityID}
  * @param pRequestingEntityID new value of interest
  * @return same object to permit progressive setters */
public ServiceRequestPdu setRequestingEntityID(EntityID pRequestingEntityID)
{
    requestingEntityID = pRequestingEntityID;
    return this;
}
/** Getter for {@link ServiceRequestPdu#requestingEntityID}
  * @return value of interest */
public EntityID getRequestingEntityID()
{
    return requestingEntityID;
}


/** Setter for {@link ServiceRequestPdu#servicingEntityID}
  * @param pServicingEntityID new value of interest
  * @return same object to permit progressive setters */
public ServiceRequestPdu setServicingEntityID(EntityID pServicingEntityID)
{
    servicingEntityID = pServicingEntityID;
    return this;
}
/** Getter for {@link ServiceRequestPdu#servicingEntityID}
  * @return value of interest */
public EntityID getServicingEntityID()
{
    return servicingEntityID;
}


/** Setter for {@link ServiceRequestPdu#serviceTypeRequested}
  * @param pServiceTypeRequested new value of interest
  * @return same object to permit progressive setters */
public ServiceRequestPdu setServiceTypeRequested(ServiceRequestServiceTypeRequested pServiceTypeRequested)
{
    serviceTypeRequested = pServiceTypeRequested;
    return this;
}
/** Getter for {@link ServiceRequestPdu#serviceTypeRequested}
  * @return value of interest */
public ServiceRequestServiceTypeRequested getServiceTypeRequested()
{
    return serviceTypeRequested; 
}

/** Setter for {@link ServiceRequestPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public ServiceRequestPdu setPadding1(short pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Utility setter for {@link ServiceRequestPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public ServiceRequestPdu setPadding1(int pPadding1){
    padding1 = (short) pPadding1;
    return this;
}
/** Getter for {@link ServiceRequestPdu#padding1}
  * @return value of interest */
public short getPadding1()
{
    return padding1; 
}

/** Setter for {@link ServiceRequestPdu#supplies}
  * @param pSupplies new value of interest
  * @return same object to permit progressive setters */
public ServiceRequestPdu setSupplies(List<SupplyQuantity> pSupplies)
{
    supplies = pSupplies;
    return this;
}
/** Getter for {@link ServiceRequestPdu#supplies}
  * @return value of interest */
public List<SupplyQuantity> getSupplies()
{
    return supplies; 
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
       requestingEntityID.marshal(dos);
       servicingEntityID.marshal(dos);
       serviceTypeRequested.marshal(dos);
       dos.writeByte(supplies.size());
       dos.writeShort(padding1);

       for (int idx = 0; idx < supplies.size(); idx++)
       {
            SupplyQuantity aSupplyQuantity = supplies.get(idx);
            aSupplyQuantity.marshal(dos);
       }

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
        uPosition += requestingEntityID.unmarshal(dis);
        uPosition += servicingEntityID.unmarshal(dis);
        serviceTypeRequested = ServiceRequestServiceTypeRequested.unmarshalEnum(dis);
        uPosition += serviceTypeRequested.getMarshalledSize();
        numberOfSupplyTypes = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding1 = (short)dis.readUnsignedShort();
        uPosition += 2;
        for (int idx = 0; idx < numberOfSupplyTypes; idx++)
        {
            SupplyQuantity anX = new SupplyQuantity();
            uPosition += anX.unmarshal(dis);
            supplies.add(anX);
        }

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
   requestingEntityID.marshal(byteBuffer);
   servicingEntityID.marshal(byteBuffer);
   serviceTypeRequested.marshal(byteBuffer);
   byteBuffer.put( (byte)supplies.size());
   byteBuffer.putShort( (short)padding1);

   for (int idx = 0; idx < supplies.size(); idx++)
   {
        SupplyQuantity aSupplyQuantity = supplies.get(idx);
        aSupplyQuantity.marshal(byteBuffer);
   }

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
        // attribute requestingEntityID marked as not serialized
        requestingEntityID.unmarshal(byteBuffer);
        // attribute servicingEntityID marked as not serialized
        servicingEntityID.unmarshal(byteBuffer);
        // attribute serviceTypeRequested marked as not serialized
        serviceTypeRequested = ServiceRequestServiceTypeRequested.unmarshalEnum(byteBuffer);
        // attribute numberOfSupplyTypes marked as not serialized
        numberOfSupplyTypes = (byte)(byteBuffer.get() & 0xFF);
        // attribute padding1 marked as not serialized
        padding1 = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute supplies marked as not serialized
        for (int idx = 0; idx < numberOfSupplyTypes; idx++)
        {
        SupplyQuantity anX = new SupplyQuantity();
        anX.unmarshal(byteBuffer);
        supplies.add(anX);
        }

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
     final ServiceRequestPdu rhs = (ServiceRequestPdu)obj;

     if( ! Objects.equals(requestingEntityID, rhs.requestingEntityID) ) return false;
     if( ! Objects.equals(servicingEntityID, rhs.servicingEntityID) ) return false;
     if( ! (serviceTypeRequested == rhs.serviceTypeRequested)) return false;
     if( ! (padding1 == rhs.padding1)) return false;
     if( ! Objects.equals(supplies, rhs.supplies) ) return false;
    return super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" requestingEntityID:").append(requestingEntityID); // writeOneToString
    sb.append(" servicingEntityID:").append(servicingEntityID); // writeOneToString
    sb.append(" serviceTypeRequested:").append(serviceTypeRequested); // writeOneToString
    sb.append(" padding1:").append(padding1); // writeOneToString
    sb.append(" supplies: ");
    supplies.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.requestingEntityID,
	                     this.servicingEntityID,
	                     this.serviceTypeRequested,
	                     this.numberOfSupplyTypes,
	                     this.padding1,
	                     this.supplies);
 }
} // end of class
