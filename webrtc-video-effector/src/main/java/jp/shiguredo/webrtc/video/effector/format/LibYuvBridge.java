package jp.shiguredo.webrtc.video.effector.format;

public class LibYuvBridge {

    static {
        System.loadLibrary("yuvconv");
    }

    public LibYuvBridge() {
    }

    public void yuvToRgba(byte[] yuv, int width, int height, int[] out) {
        yuvToRgbaInternal(yuv, width, height, out);
    }

    public void rgbToYuv(byte[] rgb, int width, int height, byte[] yuv) {
        rgbToYuvInternal(rgb, width, height, yuv);
    }

    private native void yuvToRgbaInternal(byte[] yuv, int width, int height, int[] out);

    private native void rgbToYuvInternal(byte[] rgb, int width, int height, byte[] yuv);
}
