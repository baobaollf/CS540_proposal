public class Job implements Executable {

    private final String databaseConnection;
    private String authenticationHash;
    public final String jobName;
    Job(String dbConnection, String auth, String jobName) {
        this.databaseConnection = dbConnection;
        this.authenticationHash = auth;
        this.jobName = jobName;
    }

    @Override
    public boolean execute() {
        System.out.println("job is " + jobName);
        System.out.println("access database " + databaseConnection);
        System.out.println("authentication pass");
        System.out.println("assign delivery driver");
        return true;
    }
}
