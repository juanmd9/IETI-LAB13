package co.edu.eci.ieti.android.database;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

import co.edu.eci.ieti.android.network.data.Task;

public class TaskRepository {

    private TaskDao mTaskDao;
    private LiveData<List<Task>> mAllTasks;

    TaskRepository(Application application) {
        TaskRoomDatabase db = TaskRoomDatabase.getDatabase(application);
        mTaskDao = db.taskDao();
        mAllTasks = mTaskDao.getTasks();
    }

    LiveData<List<Task>> getAllTasks() {
        return mAllTasks;
    }

    void insert(Task task) {
        TaskRoomDatabase.databaseWriteExecutor.execute(() -> {
            mTaskDao.insert(task);
        });
    }
    
}
