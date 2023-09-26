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
 * 5.12.4.12 Contains the same information as found in the Event Report PDU.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class EventReportRPdu extends SimulationManagementWithReliabilityFamilyPdu implements Serializable
{
   /** Event type uid 73 */
   protected EventReportEventType eventType = EventReportEventType.values()[0];

   /** padding */
   protected int pad1;

   /** Fixed datum record count */
   protected int numberOfFixedDatumRecords;

   /** variable datum record count */
   protected int numberOfVariableDatumRecords;

   /** Fixed datum records */
   protected List< FixedDatum > fixedDatumRecords = new ArrayList< FixedDatum >();
 
   /** Variable datum records */
   protected List< VariableDatum > variableDatumRecords = new ArrayList< VariableDatum >();
 

/** Constructor creates and configures a new instance object */
 public EventReportRPdu()
 {
    setPduType( DisPduType.EVENT_REPORT_RELIABLE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public EventReportRPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public EventReportRPdu copyByteBuffer()
 {
     EventReportRPdu newCopy = new EventReportRPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("EventReportRPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public EventReportRPdu copyDataOutputStream()
 {
     EventReportRPdu newCopy = new EventReportRPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("EventReportRPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.out.println("EventReportRPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (eventType != null)
       marshalSize += eventType.getMarshalledSize();
   marshalSize += 4;  // pad1
   marshalSize += 4;  // numberOfFixedDatumRecords
   marshalSize += 4;  // numberOfVariableDatumRecords
   if (fixedDatumRecords != null)
       for (int idx=0; idx < fixedDatumRecords.size(); idx++)
       {
            FixedDatum listElement = fixedDatumRecords.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }
   if (variableDatumRecords != null)
       for (int idx=0; idx < variableDatumRecords.size(); idx++)
       {
            VariableDatum listElement = variableDatumRecords.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link EventReportRPdu#eventType}
  * @param pEventType new value of interest
  * @return same object to permit progressive setters */
public EventReportRPdu setEventType(EventReportEventType pEventType)
{
    eventType = pEventType;
    return this;
}
/** Getter for {@link EventReportRPdu#eventType}
  * @return value of interest */
public EventReportEventType getEventType()
{
    return eventType; 
}

/** Setter for {@link EventReportRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public EventReportRPdu setPad1(int pPad1)
{
    pad1 = pPad1;
    return this;
}
/** Getter for {@link EventReportRPdu#pad1}
  * @return value of interest */
public int getPad1()
{
    return pad1; 
}

/** Setter for {@link EventReportRPdu#fixedDatumRecords}
  * @param pFixedDatumRecords new value of interest
  * @return same object to permit progressive setters */
public EventReportRPdu setFixedDatumRecords(List<FixedDatum> pFixedDatumRecords)
{
    fixedDatumRecords = pFixedDatumRecords;
    return this;
}
/** Getter for {@link EventReportRPdu#fixedDatumRecords}
  * @return value of interest */
public List<FixedDatum> getFixedDatumRecords()
{
    return fixedDatumRecords; 
}

/** Setter for {@link EventReportRPdu#variableDatumRecords}
  * @param pVariableDatumRecords new value of interest
  * @return same object to permit progressive setters */
public EventReportRPdu setVariableDatumRecords(List<VariableDatum> pVariableDatumRecords)
{
    variableDatumRecords = pVariableDatumRecords;
    return this;
}
/** Getter for {@link EventReportRPdu#variableDatumRecords}
  * @return value of interest */
public List<VariableDatum> getVariableDatumRecords()
{
    return variableDatumRecords; 
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
       eventType.marshal(dos);
       dos.writeInt(pad1);
       dos.writeInt(fixedDatumRecords.size());
       dos.writeInt(variableDatumRecords.size());

       for (int idx = 0; idx < fixedDatumRecords.size(); idx++)
       {
            FixedDatum aFixedDatum = fixedDatumRecords.get(idx);
            aFixedDatum.marshal(dos);
       }


       for (int idx = 0; idx < variableDatumRecords.size(); idx++)
       {
            VariableDatum aVariableDatum = variableDatumRecords.get(idx);
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
        eventType = EventReportEventType.unmarshalEnum(dis);
        uPosition += eventType.getMarshalledSize();
        pad1 = dis.readInt();
        uPosition += 4;
        numberOfFixedDatumRecords = dis.readInt();
        uPosition += 4;
        numberOfVariableDatumRecords = dis.readInt();
        uPosition += 4;
        for (int idx = 0; idx < numberOfFixedDatumRecords; idx++)
        {
            FixedDatum anX = new FixedDatum();
            uPosition += anX.unmarshal(dis);
            fixedDatumRecords.add(anX);
        }

        for (int idx = 0; idx < numberOfVariableDatumRecords; idx++)
        {
            VariableDatum anX = new VariableDatum();
            uPosition += anX.unmarshal(dis);
            variableDatumRecords.add(anX);
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
   eventType.marshal(byteBuffer);
   byteBuffer.putInt( (int)pad1);
   byteBuffer.putInt( (int)fixedDatumRecords.size());
   byteBuffer.putInt( (int)variableDatumRecords.size());

   for (int idx = 0; idx < fixedDatumRecords.size(); idx++)
   {
        FixedDatum aFixedDatum = fixedDatumRecords.get(idx);
        aFixedDatum.marshal(byteBuffer);
   }


   for (int idx = 0; idx < variableDatumRecords.size(); idx++)
   {
        VariableDatum aVariableDatum = variableDatumRecords.get(idx);
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
        // attribute eventType marked as not serialized
        eventType = EventReportEventType.unmarshalEnum(byteBuffer);
        // attribute pad1 marked as not serialized
        pad1 = byteBuffer.getInt();
        // attribute numberOfFixedDatumRecords marked as not serialized
        numberOfFixedDatumRecords = byteBuffer.getInt();
        // attribute numberOfVariableDatumRecords marked as not serialized
        numberOfVariableDatumRecords = byteBuffer.getInt();
        // attribute fixedDatumRecords marked as not serialized
        for (int idx = 0; idx < numberOfFixedDatumRecords; idx++)
        {
        FixedDatum anX = new FixedDatum();
        anX.unmarshal(byteBuffer);
        fixedDatumRecords.add(anX);
        }

        // attribute variableDatumRecords marked as not serialized
        for (int idx = 0; idx < numberOfVariableDatumRecords; idx++)
        {
        VariableDatum anX = new VariableDatum();
        anX.unmarshal(byteBuffer);
        variableDatumRecords.add(anX);
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

     final EventReportRPdu rhs = (EventReportRPdu)obj;

     if( ! (eventType == rhs.eventType)) ivarsEqual = false;
     if( ! (pad1 == rhs.pad1)) ivarsEqual = false;

     for (int idx = 0; idx < fixedDatumRecords.size(); idx++)
        if( ! ( fixedDatumRecords.get(idx).equals(rhs.fixedDatumRecords.get(idx)))) ivarsEqual = false;


     for (int idx = 0; idx < variableDatumRecords.size(); idx++)
        if( ! ( variableDatumRecords.get(idx).equals(rhs.variableDatumRecords.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" eventType:").append(eventType); // writeOneToString
    sb.append(" pad1:").append(pad1); // writeOneToString
    sb.append(" fixedDatumRecords: ");
    fixedDatumRecords.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset
    sb.append(" variableDatumRecords: ");
    variableDatumRecords.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.eventType,
	                     this.pad1,
	                     this.numberOfFixedDatumRecords,
	                     this.numberOfVariableDatumRecords,
	                     this.fixedDatumRecords,
	                     this.variableDatumRecords);
 }
} // end of class
