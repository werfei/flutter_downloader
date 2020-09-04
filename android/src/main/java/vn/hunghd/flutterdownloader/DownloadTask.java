package vn.hunghd.flutterdownloader;

public class DownloadTask {
    int primaryId;
    String taskId;
    int status;
    int progress;
    String url;
    String filename;
    String savedDir;
    String headers;
    String mimeType;
    boolean resumable;
    boolean showNotification;
    boolean openFileFromNotification;
    long size;
    String data;
    long modified;
    long timeCreated;

    DownloadTask(int primaryId, String taskId, int status, int progress, String url, String filename, String savedDir,
                 String headers, String mimeType, boolean resumable, boolean showNotification,
                 boolean openFileFromNotification, long timeCreated, long size,String data,long modified) {
        this.primaryId = primaryId;
        this.taskId = taskId;
        this.status = status;
        this.progress = progress;
        this.url = url;
        this.filename = filename;
        this.savedDir = savedDir;
        this.headers = headers;
        this.mimeType = mimeType;
        this.resumable = resumable;
        this.showNotification = showNotification;
        this.openFileFromNotification = openFileFromNotification;
        this.timeCreated = timeCreated;
        this.size = size;
        this.data = data;
        this.modified = modified;
    }

    @Override
    public String toString() {
        return "DownloadTask{taskId=" + taskId + ",status=" + status + ",progress=" + progress + ",url=" + url + ",filename=" + filename + ",savedDir=" + savedDir + ",headers=" + headers + "}";
    }
}
