package reports;

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
    "id",
    "name",
    "description",
    "startTime",
    "endTime",
    "stepsCount",
    "exception",
    "reason",
     "testExecutionTime",
    "screenShots"
})
public class TestResult implements Serializable
{

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("startTime")
    private Long startTime;
    @JsonProperty("endTime")
    private Long endTime;
    @JsonProperty("stepsCount")
    private Integer stepsCount;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("exception")
    private String exception;
    @JsonProperty("screenShots")
    private List<String> screenShots = null;
    @JsonProperty("testExecutionTime")
    private Long testExecutionTime;
    private final static long serialVersionUID = -2029496503521642489L;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("startTime")
    public Long getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("endTime")
    public Long getEndTime() {
        return endTime;
    }

    @JsonProperty("endTime")
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @JsonProperty("stepsCount")
    public Integer getStepsCount() {
        return stepsCount;
    }

    @JsonProperty("stepsCount")
    public void setStepsCount(Integer stepsCount) {
        this.stepsCount = stepsCount;
    }

    @JsonProperty("screenShots")
    public List<String> getScreenShots() {
        return screenShots;
    }

    @JsonProperty("screenShots")
    public void setScreenShots(List<String> screenShots) {
        this.screenShots = screenShots;
    }

    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @JsonProperty("exception")
    public String getException() {
        return exception;
    }

    @JsonProperty("exception")
    public void setException(String exception) {
        this.exception = exception;
    }

    @JsonProperty("testExecutionTime")
    public Long getTestExecutionTime() {
        return testExecutionTime;
    }

    @JsonProperty("testExecutionTime")
    public void setTestExecutionTime(Long testExecutionTime) {
        this.testExecutionTime = testExecutionTime;
    }
}
