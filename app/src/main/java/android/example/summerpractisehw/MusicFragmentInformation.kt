package android.example.summerpractisehw

import android.example.summerpractisehw.MusicRepository.musics
import android.example.summerpractisehw.databinding.InformationFragmentMusicBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class MusicFragmentInformation : Fragment(R.layout.information_fragment_music) {
    private var _binding: InformationFragmentMusicBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.information_fragment_music, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = InformationFragmentMusicBinding.bind(view)
        val args by navArgs<MusicFragmentInformationArgs>()
        val myIterator = args.arg

        with(binding) {
            tvNameAction.text = "Name: ${musics[myIterator].name}"
            tvPerformerAction.text = "Performer: ${musics[myIterator].performer}"
            tvDurationAction.text = "Duration: ${musics[myIterator].duration}"
            tvIdAction.text = "ID: ${musics[myIterator].id}"
        }
    }


}