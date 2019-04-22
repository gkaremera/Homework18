package edu.dmacc.codedsm.hw18;

public class FizzBuzzServicehwk18Impl implements FizzBuzzService {

    private MapRepository repository;
    private SubmissionController Submission;

    public FizzBuzzServicehwk18Impl(MapRepository repository) {
        this.repository = repository;
    }


    public Result performFizzBuzzLogicSubmission (Submission submission) {
        String message = "";
        if (submission.getInputNumber() % 4 == 0 && submission.getInputNumber() % 7 == 0) {
            message = "FizzBuzz!";
        } else if (submission.getInputNumber() % 4 == 0) {
            message = "Fizz";
        } else if (submission.getInputNumber() % 7 == 0) {
            message = "Buzz";
        } else {
            message = "Input was not fizzy";
        }

        Result result = new Result();
        result.setMessage(message);
        result.setSubmission(submission);

        repository.save(result);

        return result;
    }

    @Override
    public Result performFizzBuzzLogic(edu.dmacc.codedsm.hw18.Submission submission) {
        return null;
    }
}
