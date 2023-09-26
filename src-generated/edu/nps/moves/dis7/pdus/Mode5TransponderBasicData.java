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
 * B.2.29. Mode 5 transponder basic data
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class Mode5TransponderBasicData extends Object implements Serializable
{
   /** Mode 5 status, part of Mode 5 transponder basic data fields */
   protected short mode5Status;

   /** Personal Identification Number (PIN), part of Mode 5 transponder basic data fields */
   protected short personalIdentificationNumber;

   /** Mode 5 Message Formats Present, part of Mode 5 transponder basic data fields */
   protected int mode5MessageFormatsPresent;

   /** Enhanced Mode 1, part of Mode 5 transponder basic data fields */
   protected short enhancedMode1;

   /** National Origin, part of Mode 5 transponder basic data fields */
   protected short nationalOrigin;

   /** Supplemental Data, part of Mode 5 transponder basic data fields */
   protected byte supplementalData;

   /** Navigation Source, part of Mode 5 transponder basic data fields UID 359 */
   protected NavigationSource navigationSource = NavigationSource.values()[0];

   /** Figure of merit, part of Mode 5 transponder basic data fields */
   protected byte figureOfMerit;

   /** Padding, part of Mode 5 transponder basic data fields */
   protected byte padding;


/** Constructor creates and configures a new instance object */
 public Mode5TransponderBasicData()
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

   marshalSize += 2;  // mode5Status
   marshalSize += 2;  // personalIdentificationNumber
   marshalSize += 4;  // mode5MessageFormatsPresent
   marshalSize += 2;  // enhancedMode1
   marshalSize += 2;  // nationalOrigin
   marshalSize += 1;  // supplementalData
   if (navigationSource != null)
       marshalSize += navigationSource.getMarshalledSize();
   marshalSize += 1;  // figureOfMerit
   marshalSize += 1;  // padding

   return marshalSize;
}


/** Setter for {@link Mode5TransponderBasicData#mode5Status}
  * @param pMode5Status new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setMode5Status(short pMode5Status)
{
    mode5Status = pMode5Status;
    return this;
}
/** Utility setter for {@link Mode5TransponderBasicData#mode5Status}
  * @param pMode5Status new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setMode5Status(int pMode5Status){
    mode5Status = (short) pMode5Status;
    return this;
}
/** Getter for {@link Mode5TransponderBasicData#mode5Status}
  * @return value of interest */
public short getMode5Status()
{
    return mode5Status; 
}

/** Setter for {@link Mode5TransponderBasicData#personalIdentificationNumber}
  * @param pPersonalIdentificationNumber new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setPersonalIdentificationNumber(short pPersonalIdentificationNumber)
{
    personalIdentificationNumber = pPersonalIdentificationNumber;
    return this;
}
/** Utility setter for {@link Mode5TransponderBasicData#personalIdentificationNumber}
  * @param pPersonalIdentificationNumber new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setPersonalIdentificationNumber(int pPersonalIdentificationNumber){
    personalIdentificationNumber = (short) pPersonalIdentificationNumber;
    return this;
}
/** Getter for {@link Mode5TransponderBasicData#personalIdentificationNumber}
  * @return value of interest */
public short getPersonalIdentificationNumber()
{
    return personalIdentificationNumber; 
}

/** Setter for {@link Mode5TransponderBasicData#mode5MessageFormatsPresent}
  * @param pMode5MessageFormatsPresent new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setMode5MessageFormatsPresent(int pMode5MessageFormatsPresent)
{
    mode5MessageFormatsPresent = pMode5MessageFormatsPresent;
    return this;
}
/** Getter for {@link Mode5TransponderBasicData#mode5MessageFormatsPresent}
  * @return value of interest */
public int getMode5MessageFormatsPresent()
{
    return mode5MessageFormatsPresent; 
}

/** Setter for {@link Mode5TransponderBasicData#enhancedMode1}
  * @param pEnhancedMode1 new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setEnhancedMode1(short pEnhancedMode1)
{
    enhancedMode1 = pEnhancedMode1;
    return this;
}
/** Utility setter for {@link Mode5TransponderBasicData#enhancedMode1}
  * @param pEnhancedMode1 new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setEnhancedMode1(int pEnhancedMode1){
    enhancedMode1 = (short) pEnhancedMode1;
    return this;
}
/** Getter for {@link Mode5TransponderBasicData#enhancedMode1}
  * @return value of interest */
public short getEnhancedMode1()
{
    return enhancedMode1; 
}

/** Setter for {@link Mode5TransponderBasicData#nationalOrigin}
  * @param pNationalOrigin new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setNationalOrigin(short pNationalOrigin)
{
    nationalOrigin = pNationalOrigin;
    return this;
}
/** Utility setter for {@link Mode5TransponderBasicData#nationalOrigin}
  * @param pNationalOrigin new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setNationalOrigin(int pNationalOrigin){
    nationalOrigin = (short) pNationalOrigin;
    return this;
}
/** Getter for {@link Mode5TransponderBasicData#nationalOrigin}
  * @return value of interest */
public short getNationalOrigin()
{
    return nationalOrigin; 
}

/** Setter for {@link Mode5TransponderBasicData#supplementalData}
  * @param pSupplementalData new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setSupplementalData(byte pSupplementalData)
{
    supplementalData = pSupplementalData;
    return this;
}
/** Utility setter for {@link Mode5TransponderBasicData#supplementalData}
  * @param pSupplementalData new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setSupplementalData(int pSupplementalData){
    supplementalData = (byte) pSupplementalData;
    return this;
}
/** Getter for {@link Mode5TransponderBasicData#supplementalData}
  * @return value of interest */
