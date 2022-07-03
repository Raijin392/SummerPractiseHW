package android.example.summerpractisehw

import android.example.summerpractisehw.databinding.FragmentMusicBinding
import android.example.summerpractisehw.databinding.ItemMusicBinding
import androidx.recyclerview.widget.RecyclerView

class MusicHolder(
    private val binding: ItemMusicBinding,
    private val onItemClick: (Music) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(music: Music) {
        with(binding) {
            tvName.text = music.name
            tvPerformer.text = music.performer
            root.setOnClickListener {
                onItemClick(music)
            }
        }
    }
}