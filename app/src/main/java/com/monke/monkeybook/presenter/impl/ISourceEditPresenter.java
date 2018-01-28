package com.monke.monkeybook.presenter.impl;

import com.monke.basemvplib.impl.IPresenter;
import com.monke.monkeybook.bean.BookSourceBean;

/**
 * Created by GKF on 2018/1/28.
 * 编辑书源
 */

public interface ISourceEditPresenter extends IPresenter {

    void copySource(BookSourceBean bookSourceBean);

    void pasteSource();

}