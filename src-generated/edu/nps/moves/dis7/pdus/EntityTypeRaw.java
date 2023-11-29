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
 * Identifies the type of Entity
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class EntityTypeRaw extends Object implements Serializable
{
   /** Kind of entity uid 7 */
   protected EntityKind entityKind = EntityKind.values()[0];

   /** Domain of entity (air, surface, subsurface, space, etc.) */
   protected byte domain;

   /** country to which the design of the entity is attributed */
   protected short country;

   /** category of entity */
   protected byte category;

   /** subcategory of entity */
   protected byte subCategory;

   /** specific info based on subcategory field. Renamed from specific because that is a reserved word in SQL. */
   protected byte specific;

   /** extra is an undescribed parameter... */
   protected byte extra;


/** Constructor creates and configures a new instance object */
 public EntityTypeRaw()
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

   if (entityKind != null)
       marshalSize += entityKind.getMarshalledSize();
   marshalSize += 1;  // domain
   marshalSize += 2;  // country
   marshalSize += 1;  // category
   marshalSize += 1;  // subCategory
   marshalSize += 1;  // specific
   marshalSize += 1;  // extra

   return marshalSize;
}


/** Setter for {@link EntityTypeRaw#entityKind}
  * @param pEntityKind new value of interest
  * @return same object to permit progressive setters */
public EntityTypeRaw setEntityKind(EntityKind pEntityKind)
{
    entityKind = pEntityKind;
    return this;
}
/** Getter for {@link EntityTypeRaw#entityKind}
  * @return value of interest */
public EntityKind getEntityKind()
{
    return entityKind; 
}

/** Setter for {@link EntityTypeRaw#domain}
  * @param pDomain new value of interest
  * @return same object to permit progressive setters */
public EntityTypeRaw setDomain(byte pDomain)
{
    domain = pDomain;
    return this;
}
/** Utility setter for {@link EntityTypeRaw#domain}
  * @param pDomain new value of interest
  * @return same object to permit progressive setters */
public EntityTypeRaw setDomain(int pDomain){
    domain = (byte) pDomain;
    return this;
}
/** Getter for {@link EntityTypeRaw#domain}
  * @return value of interest */
public byte getDomain()
{
    return domain; 
}

/** Setter for {@link EntityTypeRaw#country}
  * @param pCountry new value of interest
  * @return same object to permit progressive setters */
public EntityTypeRaw setCountry(short pCountry)
{
    country = pCountry;
    return this;
}
/** Utility setter for {@link EntityTypeRaw#country}
  * @param pCountry new value of interest
  * @return same object to permit progressive setters */
public EntityTypeRaw setCountry(int pCountry){
    country = (short) pCountry;
    return this;
}
/** Getter for {@link EntityTypeRaw#country}
  * @return value of interest */
public short getCountry()
{
    return country; 
}

/** Setter for {@link EntityTypeRaw#category}
  * @param pCategory new value of interest
  * @return same object to permit progressive setters */
public EntityTypeRaw setCategory(byte pCategory)
{
    category = pCategory;
    return this;
}
/** Utility setter for {@link EntityTypeRaw#category}
  * @param pCategory new value of interest
  * @return same object to permit progressive setters */
public EntityTypeRaw setCategory(int pCategory){
    category = (byte) pCategory;
    return this;
}
/** Getter for {@link EntityTypeRaw#category}
  * @return value of interest */
public byte getCategory()
{
    return category; 
}

/** Setter for {@link EntityTypeRaw#subCategory}
  * @param pSubCategory new value of interest
  * @return same object to permit progressive setters */
public EntityTypeRaw setSubCategory(byte pSubCategory)
{
    subCategory = pSubCategory;
    return this;
}
/** Utility setter for {@link EntityTypeRaw#subCategory}
  * @param pSubCategory new value of interest
  * @return same object to permit progressive setters */
public EntityTypeRaw setSubCategory(int pSubCategory){
    subCategory = (byte) pSubCategory;
    return this;
}
/** Getter for {@link EntityTypeRaw#subCategory}
  * @return value of interest */
public byte getSubCategory()
{
    return subCategory; 
}

