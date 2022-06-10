package Queues;

public class Task implements Comparable<Task> {
    private String name;
    private String description;
    private Priority priority;

    public Task(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    public Task(String name, String description, Priority priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Task o) {
        return priority.compareTo(o.priority);
    }

    @Override
    public String toString() {
        return description != null ? name + ", " + description + ", priorytet " + priority.description : name + ", priorytet " + priority.description;
    }

    public enum Priority {
        HIGH("wysoki"), MODERATE("średni"), LOW("niski");

        private final String description;

        Priority(String description) {
            this.description = description;
        }

        public static Priority fromDesc(String desc) {
            Priority[] values = values();
            for (Priority priority : values
            ) {
                if (priority.description.equals(desc)) {
                    return priority;
                }
            }
            return null;
        }
    }


}
