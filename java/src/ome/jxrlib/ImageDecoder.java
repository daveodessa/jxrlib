/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ome.jxrlib;

public class ImageDecoder {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ImageDecoder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImageDecoder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JXRJNI.delete_ImageDecoder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void initialize() {
    JXRJNI.ImageDecoder_initialize(swigCPtr, this);
  }

  public long getFrameCount() {
    return JXRJNI.ImageDecoder_getFrameCount(swigCPtr, this);
  }

  public void selectFrame(long frameNum) {
    JXRJNI.ImageDecoder_selectFrame(swigCPtr, this, frameNum);
  }

  public GUID getGUIDPixFormat() {
    return new GUID(JXRJNI.ImageDecoder_getGUIDPixFormat(swigCPtr, this), true);
  }

  public boolean getBlackWhite() {
    return JXRJNI.ImageDecoder_getBlackWhite(swigCPtr, this);
  }

  public long getWidth() {
    return JXRJNI.ImageDecoder_getWidth(swigCPtr, this);
  }

  public long getHeight() {
    return JXRJNI.ImageDecoder_getHeight(swigCPtr, this);
  }

  public Resolution getResolution() {
    return new Resolution(JXRJNI.ImageDecoder_getResolution(swigCPtr, this), true);
  }

  public void close() {
    JXRJNI.ImageDecoder_close(swigCPtr, this);
  }

  public ImageDecoder() {
    this(JXRJNI.new_ImageDecoder(), true);
  }

}
