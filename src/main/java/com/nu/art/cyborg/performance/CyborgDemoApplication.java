/*
 * Copyright (c) 2017 to Adam van der Kruk (Zehavi) AKA TacB0sS - Nu-Art Software
 *
 * This software code is not an 'Open Source'!
 * In order to use this code you MUST have a proper license.
 * In order to obtain a licence please contact me directly.
 *
 * Email: Adam.Zehavi@Nu-Art-Software.com
 */

package com.nu.art.cyborg.performance;

import android.app.Application;

import com.nu.art.core.utils.DebugFlags;
import com.nu.art.cyborg.core.CyborgBuilder;
import com.nu.art.cyborg.core.CyborgBuilder.CyborgConfiguration;
import com.nu.art.cyborg.core.CyborgStackController;
import com.nu.art.cyborg.media.CyborgAudioRecorder;

public class CyborgDemoApplication
	extends Application {

	private final String TAG = getClass().getSimpleName();

	@Override
	@SuppressWarnings("unchecked")
	public void onCreate() {
		super.onCreate();
		CyborgStackController.DebugFlag.enable();
		CyborgBuilder.startCyborg(new CyborgConfiguration(this, R.layout.activity__performance, MyModulePack.class));
	}
}
