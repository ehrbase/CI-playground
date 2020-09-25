/*
 * Copyright (c) 2019 Vitasystems GmbH and Jake Smolka (Hannover Medical School).
 *
 * This file is part of project EHRbase
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
 */

package org.ehrbase.response.openehr;

import org.ehrbase.response.ehrscape.TemplateMetaDataDto;

import java.util.List;

public class TemplatesResponseData implements ResponseData<List<TemplateMetaDataDto>> {

    public TemplatesResponseData() {

    }

    public TemplatesResponseData(List<TemplateMetaDataDto> templates) {
        this.templates = templates;
    }

    List<TemplateMetaDataDto> templates;

    public List<TemplateMetaDataDto> get() {
        return templates;
    }

    public void set(List<TemplateMetaDataDto> templates) {
        this.templates = templates;
    }
}
