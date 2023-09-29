public class Task {

        String task;
        String description;
        String date;


        public Task(String task, String description, String date) {
            this.task = task;
            this.description = description;
            this.date = date;

        }
        public String getTask() {
            return task;
        }

        public String getDate() {
            return date;
        }

        public String getDescription() {
            return description;
        }

        public void setTask(String task) {
            this.task = task;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

