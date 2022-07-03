package android.example.summerpractisehw

import android.example.summerpractisehw.databinding.FragmentCassetteBinding
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class CassetteFragment : Fragment(R.layout.fragment_cassette) {

    private var _binding: FragmentCassetteBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentCassetteBinding.bind(view)

        with(binding) {
            btnCassette.setOnClickListener {
                findNavController().navigate(
                    R.id.action_cassetteFragment_to_unknownFragment,
                    UnknownFragment.createBundle(
                        (tvCassette.text ?: "ERROR").toString()
                    )
                )
            }
        }
    }
}