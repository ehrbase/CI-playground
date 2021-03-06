package org.ehrbase.fhirbridge.ehr.opt.intensivmedizinischesmonitoringkorpertemperaturcomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_TEXT")
public class KorpertemperaturKorperexpositionDvtext
    implements KorpertemperaturKorperexpositionChoice {
  @Path("|value")
  private String korperexpositionValue;

  public void setKorperexpositionValue(String korperexpositionValue) {
    this.korperexpositionValue = korperexpositionValue;
  }

  public String getKorperexpositionValue() {
    return this.korperexpositionValue;
  }
}
