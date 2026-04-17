package edu.cmu.DirManager;

public class Manager {
    private DirOps dirOps;
    
    /**
     * Creates a new directory at the specified path.
     *
     * @param path the path where the new directory should be created
     * @throws Exception if the directory already exists at the given path
     * @throws Exception if the path is invalid
     */
    public void newDirectory(String path) throws Exception {
        if (!dirOps.checkPathValid(path)) {
            throw new Exception("Invalid Path: " + path);
        } else if (dirOps.checkDirectoryExists(path)) {
            throw new Exception("Directory Exists: " + path);
        } else {
            dirOps.createDirectory(path);
        }
    }
}
