package com.jesen.harmony.svd.slice;

import com.jesen.harmony.svd.MainAbility;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import com.jesen.harmony.svd.ResourceTable;

public class RegisterAbilitySlice extends AbilitySlice {
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_register);

        Button buttonLogin = findComponentById(ResourceTable.Id_button_login);
        buttonLogin.setClickedListener(component -> {
            Intent intent1 = new Intent();
            intent1.setOperation(new Intent.OperationBuilder()
                    .withAbilityName(MainAbility.class)
                    .withBundleName("com.jesen.harmony.svd").build());
            startAbility(intent1);
            // 关闭RegisterAbilitySlice
            terminate();
        });
    }

    @Override
    protected void onActive() {
        super.onActive();
    }

    @Override
    protected void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}