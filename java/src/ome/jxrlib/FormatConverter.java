/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ome.jxrlib;

public class FormatConverter {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FormatConverter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FormatConverter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JXRJNI.delete_FormatConverter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FormatConverter() {
    this(JXRJNI.new_FormatConverter(), true);
  }

}
