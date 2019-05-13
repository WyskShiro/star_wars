package com.example.jera_starwars.model.dataclass

import android.support.v7.widget.RecyclerView

interface Resource {
    fun updateResources(resource: Resource, adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>)
}
