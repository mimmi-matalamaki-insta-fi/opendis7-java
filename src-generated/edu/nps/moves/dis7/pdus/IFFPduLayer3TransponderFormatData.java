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
 * 7.6.5.4.3 Layer 3 Mode 5 transponder format
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class IFFPduLayer3TransponderFormatData extends AbstractIFFPduLayerData implements Serializable
{
   /** Layer header */
   protected LayerHeader  layerHeader = new LayerHeader(); 

   /** 6.2.80 Site number, part of reporting simulation field */
   protected short siteNumber;

   /** 6.2.80 Application number, part of reporting simulation field */
   protected short applicationNumber;

   /** Mode 5 transponder basic data */
   protected Mode5TransponderBasicData  mode5TransponderBasicData = new Mode5TransponderBasicData(); 

   /** Padding */
   protected short padding;

   /** numberOfIFFFundamentalParameterDataRecordsParameters is an undescribed parameter... */
   protected short numberOfIFFFundamentalParameterDataRecordsParameters;

   /** Variable length list of fundamental parameters. */
   protected List< IFFDataSpecification > IFFFundamentalParameterDataRecord = new ArrayList< IFFDataSpecification >();
 

/** Constructor creates and configures a new instance object */
 public IFFPduLayer3TransponderFormatData()
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

   marshalSize = super.getMarshalledSize();
   if (layerHeader != null)
       marshalSize += layerHeader.getMarshalledSize();
   marshalSize += 2;  // siteNumber
   marshalSize += 2;  // applicationNumber
   if (mode5TransponderBasicData != null)
       marshalSize += mode5TransponderBasicData.getMarshalledSize();
   marshalSize += 2;  // padding
   marshalSize += 2;  // numberOfIFFFundamentalParameterDataRecordsParameters
   if (IFFFundamentalParameterDataRecord != null)
       for (int idx=0; idx < IFFFundamentalParameterDataRecord.size(); idx++)
       {
            IFFDataSpecification listElement = IFFFundamentalParameterDataRecord.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link IFFPduLayer3TransponderFormatData#layerHeader}
  * @param pLayerHeader new value of interest
  * @return same object to permit progressive setters */
public IFFPduLayer3TransponderFormatData setLayerHeader(LayerHeader pLayerHeader)
{
    layerHeader = pLayerHeader;
    return this;
}
/** Getter for {@link IFFPduLayer3TransponderFormatData#layerHeader}
  * @return value of interest */
public LayerHeader getLayerHeader()
{
    return layerHeader;
}


/** Setter for {@link IFFPduLayer3TransponderFormatData#siteNumber}
  * @param pSiteNumber new value of interest
  * @return same object to permit progressive setters */
public IFFPduLayer3TransponderFormatData setSiteNumber(short pSiteNumber)
{
    siteNumber = pSiteNumber;
    return this;
}
/** Utility setter for {@link IFFPduLayer3TransponderFormatData#siteNumber}
  * @param pSiteNumber new value of interest
  * @return same object to permit progressive setters */
public IFFPduLayer3TransponderFormatData setSiteNumber(int pSiteNumber){
    siteNumber = (short) pSiteNumber;
    return this;
}
/** Getter for {@link IFFPduLayer3TransponderFormatData#siteNumber}
  * @return value of interest */
public short getSiteNumber()
{
    return siteNumber; 
}

/** Setter for {@link IFFPduLayer3TransponderFormatData#applicationNumber}
  * @param pApplicationNumber new value of interest
  * @return same object to permit progressive setters */
public IFFPduLayer3TransponderFormatData setApplicationNumber(short pApplicationNumber)
{
    applicationNumber = pApplicationNumber;
    return this;
}
/** Utility setter for {@link IFFPduLayer3TransponderFormatData#applicationNumber}
  * @param pApplicationNumber new value of interest
  * @return same object to permit progressive setters */
public IFFPduLayer3TransponderFormatData setApplicationNumber(int pApplicationNumber){
    applicationNumber = (short) pApplicationNumber;
    return this;
}
/** Getter for {@link IFFPduLayer3TransponderFormatData#applicationNumber}
  * @return value of interest */
public short getApplicationNumber()
{
    return applicationNumber; 
}

/** Setter for {@link IFFPduLayer3TransponderFormatData#mode5TransponderBasicData}
  * @param pMode5TransponderBasicData new value of interest
  * @return same object to permit progressive setters */
public IFFPduLayer3TransponderFormatData setMode5TransponderBasicData(Mode5TransponderBasicData pMode5TransponderBasicData)
{
    mode5TransponderBasicData = pMode5TransponderBasicData;
    return this;
}
/** Getter for {@link IFFPduLayer3TransponderFormatData#mode5TransponderBasicData}
  * @return value of interest */
public Mode5TransponderBasicData getMode5TransponderBasicData()
{
    return mode5TransponderBasicData;
}


/** Setter for {@link IFFPduLayer3TransponderFormatData#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public IFFPduLayer3TransponderFormatData setPadding(short pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link IFFPduLayer3TransponderFormatData#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public IFFPduLayer3TransponderFormatData setPadding(int pPadding){
    padding = (short) pPadding;
    return this;
}
/** Getter for {@link IFFPduLayer3TransponderFormatData#padding}
  * @return value of interest */
public short getPadding()
{
    return padding; 
}

/** Utility method to get size of field
 * @return size of field */
public short getNumberOfIFFFundamentalParameterDataRecordsParameters()
{
    return (short)IFFFundamentalParameterDataRecord.size(); 
}

/** Note that setting this value will not change the marshalled value. The list whose length this describes is used for that purpose.
 * The getnumberOfIFFFundamentalParameterDataRecordsParameters method will also be based on the actual list length rather than this value. 
 * The method is simply here for java bean completeness.
 * @param pNumberOfIFFFundamentalParameterDataRecordsParameters passed parameter
 * @return this object
 */
public IFFPduLayer3TransponderFormatData setNumberOfIFFFundamentalParameterDataRecordsParameters(short pNumberOfIFFFundamentalParameterDataRecordsParameters)
{
    numberOfIFFFundamentalParameterDataRecordsParameters = pNumberOfIFFFundamentalParameterDataRecordsParameters;
    return this;
}

/** Setter for {@link IFFPduLayer3TransponderFormatData#IFFFundamentalParameterDataRecord}
  * @param pIFFFundamentalParameterDataRecord new value of interest
  * @return same object to permit progressive setters */
public IFFPduLayer3TransponderFormatData setIFFFundamentalParameterDataRecord(List<IFFDataSpecification> pIFFFundamentalParameterDataRecord)
{
    IFFFundamentalParameterDataRecord = pIFFFundamentalParameterDataRecord;
    return this;
}
/** Getter for {@link IFFPduLayer3TransponderFormatData#IFFFundamentalParameterDataRecord}
  * @return value of interest */
public List<IFFDataSpecification> getIFFFundamentalParameterDataRecord()
{
    return IFFFundamentalParameterDataRecord; 
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
       layerHeader.marshal(dos);
       dos.writeShort(siteNumber);
       dos.writeShort(applicationNumber);
       mode5TransponderBasicData.marshal(dos);
       dos.writeShort(padding);
       dos.writeShort(IFFFundamentalParameterDataRecord.size());

       for (int idx = 0; idx < IFFFundamentalParameterDataRecord.size(); idx++)
       {
            IFFDataSpecification aIFFDataSpecification = IFFFundamentalParameterDataRecord.get(idx);
            aIFFDataSpecification.marshal(dos);
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
        uPosition += layerHeader.unmarshal(dis);
        siteNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
        applicationNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += mode5TransponderBasicData.unmarshal(dis);
        padding = (short)dis.readUnsignedShort();
        uPosition += 2;
        numberOfIFFFundamentalParameterDataRecordsParameters = (short)dis.readUnsignedShort();
        uPosition += 2;
        for (int idx = 0; idx < numberOfIFFFundamentalParameterDataRecordsParameters; idx++)
        {
            IFFDataSpecification anX = new IFFDataSpecification();
            uPosition += anX.unmarshal(dis);
            IFFFundamentalParameterDataRecord.add(anX);
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
   layerHeader.marshal(byteBuffer);
   byteBuffer.putShort( (short)siteNumber);
   byteBuffer.putShort( (short)applicationNumber);
   mode5TransponderBasicData.marshal(byteBuffer);
   byteBuffer.putShort( (short)padding);
   byteBuffer.putShort( (short)IFFFundamentalParameterDataRecord.size());

   for (int idx = 0; idx < IFFFundamentalParameterDataRecord.size(); idx++)
   {
        IFFDataSpecification aIFFDataSpecification = IFFFundamentalParameterDataRecord.get(idx);
        aIFFDataSpecification.marshal(byteBuffer);
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
        // attribute layerHeader marked as not serialized
        layerHeader.unmarshal(byteBuffer);
        // attribute siteNumber marked as not serialized
        siteNumber = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute applicationNumber marked as not serialized
        applicationNumber = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute mode5TransponderBasicData marked as not serialized
        mode5TransponderBasicData.unmarshal(byteBuffer);
        // attribute padding marked as not serialized
        padding = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute numberOfIFFFundamentalParameterDataRecordsParameters marked as not serialized
        numberOfIFFFundamentalParameterDataRecordsParameters = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute IFFFundamentalParameterDataRecord marked as not serialized
        for (int idx = 0; idx < numberOfIFFFundamentalParameterDataRecordsParameters; idx++)
        {
        IFFDataSpecification anX = new IFFDataSpecification();
        anX.unmarshal(byteBuffer);
        IFFFundamentalParameterDataRecord.add(anX);
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

     final IFFPduLayer3TransponderFormatData rhs = (IFFPduLayer3TransponderFormatData)obj;

     if( ! (layerHeader.equals( rhs.layerHeader) )) ivarsEqual = false;
     if( ! (siteNumber == rhs.siteNumber)) ivarsEqual = false;
     if( ! (applicationNumber == rhs.applicationNumber)) ivarsEqual = false;
     if( ! (mode5TransponderBasicData.equals( rhs.mode5TransponderBasicData) )) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
     if( ! (numberOfIFFFundamentalParameterDataRecordsParameters == rhs.numberOfIFFFundamentalParameterDataRecordsParameters)) ivarsEqual = false;

     for (int idx = 0; idx < IFFFundamentalParameterDataRecord.size(); idx++)
        if( ! ( IFFFundamentalParameterDataRecord.get(idx).equals(rhs.IFFFundamentalParameterDataRecord.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" layerHeader:").append(layerHeader); // writeOneToString
    sb.append(" siteNumber:").append(siteNumber); // writeOneToString
    sb.append(" applicationNumber:").append(applicationNumber); // writeOneToString
    sb.append(" mode5TransponderBasicData:").append(mode5TransponderBasicData); // writeOneToString
    sb.append(" padding:").append(padding); // writeOneToString
    sb.append(" numberOfIFFFundamentalParameterDataRecordsParameters:").append(numberOfIFFFundamentalParameterDataRecordsParameters); // writeOneToString
    sb.append(" IFFFundamentalParameterDataRecord: ");
    IFFFundamentalParameterDataRecord.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.layerHeader,
	                     this.siteNumber,
	                     this.applicationNumber,
	                     this.mode5TransponderBasicData,
	                     this.padding,
	                     this.numberOfIFFFundamentalParameterDataRecordsParameters,
	                     this.IFFFundamentalParameterDataRecord);
 }
} // end of class