/** Setter for {@link EntityTypeRaw#specific}
  * @param pSpecific new value of interest
  * @return same object to permit progressive setters */
public EntityTypeRaw setSpecific(byte pSpecific)
{
    specific = pSpecific;
    return this;
}
/** Utility setter for {@link EntityTypeRaw#specific}
  * @param pSpecific new value of interest
  * @return same object to permit progressive setters */
public EntityTypeRaw setSpecific(int pSpecific){
    specific = (byte) pSpecific;
    return this;
}
/** Getter for {@link EntityTypeRaw#specific}
  * @return value of interest */
public byte getSpecific()
{
    return specific; 
}

/** Setter for {@link EntityTypeRaw#extra}
  * @param pExtra new value of interest
  * @return same object to permit progressive setters */
public EntityTypeRaw setExtra(byte pExtra)
{
    extra = pExtra;
    return this;
}
/** Utility setter for {@link EntityTypeRaw#extra}
  * @param pExtra new value of interest
  * @return same object to permit progressive setters */
public EntityTypeRaw setExtra(int pExtra){
    extra = (byte) pExtra;
    return this;
}
/** Getter for {@link EntityTypeRaw#extra}
  * @return value of interest */
public byte getExtra()
{
    return extra; 
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
       entityKind.marshal(dos);
       dos.writeByte(domain);
       dos.writeShort(country);
       dos.writeByte(category);
       dos.writeByte(subCategory);
       dos.writeByte(specific);
       dos.writeByte(extra);
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
        entityKind = EntityKind.unmarshalEnum(dis);
        uPosition += entityKind.getMarshalledSize();
        domain = (byte)dis.readUnsignedByte();
        uPosition += 1;
        country = (short)dis.readUnsignedShort();
        uPosition += 2;
        category = (byte)dis.readUnsignedByte();
        uPosition += 1;
        subCategory = (byte)dis.readUnsignedByte();
        uPosition += 1;
        specific = (byte)dis.readUnsignedByte();
        uPosition += 1;
        extra = (byte)dis.readUnsignedByte();
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
   entityKind.marshal(byteBuffer);
   byteBuffer.put( (byte)domain);
   byteBuffer.putShort( (short)country);
   byteBuffer.put( (byte)category);
   byteBuffer.put( (byte)subCategory);
   byteBuffer.put( (byte)specific);
   byteBuffer.put( (byte)extra);
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
        // attribute entityKind marked as not serialized
        entityKind = EntityKind.unmarshalEnum(byteBuffer);
        // attribute domain marked as not serialized
        domain = (byte)(byteBuffer.get() & 0xFF);
        // attribute country marked as not serialized
        country = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute category marked as not serialized
        category = (byte)(byteBuffer.get() & 0xFF);
        // attribute subCategory marked as not serialized
        subCategory = (byte)(byteBuffer.get() & 0xFF);
        // attribute specific marked as not serialized
        specific = (byte)(byteBuffer.get() & 0xFF);
        // attribute extra marked as not serialized
        extra = (byte)(byteBuffer.get() & 0xFF);
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
     final EntityTypeRaw rhs = (EntityTypeRaw)obj;

     if( ! (entityKind == rhs.entityKind)) return false;
     if( ! (domain == rhs.domain)) return false;
     if( ! (country == rhs.country)) return false;
     if( ! (category == rhs.category)) return false;
     if( ! (subCategory == rhs.subCategory)) return false;
     if( ! (specific == rhs.specific)) return false;
     if( ! (extra == rhs.extra)) return false;
    return true;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" entityKind:").append(entityKind); // writeOneToString
    sb.append(" domain:").append(domain); // writeOneToString
    sb.append(" country:").append(country); // writeOneToString
    sb.append(" category:").append(category); // writeOneToString
    sb.append(" subCategory:").append(subCategory); // writeOneToString
    sb.append(" specific:").append(specific); // writeOneToString
    sb.append(" extra:").append(extra); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.entityKind,
	                     this.domain,
	                     this.country,
	                     this.category,
	                     this.subCategory,
	                     this.specific,
	                     this.extra);
 }
} // end of class
