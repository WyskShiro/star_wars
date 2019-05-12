package com.example.jera_starwars.view.viewcontract

import com.example.jera_starwars.model.dataclass.Resource

interface ResourceViewContract {
    fun updateResourcesOnRecyclerView(resource: Resource)
}