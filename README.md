# BTCooldownAPI
효율적인 쿨타임 플러그인 :3

# How To Use (Skript)
```
import:
    org.rottenbread.bTCooldownAPI.CooldownManager

on leftclick:
    if player's tool is netherite sword:
        set {_b} to CooldownManager.getRemaining("dash", player's uuid, 10)
        if {_b} <= 0:
            CooldownManager.apply("dash", player's uuid, 10)
            broadcast "깔롱"
        else:
            broadcast "쿨타임 중입니다. (%{_b} / 1000%s)"

on rightclick:
    if player's tool is diamond sword:
        set {_b} to CooldownManager.getRemaining("slash", player's uuid, 10)
        if {_b} <= 0:
            CooldownManager.apply("slash", player's uuid, 10)
            broadcast "깔로롱"
        else:
            broadcast "쿨타임 중입니다. (%{_b} / 1000%s)"
```

# License
본 저작물 이용자는 재판매 행위를 할 수 없음을 밝힙니다. <br>
Discord: jhmoon_aa
