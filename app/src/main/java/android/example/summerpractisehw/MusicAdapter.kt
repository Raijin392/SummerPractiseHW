package android.example.summerpractisehw

import android.example.summerpractisehw.databinding.ItemMusicBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager

class MusicAdapter(
    private val list: List<Music>,
    private var glide: RequestManager,
    private val onItemClick: (Music) -> Unit
) : RecyclerView.Adapter<MusicHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MusicHolder = MusicHolder(
        ItemMusicBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide = glide,
        onItemClick = onItemClick
    )

    override fun onBindViewHolder(
        holder: MusicHolder,
        position: Int
    ) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}