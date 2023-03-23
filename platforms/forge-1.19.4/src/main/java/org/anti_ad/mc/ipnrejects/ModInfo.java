/*
 * Inventory Profiles Next
 *
 *   Copyright (c) 2019-2020 jsnimda <7615255+jsnimda@users.noreply.github.com>
 *   Copyright (c) 2021-2022 Plamen K. Kosseff <p.kosseff@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.anti_ad.mc.ipnrejects;

import net.minecraftforge.common.util.MavenVersionStringHelper;
import net.minecraftforge.fml.ModList;

import java.util.concurrent.atomic.AtomicReference;

/**
 * ModInfo
 */
public class ModInfo {

    public static final String MOD_ID = "ipnrejects";
    public static final String MOD_NAME = "IPN Rejects";
    public static String MOD_VERSION = "null";

    public static String getModVersion() {
        AtomicReference<String> version = new AtomicReference<>("?");
        ModList.get().getMods().forEach(x -> {
            if (x.getModId().equals(MOD_ID)) {
                version.set(MavenVersionStringHelper.artifactVersionToString(x.getVersion()));
            }
        });
        return version.get();
    }

    public static final String MODRINTH_URL = "https://modrinth.com/mod/ipn-rejects";
    public static final String CURSEFORGE_URL = "https://www.curseforge.com/minecraft/mc-mods/ipn-rejects";

}
