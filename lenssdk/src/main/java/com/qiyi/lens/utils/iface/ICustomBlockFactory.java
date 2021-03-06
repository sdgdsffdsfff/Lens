/*
 *
 * Copyright (C) 2020 iQIYI (www.iqiyi.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.qiyi.lens.utils.iface;

import com.qiyi.lens.ui.devicepanel.blockInfos.AbsBlockInfo;

/**
 * 用于支持是设置页面，带开关部分逻辑的回调
 */
public interface ICustomBlockFactory {
    // 未测试，未支持： 创建自定义模块，用于展示在lens 顶级页面上
    AbsBlockInfo createBlockInfo(String key);

    // 未测试，已支持： 开关打开关闭的场景下调用。
    boolean onBlockSwitchChange(String key, boolean open);
}
