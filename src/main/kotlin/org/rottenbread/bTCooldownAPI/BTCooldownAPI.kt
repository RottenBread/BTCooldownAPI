package org.rottenbread.bTCooldownAPI

import org.bukkit.plugin.java.JavaPlugin

class BTCooldownAPI : JavaPlugin() {

    override fun onEnable() {
        logger.info("BTCooldownAPI가 활성화되었습니다.")
    }

    override fun onDisable() {
        logger.info("BTCooldownAPI가 비활성화되었습니다.")
    }
}