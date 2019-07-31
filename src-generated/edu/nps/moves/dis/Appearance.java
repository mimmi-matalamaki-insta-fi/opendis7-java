/**
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 */

package edu.nps.moves.dis;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis.enumerations.*;

/**
 * used in AppearancePdu
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
 */
public class Appearance extends Object implements Serializable
{
   protected int  visual;

   protected int  ir;

   protected int  em;

   protected int  audio;


/** Constructor */
 public Appearance()
 {
 }

public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 4;  // visual
   marshalSize += 4;  // ir
   marshalSize += 4;  // em
   marshalSize += 4;  // audio

   return marshalSize;
}


public Appearance setVisual(int pVisual)
{
    visual = pVisual;
    return this;
}

public int getVisual()
{
    return visual; 
}

public Appearance setIr(int pIr)
{
    ir = pIr;
    return this;
}

public int getIr()
{
    return ir; 
}

public Appearance setEm(int pEm)
{
    em = pEm;
    return this;
}

public int getEm()
{
    return em; 
}

public Appearance setAudio(int pAudio)
{
    audio = pAudio;
    return this;
}

public int getAudio()
{
    return audio; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @see java.io.DataOutputStream
 * @param dos The DataOutputStream
 */
public void marshal(DataOutputStream dos)
{
    try 
    {
       dos.writeInt( (int)visual);
       dos.writeInt( (int)ir);
       dos.writeInt( (int)em);
       dos.writeInt( (int)audio);
    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Unserializes an object from a DataInputStream.
 * @see java.io.DataInputStream
 * @param dis The DataInputStream
 * @return marshalled size
 */
public int unmarshal(DataInputStream dis)
{
    int uPosition = 0;
    try 
    {
        visual = dis.readInt();
        uPosition += 4;
        ir = dis.readInt();
        uPosition += 4;
        em = dis.readInt();
        uPosition += 4;
        audio = dis.readInt();
        uPosition += 4;
    }
    catch(Exception e)
    { 
      System.out.println(e); 
    }
    return getMarshalledSize();
}

/**
 * Packs an object into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if buff is too small
 * @throws java.nio.ReadOnlyBufferException if buff is read only
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer buff) throws Exception
{
   buff.putInt( (int)visual);
   buff.putInt( (int)ir);
   buff.putInt( (int)em);
   buff.putInt( (int)audio);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if buff is too small
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin reading
 * @return marshalled size
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer buff) throws Exception
{
    visual = buff.getInt();
    ir = buff.getInt();
    em = buff.getInt();
    audio = buff.getInt();
    return getMarshalledSize();
}

 /*
  * The equals method doesn't always work--mostly it works only on classes that consist only of primitives. Be careful.
  */
@Override
 public boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(getClass() != obj.getClass())
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

    if(!(obj instanceof Appearance))
        return false;

     final Appearance rhs = (Appearance)obj;

     if( ! (visual == rhs.visual)) ivarsEqual = false;
     if( ! (ir == rhs.ir)) ivarsEqual = false;
     if( ! (em == rhs.em)) ivarsEqual = false;
     if( ! (audio == rhs.audio)) ivarsEqual = false;
    return ivarsEqual;
 }
} // end of class
