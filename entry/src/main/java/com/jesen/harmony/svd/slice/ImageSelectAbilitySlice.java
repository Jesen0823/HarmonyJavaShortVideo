package com.jesen.harmony.svd.slice;

import com.jesen.harmony.svd.ResourceTable;
import com.jesen.harmony.svd.utils.ScreenUtil;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Image;
import ohos.agp.components.TableLayout;

import java.util.ArrayList;
import java.util.List;

public class ImageSelectAbilitySlice extends AbilitySlice {
   private TableLayout tableLayout;
    private List<Integer> imageList = new ArrayList();
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_image_select);

        initUi();
        initData();
        showImages();
    }

    private void showImages() {
        int screenWidth = ScreenUtil.getScreenWidth(this);
        int imageWidth = (screenWidth-20*4)/4;

        tableLayout.removeAllComponents();
        for(int src:imageList){
            Image image = new Image(this);
            image.setHeight(imageWidth);
            image.setWidth(imageWidth);
            image.setScaleMode(Image.ScaleMode.ZOOM_CENTER);
            image.setMarginTop(10);
            image.setMarginRight(10);
            image.setMarginLeft(10);
            image.setPixelMap(ResourceTable.Media_ic_portrait);

            tableLayout.addComponent(image);
        }
    }

    private void initData() {
        for (int i = 0; i < 100; i++) {
            imageList.add(i);
        }
    }

    private void initUi() {
        tableLayout = findComponentById(ResourceTable.Id_tab_layout_image);

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