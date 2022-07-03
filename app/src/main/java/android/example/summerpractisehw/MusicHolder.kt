package android.example.summerpractisehw

import android.example.summerpractisehw.databinding.FragmentMusicBinding
import androidx.recyclerview.widget.RecyclerView

class MusicHolder(
    private val binding: FragmentMusicBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(music: Music) {
        with(binding) {

        }
    }
}