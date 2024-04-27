package com.jesen.harmony.svd.slice;

import com.jesen.harmony.svd.MinePageAbility;
import com.jesen.harmony.svd.ResourceTable;
import com.jesen.harmony.svd.VideoPublishPageAbility;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        initUi(intent);
    }

    private void initUi(Intent intent) {
        initTabList(intent);
    }

    private void initTabList(Intent intent) {
        Button btnAdd = findComponentById(ResourceTable.Id_button_add);
        btnAdd.setClickedListener(component -> {
            startNavAbility(intent,VideoPublishPageAbility.class,null);
        });
        Button btnMine = findComponentById(ResourceTable.Id_button_mine);
        btnMine.setClickedListener(component -> {
            startNavAbility(intent, MinePageAbility.class,null);
        });
    }

    private void startNavAbility(Intent intent,Class<?> cls,  String bundleName) {
        if (bundleName == null){
            bundleName = "com.jesen.harmony.svd";
        }
        Operation operation = new Intent.OperationBuilder()
                .withAbilityName(cls)
                .withBundleName(bundleName)
                .build();
        intent.setOperation(operation);
        startAbility(intent);

        terminate();
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
