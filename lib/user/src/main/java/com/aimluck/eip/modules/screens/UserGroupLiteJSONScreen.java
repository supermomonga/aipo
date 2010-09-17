/*
 * Aipo is a groupware program developed by Aimluck,Inc.
 * Copyright (C) 2004-2010 Aimluck,Inc.
 * http://aipostyle.com/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aimluck.eip.modules.screens;

import net.sf.json.JSONArray;

import org.apache.jetspeed.services.logging.JetspeedLogFactoryService;
import org.apache.jetspeed.services.logging.JetspeedLogger;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;

import com.aimluck.eip.user.util.UserUtils;

/**
 * グループ情報をJSONデータとして出力するクラスです。 <br />
 * 
 */
public class UserGroupLiteJSONScreen extends ALJSONScreen {

  /** logger */
  private static final JetspeedLogger logger = JetspeedLogFactoryService
    .getLogger(UserLiteJSONScreen.class.getName());

  @Override
  protected String getJSONString(RunData rundata, Context context)
      throws Exception {
    String result = "";
    JSONArray json;

    try {

      String mode = rundata.getParameters().getString("mode");
      if ("mygroup".equals(mode)) {
        json =
          JSONArray.fromObject(UserUtils.getUserGroupLiteBeans(
            rundata,
            true,
            false));
      } else if ("post".equals(mode)) {
        json =
          JSONArray.fromObject(UserUtils.getUserGroupLiteBeans(
            rundata,
            false,
            true));
      } else {
        json =
          JSONArray.fromObject(UserUtils.getUserGroupLiteBeans(
            rundata,
            true,
            true));
      }

      result = json.toString();
    } catch (Exception e) {
      logger.error("[UserLiteJSONScreen]", e);
    }

    return result;
  }
}
