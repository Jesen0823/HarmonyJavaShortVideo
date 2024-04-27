package com.jesen.harmony.svd;

import com.jesen.harmony.svd.slice.WelcomePageAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class WelcomePageAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(WelcomePageAbilitySlice.class.getName());
    }
}
