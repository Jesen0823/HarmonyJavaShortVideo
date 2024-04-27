package com.jesen.harmony.svd;

import com.jesen.harmony.svd.slice.MinePageAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MinePageAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MinePageAbilitySlice.class.getName());
    }
}
