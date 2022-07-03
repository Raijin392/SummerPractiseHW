package android.example.summerpractisehw

import android.example.summerpractisehw.databinding.ItemMusicBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(
    private val list: List<Music>,
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
        onItemClick
    )

    override fun onBindViewHolder(
        holder: MusicHolder,
        position: Int
    ) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}