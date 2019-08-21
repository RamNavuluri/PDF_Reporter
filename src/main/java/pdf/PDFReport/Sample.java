package pdf.PDFReport;

import org.testng.ITestResult;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    private List<TestResult> pass = new ArrayList<>();
    private List<TestResult> fail = new ArrayList<>();
    private List<TestResult> skip = new ArrayList<>();
    private Report report = new Report();

    /**
     * int SUCCESS = 1;
     *   int FAILURE = 2;
     *   int SKIP = 3;
     * @param result
     */

    public void setTestResult(ITestResult result){
        TestResult testResult = new TestResult();
        testResult.setName(result.getTestName());
        testResult.setDescription("");
        testResult.setId(System.currentTimeMillis());
        testResult.setEndTime(result.getEndMillis());
        testResult.setStartTime(result.getStartMillis());
        testResult.setTestExecutionTime(result.getEndMillis()-result.getStartMillis());
        if(result.getStatus()==1){
            pass.add(testResult);
        }else if(result.getStatus()==2){
            testResult.setException(result.getThrowable().toString());
            fail.add(testResult);
        }else if(result.getStatus()==3){

            testResult.setReason(result.getSkipCausedBy().toString());
            skip.add(testResult);
        }

    }

    public void setTestSuite(ITestResult result){
        report.setTestsuite(result.getTestContext().getSuite().getName());

    }
}