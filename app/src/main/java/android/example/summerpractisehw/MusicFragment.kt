package android.example.summerpractisehw

import android.example.summerpractisehw.databinding.FragmentMusicBinding
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar

class MusicFragment : Fragment(R.layout.fragment_music) {

    private var _binding: FragmentMusicBinding? = null
    private val binding get() = _binding!!
    private var adapter: MusicAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentMusicBinding.bind(view)
        initAdapt()

    }

    private fun initAdapt() {
        adapter = MusicAdapter(MusicRepository.musics, Glide.with(this)) {
            val action = MusicFragmentDirections.actionMusicFragmentToMusicFragmentInformation(it.id)
            binding.root.findNavController().navigate(action)
        }
        binding.rvMusic.adapter = adapter

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}