package org.learn.jgit;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

// import java.io.File;

// import org.eclipse.jgit.api.Git;
// import org.eclipse.jgit.api.errors.GitAPIException;

public class GitService {

    //logger for logging
    // private static final Logger LOGGER = LoggerFactory.getLogger(GitService.class);
    // //location of the git repository;
    // private String REMOTE_URL;
    // //location to store the repository
    // private String LOCAL_PATH;

    // //constructor
    // public GitService(String REMOTE_URL, String LOCAL_PATH) {
    //     this.REMOTE_URL = REMOTE_URL;
    //     this.LOCAL_PATH = LOCAL_PATH;
    // }

    // //clone the repository
    // public void cloneRepo() {
    //     LOGGER.info("Cloning " + REMOTE_URL + " into " + LOCAL_PATH);
    //     try {
    //         Git.cloneRepository()
    //                 .setURI(REMOTE_URL)
    //                 .setDirectory(new File(LOCAL_PATH))
    //                 .call();
    //     } catch (GitAPIException e) {
    //         LOGGER.error("Exception occurred while cloning repo");
    //     }
    //     LOGGER.info("Completed Cloning");
    // }


    // implement using main method handle with GITAPIException
    public static void main(String[] args) {
        // String REMOTE_URL = "https://github.com/saravanan30092023/jgit.git";
        // String LOCAL_PATH = "D:\\TempGit";
        // GitService gitService = new GitService(REMOTE_URL, LOCAL_PATH);
        // try
        // {
        //     gitService.cloneRepo();
        // }
        // catch (Exception e)
        // {
        //     LOGGER.error("Exception occurred while cloning repo");

        // }


}

}
