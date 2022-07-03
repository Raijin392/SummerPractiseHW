package android.example.summerpractisehw

import android.example.summerpractisehw.databinding.FragmentCameraBinding
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class CameraFragment : Fragment(R.layout.fragment_camera) {

    private var _binding: FragmentCameraBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentCameraBinding.bind(view)

        with(binding) {
            btnCamera.setOnClickListener {
                findNavController().navigate(
                    R.id.action_cameraFragment_to_unknownFragment2,
                    UnknownFragment.createBundle(
                        (tvCamera.text ?: "ERROR").toString()
                    )
                )
            }
        }
    }
}