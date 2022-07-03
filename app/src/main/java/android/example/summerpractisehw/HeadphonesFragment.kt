package android.example.summerpractisehw

import android.example.summerpractisehw.databinding.FragmentCameraBinding
import android.example.summerpractisehw.databinding.FragmentHeadphonesBinding
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HeadphonesFragment : Fragment(R.layout.fragment_headphones) {

    private var _binding: FragmentHeadphonesBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentHeadphonesBinding.bind(view)

        with(binding) {
            btnHeadphones.setOnClickListener {
                findNavController().navigate(
                    R.id.action_headphonesFragment_to_unknownFragment,
                    UnknownFragment.createBundle(
                        (tvHeadphones.text ?: "ERROR").toString()
                    )
                )
            }
        }
    }
}