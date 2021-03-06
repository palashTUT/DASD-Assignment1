/* Copyright (c)2017 Rockwell Automation. All rights reserved. */
package fb.rt.student;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK AUTO_LOAD (* Composite Function Block Type *)
  * @author JHC
  * @version 20170220/JHC - Generated.
  */
public class AUTO_LOAD extends fb.rt.FBInstance {
/** Normal Execution Request */
public final EventOutput REQ = new EventOutput();
/** Execution Confirmation */
public final EventOutput CNF = new EventOutput();
/** FB DLY:E_DELAY */
  protected E_DELAY DLY = new E_DELAY() ;
/** Output event qualifier */
  public final BOOL QO = new BOOL();
/** The default constructor. */
public AUTO_LOAD(){
    super();
    REQ.connectTo(DLY.START);
    DLY.EO.connectTo(CNF);
    DLY.DT.initializeNoException("t#1ms");
  }
/** start the FB instances. */
public void start( ){
    super.start();
  DLY.start();
}
/** stop the FB instances. */
public void stop( ){
    super.stop();
  DLY.stop();
}
/** kill the FB instances. */
public void kill( ){
    super.kill();
  DLY.kill();
}
/** reset the FB instances. */
public void reset( ){
    super.reset();
  DLY.reset();
}
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    DLY.initialize("DLY",r);
}
}
