# BTCooldownAPI
효율적인 쿨타임 플러그인 :3 <br>
제미나이 마구마구 이용함

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

```
CooldownManager.apply("이름", 플레이어 UUID, 초) - '플레이어 UUID'를 가진 '이름'의 쿨타임을 생성합니다
CooldownManager.getRemaining("이름", 플레이어 UUID, 초) - '플레이어 UUID'를 가진 '이름'의 잔여 쿨타임을 가져옵니다
```

# License
본 저작물 이용자는 재판매 행위를 할 수 없음을 밝힙니다. <br>
Discord: jhmoon_aa