public byte getSupplementalData()
{
    return supplementalData; 
}

/** Setter for {@link Mode5TransponderBasicData#navigationSource}
  * @param pNavigationSource new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setNavigationSource(NavigationSource pNavigationSource)
{
    navigationSource = pNavigationSource;
    return this;
}
/** Getter for {@link Mode5TransponderBasicData#navigationSource}
  * @return value of interest */
public NavigationSource getNavigationSource()
{
    return navigationSource; 
}

/** Setter for {@link Mode5TransponderBasicData#figureOfMerit}
  * @param pFigureOfMerit new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setFigureOfMerit(byte pFigureOfMerit)
{
    figureOfMerit = pFigureOfMerit;
    return this;
}
/** Utility setter for {@link Mode5TransponderBasicData#figureOfMerit}
  * @param pFigureOfMerit new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setFigureOfMerit(int pFigureOfMerit){
    figureOfMerit = (byte) pFigureOfMerit;
    return this;
}
/** Getter for {@link Mode5TransponderBasicData#figureOfMerit}
  * @return value of interest */
public byte getFigureOfMerit()
{
    return figureOfMerit; 
}

/** Setter for {@link Mode5TransponderBasicData#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setPadding(byte pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link Mode5TransponderBasicData#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public Mode5TransponderBasicData setPadding(int pPadding){
    padding = (byte) pPadding;
    return this;
}
/** Getter for {@link Mode5TransponderBasicData#padding}
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
       dos.writeShort(mode5Status);
       dos.writeShort(personalIdentificationNumber);
       dos.writeInt(mode5MessageFormatsPresent);
       dos.writeShort(enhancedMode1);
       dos.writeShort(nationalOrigin);
       dos.writeByte(supplementalData);
       navigationSource.marshal(dos);
       dos.writeByte(figureOfMerit);
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
        mode5Status = (short)dis.readUnsignedShort();
        uPosition += 2;
        personalIdentificationNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
        mode5MessageFormatsPresent = dis.readInt();
        uPosition += 4;
        enhancedMode1 = (short)dis.readUnsignedShort();
        uPosition += 2;
        nationalOrigin = (short)dis.readUnsignedShort();
        uPosition += 2;
        supplementalData = (byte)dis.readUnsignedByte();
        uPosition += 1;
        navigationSource = NavigationSource.unmarshalEnum(dis);
        uPosition += navigationSource.getMarshalledSize();
        figureOfMerit = (byte)dis.readUnsignedByte();
        uPosition += 1;
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
   byteBuffer.putShort( (short)mode5Status);
   byteBuffer.putShort( (short)personalIdentificationNumber);
   byteBuffer.putInt( (int)mode5MessageFormatsPresent);
   byteBuffer.putShort( (short)enhancedMode1);
   byteBuffer.putShort( (short)nationalOrigin);
   byteBuffer.put( (byte)supplementalData);
   navigationSource.marshal(byteBuffer);
   byteBuffer.put( (byte)figureOfMerit);
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
        // attribute mode5Status marked as not serialized
        mode5Status = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute personalIdentificationNumber marked as not serialized
        personalIdentificationNumber = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute mode5MessageFormatsPresent marked as not serialized
        mode5MessageFormatsPresent = byteBuffer.getInt();
        // attribute enhancedMode1 marked as not serialized
        enhancedMode1 = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute nationalOrigin marked as not serialized
        nationalOrigin = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute supplementalData marked as not serialized
        supplementalData = (byte)(byteBuffer.get() & 0xFF);
        // attribute navigationSource marked as not serialized
        navigationSource = NavigationSource.unmarshalEnum(byteBuffer);
        // attribute figureOfMerit marked as not serialized
        figureOfMerit = (byte)(byteBuffer.get() & 0xFF);
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
     boolean ivarsEqual = true;

     final Mode5TransponderBasicData rhs = (Mode5TransponderBasicData)obj;

     if( ! (mode5Status == rhs.mode5Status)) ivarsEqual = false;
     if( ! (personalIdentificationNumber == rhs.personalIdentificationNumber)) ivarsEqual = false;
     if( ! (mode5MessageFormatsPresent == rhs.mode5MessageFormatsPresent)) ivarsEqual = false;
     if( ! (enhancedMode1 == rhs.enhancedMode1)) ivarsEqual = false;
     if( ! (nationalOrigin == rhs.nationalOrigin)) ivarsEqual = false;
     if( ! (supplementalData == rhs.supplementalData)) ivarsEqual = false;
     if( ! (navigationSource == rhs.navigationSource)) ivarsEqual = false;
     if( ! (figureOfMerit == rhs.figureOfMerit)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" mode5Status:").append(mode5Status); // writeOneToString
    sb.append(" personalIdentificationNumber:").append(personalIdentificationNumber); // writeOneToString
    sb.append(" mode5MessageFormatsPresent:").append(mode5MessageFormatsPresent); // writeOneToString
    sb.append(" enhancedMode1:").append(enhancedMode1); // writeOneToString
    sb.append(" nationalOrigin:").append(nationalOrigin); // writeOneToString
    sb.append(" supplementalData:").append(supplementalData); // writeOneToString
    sb.append(" navigationSource:").append(navigationSource); // writeOneToString
    sb.append(" figureOfMerit:").append(figureOfMerit); // writeOneToString
    sb.append(" padding:").append(padding); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.mode5Status,
	                     this.personalIdentificationNumber,
	                     this.mode5MessageFormatsPresent,
	                     this.enhancedMode1,
	                     this.nationalOrigin,
	                     this.supplementalData,
	                     this.navigationSource,
	                     this.figureOfMerit,
	                     this.padding);
 }
} // end of class
