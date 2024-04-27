package com.jesen.harmony.svd;

import com.jesen.harmony.svd.slice.VideoPublishPageAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class VideoPublishPageAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(VideoPublishPageAbilitySlice.class.getName());
    }
}
