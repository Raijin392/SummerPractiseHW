package android.example.summerpractisehw

import android.example.summerpractisehw.databinding.FragmentCameraBinding
import android.example.summerpractisehw.databinding.FragmentFashionBinding
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FashionFragment : Fragment(R.layout.fragment_fashion) {

    private var _binding: FragmentFashionBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentFashionBinding.bind(view)

        with(binding) {
            btnFashion.setOnClickListener {
                findNavController().navigate(
                    R.id.action_fashionFragment_to_unknownFragment,
                    UnknownFragment.createBundle(
                        (tvFashion.text ?: "ERROR").toString()
                    )
                )
            }
        }
    }
}