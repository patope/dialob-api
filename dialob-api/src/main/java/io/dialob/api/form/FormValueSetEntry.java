package io.dialob.api.form;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.dialob.api.annotation.AllowNulls;
import org.immutables.gson.Gson;
import org.immutables.value.Value;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Map;

@Value.Immutable
@Value.Style(jdkOnly = true)
@Value.Modifiable
@JsonSerialize(as = ImmutableFormValueSetEntry.class)
@JsonDeserialize(as = ImmutableFormValueSetEntry.class)
@Gson.TypeAdapters(emptyAsNulls = true)
public interface FormValueSetEntry extends Serializable {

  @NotNull
  String getId();

  Map<String, String> getLabel();

  @JsonInclude
  @JsonAnyGetter
  @AllowNulls
  @Gson.Ignore
  Map<String, Object> getAdditionalProperties();

}
