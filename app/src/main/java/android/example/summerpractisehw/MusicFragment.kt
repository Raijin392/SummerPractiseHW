package android.example.summerpractisehw

import android.example.summerpractisehw.databinding.FragmentMusicBinding
import androidx.fragment.app.Fragment

class MusicFragment : Fragment(R.layout.fragment_music) {

    private var _binding: FragmentMusicBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentMusicBinding.bind(view)

    }
}