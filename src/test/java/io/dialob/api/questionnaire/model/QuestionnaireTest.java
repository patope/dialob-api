/*
 * Copyright 2018 ReSys OÜ
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
package io.dialob.api.questionnaire.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Assert;
import org.junit.Test;

public class QuestionnaireTest {

  @Test
  public void gsonShouldSerializeCompatibleJson() {
    Questionnaire questionnaire = QuestionnaireFactory.questionnaire("12","123");
    Gson gson = new GsonBuilder()
      .registerTypeAdapterFactory(new GsonAdaptersQuestionnaire())
      .create();
    String json = gson.toJson(questionnaire);
    Assert.assertEquals("{\"_id\":\"12\",\"metadata\":{\"formId\":\"123\",\"status\":\"NEW\"}}", json);
  }

}