package io.quarkus.deployment.dev.filesystem.watch;

import java.nio.file.Path;

/**
 * The event object that is fired when a file system change is detected.
 *
 * @see WatchServiceFileSystemWatcher
 *
 */
public class FileChangeEvent {

    private final Path file;
    private final Type type;

    /**
     * Construct a new instance.
     *
     * @param file the file which is being watched
     * @param type the type of event that was encountered
     */
    public FileChangeEvent(Path file, Type type) {
        this.file = file;
        this.type = type;
    }

    /**
     * Get the file which was being watched.
     *
     * @return the file which was being watched
     */
    public Path getFile() {
        return file;
    }

    /**
     * Get the type of event.
     *
     * @return the type of event
     */
    public Type getType() {
        return type;
    }

    /**
     * Watched file event types. More may be added in the future.
     */
    public static enum Type {
        /**
         * A file was added in a directory.
         */
        ADDED,
        /**
         * A file was removed from a directory.
         */
        REMOVED,
        /**
         * A file was modified in a directory.
         */
        MODIFIED,
    }

}
