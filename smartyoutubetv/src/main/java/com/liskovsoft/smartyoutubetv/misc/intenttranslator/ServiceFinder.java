package com.liskovsoft.smartyoutubetv.misc.intenttranslator;

import android.content.Intent;

public interface ServiceFinder {
    String getUrl();
    Intent transformIntent(Intent intent);
}
