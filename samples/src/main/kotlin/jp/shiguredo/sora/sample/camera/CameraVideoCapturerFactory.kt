package jp.shiguredo.sora.sample.camera

import android.content.Context
import jp.shiguredo.sora.sdk.camera.CameraCapturerFactory
import jp.shiguredo.webrtc.video.effector.RTCVideoEffector
import jp.shiguredo.webrtc.video.effector.camera.EffectCameraCapturerFactory
import org.webrtc.CameraVideoCapturer

interface CameraVideoCapturerFactory {
    fun createCapturer(): CameraVideoCapturer?
}

class DefaultCameraVideoCapturerFactory(
        private val context: Context
): CameraVideoCapturerFactory {

    override fun createCapturer(): CameraVideoCapturer? {
        return CameraCapturerFactory.create(context)
    }
}

class EffectCameraVideoCapturerFactory(
        private val effector: RTCVideoEffector
): CameraVideoCapturerFactory {

    override fun createCapturer(): CameraVideoCapturer? {
        return EffectCameraCapturerFactory.create(effector)
    }

}
