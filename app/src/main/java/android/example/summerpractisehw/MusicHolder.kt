package android.example.summerpractisehw

import android.example.summerpractisehw.databinding.FragmentMusicBinding
import android.example.summerpractisehw.databinding.ItemMusicBinding
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

class MusicHolder(
    private val binding: ItemMusicBinding,
    private var glide: RequestManager,
    private val onItemClick: (Music) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    private val options: RequestOptions = RequestOptions().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)


    fun onBind(music: Music) {
        with(binding) {
            tvName.text = music.name
            tvPerformer.text = music.performer
            root.setOnClickListener {
                onItemClick(music)
            }

            glide
                .load(music.url)
                .placeholder(R.drawable.ic_music_bars)
                .error(R.drawable.ic_music_bars)
                .into(imageAction)
        }
    }
}