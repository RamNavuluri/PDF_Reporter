
package pdf.PDFReport;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pass",
    "fail",
    "skip"
})
public class Results implements Serializable
{

    @JsonProperty("pass")
    private List<TestResult> pass = null;
    @JsonProperty("fail")
    private List<TestResult> fail = null;
    @JsonProperty("skip")
    private List<TestResult> skip = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5663218050429346585L;

    @JsonProperty("pass")
    public List<TestResult> getPass() {
        return pass;
    }

    @JsonProperty("pass")
    public void setPass(List<TestResult> pass) {
        this.pass = pass;
    }

    @JsonProperty("fail")
    public List<TestResult> getFail() {
        return fail;
    }

    @JsonProperty("fail")
    public void setFail(List<TestResult> fail) {
        this.fail = fail;
    }

    @JsonProperty("skip")
    public List<TestResult> getSkip() {
        return skip;
    }

    @JsonProperty("skip")
    public void setSkip(List<TestResult> skip) {
        this.skip = skip;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
