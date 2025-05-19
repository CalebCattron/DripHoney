package net.driphoney.fabric

import net.driphoney.fabriclike.ExampleModFabricLike
import net.fabricmc.api.ModInitializer


object ExampleModFabric: ModInitializer {
    override fun onInitialize() {
        ExampleModFabricLike.init()
    }
}
