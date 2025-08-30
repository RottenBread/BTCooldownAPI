package org.rottenbread.bTCooldownAPI

import java.util.UUID
import java.util.concurrent.TimeUnit
import kotlin.jvm.JvmStatic

object CooldownManager {

    private val cooldowns = mutableMapOf<String, MutableMap<UUID, Long>>()

    @JvmStatic
    fun apply(name: String, uuid: UUID, durationSeconds: Long): Long {
        val playerCooldowns = cooldowns.getOrPut(name) { mutableMapOf() }
        val lastUsedTime = playerCooldowns[uuid]
        val currentTime = System.currentTimeMillis()
        val cooldownMillis = TimeUnit.SECONDS.toMillis(durationSeconds)

        if (lastUsedTime == null) {
            playerCooldowns[uuid] = currentTime
            return 0L
        }

        val elapsed = currentTime - lastUsedTime
        return if (elapsed >= cooldownMillis) {
            playerCooldowns[uuid] = currentTime
            0L
        } else {
            cooldownMillis - elapsed
        }
    }

    @JvmStatic
    fun getRemaining(name: String, uuid: UUID, durationSeconds: Long): Long {
        val lastUsedTime = cooldowns[name]?.get(uuid) ?: return 0L
        val elapsed = System.currentTimeMillis() - lastUsedTime
        val cooldownMillis = TimeUnit.SECONDS.toMillis(durationSeconds)

        return if (elapsed >= cooldownMillis) 0L else cooldownMillis - elapsed
    }
}