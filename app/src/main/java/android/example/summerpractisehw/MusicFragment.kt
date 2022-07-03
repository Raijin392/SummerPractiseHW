package android.example.summerpractisehw

import android.example.summerpractisehw.databinding.FragmentMusicBinding
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MusicFragment : Fragment(R.layout.fragment_music) {

    private var _binding: FragmentMusicBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentMusicBinding.bind(view)

        with(binding) {
            btnMusic.setOnClickListener {
                findNavController().navigate(
                    R.id.action_musicFragment_to_unknownFragment,
                    UnknownFragment.createBundle(
                        (tvMusic.text ?: "ERROR").toString()
                    )
                )
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}