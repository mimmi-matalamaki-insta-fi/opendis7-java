/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */
// header autogenerated using string template dis7javalicense.txt

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;
import java.nio.ByteBuffer;

/**
 * Section 7.5.8. When an entity receives an Action Request PDU, that entity shall acknowledge the receipt of the Action Request PDU with an Action Response PDU. See 5.6.5.8.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class ActionResponsePdu extends SimulationManagementFamilyPdu implements Serializable
{
   /** Request ID that is unique */
   protected int requestID;

   /** Status of response uid 72 */
   protected ActionResponseRequestStatus requestStatus = ActionResponseRequestStatus.values()[0];

   /** Number of fixed datum records */
   protected int numberOfFixedDatumRecords;

   /** Number of variable datum records, handled automatically by marshaller at run time (and not modifiable by end-user programmers) */
   protected int numberOfVariableDatumRecords;

   /** fixed length list of fixed datums */
   protected List< FixedDatum > fixedDatums = new ArrayList< FixedDatum >();
 
   /** variable length list of variable length datums */
   protected List< VariableDatum > variableDatums = new ArrayList< VariableDatum >();
 

/** Constructor creates and configures a new instance object */
 public ActionResponsePdu()
 {
    setPduType( DisPduType.ACTION_RESPONSE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public ActionResponsePdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public ActionResponsePdu copyByteBuffer()
 {
     ActionResponsePdu newCopy = new ActionResponsePdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("ActionResponsePdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public ActionResponsePdu copyDataOutputStream()
 {
     ActionResponsePdu newCopy = new ActionResponsePdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("ActionResponsePdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.out.println("ActionResponsePdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   marshalSize += 4;  // requestID
   if (requestStatus != null)
       marshalSize += requestStatus.getMarshalledSize();
   marshalSize += 4;  // numberOfFixedDatumRecords
   marshalSize += 4;  // numberOfVariableDatumRecords
   if (fixedDatums != null)
       for (int idx=0; idx < fixedDatums.size(); idx++)
       {
            FixedDatum listElement = fixedDatums.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }
   if (variableDatums != null)
       for (int idx=0; idx < variableDatums.size(); idx++)
       {
            VariableDatum listElement = variableDatums.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link ActionResponsePdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public ActionResponsePdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}
/** Getter for {@link ActionResponsePdu#requestID}
  * @return value of interest */
public int getRequestID()
{
    return requestID; 
}

/** Setter for {@link ActionResponsePdu#requestStatus}
  * @param pRequestStatus new value of interest
  * @return same object to permit progressive setters */
public ActionResponsePdu setRequestStatus(ActionResponseRequestStatus pRequestStatus)
{
    requestStatus = pRequestStatus;
    return this;
}
/** Getter for {@link ActionResponsePdu#requestStatus}
  * @return value of interest */
public ActionResponseRequestStatus getRequestStatus()
{
    return requestStatus; 
}

/** Setter for {@link ActionResponsePdu#fixedDatums}
  * @param pFixedDatums new value of interest
  * @return same object to permit progressive setters */
public ActionResponsePdu setFixedDatums(List<FixedDatum> pFixedDatums)
{
    fixedDatums = pFixedDatums;
    return this;
}
/** Getter for {@link ActionResponsePdu#fixedDatums}
  * @return value of interest */
public List<FixedDatum> getFixedDatums()
{
    return fixedDatums; 
}

/** Setter for {@link ActionResponsePdu#variableDatums}
  * @param pVariableDatums new value of interest
  * @return same object to permit progressive setters */
public ActionResponsePdu setVariableDatums(List<VariableDatum> pVariableDatums)
{
    variableDatums = pVariableDatums;
    return this;
}
/** Getter for {@link ActionResponsePdu#variableDatums}
  * @return value of interest */
public List<VariableDatum> getVariableDatums()
{
    return variableDatums; 
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
       dos.writeInt(requestID);
       requestStatus.marshal(dos);
       dos.writeInt(fixedDatums.size());
       dos.writeInt(variableDatums.size());

       for (int idx = 0; idx < fixedDatums.size(); idx++)
       {
            FixedDatum aFixedDatum = fixedDatums.get(idx);
            aFixedDatum.marshal(dos);
       }


       for (int idx = 0; idx < variableDatums.size(); idx++)
       {
            VariableDatum aVariableDatum = variableDatums.get(idx);
            aVariableDatum.marshal(dos);
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
        requestID = dis.readInt();
        uPosition += 4;
        requestStatus = ActionResponseRequestStatus.unmarshalEnum(dis);
        uPosition += requestStatus.getMarshalledSize();
        numberOfFixedDatumRecords = dis.readInt();
        uPosition += 4;
        numberOfVariableDatumRecords = dis.readInt();
        uPosition += 4;
        for (int idx = 0; idx < numberOfFixedDatumRecords; idx++)
        {
            FixedDatum anX = new FixedDatum();
            uPosition += anX.unmarshal(dis);
            fixedDatums.add(anX);
        }

        for (int idx = 0; idx < numberOfVariableDatumRecords; idx++)
        {
            VariableDatum anX = new VariableDatum();
            uPosition += anX.unmarshal(dis);
            variableDatums.add(anX);
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
   byteBuffer.putInt( (int)requestID);
   requestStatus.marshal(byteBuffer);
   byteBuffer.putInt( (int)fixedDatums.size());
   byteBuffer.putInt( (int)variableDatums.size());

   for (int idx = 0; idx < fixedDatums.size(); idx++)
   {
        FixedDatum aFixedDatum = fixedDatums.get(idx);
        aFixedDatum.marshal(byteBuffer);
   }


   for (int idx = 0; idx < variableDatums.size(); idx++)
   {
        VariableDatum aVariableDatum = variableDatums.get(idx);
        aVariableDatum.marshal(byteBuffer);
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
        // attribute requestID marked as not serialized
        requestID = byteBuffer.getInt();
        // attribute requestStatus marked as not serialized
        requestStatus = ActionResponseRequestStatus.unmarshalEnum(byteBuffer);
        // attribute numberOfFixedDatumRecords marked as not serialized
        numberOfFixedDatumRecords = byteBuffer.getInt();
        // attribute numberOfVariableDatumRecords marked as not serialized
        numberOfVariableDatumRecords = byteBuffer.getInt();
        // attribute fixedDatums marked as not serialized
        for (int idx = 0; idx < numberOfFixedDatumRecords; idx++)
        {
        FixedDatum anX = new FixedDatum();
        anX.unmarshal(byteBuffer);
        fixedDatums.add(anX);
        }

        // attribute variableDatums marked as not serialized
        for (int idx = 0; idx < numberOfVariableDatumRecords; idx++)
        {
        VariableDatum anX = new VariableDatum();
        anX.unmarshal(byteBuffer);
        variableDatums.add(anX);
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
     boolean ivarsEqual = true;

     final ActionResponsePdu rhs = (ActionResponsePdu)obj;

     if( ! (requestID == rhs.requestID)) ivarsEqual = false;
     if( ! (requestStatus == rhs.requestStatus)) ivarsEqual = false;

     for (int idx = 0; idx < fixedDatums.size(); idx++)
        if( ! ( fixedDatums.get(idx).equals(rhs.fixedDatums.get(idx)))) ivarsEqual = false;


     for (int idx = 0; idx < variableDatums.size(); idx++)
        if( ! ( variableDatums.get(idx).equals(rhs.variableDatums.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" requestID:").append(requestID); // writeOneToString
    sb.append(" requestStatus:").append(requestStatus); // writeOneToString
    sb.append(" fixedDatums: ");
    fixedDatums.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    sb2.delete(0,sb2.length()-1); // reset
    sb.append(" variableDatums: ");
    variableDatums.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    sb2.delete(0,sb2.length()-1); // reset

   return sb.toString();
 }
} // end of class
