/*
 * Copyright 2013 Dittmar Steiner
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.mylib.utils;

import java.io.File;

import android.content.Context;

public class StorageUtils {
	
	/**
	 * Verwendet das Android Device eine externe SD Card, so wird der Cache dort
	 * verwendet. Ansonsten intern.
	 * 
	 * @param context
	 * @return externer Cache oder interner
	 */
	public static File getCache(Context context) {
		File cache = context.getExternalCacheDir();
		
		if (cache == null) {
			cache = context.getCacheDir();
		}
		
		return cache;
	}
}
