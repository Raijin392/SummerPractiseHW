package android.example.summerpractisehw

import android.example.summerpractisehw.databinding.FragmentMusicBinding
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

class MusicFragment : Fragment(R.layout.fragment_music) {

    private var _binding: FragmentMusicBinding? = null
    private val binding get() = _binding!!
    private var adapter: MusicAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentMusicBinding.bind(view)

        adapter = MusicAdapter(MusicRepository.musics) {
            Snackbar.make(binding.root, "Music id: ${it.id}", Snackbar.LENGTH_SHORT).show()
        }
        binding.rvMusic.adapter = adapter
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}