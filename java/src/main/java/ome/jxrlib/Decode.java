/*
 * Copyright (C) 2016-2020 Glencoe Software, Inc. All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package ome.jxrlib;

import java.io.File;
import java.nio.ByteBuffer;

import org.scijava.nativelib.NativeLibraryUtil;

/**
 * Concrete class for decoding JPEG-XR data.
 * Automatically loads the relevant native libraries.
 *
 * @see AbstractDecode
 */
public class Decode extends AbstractDecode {

    static {
        NativeLibraryUtil.loadNativeLibrary(Decode.class, "jxrjava");
    }

    /**
     * @see AbstractDecode(File)
     */
    public Decode(File inputFile) {
        super(inputFile);
    }

    /**
     * @see AbstractDecode(byte[])
     */
    public Decode(byte data[]) throws DecodeException {
        super(data);
    }

    /**
     * @see AbstractDecode(ByteBuffer)
     */
    public Decode(ByteBuffer dataBuffer) throws DecodeException {
        super(dataBuffer);
    }

    /**
     * @see AbstractDecode(ByteBuffer, int, int)
     */
    public Decode(ByteBuffer dataBuffer, int offset, int length)
            throws DecodeException {
        super(dataBuffer, offset, length);
    }

    /**
     * @see AbstractDecode#decodeFirstFrame(byte[], int, int)
     */
    public static byte[] decodeFirstFrame(
            byte[] source, int offset, int length) {
        return AbstractDecode.decodeFirstFrame(source, offset, length);
    }
}
