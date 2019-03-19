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

import android.widget.TextView;

import com.nu.art.core.tools.DateTimeTools;
import com.nu.art.cyborg.annotations.ViewIdentifier;
import com.nu.art.cyborg.core.CyborgBuilder;
import com.nu.art.cyborg.core.CyborgController;
import com.nu.art.cyborg.performance.modules.*;
import com.nu.art.reflection.annotations.ReflectiveInitialization;

/**
 * Created by TacB0sS on 13-Jun 2015.
 */
@SuppressWarnings("unchecked")
@ReflectiveInitialization
public class ControllerV1_ExamplesSelection
	extends CyborgController {

	Module1 module1;
	Module2 module2;
	Module3 module3;
	Module4 module4;
	Module5 module5;
	Module6 module6;
	Module7 module7;
	Module8 module8;
	Module9 module9;
	Module10 module10;
	Module11 module11;
	Module12 module12;
	Module13 module13;
	Module14 module14;
	Module15 module15;
	Module16 module16;
	Module17 module17;
	Module18 module18;
	Module19 module19;
	Module20 module20;
	Module21 module21;
	Module22 module22;
	Module23 module23;
	Module24 module24;
	Module25 module25;
	Module26 module26;
	Module27 module27;
	Module28 module28;
	Module29 module29;
	Module30 module30;
	Module31 module31;
	Module32 module32;
	Module33 module33;
	Module34 module34;
	Module35 module35;
	Module36 module36;
	Module37 module37;
	Module38 module38;
	Module39 module39;
	Module40 module40;
	Module41 module41;
	Module42 module42;
	Module43 module43;
	Module44 module44;
	Module45 module45;
	Module46 module46;
	Module47 module47;
	Module48 module48;
	Module49 module49;
	Module50 module50;
	Module51 module51;
	Module52 module52;
	Module53 module53;
	Module54 module54;
	Module55 module55;
	Module56 module56;
	Module57 module57;
	Module58 module58;
	Module59 module59;
	Module60 module60;
	Module61 module61;
	Module62 module62;
	Module63 module63;
	Module64 module64;
	Module65 module65;
	Module66 module66;
	Module67 module67;
	Module68 module68;
	Module69 module69;
	Module70 module70;
	Module71 module71;
	Module72 module72;
	Module73 module73;
	Module74 module74;
	Module75 module75;
	Module76 module76;
	Module77 module77;
	Module78 module78;
	Module79 module79;
	Module80 module80;
	Module81 module81;
	Module82 module82;
	Module83 module83;
	Module84 module84;
	Module85 module85;
	Module86 module86;
	Module87 module87;
	Module88 module88;
	Module89 module89;
	Module90 module90;
	Module91 module91;
	Module92 module92;
	Module93 module93;
	Module94 module94;
	Module95 module95;
	Module96 module96;
	Module97 module97;
	Module98 module98;
	Module99 module99;
	Module100 module100;
	private final long startedAt;

	@ViewIdentifier(viewId = R.id.TV_Duration)
	private TextView duration;

	@ViewIdentifier(viewId = R.id.TV_CyborgDuration)
	private TextView cyborgDuration;

	private ControllerV1_ExamplesSelection() {
		super(R.layout.controller__performance);
		startedAt = System.currentTimeMillis();
	}

	@Override
	public void onCreate() {
		super.onCreate();

		cyborgDuration.setText(DateTimeTools.getDurationAsString("ss:ms", CyborgBuilder.getStartupDuration()));
		duration.setText(DateTimeTools.getDurationAsString("ss:ms", System.currentTimeMillis() - startedAt));
	}
}

