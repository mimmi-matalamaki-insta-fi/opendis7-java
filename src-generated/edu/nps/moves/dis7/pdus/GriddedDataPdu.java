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
 * 7.10.3 Used to communicate information about global, spatially varying environmental effects.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class GriddedDataPdu extends SyntheticEnvironmentFamilyPdu implements Serializable
{
   /** environmental simulation application ID provides a unique identifier */
   protected SimulationIdentifier  environmentalSimulationApplicationID = new SimulationIdentifier(); 

   /** unique identifier for each piece of environmental data */
   protected short fieldNumber;

   /** sequence number for the total set of PDUS used to transmit the data */
   protected short pduNumber;

   /** Total number of PDUS used to transmit the data */
   protected short pduTotal;

   /** coordinate system of the grid uid 244 */
   protected GriddedDataCoordinateSystem coordinateSystem = GriddedDataCoordinateSystem.values()[0];

   /** number of grid axes for the environmental data */
   protected byte numberOfGridAxes;

   /** are domain grid axes identidal to those of the priveious domain update? uid 245 */
   protected GriddedDataConstantGrid constantGrid = GriddedDataConstantGrid.values()[0];

   /** type of environment */
   protected EntityType  environmentType = new EntityType(); 

   /** orientation of the data grid */
   protected EulerAngles  orientation = new EulerAngles(); 

   /** valid time of the enviormental data sample, 64-bit unsigned int */
   protected ClockTime  sampleTime = new ClockTime(); 

   /** total number of all data values for all pdus for an environmental sample */
   protected int totalValues;

   /** total number of data values at each grid point. */
   protected byte vectorDimension;

   /** padding */
   protected byte padding1;

   /** padding */
   protected short padding2;

   /** gridAxisDescriptors is an undescribed parameter... */
   protected List< GridAxisDescriptor > gridAxisDescriptors = new ArrayList< GridAxisDescriptor >();
 
   /** gridDataRecords is an undescribed parameter... */
   protected List< GridData > gridDataRecords = new ArrayList< GridData >();
 

/** Constructor creates and configures a new instance object */
 public GriddedDataPdu()
 {
    setPduType( DisPduType.GRIDDED_DATA );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public GriddedDataPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public GriddedDataPdu copyByteBuffer()
 {
     GriddedDataPdu newCopy = new GriddedDataPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("GriddedDataPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public GriddedDataPdu copyDataOutputStream()
 {
     GriddedDataPdu newCopy = new GriddedDataPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("GriddedDataPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.out.println("GriddedDataPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (environmentalSimulationApplicationID != null)
       marshalSize += environmentalSimulationApplicationID.getMarshalledSize();
   marshalSize += 2;  // fieldNumber
   marshalSize += 2;  // pduNumber
   marshalSize += 2;  // pduTotal
   if (coordinateSystem != null)
       marshalSize += coordinateSystem.getMarshalledSize();
   marshalSize += 1;  // numberOfGridAxes
   if (constantGrid != null)
       marshalSize += constantGrid.getMarshalledSize();
   if (environmentType != null)
       marshalSize += environmentType.getMarshalledSize();
   if (orientation != null)
       marshalSize += orientation.getMarshalledSize();
   if (sampleTime != null)
       marshalSize += sampleTime.getMarshalledSize();
   marshalSize += 4;  // totalValues
   marshalSize += 1;  // vectorDimension
   marshalSize += 1;  // padding1
   marshalSize += 2;  // padding2
   if (gridAxisDescriptors != null)
       for (int idx=0; idx < gridAxisDescriptors.size(); idx++)
       {
            GridAxisDescriptor listElement = gridAxisDescriptors.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }
   if (gridDataRecords != null)
       for (int idx=0; idx < gridDataRecords.size(); idx++)
       {
            GridData listElement = gridDataRecords.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link GriddedDataPdu#environmentalSimulationApplicationID}
  * @param pEnvironmentalSimulationApplicationID new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setEnvironmentalSimulationApplicationID(SimulationIdentifier pEnvironmentalSimulationApplicationID)
{
    environmentalSimulationApplicationID = pEnvironmentalSimulationApplicationID;
    return this;
}
/** Getter for {@link GriddedDataPdu#environmentalSimulationApplicationID}
  * @return value of interest */
public SimulationIdentifier getEnvironmentalSimulationApplicationID()
{
    return environmentalSimulationApplicationID;
}


/** Setter for {@link GriddedDataPdu#fieldNumber}
  * @param pFieldNumber new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setFieldNumber(short pFieldNumber)
{
    fieldNumber = pFieldNumber;
    return this;
}
/** Utility setter for {@link GriddedDataPdu#fieldNumber}
  * @param pFieldNumber new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setFieldNumber(int pFieldNumber){
    fieldNumber = (short) pFieldNumber;
    return this;
}
/** Getter for {@link GriddedDataPdu#fieldNumber}
  * @return value of interest */
public short getFieldNumber()
{
    return fieldNumber; 
}

/** Setter for {@link GriddedDataPdu#pduNumber}
  * @param pPduNumber new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setPduNumber(short pPduNumber)
{
    pduNumber = pPduNumber;
    return this;
}
/** Utility setter for {@link GriddedDataPdu#pduNumber}
  * @param pPduNumber new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setPduNumber(int pPduNumber){
    pduNumber = (short) pPduNumber;
    return this;
}
/** Getter for {@link GriddedDataPdu#pduNumber}
  * @return value of interest */
public short getPduNumber()
{
    return pduNumber; 
}

/** Setter for {@link GriddedDataPdu#pduTotal}
  * @param pPduTotal new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setPduTotal(short pPduTotal)
{
    pduTotal = pPduTotal;
    return this;
}
/** Utility setter for {@link GriddedDataPdu#pduTotal}
  * @param pPduTotal new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setPduTotal(int pPduTotal){
    pduTotal = (short) pPduTotal;
    return this;
}
/** Getter for {@link GriddedDataPdu#pduTotal}
  * @return value of interest */
public short getPduTotal()
{
    return pduTotal; 
}

/** Setter for {@link GriddedDataPdu#coordinateSystem}
  * @param pCoordinateSystem new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setCoordinateSystem(GriddedDataCoordinateSystem pCoordinateSystem)
{
    coordinateSystem = pCoordinateSystem;
    return this;
}
/** Getter for {@link GriddedDataPdu#coordinateSystem}
  * @return value of interest */
public GriddedDataCoordinateSystem getCoordinateSystem()
{
    return coordinateSystem; 
}

/** Setter for {@link GriddedDataPdu#constantGrid}
  * @param pConstantGrid new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setConstantGrid(GriddedDataConstantGrid pConstantGrid)
{
    constantGrid = pConstantGrid;
    return this;
}
/** Getter for {@link GriddedDataPdu#constantGrid}
  * @return value of interest */
public GriddedDataConstantGrid getConstantGrid()
{
    return constantGrid; 
}

/** Setter for {@link GriddedDataPdu#environmentType}
  * @param pEnvironmentType new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setEnvironmentType(EntityType pEnvironmentType)
{
    environmentType = pEnvironmentType;
    return this;
}
/** Getter for {@link GriddedDataPdu#environmentType}
  * @return value of interest */
public EntityType getEnvironmentType()
{
    return environmentType;
}


/** Setter for {@link GriddedDataPdu#orientation}
  * @param pOrientation new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setOrientation(EulerAngles pOrientation)
{
    orientation = pOrientation;
    return this;
}
/** Getter for {@link GriddedDataPdu#orientation}
  * @return value of interest */
public EulerAngles getOrientation()
{
    return orientation;
}


/** Setter for {@link GriddedDataPdu#sampleTime}
  * @param pSampleTime new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setSampleTime(ClockTime pSampleTime)
{
    sampleTime = pSampleTime;
    return this;
}
/** Getter for {@link GriddedDataPdu#sampleTime}
  * @return value of interest */
public ClockTime getSampleTime()
{
    return sampleTime;
}


/** Setter for {@link GriddedDataPdu#totalValues}
  * @param pTotalValues new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setTotalValues(int pTotalValues)
{
    totalValues = pTotalValues;
    return this;
}
/** Getter for {@link GriddedDataPdu#totalValues}
  * @return value of interest */
public int getTotalValues()
{
    return totalValues; 
}

/** Setter for {@link GriddedDataPdu#vectorDimension}
  * @param pVectorDimension new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setVectorDimension(byte pVectorDimension)
{
    vectorDimension = pVectorDimension;
    return this;
}
/** Utility setter for {@link GriddedDataPdu#vectorDimension}
  * @param pVectorDimension new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setVectorDimension(int pVectorDimension){
    vectorDimension = (byte) pVectorDimension;
    return this;
}
/** Getter for {@link GriddedDataPdu#vectorDimension}
  * @return value of interest */
public byte getVectorDimension()
{
    return vectorDimension; 
}

/** Setter for {@link GriddedDataPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setPadding1(byte pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Utility setter for {@link GriddedDataPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setPadding1(int pPadding1){
    padding1 = (byte) pPadding1;
    return this;
}
/** Getter for {@link GriddedDataPdu#padding1}
  * @return value of interest */
public byte getPadding1()
{
    return padding1; 
}

/** Setter for {@link GriddedDataPdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setPadding2(short pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link GriddedDataPdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setPadding2(int pPadding2){
    padding2 = (short) pPadding2;
    return this;
}
/** Getter for {@link GriddedDataPdu#padding2}
  * @return value of interest */
public short getPadding2()
{
    return padding2; 
}

/** Setter for {@link GriddedDataPdu#gridAxisDescriptors}
  * @param pGridAxisDescriptors new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setGridAxisDescriptors(List<GridAxisDescriptor> pGridAxisDescriptors)
{
    gridAxisDescriptors = pGridAxisDescriptors;
    return this;
}
/** Getter for {@link GriddedDataPdu#gridAxisDescriptors}
  * @return value of interest */
public List<GridAxisDescriptor> getGridAxisDescriptors()
{
    return gridAxisDescriptors; 
}

/** Setter for {@link GriddedDataPdu#gridDataRecords}
  * @param pGridDataRecords new value of interest
  * @return same object to permit progressive setters */
public GriddedDataPdu setGridDataRecords(List<GridData> pGridDataRecords)
{
    gridDataRecords = pGridDataRecords;
    return this;
}
/** Getter for {@link GriddedDataPdu#gridDataRecords}
  * @return value of interest */
public List<GridData> getGridDataRecords()
{
    return gridDataRecords; 
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
       environmentalSimulationApplicationID.marshal(dos);
       dos.writeShort(fieldNumber);
       dos.writeShort(pduNumber);
       dos.writeShort(pduTotal);
       coordinateSystem.marshal(dos);
       dos.writeByte(gridDataRecords.size());
       constantGrid.marshal(dos);
       environmentType.marshal(dos);
       orientation.marshal(dos);
       sampleTime.marshal(dos);
       dos.writeInt(totalValues);
       dos.writeByte(vectorDimension);
       dos.writeByte(padding1);
       dos.writeShort(padding2);

       for (int idx = 0; idx < gridAxisDescriptors.size(); idx++)
       {
            GridAxisDescriptor aGridAxisDescriptor = gridAxisDescriptors.get(idx);
            aGridAxisDescriptor.marshal(dos);
       }


       for (int idx = 0; idx < gridDataRecords.size(); idx++)
       {
            GridData aGridData = gridDataRecords.get(idx);
            aGridData.marshal(dos);
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
        uPosition += environmentalSimulationApplicationID.unmarshal(dis);
        fieldNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
        pduNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
        pduTotal = (short)dis.readUnsignedShort();
        uPosition += 2;
        coordinateSystem = GriddedDataCoordinateSystem.unmarshalEnum(dis);
        uPosition += coordinateSystem.getMarshalledSize();
        numberOfGridAxes = (byte)dis.readUnsignedByte();
        uPosition += 1;
        constantGrid = GriddedDataConstantGrid.unmarshalEnum(dis);
        uPosition += constantGrid.getMarshalledSize();
        uPosition += environmentType.unmarshal(dis);
        uPosition += orientation.unmarshal(dis);
        uPosition += sampleTime.unmarshal(dis);
        totalValues = dis.readInt();
        uPosition += 4;
        vectorDimension = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        for (int idx = 0; idx < numberOfGridAxes; idx++)
        {
            GridAxisDescriptor anX = new GridAxisDescriptor();
            uPosition += anX.unmarshal(dis);
            gridAxisDescriptors.add(anX);
        }

        for (int idx = 0; idx < numberOfGridAxes; idx++)
        {
            GridData anX = new GridData();
            uPosition += anX.unmarshal(dis);
            gridDataRecords.add(anX);
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
   environmentalSimulationApplicationID.marshal(byteBuffer);
   byteBuffer.putShort( (short)fieldNumber);
   byteBuffer.putShort( (short)pduNumber);
   byteBuffer.putShort( (short)pduTotal);
   coordinateSystem.marshal(byteBuffer);
   byteBuffer.put( (byte)gridDataRecords.size());
   constantGrid.marshal(byteBuffer);
   environmentType.marshal(byteBuffer);
   orientation.marshal(byteBuffer);
   sampleTime.marshal(byteBuffer);
   byteBuffer.putInt( (int)totalValues);
   byteBuffer.put( (byte)vectorDimension);
   byteBuffer.put( (byte)padding1);
   byteBuffer.putShort( (short)padding2);

   for (int idx = 0; idx < gridAxisDescriptors.size(); idx++)
   {
        GridAxisDescriptor aGridAxisDescriptor = gridAxisDescriptors.get(idx);
        aGridAxisDescriptor.marshal(byteBuffer);
   }


   for (int idx = 0; idx < gridDataRecords.size(); idx++)
   {
        GridData aGridData = gridDataRecords.get(idx);
        aGridData.marshal(byteBuffer);
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
        // attribute environmentalSimulationApplicationID marked as not serialized
        environmentalSimulationApplicationID.unmarshal(byteBuffer);
        // attribute fieldNumber marked as not serialized
        fieldNumber = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute pduNumber marked as not serialized
        pduNumber = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute pduTotal marked as not serialized
        pduTotal = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute coordinateSystem marked as not serialized
        coordinateSystem = GriddedDataCoordinateSystem.unmarshalEnum(byteBuffer);
        // attribute numberOfGridAxes marked as not serialized
        numberOfGridAxes = (byte)(byteBuffer.get() & 0xFF);
        // attribute constantGrid marked as not serialized
        constantGrid = GriddedDataConstantGrid.unmarshalEnum(byteBuffer);
        // attribute environmentType marked as not serialized
        environmentType.unmarshal(byteBuffer);
        // attribute orientation marked as not serialized
        orientation.unmarshal(byteBuffer);
        // attribute sampleTime marked as not serialized
        sampleTime.unmarshal(byteBuffer);
        // attribute totalValues marked as not serialized
        totalValues = byteBuffer.getInt();
        // attribute vectorDimension marked as not serialized
        vectorDimension = (byte)(byteBuffer.get() & 0xFF);
        // attribute padding1 marked as not serialized
        padding1 = (byte)(byteBuffer.get() & 0xFF);
        // attribute padding2 marked as not serialized
        padding2 = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute gridAxisDescriptors marked as not serialized
        for (int idx = 0; idx < numberOfGridAxes; idx++)
        {
        GridAxisDescriptor anX = new GridAxisDescriptor();
        anX.unmarshal(byteBuffer);
        gridAxisDescriptors.add(anX);
        }

        // attribute gridDataRecords marked as not serialized
        for (int idx = 0; idx < numberOfGridAxes; idx++)
        {
        GridData anX = new GridData();
        anX.unmarshal(byteBuffer);
        gridDataRecords.add(anX);
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
     final GriddedDataPdu rhs = (GriddedDataPdu)obj;

     if( ! Objects.equals(environmentalSimulationApplicationID, rhs.environmentalSimulationApplicationID) ) return false;
     if( ! (fieldNumber == rhs.fieldNumber)) return false;
     if( ! (pduNumber == rhs.pduNumber)) return false;
     if( ! (pduTotal == rhs.pduTotal)) return false;
     if( ! (coordinateSystem == rhs.coordinateSystem)) return false;
     if( ! (constantGrid == rhs.constantGrid)) return false;
     if( ! Objects.equals(environmentType, rhs.environmentType) ) return false;
     if( ! Objects.equals(orientation, rhs.orientation) ) return false;
     if( ! Objects.equals(sampleTime, rhs.sampleTime) ) return false;
     if( ! (totalValues == rhs.totalValues)) return false;
     if( ! (vectorDimension == rhs.vectorDimension)) return false;
     if( ! (padding1 == rhs.padding1)) return false;
     if( ! (padding2 == rhs.padding2)) return false;
     if( ! Objects.equals(gridAxisDescriptors, rhs.gridAxisDescriptors) ) return false;
     if( ! Objects.equals(gridDataRecords, rhs.gridDataRecords) ) return false;
    return super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" environmentalSimulationApplicationID:").append(environmentalSimulationApplicationID); // writeOneToString
    sb.append(" fieldNumber:").append(fieldNumber); // writeOneToString
    sb.append(" pduNumber:").append(pduNumber); // writeOneToString
    sb.append(" pduTotal:").append(pduTotal); // writeOneToString
    sb.append(" coordinateSystem:").append(coordinateSystem); // writeOneToString
    sb.append(" constantGrid:").append(constantGrid); // writeOneToString
    sb.append(" environmentType:").append(environmentType); // writeOneToString
    sb.append(" orientation:").append(orientation); // writeOneToString
    sb.append(" sampleTime:").append(sampleTime); // writeOneToString
    sb.append(" totalValues:").append(totalValues); // writeOneToString
    sb.append(" vectorDimension:").append(vectorDimension); // writeOneToString
    sb.append(" padding1:").append(padding1); // writeOneToString
    sb.append(" padding2:").append(padding2); // writeOneToString
    sb.append(" gridAxisDescriptors: ");
    gridAxisDescriptors.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset
    sb.append(" gridDataRecords: ");
    gridDataRecords.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.environmentalSimulationApplicationID,
	                     this.fieldNumber,
	                     this.pduNumber,
	                     this.pduTotal,
	                     this.coordinateSystem,
	                     this.numberOfGridAxes,
	                     this.constantGrid,
	                     this.environmentType,
	                     this.orientation,
	                     this.sampleTime,
	                     this.totalValues,
	                     this.vectorDimension,
	                     this.padding1,
	                     this.padding2,
	                     this.gridAxisDescriptors,
	                     this.gridDataRecords);
 }
} // end of class
